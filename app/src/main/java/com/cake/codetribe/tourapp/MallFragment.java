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

public class MallFragment extends Fragment {




    View view;
    static  String ids = "ID";

    public static final int ILANGA = 1;
    public static final int RIVERSIDE = 2;
    public static final int EMOYENI= 3;
    public static final int PROMANADE= 4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

         view = inflater.inflate(R.layout.malls,container,false);

        ImageView ilanga = view.findViewById(R.id.ilanga);
        ImageView riverside = view.findViewById(R.id.riverside);
        ImageView emoyeni = view.findViewById(R.id.moyenimall);
        ImageView prominade = view.findViewById(R.id.prominademall);
        getActivity().setTitle("Malls");

        Context c = getActivity().getApplicationContext();
        Picasso.with(c).load("http://www.schneidersguesthouse.com/wp-content/uploads/2015/05/IlangaMall4.jpg")
                .fit().into(ilanga);


        Picasso.with(c).load("https://static.wixstatic.com/media/22a6be_8f72a1889ed74cd1905a6aff6f5f5991~mv2_d_2662_1581_s_2.jpg_srz_912_542_85_22_0.50_1.20_0.00_jpg_srz")
                .fit().into(riverside);

        Picasso.with(c).load("http://www.mccormick-property.com/mpd/sites/default/files/Image%201_4.jpg")
                .fit().into(emoyeni);

        Picasso.with(c).load("https://static1.squarespace.com/static/529fc0c0e4b088b079c3fb6d/t/58f94c46e6f2e1f9421f1796/1492733116624/")
                .fit().into(prominade);

        ilanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),MallInformationActivity.class);
                intent.putExtra(ids,ILANGA);
                startActivity(intent);

            }
        });
        riverside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), MallInformationActivity.class);
                intent.putExtra(ids,RIVERSIDE);
                startActivity(intent);

            }
        });
        emoyeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), MallInformationActivity.class);
                intent.putExtra(ids,EMOYENI);
                startActivity(intent);

            }
        });
        prominade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), MallInformationActivity.class);
                intent.putExtra(ids,PROMANADE);
                startActivity(intent);

            }
        });

        return  view;


    }



}
