package com.example.android.tourguideapp;

import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    //public static ArrayList<ScenicView> scenicViews = new ArrayList<ScenicView>();
    //FragmentTransaction fragmentTransaction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get data
       //ArrayOfScenicViews arrayOfScenicViews = new ArrayOfScenicViews(MainActivity.this);
       //scenicViews = arrayOfScenicViews.getScenicViews();

        //Create the data using bundle
       // Bundle bundle = new Bundle();
       // bundle.putSerializable("scenicList", scenicViews);

        //Pass over the bundle to the fragment
        //CityFragment cityFragment = new CityFragment();
       // cityFragment.setArguments(bundle);
        //fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.container, cityFragment).commit();

        //Passing data by Intent
        //Intent intent = new Intent(MainActivity.this, CityFragment.class);
        //intent.putExtras(bundle);
        //startActivity(intent);





        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.viewpager_adapter_layout);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

    }
}
