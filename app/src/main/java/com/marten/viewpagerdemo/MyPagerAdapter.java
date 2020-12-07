package com.marten.viewpagerdemo;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class MyPagerAdapter extends PagerAdapter {

    private ArrayList<View> viewLists;
    private ArrayList<String> sList;

    public MyPagerAdapter() {

    }

    public MyPagerAdapter(ArrayList<View> viewLists, ArrayList<String> sList) {
        this.viewLists = viewLists;
        this.sList = sList;
    }

    @Override
    public int getCount() {
        return viewLists.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(viewLists.get(position));
        return viewLists.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(viewLists.get(position));
    }

    //设置标题
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return sList.get(position);
    }
}
