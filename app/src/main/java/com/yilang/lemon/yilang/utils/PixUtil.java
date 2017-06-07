package com.yilang.lemon.yilang.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 19:53
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public class PixUtil {
    public static float convertDpToPixel(float dp, Context context){
        Resources      resources = context.getResources();
        DisplayMetrics metrics   = resources.getDisplayMetrics();
        float          px        = dp * (metrics.densityDpi / 160f);
        return px;
    }
}
