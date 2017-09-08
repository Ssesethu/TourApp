package com.cake.codetribe.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class HotelInfomation extends AppCompatActivity {

    int id = 0;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_infomation);

        Bundle intent = getIntent().getExtras();
        id = intent.getInt(FirstFragment.ids);
        ImageView hotelImage =(ImageView)findViewById(R.id.imgHotel);

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
        TextView txtinfo = (TextView)findViewById(R.id.hotelinfo);

        if (id == HotelFragment.MERCURE) {
            Picasso.with(getApplicationContext())
                    .load("https://exp.cdn-hotels.com/hotels/1000000/490000/483200/483192/483192_114_z.jpg")
                    .into(hotelImage);
            txtinfo.setText("The 3-star Mercure Hotel Nelspruit offers excellent Lowveld hospitality to mid-range," +
                    " long-and short-stay guests. It is the ideal home-base for corporate and leisure travel in and around the Lowveld," +
                    " including the nearby Kruger National Park and Sudwala Caves. " +
                    "It is adjacent to the new ilanga Mall. Apartment-style suites offer guests self-catering," +
                    " room service, or dine-in restaurant options." +
                    " Enjoy cocktails at the pool while you take advangtage of the free Wi-Fi and the excellent weather.\n"+
                     "  \n" +
                     "Address: Corner &, Bitterbessie Street, Nelspruit, 1211\n" +
                    "Phone: 013 741 4222");
            getSupportActionBar().setTitle("Mercure Hotel");

        } else if( id ==  HotelFragment.LAVILLA) {


            Picasso.with(getApplicationContext())
                    .load("http://www.places.co.za/crs/photolarge/72857.jpg")
                    .into(hotelImage);
            txtinfo.setText("Set in a Tuscan-style mansion," +
                    " this refined hotel is 5 km from Nelspruit Nature Reserve, 1" +
                    "0 km from sports events at Mbombela Stadium and 13 km from Nelspruit Airport. \n" +
                    "\n" +
                    "Plush, stylish rooms provide flat-screen TVs, free Wi-Fi," +
                    " minibars, and tea and coffeemaking equipment. Some have 4-poster beds or private patios. " +
                    "Lavish suites add separate sitting areas. Room service is available.\n" +
                    "\n" +
                    "Secure parking and continental or hot breakfast are complimentary. " +
                    "There's also a gourmet restaurant, an outdoor pool and a piano lounge with a bar," +
                    " plus a hot tub on a shared patio. A spa offers massages and a fitness room." +
                    " Kids age 7 and over are welcome.\n" +
                    "   \n" +
                     "Address: 21 Klipspringer St, The Rest 454-Jt, Nelspruit, 1200\n" +
                    "Phone: 013 752 5370");

            getSupportActionBar().setTitle("La Villa Vita Hotel");
        } else if( id == HotelFragment.PROTEA) {

            Picasso.with(getApplicationContext())
                    .load("https://sncdn.com/db/id/229222/g2001175.jpg")
                    .into(hotelImage);
            txtinfo.setText("Protea Hotel Nelspruit has 94 rooms. " +
                    "All rooms are equipped with satellite televisions, " +
                    "hairdryers and free Wi-Fi, " +
                    "and all bathrooms have separate baths and showers at this accommodation in Mpumalanga. " +
                    "Accommodation consists of 12 Rooms, 18 Single Rooms, 32 Double Rooms," +
                    " 20 King Rooms, 10 Executive Suites and 2 rooms with universal access.\n" +
                    "\n" +
                    "The Fig Tree Restaurant at this accommodation in Nelspruit serves a delicious and mouthwatering breakfast buffet ," +
                    "while a la carte lunch and dinner is available 7 days a week. The Fig Tree Bar," +
                    " is an ideal venue to chill out on the deck with a refreshing cocktail or pre-dinner drink. " +
                    "Room service is available for your convenience from 6:30am until 10:30pm daily.\n" +
                    "\n" +
                    "In-room Facilities\n" +
                    "\n" +
                    "Air-conditioning\n" +
                    "Satellite TV channels\n" +
                    "Crisp white linen on all the beds\n" +
                    "Hairdryer\n" +
                    "Laptop-friendly safes in the room\n" +
                    "Tea and coffee making facilities\n" +
                    "Room service\n"+
                     "  \n" +
                    "Address: 30 Orchards, Jerepico St, Nelspruit, 1200\n" +
                    "Phone: 013 752 3948");

            getSupportActionBar().setTitle("Protea Hotel");
        } else if
                ( id == HotelFragment.PROMANADE) {

            Picasso.with(getApplicationContext())
                    .load("https://t-ec.bstatic.com/images/hotel/max1024x768/278/27878533.jpg")
                    .into(hotelImage);
            txtinfo.setText("Adjacent to the Promenade Shopping Centre, " +
                    "this classic hotel with a clock tower is 4 km from the Nelspruit Botanical Gardens" +
                    " and 7 km from the Mbombela Stadium. \n" +
                    "\n" +
                    "Straightforward rooms offer en suite bathrooms, " +
                    "plus cable TV, WiFi (fee), and tea and coffeemaking equipment." +
                    " Upgraded rooms are airy, and have refined wood furnishings, " +
                    "custom-made dressing tables, flat-screen TVs and minifridges.\n" +
                    "\n" +
                    "Continental breakfast is complimentary." +
                    "A laid-back restaurant serves buffet-style meals," +
                    " and casual pub fare is offered at a lounge bar." +
                    " There's an outdoor pool in a courtyard that also has a bar. " +
                    "Event facilities and secured parking are available.\n"+
                    " \n" +
                    "Address: Samora Machel Dr & Henshall Street, Nelspruit Central, Nelspruit, 1200\n" +
                    "Phone: 013 753 3000");
            getSupportActionBar().setTitle("Promenade Hotel");

        } else if( id == HotelFragment.CHILL_PEPPER) {

            Picasso.with(getApplicationContext())
                    .load("https://s-ec.bstatic.com/images/hotel/max1024x768/741/74141119.jpg")
                    .into(hotelImage);
            txtinfo.setText("Discover our Luxury Boutique Hotel nestled in the heart of Nelspruit." +
                    "  You can't miss us in our prime location opposite the Riverside Mall.\n" +
                    " \n" +
                    "Come and experience the comfort of our designer rooms," +
                    " each one personalized to add that special touch! " +
                    " Chill Pepper offers 73 rooms with a comfortable " +
                    "and modern open plan design that allows for pure relaxation and enjoyment.\n" +
                    " \n" +
                    "Enjoy the relaxing Lowveld vibe nest to the pool or in our Chill Lounge," +
                    " while sipping on an ice cold drink.  " +
                    "Our two boardrooms offer seamless audio visual solutions." +
                    "  Sweat it out in our Hot Pepper Gym or treat yourself to some \"me time\" in our Green Pepper Beauty Spa.\n" +
                    " \n" +
                    "You will yearn for any opportunity to return to the Chill Pepper Boutique Hotel!\n" +
                    " \n" +
                    "Address: 8 Ripple Crescent, Riverside Park,, Nelspruit, 1200\n" +
                    "Phone:013 757 0370");
            getSupportActionBar().setTitle("Chill Pepper Hotel");

        } else if( id == HotelFragment.TOWN_LODGE) {

            Picasso.with(getApplicationContext())
                    .load("http://g.otcdn.com/imglib/hotelfotos/8/111/hotel-town-lodge-nelspruit-036.jpg")
                    .into(hotelImage);
            txtinfo.setText("The Town Lodge Nelspruit is situated in a lovely garden with rolling lawns and a swimming pool. " +
                    "It is centrally located close to restaurants," +
                    " just off the N4 motorway," +
                    " 30 minutes from Kruger Mpumalanga International Airport and 2 minutes from Nelspruit`s CBD. \n" +
                    "\n" +
                    "The Town Lodge Nelspruit is the perfect base for exploring the Kruger National Park -" +
                    " just 70 minutes from the Paul Kruger Gate and 30 minutes from the Malelane Gate. " +
                    "It is also the ideal stopover to get to the Mozambique border post early in the morning. \n" +
                    "\n" +
                    "The Town Lodge Nelspruit has 106 rooms on offer and are all fully carpeted," +
                    " spacious and air-conditioned with double or twin beds," +
                    " television with M-Net and radio with all popular stations," +
                    " en-suite bathrooms with maxi shower and tea and coffee making facilities. " +
                    "One in fifty rooms is designed to meet the special needs of the physically disabled and interleading family rooms are available.\n" +
                    "\n" +
                    "Town Lodge Nelspruit comprises the features synonymous with Town Lodges around the country such as spacious rooms with maxi showers," +
                    " ample free parking, a swimming pool, breakfast and an evening bar service.\n" +
                    " \n" +
                    "Address: 50 Koorsboom St & Madiba Dr, Mbombela, Nelspruit, 1200\n" +
                    "Phone: 013 741 1444");

            getSupportActionBar().setTitle("Town Lodge Hotel");

        } else if( id == HotelFragment.CYCAD_LODGE) {

            Picasso.with(getApplicationContext())
                    .load("http://www.cycadlodge.com/wp-content/uploads/photo-gallery/Gardens%202.jpg")
                    .into(hotelImage);
            txtinfo.setText("The 4 star Cycad Lodge is located in the scenic and sunny Nelspruit in the Lowveld, " +
                    "offering bed and breakfast and self catering accommodation." +
                    "The shopping mall and restaurants are within close proximity." +
                    "The famous Kruger National Park is close by. \n" +
                    "\n" +
                    "The lodge serves a delicious breakfast daily and guests can look forward to relaxing at the sparkling swimming pool." +
                    " The barbeque area is ideal for outdoor dining and entertainment. " +
                    "There is safe and secure parking onsite and the staff are on hand to wash vehicles." +
                    " There is access to the internet and a laundry service is available on request. " +
                    "The property also has a conference venue. \n" +
                    "Standard rooms are en-suite and each offers a satellite television," +
                    " tea and coffee making facilities, amenities and a safety deposit box. " +
                    "Rooms are serviced daily\n" +
                    " \n" +
                    "Address: 17B Koraalboom Ave, West Acres, Nelspruit, 1211\n" +
                    "Phone: 013 741 4979");
            getSupportActionBar().setTitle("Cycad Lodge");

        } else if( id == HotelFragment.SHANDON) {

            Picasso.with(getApplicationContext())
                    .load("https://static.wheretostay.co.za/resources/0/2/8/02872/138523_634x424.jpg")
                    .into(hotelImage);

            txtinfo.setText("Surrounded by landscaped tropical gardens and 7 km from Nelspruit's centre," +
                    " this unpretentious guesthouse in a posh ranch-style home is 37 km from Mthethomusha Game Reserve's game" +
                    " drives and guided walks to San rock art sites.\n" +
                    "\n" +
                    "The 9 guestrooms offer private entrances, and traditional or country decor." +
                    " All rooms include satellite TV, minifridges, free Wi-Fi, and tea and coffeemaking equipment.\n" +
                    "\n" +
                    "Cooked English breakfast is included. " +
                    "A 2-course dinner is available by request for a surcharge. " +
                    "There's a simple bar and a classic lounge with seating under a chandelier. " +
                    "A covered deck with a fountain overlooks an outdoor pool set in a brick courtyard\n" +
                    " \n" +
                    "Address: 58 Von Braun St, Nelspruit, 1201\n" +
                    "Phone: 013 744 9934");
            getSupportActionBar().setTitle("Shandon Lodge");


        }

    }
}
