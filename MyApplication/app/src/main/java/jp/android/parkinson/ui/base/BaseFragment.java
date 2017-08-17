package jp.android.parkinson.ui.base;

import android.app.Fragment;

/**
 * Created by tinhtv on 8/16/2017.
 */

public abstract class BaseFragment extends Fragment {

    public abstract void initData();
    public abstract void initView();
    public abstract void drawActionBar();
}
