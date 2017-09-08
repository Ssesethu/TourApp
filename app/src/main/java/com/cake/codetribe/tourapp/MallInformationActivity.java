package com.cake.codetribe.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MallInformationActivity extends AppCompatActivity {

    int id = 0;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall_information);

        Bundle intent = getIntent().getExtras();
        id = intent.getInt(FirstFragment.ids);
        ImageView mallImage = (ImageView) findViewById(R.id.imgMall);
        TextView txtMall = (TextView)findViewById(R.id.mallinfo);
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


        if (id == MallFragment.ILANGA) {
                    Picasso.with(getApplicationContext())
                    .load("http://www.ilangamall.co.za/images/gallery/ilanga/ilanga-mall-03.jpg")
                    .into(mallImage);
                    txtMall.setText("i'langa Mall's carefully planned mix of tenants," +
                    " fresh design, superb location and easy access offers every good reason for NELSPRUIT" +
                    " and surrounding citizens to embrace it as their shopping and dining venue of choice.\n" +
                    "\n"+
                    "i'langa Mall (i'langa meaning 'sun') has an extensive offering of popular national retailers " +
                    "as well as a number of unique independent retailers offering specialized products and services, " +
                    "many of which are local businesses. This means that overall shoppers have access to many top brands, " +
                    "exceptional stores and a superb comparative shopping experience which is also unique in every way.\n" +
                    "\n"+
                    "The enclosed air-conditioned i'langa Mall caters for all shoppers' needs in a modern highly-pleasing shopping environment." +
                    " Furthermore a vibrant open-air piazza concept offers an exciting variety of distinctive restaurants.\n" +
                    " \n" +
                    "Address: Corner of Bitterbessie and Flamboyant Street, Nelspruit, 1200\n" +
                    "Hours: Open today · 9AM–6PM\n" +
                    "Phone: 013 742 2293");
            getSupportActionBar().setTitle("Ilanga Mall");
        } else if (id == MallFragment.RIVERSIDE) {

            Picasso.with(getApplicationContext())
                    .load("http://salifestyleblog.co.za/wp-content/uploads/2016/01/016_RiversideMall-Shop.jpg")
                    .into(mallImage);
            txtMall.setText("Riverside Mall has, since 1998," +
                    " established itself as the leading entertainment and shopping destination in Nelspruit. " +
                    "Ideally situated in the fastest development node of the capital city of Nelspruit " +
                    "and en-route to the Maputo Corridor in Mozambique, Riverside mall has over 140 stores," +
                    " top class restaurants, movies and more, drawing people from across the Mpumalanga province" +
                    " as well as shoppers from Neighbouring countries – Mozambique and Swaziland.\n" +
                    "\n" +
                    "Riverside Mall offers a high standard of shopping" +
                    " and a variety of activities for convenience and pleasure," +
                    " and constantly seeks opportunities to develop and grow, " +
                    "ensuring that it lives up to its brand promise of ‘More than a Mall’.\n" +
                    " \n" +
                    "Trading Hours*\n" +
                    "\n" +
                    "Monday to Saturday : 09:00 – 18:00\n" +
                    "Sundays : 09:00 – 15:00\n" +
                    "Public Holidays : 09:00 – 15:00");
            getSupportActionBar().setTitle("Riverside Mall");
        } else if (id == MallFragment.EMOYENI ){

                  Picasso.with(getApplicationContext())
                    .load("http://ikotwe.co.za/wp-content/uploads/2015/11/Emoyeni-Mall-Nelspruit-17.jpg")
                    .into(mallImage);
                    txtMall.setText("The Mall opened its doors on Friday 24 April and provides the ultimate in top quality," +
                    " convenient shopping for the communities of Daantjie, Msogwaba, Pienaar, Kabokweni" +
                    " and Kanyamazane who previously had to travel up to 20km’s to fulfil their retail needs. \n" +
                    "\n" +
                    "“Not only are we bringing top class retail to a population of over120 000 people, " +
                    "we are saving them a significant amount of money that they would previously have had " +
                    "to spend on transport costs to get to Nelspruit,” explains MD of McCormick Property Development, Jason McCormick.  \n" +
                    "\n" +
                    "Tenants include Shoprite, Pick n Pay, Truworths, Foschini, Liquor City, Roots Butchery, " +
                    "Mr Price, Capitec Bank, Sheet Street, Rage, Edgars Active and Clicks. " +
                    "A fully serviced Co.Fi restaurant brings a unique lifestyle element to the " +
                    "centre that will contribute to the entertainment on offer. The Mall is a fully enclosed," +
                    " modern centre with over 70 storesproviding the latest fashion, grocery and food retailers. \n" +
                    " \n" +
                    "Address 75, Emoyeni Mall,  Remainder of Portion 24," +
                    " Mbombela(Nelspruit), Mbombela(Nelspruit), Mpumalanga, 0000.\n" +
                    "Opening hours\n" +
                    "\n" +
                    "Monday 09.00 - 18.00\n" +
                    "Tuesday 09.00 - 18.00\n" +
                    "Wednesday 09.00 - 18.00\n" +
                    "Thursday 09.00 - 18.00\n" +
                    "Friday 09.00 - 18.00\n" +
                    "Saturday 08.00 - 18.00\n" +
                    "Sunday 09.00 - 15.00\n" +
                    "Public Holidays 09.00 - 15.00\n" +
                    "Call to confirm\n" +
                    "Contact Details\n" +
                    "\n" +
                    "Shop telephone 1 013 747 2019 Shop telephone 2 013 747 2006");

            getSupportActionBar().setTitle("Emoyeni Mall");
        } else if (id == MallFragment.PROMANADE) {
                    Picasso.with(getApplicationContext())
                    .load("http://s3.amazonaws.com/i1338443035/dlf-promenade_6612692_l.jpg")
                    .into(mallImage);
                     txtMall.setText("Promenade Shopping Centre is located in Nelspruit, " +
                    "South Africa. Company is working in Shopping centres business activities.\n"+
                    "\n" +
                    "Address: Ste15 Promenade Ctr, Louis Trichardt St, Nelspruit, 1201\n" +
                    "Hours: Open today · 7AM–6PM\n" +
                    "Phone: 013 755 1623");
            getSupportActionBar().setTitle("Promanade Mall");


        }
    }
}
