package com.example.horton.news_panzhi.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


/**
 * Created by horto on 7/26/2015.
 */
public class GovAffairsPage extends BasePage {
    public GovAffairsPage(Context ct){
        super(ct);
    }

    @Override
    public View initView(LayoutInflater inflater) {
        TextView textView = new TextView(ct);
        textView.setText("我是指南");
        return textView;
    }

    @Override
    public void initData() {

    }
}
