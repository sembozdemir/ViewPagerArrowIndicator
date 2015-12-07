package com.sembozdemir.viewpagerarrowindicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sembozdemir.viewpagerarrowindicator.library.ViewPagerArrowIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPagerArrowIndicator viewPagerArrowIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerArrowIndicator = (ViewPagerArrowIndicator) findViewById(R.id.viewPagerArrowIndicator);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        viewPagerArrowIndicator.bind(viewPager);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0:
                    return SimpleFragment.newInstance("Page 1");
                case 1:
                    return SimpleFragment.newInstance("Page 2");
                case 2:
                    return SimpleFragment.newInstance("Page 3");
                case 3:
                    return SimpleFragment.newInstance("Page 4");
                default:
                    return SimpleFragment.newInstance("Page 99");
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
