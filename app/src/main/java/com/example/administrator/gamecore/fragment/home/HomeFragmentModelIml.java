package com.example.administrator.gamecore.fragment.home;

import com.example.administrator.gamecore.bean.HomeBean;
import com.example.administrator.gamecore.beanservice.HomeBeanService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:55   
*/
public class HomeFragmentModelIml implements HomeFragmentContract.HomeFragmentModel {
    @Override
    public void onLoadHomeBean(Callback<HomeBean> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.g-cores.com/api/originals/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HomeBeanService homeBeanService = retrofit.create(HomeBeanService.class);
        Call<HomeBean> homeBeanCall = homeBeanService.getHomeBean();
        homeBeanCall.enqueue(callback);
    }
}
