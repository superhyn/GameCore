package com.example.administrator.gamecore.fragment.article;

/*       
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:52   
*/
public class ArticleFragmentPresenterIml implements ArticleFragmentContract.ArticleFragmentPresenter {
    private ArticleFragmentContract.ArticleFragmentView view;
    private ArticleFragmentContract.ArticleFragmentModel model;

    public ArticleFragmentPresenterIml(ArticleFragmentContract.ArticleFragmentView view, ArticleFragmentContract.ArticleFragmentModel model) {
        this.view = view;
        this.model = model;
    }

    //TODO
}
