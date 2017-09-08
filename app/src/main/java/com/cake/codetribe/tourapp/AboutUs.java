package com.cake.codetribe.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        TextView txtInfo = (TextView)findViewById(R.id.abtus);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);


       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeButtonEnabled(true);
        mToolbar.setTitle("About us");


        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();

            }

        });

        txtInfo.setText ("NELSPRUIT CITY \n" +
                " \n" +
                " \n" +
                " \n" +
                "Nelspruit is situated in the fertile valley of the Crocodile River and acts as the gateway to Mpumalanga and the Kruger National Park." +
                " With abundant sunshine, moderate sub-tropical climate, lush landscape, and a host of nearby attractions," +
                " Nelspruit is an ideal base to explore Mpumalanga.\n " +
                " \n" +
                "Discover this region for yourself by booking a stay at one of the tranquil Nelspruit accommodations. \n"  +
                 "The internationally acclaimed Kruger National Park is the biggest tourist attraction in Mpumalanga." +
                " As the largest reserve in South Africa, it covers 19 480 km² and is home to a diverse population of wildlife," +
                " including the Big 5, birding Big 6, and more species of mammals than any other African game reserve." +
                " Enjoy an unmatched safari experience with self-drives or guided tours. " +
                "Excellent infrastructure includes picnic sites, rest camps, waterholes," +
                " and hides. Other popular Mpumalanga attractions include God’s Window," +
                " the Three Rondavels, and Bourke’s Luck Potholes.\n" +
                " \n" +
                "Nelspruit, officially renamed Mbombela, is the capital of Mpumalanga and has something for everyone." +
                " Nature lovers will love an amble through the Lowveld Botanical Garden," +
                " which boasts a rare collection of over 650 plant species, the first man-made rain forest," +
                " and a tranquil pool where the Crocodile River meets the Nels River (which cascades down a waterfall in the west). " +
                "The mountains surrounding Nelspruit have fantastic hiking trails for all levels of fitness." +
                " Nelspruit Nature Reserve offers several walks between one and six hours.\n" +
                " \n" +
                " Enjoy indigenous vegetation and a variety of birds and small antelope along the easy-going Green Heritage Hiking Trail;" +
                " or discover interesting facts about Nelspruit's past along the Nelspruit Historical Walking Trail. \n" +
                "Nelspruit Golf Course is the busiest in the region and offers excellent opportunities to not only score birdies," +
                " but also spot a variety of birdlife. Mbombela Stadium is an excellent venue for sports matches," +
                " live entertainment, and exhibitions, so keep a look out for what’s happening while you’re in the region. \n" +
                " \n" +
                "Another major attraction is Sudwala Caves, regarded as the oldest known caves in the world. " +
                "The caves feature a series of caverns with stalactites, stalagmites, and flowstone formations." +
                " Next to the caves is Dinosaur Park and cultural centre where you can roam amongst life-size replicas of dinosaurs," +
                " the extinct Cape Lion and Cape Quagga, a 3m long Nile crocodile, and pre-historic man. Situated outdoors," +
                " in a sub-tropical garden with ancient cycads, the park provides an educational experience for all ages.\n");



    }
}
