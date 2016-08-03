package com.example.administrator.gamecore.mainactivity;

import android.util.Log;

import com.example.administrator.gamecore.bean.TopImgBean;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/1 18:01   
*/
public class MainPresenterIml implements MainContract.MainPresenter {

    private MainContract.MainView mainView;
    private MainContract.MainModel mainModel;

    public MainPresenterIml(MainContract.MainView mainView, MainContract.MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

    @Override
    public void getBean() {
        mainModel.getBean(new retrofit2.Callback<TopImgBean>() {
            @Override
            public void onResponse(retrofit2.Call<TopImgBean> call, retrofit2.Response<TopImgBean> response) {
                Log.i("TAG",response.body().toString());
                mainView.onLoadJsonSuccess( response.body());
            }

            @Override
            public void onFailure(retrofit2.Call<TopImgBean> call, Throwable t) {

            }
        });

    }
}
