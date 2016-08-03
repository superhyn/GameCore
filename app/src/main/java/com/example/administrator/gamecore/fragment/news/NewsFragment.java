package com.example.administrator.gamecore.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.gamecore.R;
import com.example.administrator.gamecore.fragment.home.HomeFragmentContract;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/2 18:57   
*/
public class NewsFragment extends Fragment implements NewsFragmentContract.NewsFragmentView{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_frg_layout,null);
        ListView listView = (ListView) view.findViewById(R.id.news_frg_listview);
        String[] str = new String[]{"hhh","sdfsdf","dsfsdf","fsdfsdf",
                "hhh","sdfsdf","dsfsdf","fsdfsdf","hhh","sdfsdf","dsfsdf","fsdfsdf",
                "hhh","sdfsdf","dsfsdf","fsdfsdf","hhh","sdfsdf","dsfsdf","fsdfsdf"
        };
        ArrayAdapter mAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,str);
        listView.setAdapter(mAdapter);


        return view;
    }
}
