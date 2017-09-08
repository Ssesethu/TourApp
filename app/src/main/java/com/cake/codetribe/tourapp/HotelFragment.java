package com.cake.codetribe.tourapp;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by codetribe on 2017/07/20.
 */

public class HotelFragment  extends Fragment
{
    public static final int MERCURE = 1;
    public static final int LAVILLA = 2;
    public static final int PROTEA = 3;
    public static final int PROMANADE= 4;
    public static final int CHILL_PEPPER= 5;
    public static final int TOWN_LODGE= 6;
    public static final int CYCAD_LODGE= 7;
    public static final int SHANDON= 8;
    static  String ids = "ID";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hotels,container,false);


        ImageView imMercure = view.findViewById(R.id.mercure);
        ImageView imVilla = view.findViewById(R.id.villa);
        ImageView imProtea = view.findViewById(R.id.protea);
        ImageView imProminade = view.findViewById(R.id.promanade);
        ImageView imChill= view.findViewById(R.id.chillpepper);
        ImageView imTownLodge = view.findViewById(R.id.townlodge);
        ImageView imCycad = view.findViewById(R.id.cycad);
        ImageView imShandon = view.findViewById(R.id.shandon);

        getActivity().setTitle("Hotels");
        Context c = getActivity().getApplicationContext();
        Picasso.with(c).load("http://exp.cdn-hotels.com/hotels/1000000/490000/483200/483192/483192_123_z.jpg")
                .fit().into(imMercure);

        Picasso.with(c).load("http://www.villavitanelspruit.com/publishImages/index~~element641.jpg")
                .fit().into(imVilla);

        Picasso.with(c).load("https://tracks4africa.co.za/media/users/images/w167012_11596_protea-hotel-nelspruit_entrance.JPG")
                .fit().into(imProtea);

        Picasso.with(c).load(R.drawable.promenadeicon)
                .fit().into(imProminade);

        Picasso.with(c).load("https://exp.cdn-hotels.com/hotels/16000000/15480000/15473800/15473742/c995d17b_z.jpg")
                .fit().into(imChill);

        Picasso.with(c).load("http://media-cdn.tripadvisor.com/media/photo-s/05/38/b1/6a/town-lodge-nelspruit.jpg")
                .fit().into(imTownLodge);

        Picasso.with(c).load("http://www.traveljack.co.za/wp-content/uploads/2013/04/The-Cycad-Lodge-and-Chalets-Mbombela-01-450x215.jpg")
                .fit().into(imCycad);

        Picasso.with(c).load("http://img.entegral.net/p/n907443_471afbf6-9c36-4130-be28-8ba04f3f9ccc1.jpg")
                .fit().into(imShandon);




        imMercure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,MERCURE);
                startActivity(intent);

            }
        });
        imVilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,LAVILLA);
                startActivity(intent);

            }
        });
        imProtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,PROTEA);
                startActivity(intent);

            }
        });
        imProminade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,PROMANADE);
                startActivity(intent);

            }
        });
        imChill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,CHILL_PEPPER);
                startActivity(intent);

            }
        });
        imTownLodge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,TOWN_LODGE);
                startActivity(intent);
            }
        });
        imCycad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,CYCAD_LODGE);
                startActivity(intent);

            }
        });
        imShandon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), HotelInfomation.class);
                intent.putExtra(ids,SHANDON);
                startActivity(intent);

            }
        });
        return  view;
    }



}
