package com.example.administrator.gamecore.mainactivity;

import com.example.administrator.gamecore.base.IBaseModel;
import com.example.administrator.gamecore.base.IBasePresenter;
import com.example.administrator.gamecore.base.IBaseView;
import com.example.administrator.gamecore.bean.TopImgBean;

import java.util.List;

import okhttp3.Callback;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/1 17:59   
*/
public class MainContract {

    public interface MainView extends IBaseView{
        void onLoadJsonSuccess(TopImgBean bean);
    }

    public interface MainPresenter extends IBasePresenter{
        void getBean();
    }

    public interface MainModel extends IBaseModel {
        void getBean(retrofit2.Callback<TopImgBean> callback);
    }

}
