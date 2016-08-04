package com.example.administrator.gamecore.beanservice;

import com.example.administrator.gamecore.bean.HomeBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/3 20:52   
*/
public interface HomeBeanService {
    @GET("home")
    Call<HomeBean> getHomeBean(@Query("page") int page,@Query("auth_exclusive") String auth_exclusive);
}
