package com.tsign.moudle.moduleb;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tsign.moudle.basemoudle.ARouterPath;
import com.tsign.moudle.basemoudle.BaseActivity;

@Route(path = ARouterPath.PATH_MOUDULE_B)
public class MainBActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleb_activity_main);
    }
}
