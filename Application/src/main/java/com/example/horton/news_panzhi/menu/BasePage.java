package com.example.horton.news_panzhi.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by horto on 7/26/2015.
 */
public abstract class BasePage {
    private View view;
    public Context ct;

    /**
     * 1. 画界面
     * 2. 初始化数据
     */
    public BasePage(Context ct){
        this.ct = ct;
        LayoutInflater inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = initView(inflater);
    }

    public View getRootView(){
        return view;
    }

    public abstract View initView(LayoutInflater inflater);

    public abstract void initData();


    public View getContentView() {
        return view;
    }
}
