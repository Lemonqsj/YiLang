package com.yilang.lemon.yilang.ui.news.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.yilang.lemon.yilang.R;
import com.yilang.lemon.yilang.bean.News;
import com.yilang.lemon.yilang.utils.PictureUtil;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 19:28
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public class NewsViewHolder extends BaseViewHolder<News.NewslistBean> {


    private TextView mName;
    private ImageView mFace;
    private TextView mSign;

    public NewsViewHolder(ViewGroup parent) {
        super(parent, R.layout.news_recycler_item);
        mName = $(R.id.person_name);
        mFace = $(R.id.person_face);
        mSign = $(R.id.person_sign);
    }

    @Override
    public void setData(News.NewslistBean data) {
        super.setData(data);

        mName.setText(data.getTitle());
        mSign.setText(data.getCtime());
        PictureUtil.showImage(mFace,getContext(),data.getPicUrl());

    }
}
