package com.example.horton.news_panzhi.menu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by horto on 7/26/2015.
 */
public class NewsCenterPage extends BasePage{
    TextView textView;
    public NewsCenterPage(Context ct){
        super(ct);
    }

    @Override
    public View initView(LayoutInflater inflater) {

        textView = new TextView(ct);
        textView.setText("我是新闻");
        return textView;
    }

    @Override
    public void initData() {

    }

}
