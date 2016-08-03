package com.example.administrator.gamecore.mainactivity;

import android.graphics.BitmapFactory;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ViewConfiguration;
import android.widget.ImageView;

import com.example.administrator.gamecore.R;
import com.example.administrator.gamecore.adapter.MainContentVpAdapter;
import com.example.administrator.gamecore.adapter.MainTopVpAdapter;
import com.example.administrator.gamecore.bean.TopImgBean;
import com.example.administrator.gamecore.fragment.article.ArticleFragment;
import com.example.administrator.gamecore.fragment.home.HomeFragment;
import com.example.administrator.gamecore.fragment.news.NewsFragment;
import com.example.administrator.gamecore.fragment.station.StationFragment;
import com.example.administrator.gamecore.fragment.video.VideoFragment;
import com.example.administrator.gamecore.widget.indicator.CircleIndicator;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    //MVP
    private MainContract.MainModel mainModel;
    private MainContract.MainPresenter mainPresenter;


    //home--top
    private ViewPager topVp;
    private List<ImageView> mList;
    private MainTopVpAdapter mAdapter;
    private CircleIndicator topVp_indicator;

    //home--drawer
    private Toolbar main_toolbar;
    private DrawerLayout main_drawerLayout;

    //home----content
    private TabLayout main_tabLayout;
    private ViewPager fragement_vp;
    private List<Fragment> fragment_list;
    private String[] titile_list;
    private MainContentVpAdapter frg_vpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        initData();
        initView();

        mainModel = new MainModelIml();
        mainPresenter = new MainPresenterIml(this, mainModel);

        //activity中获取内容的话也就一个加载topViewPager
        mainPresenter.getBean();

    }


    /**
     * 初始化一些数据
     */
    private void initData() {
        //home---top
        mList = new ArrayList<>();
        ImageView iv1 = new ImageView(this);
        iv1.setScaleType(ImageView.ScaleType.FIT_XY);
        iv1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.top_vp_one));
        ImageView iv2 = new ImageView(this);
        iv2.setScaleType(ImageView.ScaleType.FIT_XY);
        iv2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.top_vp_two));
        ImageView iv3 = new ImageView(this);
        iv3.setScaleType(ImageView.ScaleType.FIT_XY);
        iv3.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.top_vp_three));

        mList.add(iv1);
        mList.add(iv2);
        mList.add(iv3);
        mAdapter = new MainTopVpAdapter(mList);


        //home---content
        fragment_list = new ArrayList<>();
        fillFragemntList(fragment_list);
        titile_list = new String[]{"电台", "视频", "首页", "新闻", "文章"};
        //TODO----fragment初始化
        frg_vpAdapter = new MainContentVpAdapter(getSupportFragmentManager(), fragment_list, titile_list);

    }

    /**
     * 将fragmetList数组中的fragment后去到
     *
     * @param fragment_list
     */
    private void fillFragemntList(List<Fragment> fragment_list) {
        fragment_list.add(new StationFragment());
        fragment_list.add(new VideoFragment());
        fragment_list.add(new HomeFragment());
        fragment_list.add(new NewsFragment());
        fragment_list.add(new ArticleFragment());

    }

    /**
     * 初始化控件
     */
    private void initView() {
        //home--top
        topVp = (ViewPager) findViewById(R.id.main_top_vp);
        topVp.setAdapter(mAdapter);
        topVp_indicator = (CircleIndicator) findViewById(R.id.main_topVp_indicator);
        topVp_indicator.setViewPager(topVp);

        main_toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        main_toolbar.inflateMenu(R.menu.activity_toolbar_menu);

        main_drawerLayout = (DrawerLayout) findViewById(R.id.main_drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, main_drawerLayout, main_toolbar, R.string.open, R.string.close);
        main_drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        //home----content
        fragement_vp = (ViewPager) findViewById(R.id.main_fragment_vp);
        main_tabLayout = (TabLayout) findViewById(R.id.main_frg_tabLayout);

        fragement_vp.setAdapter(frg_vpAdapter);
        main_tabLayout.setupWithViewPager(fragement_vp);


    }

    @Override
    public void onLoadJsonSuccess(TopImgBean bean) {


        List<TopImgBean.ResultsBean> results = bean.getResults();
        for(int i=0;i<results.size();i++){
            TopImgBean.ResultsBean resultsBean = results.get(i);
            Log.i("TAG", "onLoadJsonSuccess" + resultsBean.toString());
        }

    }
}
