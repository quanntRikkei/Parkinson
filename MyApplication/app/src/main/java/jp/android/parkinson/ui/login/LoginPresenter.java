package jp.android.parkinson.ui.login;


import jp.android.parkinson.data.network.ApiManager;
import jp.android.parkinson.ui.base.BasePresenter;

/**
 * Created by tinhtv on 8/17/2017.
 */

public class LoginPresenter implements BasePresenter {
    private ApiManager mApiManager;
    private LoginView mLoginView;

    public LoginPresenter(ApiManager apiManager, LoginView loginView) {
        mApiManager = apiManager;
        mLoginView = loginView;
    }

    @Override
    public void start() {

    }

    public void login(String userName, String passWord) {
        mApiManager.loginRequest(new loginListener() {
            @Override
            public void onSuccess() {
                mLoginView.loginSuccess();
            }

            @Override
            public void onError() {
                mLoginView.loginError();
            }
        }, userName, userName, passWord);
    }

    public void loginWithFacebook() {

    }

    public void loginWithGoogleAccount() {

    }

    public void loginWithTwitter() {

    }


    public interface loginListener {
        void onSuccess();
        void onError();
    }
}
