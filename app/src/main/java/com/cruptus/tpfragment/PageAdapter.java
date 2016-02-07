package com.cruptus.tpfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    private String[] labels = {"Choisir", "Vue"};
    private PremierFragment frag1;
    private DeuxiemeFragment frag2;

    public PageAdapter(FragmentManager fm) {
        super(fm);
        frag1 = new PremierFragment();
        frag2=new DeuxiemeFragment();
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return frag1;
            case 1:
                return frag2;
        }
        return null;
    }

    @Override
    public int getCount() {
        return labels.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return labels[position];
    }
}
