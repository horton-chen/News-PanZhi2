package com.example.horton.news_panzhi.menu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.horton.news_panzhi.MainActivity;
import com.example.horton.news_panzhi.NavigationDrawerFragment;
import com.example.horton.news_panzhi.R;
import com.lidroid.xutils.ViewUtils;

import java.util.ArrayList;

/**
 * Created by horto on 8/15/2015.
 */
public class HomeFragment extends BaseFragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    private static String TAG = "MainActivity";


    /**底部栏对应的页面集合*/
    private ArrayList<BasePage> pages = new ArrayList<BasePage>();

    private CustomViewPager viewPager;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static HomeFragment newInstance(int sectionNumber) {
        Log.i(TAG, "This is HomeFragment newInstance");
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "This is HomeFragment onCreateView");
        View rootView = inflater.inflate(R.layout.frag_home, container, false);
        return rootView;
    }
*/

    @Override
    protected View initView(LayoutInflater inflater) {
        Log.i(TAG, "This is HomeFragment initView");
        View rootView = inflater.inflate(R.layout.frag_home, null);
//        ViewUtils.inject(this, rootView);
        return rootView;
    }

/*
    @Override
    public void onAttach(Activity activity) {
        Log.i(TAG, "This is HomeFragment onAttach");
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }
*/


    @Override
    protected void initData(Bundle savedInstanceState) {

        /** 获取抽屉对象 */
        NavigationDrawerFragment mNavigationDrawerFragment =
                ((MainActivity) getActivity()).getNavigationDrawerFragment();

        /** 添加底部栏对象 */
//        pages.add(new FunctionPage(ct));
        pages.add(new NewsCenterPage(ct));
        pages.add(new SmartServicePage(ct));
        pages.add(new GovAffairsPage(ct));
        pages.add(new SettingPage(ct));

/*
        viewPager.setAdapter(mPagerAdapter);
//        viewPager.setScrollable(false); // 不能滑动
        //不进行预加载
//        viewPager.setOffscreenPageLimit(0);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                BasePage page = pages.get(position);
//                if (!page.isLoadSuccess) {
                    page.initData();
//                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        pages.get(0).initData();    // 一开始先初始化第一页的数据
        viewPager.setCurrentItem(0);
*/

    }

    @Override
    protected void processClick(View v) {

    }

    public void setHomeFragment(int itemID){
        switch (itemID){
            case R.id.menu_news:
                Toast.makeText(ct, "This is menu_news", Toast.LENGTH_SHORT).show();
//                pages.get(0).onResume();

//                viewPager.setCurrentItem(0, false);
                break;

            case R.id.menu_read:
                Toast.makeText(ct, "This is menu_read", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_discovery:
                Toast.makeText(ct, "This is menu_discovery", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_me:
                Toast.makeText(ct, "This is menu_me", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * A PagerAdapter which instantiates views based on the ContentItem's content type.
     */
    private final PagerAdapter mPagerAdapter = new PagerAdapter() {

        @Override
        public int getCount() {
            Log.i(TAG, "This is HomeFragment getCount");
            return pages.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(View container, int position, Object object) {
            ((CustomViewPager) container).removeView(pages.get(position)
                    .getContentView());
        }

        @Override
        public Object instantiateItem(View container, int position) {
            Log.i(TAG, "This is HomeFragment instantiateItem");
            ((CustomViewPager) container).addView(pages.get(position).getContentView(), 0);  // ?
            return pages.get(position).getContentView();    // getContentView(): 返回绑定了xml的View
        }
    };
}
