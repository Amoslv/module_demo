package com.tsign.moudle.firstlib;

import android.util.Log;

public class TsLogUtils {

    private static final String TAG = TsLogUtils.class.getSimpleName();

    public static void d(String log) {
        Log.d(TAG, log);
    }

    public static void w(String log) {
        Log.w(TAG, log);
    }

    public static void v(String log) {
        Log.v(TAG, log);
    }

    public static void e(String log) {
        Log.e(TAG, log);
    }

}
