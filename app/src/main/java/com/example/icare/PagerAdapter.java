package com.example.icare;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by developer on 1/8/16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOftabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs){
        super(fm);
        this.mNumOftabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BFragment tab1 = new BFragment();
                return tab1;
            case 1:
                CFragment tab2 = new CFragment();
                return tab2;
            case 2:
                DFragment tab3 = new DFragment();
                return tab3;
            case 3:
                DFragment tab4 = new DFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOftabs;
    }
}
