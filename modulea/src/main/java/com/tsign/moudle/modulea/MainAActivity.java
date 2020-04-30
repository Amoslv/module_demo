package com.tsign.moudle.modulea;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tsign.moudle.basemoudle.ARouterPath;
import com.tsign.moudle.basemoudle.BaseActivity;

/**
 * @author amoslv
 */
@Route(path = ARouterPath.PATH_MOUDULE_A)
public class MainAActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_activity_main);
    }
}
