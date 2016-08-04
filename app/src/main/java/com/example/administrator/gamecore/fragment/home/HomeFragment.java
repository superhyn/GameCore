package com.example.administrator.gamecore.fragment.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.administrator.gamecore.R;
import com.example.administrator.gamecore.adapter.HomeRecyclerViewAdapter;
import com.example.administrator.gamecore.bean.HomeBean;
import com.example.administrator.gamecore.widget.indicator.devideritem.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:53   
*/
public class HomeFragment extends Fragment implements HomeFragmentContract.HomeFragmentView {

    private HomeRecyclerViewAdapter mAdapter;
    private List<HomeBean.ResultsBean> mList;
    private RecyclerView recyclerView;
    private static int page = 5;

    private HomeFragmentContract.HomeFragmentModel model;
    private HomeFragmentContract.HomeFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_frg_layout, null);
        model = new HomeFragmentModelIml();
        presenter = new HomeFragmentPresenterIml(this, model);

        //通知要下载数据了
        presenter.onLoadHomeBean(page);

        //接下来就可以获取数据源
        mList = new ArrayList<>();
        mAdapter = new HomeRecyclerViewAdapter(R.layout.home_frg_item_layout, mList);

        recyclerView = (RecyclerView) view.findViewById(R.id.home_frg_recycler);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        //设置分割线
        recyclerView.addItemDecoration(new DividerItemDecoration(
                getContext(), DividerItemDecoration.VERTICAL_LIST));

        //设置适配器
        recyclerView.setAdapter(mAdapter);

        //下来刷新
        mAdapter.openLoadMore(2,true);
        mAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
               presenter.onLoadHomeBean(++page);
            }
        });
        return view;
    }

    @Override
    public void onLoadHomeBeanSuccess(HomeBean bean) {
        Log.i("TAG","onLoadHomeBeanSuccess");
        if(mList.size()>1){
            //重复加载的过程
            List<HomeBean.ResultsBean> tempList = new ArrayList<>();
            tempList.addAll(bean.getResults());
            mAdapter.notifyDataChangedAfterLoadMore(tempList,true);
        }else{
            mList.addAll(bean.getResults());
            mAdapter.notifyDataSetChanged();
        }

    }
}
