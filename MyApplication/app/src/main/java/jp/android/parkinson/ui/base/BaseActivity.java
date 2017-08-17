package jp.android.parkinson.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by tinhtv on 8/16/2017.
 */

public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract void initData();
    public abstract void initView();
    public abstract void drawActionBar();
}
