package com.cake.codetribe.tourapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by codetribe on 2017/07/20.
 */

public class AirportFragment extends Fragment


{
    public static final int AIRPORT = 1;
    static  String ids = "ID";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.airport, container, false);

        getActivity().setTitle("Airport");

        ImageView airport = (ImageView) view.findViewById(R.id.airporticon);



        airport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),AirportInforActivity.class);
                intent.putExtra(ids,AIRPORT);
                startActivity(intent);
            }

        });


        return view;




    }
}