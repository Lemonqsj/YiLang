package com.yilang.lemon.yilang.ui.news.present;

import android.content.Context;

import com.yilang.lemon.yilang.bean.News;
import com.yilang.lemon.yilang.ui.news.contrant.NewsContrant;
import com.yilang.lemon.yilang.ui.news.modle.NewsModle;
import com.yilang.lemon.yilang.utils.NetWorkUtil;

import java.util.List;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 19:11
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public class NewsPresent implements NewsContrant.Presenter,NewsContrant.OnLoadFirstDataListener {
    private NewsContrant.View view;
    private NewsContrant.Model model;
    private Context context;
   public NewsPresent(NewsContrant.View view , Context context){
       this.context=context;
       this.view=view;
       model=new NewsModle();
   }

    @Override
    public void loadData(int type, int page) {
        model.loadData(type,this,page);
    }

    @Override
    public void onSuccess(List<News.NewslistBean> list) {
        view.returnData(list);
    }

    @Override
    public void onFailure(String str, Throwable e) {
        NetWorkUtil.checkNetworkState(context);
    }
}
