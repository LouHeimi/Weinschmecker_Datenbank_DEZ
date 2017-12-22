package com.example.louis.weinschmecker_v2.Fragments;


import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.louis.weinschmecker_v2.R;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeinregalFrag extends Fragment {


    public WeinregalFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment




        return inflater.inflate(R.layout.fragment_weinregal, container, false);

    }

}
