package com.example.administrator.gamecore.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.gamecore.R;
import com.example.administrator.gamecore.bean.HomeBean;

import java.util.List;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/3 15:48   
*/
public class HomeListViewAdapter extends BaseQuickAdapter<HomeBean.ResultsBean> {


    public HomeListViewAdapter(int layoutResId, List<HomeBean.ResultsBean> data) {
        super(layoutResId, data);
        Log.i("TAG","yunxingbuyunxinga");
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, HomeBean.ResultsBean resultsBean) {
        Log.i("TAG","yunxingbuyunxinga");
        baseViewHolder.setText(R.id.home_user_name,resultsBean.getData().getUser().getNickname());
        baseViewHolder.setText(R.id.home_user_time,resultsBean.getData().getCreated_at());
        baseViewHolder.setText(R.id.home_type,resultsBean.getData().getType());
        baseViewHolder.setText(R.id.home_like_tv,resultsBean.getData().getLikes_num()+"");
        baseViewHolder.setText(R.id.home_comments_tv,resultsBean.getData().getComments_num()+"");
        baseViewHolder.setText(R.id.home_title,resultsBean.getData().getTitle());
        baseViewHolder.setText(R.id.home_desc,resultsBean.getData().getDesc());

//        Glide.with(baseViewHolder.convertView.getContext())
//                .load(resultsBean.getData().getCover_url())
//                .into((ImageView) baseViewHolder.getView(R.id.home_iv));
//
//        Glide.with(baseViewHolder.convertView.getContext())
//                .load(resultsBean.getData().getUser().getThumb_url())
//                .into((ImageView) baseViewHolder.getView(R.id.home_user_iv));


    }
}