package com.example.administrator.gamecore.beanservice;

import com.example.administrator.gamecore.bean.TopImgBean;

import retrofit2.Call;
import retrofit2.http.GET;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 20:56   
*/
public interface TopImgBeanService {
    @GET("originals/home_slideshow?auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu")
    Call<TopImgBean> getTopImgBean();
}
