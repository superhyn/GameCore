package com.example.administrator.gamecore.fragment.home;

import android.util.Log;

import com.example.administrator.gamecore.bean.HomeBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:55   
*/
public class HomeFragmentPresenterIml implements HomeFragmentContract.HomeFragmentPresenter {
    private HomeFragmentContract.HomeFragmentView view;
    private HomeFragmentContract.HomeFragmentModel model;

    public HomeFragmentPresenterIml(HomeFragmentContract.HomeFragmentView view, HomeFragmentContract.HomeFragmentModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void onLoadHomeBean() {
        model.onLoadHomeBean(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                Log.i("TAG",response.body().toString());
                view.onLoadHomeBeanSuccess(response.body());
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {

            }
        });
    }
}
