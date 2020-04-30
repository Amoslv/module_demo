package com.tsign.moudle.modulemain;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tsign.moudle.basemoudle.ARouterPath;
import com.tsign.moudle.basemoudle.BaseActivity;

/**
 * @author amoslv
 */
public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    /**
     * toA
     */
    private Button mModulemainA;
    /**
     * toB
     */
    private Button mModulemainB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulemain_activity_main);

        initView();
        initEvent();
    }

    private void initEvent() {
        mModulemainA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_A).navigation(MainActivity.this, new NavigationCallback() {
                    @Override
                    public void onFound(Postcard postcard) {
                        Log.e(TAG, "onFound: " + postcard);
                    }

                    @Override
                    public void onLost(Postcard postcard) {
                        Log.e(TAG, "onLost: " + postcard);
                    }

                    @Override
                    public void onArrival(Postcard postcard) {
                        Log.e(TAG, "onArrival: " + postcard);
                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {
                        Log.e(TAG, "onInterrupt: " + postcard);
                    }
                });
            }
        });

        mModulemainB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_B).withString("key", "传递数据").navigation();
            }
        });
    }

    private void initView() {
        mModulemainA = findViewById(R.id.modulemain_a);
        mModulemainB = findViewById(R.id.modulemain_b);
    }


}
