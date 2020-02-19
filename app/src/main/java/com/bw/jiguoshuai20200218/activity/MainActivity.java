package com.bw.jiguoshuai20200218.activity;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bw.jiguoshuai20200218.R;
import com.bw.jiguoshuai20200218.fragment.Five;
import com.bw.jiguoshuai20200218.fragment.For;
import com.bw.jiguoshuai20200218.fragment.One;
import com.bw.jiguoshuai20200218.fragment.Three;
import com.bw.jiguoshuai20200218.fragment.Two;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ImageView iv;
    private TabLayout tb;
    private ViewPager vp;
    private ArrayList<Fragment> list=new ArrayList<>();
    private ArrayList<String> tabs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        tb = findViewById(R.id.tb);
        vp = findViewById(R.id.vp);
        One one = new One();
        Two two = new Two();
        Three three = new Three();
        For aFor = new For();
        Five five = new Five();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(aFor);
        list.add(five);
        tabs.add("最新");
        tabs.add("婆媳");
        tabs.add("房产");
        tabs.add("仲裁");
        tabs.add("北京");
        tb.addTab(tb.newTab().setTag(tabs.get(0)));
        tb.addTab(tb.newTab().setTag(tabs.get(1)));
        tb.addTab(tb.newTab().setTag(tabs.get(2)));
        tb.addTab(tb.newTab().setTag(tabs.get(3)));
        tb.addTab(tb.newTab().setTag(tabs.get(4)));
        tb.setupWithViewPager(vp);
        ViewAdpter adpter = new ViewAdpter(getSupportFragmentManager());
        vp.setAdapter(adpter);
    }
    private class ViewAdpter extends FragmentPagerAdapter {

        public ViewAdpter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return list.get(i);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabs.get(position);
        }
    }
}
