package com.yilang.lemon.yilang.ui.news.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.yilang.lemon.yilang.bean.News;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 19:26
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public class NewsAdapter extends RecyclerArrayAdapter<News.NewslistBean> {

    public NewsAdapter(Context context) {
        super(context);
    }



    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsViewHolder(parent);
    }
}
