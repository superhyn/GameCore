package com.example.administrator.gamecore.fragment.station;

import com.example.administrator.gamecore.base.IBaseModel;
import com.example.administrator.gamecore.base.IBaseView;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:36   
*/
public class StationFragmentPresenterIml implements StationFragmentContract.StationFragmentPresenter{
    private IBaseModel model;
    private IBaseView view;

    public StationFragmentPresenterIml(IBaseModel model, IBaseView view) {
        this.model = model;
        this.view = view;
    }

    //TODO自己的方法是供view层调用
    //TODO在自己的方法中调用model层的方法加载数据 加载完成 在调用view层的方法
}
