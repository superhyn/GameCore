package com.example.administrator.gamecore.fragment.home;

/*       
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:55   
*/
public class HomeFragmentPresenterIml implements HomeFragmentContract.HomeFragmentPresenter {
    private HomeFragmentContract.HomeFragmentView view;
    private HomeFragmentContract.HomeFragmentModel model;

    public HomeFragmentPresenterIml(HomeFragmentContract.HomeFragmentView view, HomeFragmentContract.HomeFragmentModel model) {
        this.view = view;
        this.model = model;
    }
}
