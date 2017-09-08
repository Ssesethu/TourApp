package com.cake.codetribe.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class AirportInforActivity extends AppCompatActivity {

    int id = 0;

     Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_infor);

        Bundle intent = getIntent().getExtras();
        id = intent.getInt(FirstFragment.ids);
        ImageView airportImage = (ImageView) findViewById(R.id.imgAirport);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);




        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }

        });
        TextView txtairport = (TextView)findViewById(R.id.airpotinfo);


        if (id == AirportFragment.AIRPORT) {
            Picasso.with(getApplicationContext())
                    .load("http://www.southafrica.to/transport/Airlines/British-Airways-South-Africa/images/20110429/BA-Nelspruit-Kruger-LARGE.JPG")
                    .into(airportImage);

            txtairport.setText("Welcome to the Kruger Mpumalanga International Airport " +
                    "also referred to as KMI Airport located in Mbombela (Nelspruit) " +
                    "which is the gateway to the world’s most iconic game reserve, " +
                    "the Kruger National Park, its third largest canyon the Blyde River Canyon," +
                    " ancient caves and many scenic & heritage attractions in close proximity.\n" +
                    "\n" +
                    "Since commencing business operations in October 2002, " +
                    "KMI Airport has opened up the skies over Mbombela (Nelspruit) for over 2.8 Million passengers, " +
                    "affording new opportunities to the tourism and business industries of the province." +
                    " KMI Airport serves an average of 260,000 passengers per annum and will breach the 3 Million passengers mark during 2016." +
                    " This is an ICAO approved International Airport with a runway of 3.1km" +
                    " which can accommodate up to a Boeing 747 and Airbus series." +
                    " The Airport also prides itself in being the holders of a Fire and Rescue Category 8 international aerodrome license," +
                    " which was a first for the province.\n" +
                    "\n" +
                    "Address: R538, Nelspruit, 1200\n" +
                    "Phone: 013 753 7500\n");
            getSupportActionBar().setTitle("KMI Airport");



        }
    }
}
