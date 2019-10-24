package com.app_dev.criss.docsexpirationreminder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        DemoFragment demoFragment = new DemoFragment();
        position = position +1;

        Bundle bundle = new Bundle();

        //so this text is shown in the page, under tabs
        switch (position){
            case 1:
                //bundle.putString("message", "Fragment1: " + position);
                ActivityOne ActivityOne = new ActivityOne();
                return ActivityOne;
            case 2:
                ActivityTwo ActivityTwo = new ActivityTwo();
                return ActivityTwo;
            case 3:
                bundle.putString("message", "Fragment3: " + position);
                break;
        }
        demoFragment.setArguments(bundle);

        return demoFragment;
    }

    @Override
    public int getCount() {
        //count for available tabs
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position+1;
        //this text is shown in the tabs under title
        String positionStatus = "";
        //this text is shown in the tabs under title
        switch (position){
            case 1:
                positionStatus = "Add";
                break;
            case 2:
                positionStatus = "View";
                break;
            case 3:
                positionStatus = "Status";
                break;
        }
        return positionStatus;
    }
}
