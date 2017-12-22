package com.example.louis.weinschmecker_v2.Fragments;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.louis.weinschmecker_v2.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SingleWineFrag extends Fragment {
    public SingleWineFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_single_wine, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();



        //wineID ausgeben
        TextView tv = (TextView) getActivity().findViewById(R.id.wineID);
        tv.setText(""+this.getArguments().get("wineID").toString()+"");

    }



}

