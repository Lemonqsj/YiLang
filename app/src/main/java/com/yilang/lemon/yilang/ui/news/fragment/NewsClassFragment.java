package com.yilang.lemon.yilang.ui.news.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.yilang.lemon.yilang.R;
import com.yilang.lemon.yilang.ui.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 16:14
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public class NewsClassFragment extends BaseFragment {
    @BindView(R.id.recycleView)
    EasyRecyclerView mRecycleView;
    private int type;

    public static NewsClassFragment getInstance(int type) {
        NewsClassFragment fragment = new NewsClassFragment();
        Bundle            bundle   = new Bundle();
        bundle.putInt("type", type);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type = getArguments().getInt("type");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_type, container, false);
        ButterKnife.bind(this, view);




        return super.onCreateView(inflater, container, savedInstanceState);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //null.unbind();
    }
}
