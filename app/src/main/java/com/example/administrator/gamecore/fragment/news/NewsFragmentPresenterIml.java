package com.example.administrator.gamecore.fragment.news;

/*       
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:59   
*/
public class NewsFragmentPresenterIml implements NewsFragmentContract.NewsFragmetPresenter {
    private NewsFragmentContract.NewsFragmentView view;
    private NewsFragmentContract.NewsFragmentModel model;

    public NewsFragmentPresenterIml(NewsFragmentContract.NewsFragmentView view, NewsFragmentContract.NewsFragmentModel model) {
        this.view = view;
        this.model = model;
    }
}
