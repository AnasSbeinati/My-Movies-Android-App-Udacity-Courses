package com.example.anoos.udacitymovieapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


public class MainActivityFragmenet extends Fragment {


    public MainActivityFragmenet() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        try {
            View v = inflater.inflate(R.layout.fragment_main_activity_fragmenet, container, false);
            GridView gridView = (GridView) v.findViewById(R.id.gridView);
            gridView.setAdapter(new GridViewAdapter(getActivity()));
            return v;
        } catch (Exception e) {
             Log.e("line 35", e.getMessage());
             return null;
        }
    }

}
