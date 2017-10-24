package com.study.lijia.appcore;

/**
 * 模拟数据层
 * Created by lijia on 17-10-24.
 */

public class AppCore {

    private final static int TYPE_RELEASE = 0;
    private final static int TYPE_DEBUG = 1;
    private final static int TYPE_BETA = 2;

    private static int mHostType = TYPE_DEBUG;


    public static void setType(int type) {
        mHostType = type;
    }

    public static String getContentFromCore() {
        if (mHostType == TYPE_RELEASE) {
            return "Hello World From Release";
        } else if (mHostType == TYPE_DEBUG) {
            return "Hello World From Debug";
        } else if (mHostType == TYPE_BETA) {
            return "Hello World From Beta";
        }
        return "Hello World";
    }
}
