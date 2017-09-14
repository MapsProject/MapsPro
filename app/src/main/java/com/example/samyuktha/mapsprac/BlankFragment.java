package com.example.samyuktha.mapsprac;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements OnMapReadyCallback {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vm =  inflater.inflate(R.layout.fragment_blank, container, false);
        return vm;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        
    }
}
