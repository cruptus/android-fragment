package com.cruptus.tpfragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.astuetz.PagerSlidingTabStrip;


public class MainActivity extends AppCompatActivity implements PremierFragment.DataTransmit{

    private PageAdapter pageAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pageAdapter = new PageAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(pageAdapter);

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.fragments);
        tabs.setShouldExpand(true);
        tabs.setViewPager(viewPager);
    }

    @Override
    public void transmit(String data) {
        DeuxiemeFragment tab2Fragment=(DeuxiemeFragment) pageAdapter.getItem(1);
        tab2Fragment.changeData(data);
    }
}
