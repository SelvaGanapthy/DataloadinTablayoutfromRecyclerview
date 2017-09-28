package com.example.admin.dataloadintablayoutfromrecyclerview;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity   {
Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager(),MainActivity.this);
        viewPager.setAdapter(pagerAdapter);
        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        for(int i=0;i<tabLayout.getTabCount();i++)
        {
            TabLayout.Tab tab=tabLayout.getTabAt(i);
            tab.setCustomView(pagerAdapter.getTabView(i));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

 @Override
    public boolean onCreateOptionsMenu(MenuItem item1) {
        int id=item1.getItemId();
        if(id==R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item1);
    }
    class PagerAdapter extends FragmentPagerAdapter
    {
        Context context;
        String[] titles_tab={"first_tab","second_tab","third_tab"};

        public PagerAdapter(FragmentManager fm,Context context)
        {
            super(fm);
            this.context=context;
        }

        @Override
        public int getCount() {
            return titles_tab.length;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:return  new BlankFragment();
                case 1: return  new BlankFragment();
                case 2:return  new BlankFragment();
            }
            return null;
        }
        @Override
        public CharSequence getPageTitle ( int position){
            return titles_tab[position];
        }
        public View getTabView(int position)
        {
            View tab= LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_tab,null);
            TextView tv=(TextView)tab.findViewById(R.id.custom_text);
            tv.setText(titles_tab[position]);
            return tab;
        }
    }
}