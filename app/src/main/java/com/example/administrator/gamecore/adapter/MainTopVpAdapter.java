package com.example.administrator.gamecore.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import javax.crypto.spec.PSource;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 14:37   
*/
public class MainTopVpAdapter extends PagerAdapter {
    public List<ImageView> mList;

    public MainTopVpAdapter(List<ImageView> mList) {
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mList.get(position));
        return mList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView(mList.get(position));
    }
}
