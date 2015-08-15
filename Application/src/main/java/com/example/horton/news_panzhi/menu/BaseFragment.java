package com.example.horton.news_panzhi.menu;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by horto on 8/15/2015.
 */
public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    protected Context ct;
    public View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ct = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = initView(inflater);
        return rootView;
    }

    protected abstract View initView(LayoutInflater inflater);

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData(savedInstanceState);
    }

    protected abstract void initData(Bundle savedInstanceState);

    @Override
    public void onClick(View v) {

    }

    protected abstract void processClick(View v);

    public View getRootView(){
        return rootView;
    }
}
