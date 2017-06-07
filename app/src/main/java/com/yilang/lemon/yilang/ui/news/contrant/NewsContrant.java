package com.yilang.lemon.yilang.ui.news.contrant;

import com.yilang.lemon.yilang.bean.News;

import java.util.List;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 16:50
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public interface NewsContrant {

    interface View{
        void returnData(List<News.NewslistBean> datas);
    }

    interface OnLoadFirstDataListener{
        void  onSuccess(List<News.NewslistBean> list);
        void  onFailure(String str,Throwable e);
    }

    interface Presenter  {
        void loadData(int type, int page);
    }

    interface Model {
        void loadData( int type, OnLoadFirstDataListener listener,int page);
    }
}
