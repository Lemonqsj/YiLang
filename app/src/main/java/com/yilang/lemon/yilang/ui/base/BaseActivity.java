package com.yilang.lemon.yilang.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Describe the function of the class
 *
 * @author lemon
 * @date 2017/6/7
 * @time 13:39
 * @Email lemonqsj@163.com
 * @description Describe the place where the class needs to pay attention.
 */

public class BaseActivity extends AppCompatActivity{
    String TAG = getClass().getSimpleName();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG,TAG+"创建");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,TAG+"销毁");
    }
}
