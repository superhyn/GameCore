package com.example.administrator.gamecore.mainactivity;

import com.example.administrator.gamecore.bean.TopImgBean;
import com.example.administrator.gamecore.beanService.TopImgBeanService;
import com.example.administrator.gamecore.config.UrlConfig;

import java.util.List;

import okhttp3.Callback;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/1 17:58   
*/
public class MainModelIml implements MainContract.MainModel{

    @Override
    public void getBean(retrofit2.Callback<TopImgBean> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.g-cores.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TopImgBeanService beanService = retrofit.create(TopImgBeanService.class);
        Call<TopImgBean> call = beanService.getTopImgBean();
        call.enqueue(callback);
    }
}
