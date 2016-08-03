package com.example.administrator.gamecore.fragment.station;

import com.example.administrator.gamecore.base.IBaseModel;
import com.example.administrator.gamecore.base.IBasePresenter;
import com.example.administrator.gamecore.base.IBaseView;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:35   
*/
public class StationFragmentContract  {
    public interface StationFragmentView extends IBaseView{
        //TODO----view层的方法
    }

    public interface StationFragmentPresenter extends IBasePresenter{
        //TODO---Presenter---通知model下载数据 下载逻辑完成调用view层的方法更新控件
    }

    public interface StationFragmentModel extends IBaseModel {
        //TODO---Model要下载数据或者数据库读取数据的方法
    }


}
