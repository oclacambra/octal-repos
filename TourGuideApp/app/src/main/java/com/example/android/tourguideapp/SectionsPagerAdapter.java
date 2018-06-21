package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    /**Context of the App*/
    private Context mContext;

    public SectionsPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new SceneryFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new DinersFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_city);
        } else if (position == 1) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 2) {
            return mContext.getString(R.string.category_events);
        } else {
            return mContext.getString(R.string.category_diners);
        }
    }


}
