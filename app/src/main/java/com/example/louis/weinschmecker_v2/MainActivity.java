package com.example.louis.weinschmecker_v2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


import com.example.louis.weinschmecker_v2.Fragments.ClientFragment;
import com.example.louis.weinschmecker_v2.Fragments.FragmentEinstellungen;
import com.example.louis.weinschmecker_v2.Fragments.ScanFrag;
import com.example.louis.weinschmecker_v2.Fragments.SingleWineFrag;
import com.example.louis.weinschmecker_v2.Fragments.SucheFrag;
import com.example.louis.weinschmecker_v2.Fragments.WeinregalFrag;

import static com.example.louis.weinschmecker_v2.Fragments.WebViewFragment.mWebView;


public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {


                case R.id.navigation_suche:
                    SucheFrag sucheFrag = new SucheFrag();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, sucheFrag,
                            sucheFrag.getTag()).commit();

                    return true;

                case R.id.navigation_scan:
                    ScanFrag barcode_frag = new ScanFrag();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, barcode_frag, barcode_frag.getTag()).commit();
                    return true;

                case R.id.navigation_weinstyle:
                    ClientFragment clientFragment = new ClientFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, clientFragment, clientFragment.getTag()).commit();
                    return true;

                case R.id.navigation_weinregal:
                    WeinregalFrag weinregalFrag = new WeinregalFrag();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, weinregalFrag, weinregalFrag.getTag()).commit();

                    return true;

            }


            return false;
        }


    };

//Herz Button in ListView ändern
    private boolean paused = false;

    public void buttonPressed(View view) {

        ImageButton button = (ImageButton) view;
        int icon;

        if (paused) {
            paused = false;
            icon = R.drawable.herzleer;
        }
        else {
            paused = true;
            icon = R.drawable.herz;
        }

        button.setImageDrawable(
                ContextCompat.getDrawable(getApplicationContext(), icon));


    }



//Zurück kommen aus Unterseiten der Webview
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mWebView.canGoBack()) {
                        mWebView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fm.beginTransaction();
        SucheFrag sucheFrag = new SucheFrag();

        transaction.add(R.id.content, sucheFrag);
        transaction.commit();






        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);






        //Slide-Effekt weg
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);




    }


    public void openSingleView(View view) {

        SingleWineFrag singleWineFrag = new SingleWineFrag();
        getSupportFragmentManager().beginTransaction().replace(R.id.content, singleWineFrag, singleWineFrag.getTag()).commit();

    }




        public void onSelectFragment(View view) {

            Fragment newFragment;

            if (view==findViewById(R.id.btnSettings)) {
                newFragment = new FragmentEinstellungen();


            } else {
                newFragment = new FragmentEinstellungen();

            }


            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.content, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }






}















