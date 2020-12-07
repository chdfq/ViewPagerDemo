package com.marten.viewpagerdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTl1;
    private ViewPager mVp1;
    private ArrayList<View> aList;
    private ArrayList<String> sList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTl1 = findViewById(R.id.tl_1);
        mVp1 = findViewById(R.id.vp_1);

        aList = new ArrayList<View>();
        aList.add(View.inflate(this, R.layout.view_one, null));
        aList.add(View.inflate(this, R.layout.view_two, null));
        aList.add(LayoutInflater.from(this).inflate(R.layout.view_three, null));
        aList.add(LayoutInflater.from(this).inflate(R.layout.view_four, null));

        sList = new ArrayList<>();
        sList.add("Home");
        sList.add("Notes");
        sList.add("User");
        sList.add("Setting");

        mVp1.setAdapter(new MyPagerAdapter(aList,sList));

        //绑定
        mTl1.setupWithViewPager(mVp1);
    }
}