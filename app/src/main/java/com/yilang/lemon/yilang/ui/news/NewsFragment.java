package com.yilang.lemon.yilang.ui.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yilang.lemon.yilang.R;
import com.yilang.lemon.yilang.ui.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 15:02
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public class NewsFragment extends BaseFragment {

    @BindView(R.id.toolbar)
    Toolbar              mToolbar;
    @BindView(R.id.tab_layout)
    TabLayout            mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager            mViewPager;
    @BindView(R.id.fab)
    FloatingActionButton mFab;
    private String[] mTitle;

    public static NewsFragment getInstance() {
        NewsFragment newsFragment = new NewsFragment();
        return newsFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        ButterKnife.bind(this, view);

        mTitle = getResources().getStringArray(R.array.main_titles);

        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
