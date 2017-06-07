package com.yilang.lemon.yilang.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 10:58
 * @Email lemonqsj@163.com
 * @description 要一个不需要自己滚动的viewpager就可以
 */

public class NoAutoScallViewPager extends ViewPager {

    private boolean enabled;
    public NoAutoScallViewPager(Context context) {
        super(context);
        this.enabled=false;
    }

    public NoAutoScallViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled=false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (enabled) return super.onTouchEvent(ev);
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (enabled) return super.onInterceptTouchEvent(ev);
        return false;
    }
    public void setPageEnable(boolean enabled){this.enabled=false;}
}
