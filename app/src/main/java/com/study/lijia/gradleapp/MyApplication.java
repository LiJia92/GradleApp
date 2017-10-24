package com.study.lijia.gradleapp;

import android.app.Application;

import com.study.lijia.appcore.AppCore;

/**
 * Application 初始化
 * Created by lijia on 17-10-24.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 设置编译类型
        AppCore.setType(BuildConfig.HOST_TYPE);
    }
}
