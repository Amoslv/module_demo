package com.tsign.moudle.basemoudle;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.utilmodule.LogUtils;
import com.example.utilmodule.StringUtils;

/**
 * @author amoslv
 */
public class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean result = StringUtils.isEmpty("test");
        LogUtils.d(getClass().getName(), "onCreate: " + result);
    }
}
