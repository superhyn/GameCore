package com.example.administrator.gamecore.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:14   
*/
public class MainContentVpAdapter extends FragmentPagerAdapter {
    private List<Fragment> mList;
    private String[] titleList;

    public MainContentVpAdapter(FragmentManager fm, List<Fragment> mList, String[] titleList) {
        super(fm);
        this.mList = mList;
        this.titleList = titleList;
    }

    public MainContentVpAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList[position];
    }
}
