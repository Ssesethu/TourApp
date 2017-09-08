package com.cake.codetribe.tourapp;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by codetribe on 2017/07/20.
 */

public class FirstFragment extends Fragment  {



    public static final int KRUGER = 1;
    public static final int BOTANICAL = 2;
    public static final int MNOTWENI = 3;
    public static final int STADIUM= 4;
    public static final int GAMERESERVE= 5;
    public static final int SUDWALA= 6;
    public static final int RHINO= 7;
    public static final int GODWINDOW= 8;

    static  String ids = "ID";

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

          View view = inflater.inflate(R.layout.attraction, container, false);

        ImageView imKruger = view.findViewById(R.id.kruger);
        ImageView imBotanical = view.findViewById(R.id.botanic);
        ImageView imeMnotweni = view.findViewById(R.id.emnotweni);
        ImageView imStadium = view.findViewById(R.id.bstadium);
        ImageView imGamereserve= view.findViewById(R.id.gamereserve);
        ImageView imSudwala = view.findViewById(R.id.sudwala);
        ImageView imRhino = view.findViewById(R.id.rhino);
        ImageView imGodswindow = view.findViewById(R.id.godswindow);

         getActivity().setTitle("Attractions");


        Context c = getActivity().getApplicationContext();
        Picasso.with(c).load("http://www.privatekrugersafaris.co.za/images/img_5523-crop-u17675.jpg?crc=4224241840")
                .fit().into(imKruger);

        Picasso.with(c).load("http://showme.co.za/nelspruit/files/2013/02/Nelspruit-Botanical-Gardens1-626x417.jpg")
                .fit().into(imBotanical);

        Picasso.with(c).load("https://d2qk001qea2413.cloudfront.net/681981528/cms/cache/1680x942/cb/7837-cb9347834e2ca82d3b3effa0358630a5.jpg")
                .fit().into(imeMnotweni);

        Picasso.with(c).load(R.drawable.mboicon)
                .fit().into(imStadium);

        Picasso.with(c).load("http://media-cdn.tripadvisor.com/media/photo-s/04/9b/03/de/mala-mala-main-camp.jpg")
                .fit().into(imGamereserve);

        Picasso.with(c).load(R.drawable.sudwalaicon)
                .fit().into(imSudwala);

        Picasso.with(c).load("http://www.weddingflair.co.za/wp-content/uploads/2016/09/rhino-post-logo-cd55870f6f2ace3d58b28e61ad887b75.jpg")
                .fit().into(imRhino);

        Picasso.with(c).load("http://2.bp.blogspot.com/_KHH9UB4kL1U/TO9xTTzSxYI/AAAAAAAAItw/7Orc04uiGWg/s1600/TOBY+MPUMALANGA.jpg")
                .fit().into(imGodswindow);



        imKruger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,KRUGER);
                startActivity(intent);

            }
        });
        imBotanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,BOTANICAL);
                startActivity(intent);

            }
        });
        imeMnotweni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,MNOTWENI);
                startActivity(intent);

            }
        });
        imStadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,STADIUM);
                startActivity(intent);

            }
        });
        imGamereserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,GAMERESERVE);
                startActivity(intent);

            }
        });
        imSudwala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,SUDWALA);
                startActivity(intent);

            }
        });
        imRhino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,RHINO);
                startActivity(intent);

            }
        });
        imGodswindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra(ids,GODWINDOW);
                startActivity(intent);

            }
        });
        return view;




    }



}

