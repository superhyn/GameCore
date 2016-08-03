package com.example.administrator.gamecore.fragment.video;

/*       
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 19:02   
*/
public class VideoFragmentPresenterIml implements VideoFragmentContract.VideoFragmentPresenter {
    private VideoFragmentContract.VideoFragmentView view;
    private VideoFragmentContract.VideoFragmentModel model;

    public VideoFragmentPresenterIml(VideoFragmentContract.VideoFragmentView view, VideoFragmentContract.VideoFragmentModel model) {
        this.view = view;
        this.model = model;
    }
}
