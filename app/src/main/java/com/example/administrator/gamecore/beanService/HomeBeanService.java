package com.example.administrator.gamecore.beanservice;

import com.example.administrator.gamecore.bean.HomeBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/3 20:52   
*/
public interface HomeBeanService {
    @GET("home?page=5&auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu")
    Call<HomeBean> getHomeBean();
}
