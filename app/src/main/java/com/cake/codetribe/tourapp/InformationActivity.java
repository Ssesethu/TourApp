package com.cake.codetribe.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class InformationActivity extends AppCompatActivity {

    private ImageView krugerImage;
    int id = 0;

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Bundle intent = getIntent().getExtras();
        id = intent.getInt(FirstFragment.ids);
        krugerImage =(ImageView)findViewById(R.id.infokruger);
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

        TextView tvAttractionInfo = (TextView)findViewById(R.id.attractioninfo);

        //if statements for attractions
        if (id == FirstFragment.KRUGER) {

            Picasso.with(getApplicationContext())
                    .load("http://toffie.co.za/wp-content/uploads/2016/08/RPSL-Game-Drive.jpg")
                    .into(krugerImage);
            tvAttractionInfo.setText("Kruger National Park, in Mpumalanga Nelspruit South Africa," +
                    " is one of Africa’s largest game reserves. " +
                    "Its high density of wild animals includes the Big 5: lions, leopards, rhinos, " +
                    "elephants and buffalos. Hundreds of other mammals make their home here," +
                    " as do diverse bird species such as vultures, eagles and storks. Mountains," +
                    " bush plains and tropical forests are all part of the landscape.\n" +
                    "  \n"+
                    "Area: 19,485 km²\n" +
                    "Hours: Open from · 6AM  to 5:30PM\n" +
                    "Phone: 013 735 4000\n" +
                    "Established: May 31, 1926\n"+
                    "Location: Nelspruit");
            getSupportActionBar().setTitle("Kruger Nation Park");


        } else if( id ==  FirstFragment.BOTANICAL) {

            Picasso.with(getApplicationContext())
                    .load("https://img.grouponcdn.com/deal/dySmrZQQADn8yUiDMfDC/o6-1500x900")
                    .into(krugerImage);
            tvAttractionInfo.setText("The Lowveld National Botanical Garden," +
                    " one of the nine National Botanical Gardens of South Africa," +
                    " is located just outside Nelspruit," +
                    " Mpumalanga where the Crocodile River and Nels River converges.\n" +
                    "  \n" +
                    "Address: Madiba Dr, Nelspruit, 1201\n" +
                    "Hours: Open today · 8AM–5PM\n" +
                    "Phone: 013 752 5531\n" +
                    "Location: Nelspruit");
            getSupportActionBar().setTitle("Botanical Garden");
        } else if( id == FirstFragment.MNOTWENI) {
                    Picasso.with(getApplicationContext())
                    .load("https://d2qk001qea2413.cloudfront.net/681981528/cms/cache/1680x700/ad/3617-ad2700991e74e294323e98bb62a94ef9.JPG")
                    .into(krugerImage);

                 tvAttractionInfo.setText("Since its inception in October 1997, E" +
                    "mnotweni Casino has established itself as a premier entertainment " +
                    "destination in Mpumalanga and within Nelspruit. \n" +
                    "\n" +
                    "Over the years the casino has staged a myriad of world-class events," +
                    " shows and golf tournaments which have attracted many visitors to the city.\n" +
                    "\n" +
                    "The Emnotweni complex offers an array of entertainment options. " +
                    "It adjoins Riverside Mall, one of the region’s biggest shopping centres," +
                    " with Explorers Restaurant and Jacaranda FM's state-of-the-art regional broadcasting studio" +
                    " seamlessly connecting the casino with the mall's promotion court and movies@ Emnotweni.\n"
                    +"  \n" +
                   " Located in: Riverside Mall\n" +
                   "Address: 1 Madiba Dr, Riverside park, Nelspruit, 1200\n" +
                    "Hours: Open today · Open 24 hours\n"+
                    "Phone: 013 757 4300");
            getSupportActionBar().setTitle("Emnotweni");
        } else if( id == FirstFragment.STADIUM) {
                    Picasso.with(getApplicationContext())
                    .load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Mbombela_Stadium_arena.jpg/1200px-Mbombela_Stadium_arena.jpg")
                    .into(krugerImage);
                   tvAttractionInfo.setText("The Mbombela Stadium is an all-seater, " +
                    "40,929-seat stadium and was one of the ten venues for the FIFA World Cup 2010." +
                    " It is located on open land six kilometres west of Mbombela, South Africa, " +
                    "the capital of the Mpumalanga province. Wikipedia\n" +
                    "  \n"+
                    "Address: 1 Bafana Road, Mataffin, Nelspruit, 1200\n" +
                    "Capacity: 40,929\n" +
                    "Broke ground: February 2007\n" +
                    "Phone: 013 757 4600\n" +
                    "Owner: Mbombela Local Municipality\n" );
            getSupportActionBar().setTitle("Mbombela Stadium");
        } else if( id == FirstFragment.GAMERESERVE) {
                   Picasso.with(getApplicationContext())
                    .load("https://www.uyaphi.com/images/south-africa/kruger/mala-mala/mala-mala-lodges.jpg")
                    .into(krugerImage);
                     tvAttractionInfo.setText("Mala Mala is a game reserve located within the Sabi Sand Game Reserve\n" +
                    " Mpumalanga province, South Africa.\n" +
                    "It is the largest and the oldest private big five game reserve in South Africa\n" +
                    " It covers around 130 km² or 15 000 hectares of land. \n" +
                    "  \n" +
                    "Address: Ehlanzeni, 1260\n" +
                    "Phone: 011 442 2267\n"+
                    "Location: Nelspruit");
            getSupportActionBar().setTitle("Mala Mala Game Reserve");

        } else if( id == FirstFragment.SUDWALA) {
            Picasso.with(getApplicationContext())
                    .load("http://wearewhiteriver.com/wp-content/uploads/2016/04/04Sudwala_Hallway-eksteen.jpg")
                    .into(krugerImage);
            tvAttractionInfo.setText("The Sudwala Caves in Mpumalanga, South Africa\n " +
                    "are set in Precambrian dolomite rock\n" +
                    "which was first laid down about 3800 million years ago, " +
                    "when Africa was still part of Gondwana. " +
                    "The caves themselves formed about 240 million years ago.\n" +
                    "   \n"+
                    "Address: R539, Nelspruit, 1201\n" +
                    "Phone: 083 446 0228");
            getSupportActionBar().setTitle("Sudwala Curve");

        } else if( id == FirstFragment.RHINO) {
            Picasso.with(getApplicationContext())
                    .load("http://www.rhinopost.co.za//wp-content/uploads/sites/2/2015/06/977561.jpg")
                    .into(krugerImage);

            tvAttractionInfo.setText("Rhino Post Safari Lodge is an eco-friendly establishment,\n " +
                    "working hard to minimize its effect on the environment, \n" +
                    "while at the same time upholding 5-star luxury standards.\n " +
                    "On a 12,000 hectare private concession in the southern Kruger National Park, " +
                    "the benefits of traversing both the National Park’s roads " +
                    "and the private concession make for phenomenal game-viewing encounters."+
                    "  \n" +
                    "Address: Kruger National Park\n" +
                            "Phone: 011 467 1886");
            getSupportActionBar().setTitle("Rhino Lodge");

        } else if( id == FirstFragment.GODWINDOW) {
            Picasso.with(getApplicationContext())
                    .load("https://www.nightjartravel.com/sites/default/files/2013-1/Country%205.jpg")
                    .into(krugerImage);
            tvAttractionInfo.setText("God's Window is one the Blyde River Canyon Nature Reserve's most spectacular viewpoints, " +
                    "with astonishing views over South Africa's Lowveld" +
                    " (so-named because it is much lower than the high escarpment along which the Panorama Route runs"+
                     "   \n" +
                     "Address: R543, Ehlanzeni\n" +
                    "Area: 290 km²\n" +
                    "Hours: Open today · Open 24 hours\n" +
                    "Phone: 011 895 3000\n" +
                    "Established: November 1965");
            getSupportActionBar().setTitle("God's Window");


        }




    }
}
