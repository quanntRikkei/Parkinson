package jp.android.parkinson.ui.login;

import jp.android.parkinson.ui.base.BaseView;

/**
 * Created by tinhtv on 8/17/2017.
 */

public interface LoginView extends BaseView<LoginPresenter> {
    void loginSuccess();
    void loginError();
}
