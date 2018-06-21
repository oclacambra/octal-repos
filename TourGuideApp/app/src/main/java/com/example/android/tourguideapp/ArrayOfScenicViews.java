package com.example.android.tourguideapp;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class ArrayOfScenicViews extends AppCompatActivity {

    public static ArrayList<ScenicView> scenicViews = null;

    public  ArrayOfScenicViews(FragmentActivity activity) {

        scenicViews.add(new ScenicView("Golden Gate Bridge", "Golden Gate, San Francisco", "Scenery", "This is the Golden Gate Bridge", R.drawable.sfcity_1));
        scenicViews.add(new ScenicView("Golden Gate Bridge", "Golden Gate", "Scenery", "View from the north", R.drawable.sfcity_2));
        scenicViews.add(new ScenicView("Golden Gate Bridge", "Golden Gate, San Francisco", "Scenery", "View from the east", R.drawable.sfcity_3));
        scenicViews.add(new ScenicView("Golden Gate Bridge", "Golden Gate, San Franciso", "Scenery", "Another view", R.drawable.sfcity_4));
        scenicViews.add(new ScenicView("Golden Gate Bridge", "Golden Gate, San Francisco", "Scenery", "The bridge", R.drawable.sfcity_5));
        scenicViews.add(new ScenicView("Golden Gate Bridge", "Golden Gate, San Franciso", "Scenery", "Another views from afar", R.drawable.sfcity_6));
    }

    public  ArrayList<ScenicView> getScenicViews() {
        return scenicViews;
    }
}
