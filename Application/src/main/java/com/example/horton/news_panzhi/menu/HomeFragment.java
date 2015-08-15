package com.example.horton.news_panzhi.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.horton.news_panzhi.R;

/**
 * Created by horto on 8/15/2015.
 */
public class HomeFragment extends BaseFragment {
    @Override
    protected View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.frag_home, null);

        return view;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void processClick(View v) {

    }
}
