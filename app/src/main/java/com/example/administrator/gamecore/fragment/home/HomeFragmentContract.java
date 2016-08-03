package com.example.administrator.gamecore.fragment.home;

import com.example.administrator.gamecore.base.IBaseModel;
import com.example.administrator.gamecore.base.IBasePresenter;
import com.example.administrator.gamecore.base.IBaseView;
import com.example.administrator.gamecore.bean.HomeBean;

import okhttp3.Callback;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:53   
*/
public class HomeFragmentContract {
    public interface HomeFragmentView extends IBaseView{
        void onLoadHomeBeanSuccess(HomeBean bean);
    }

    public interface HomeFragmentPresenter extends IBasePresenter{
        void onLoadHomeBean();
    }

    public interface HomeFragmentModel extends IBaseModel{
        void onLoadHomeBean(retrofit2.Callback<HomeBean> callback);
    }
}
