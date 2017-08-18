package jp.android.parkinson.data.network;

import jp.android.parkinson.data.network.model.LoginResponse;
import jp.android.parkinson.ui.login.LoginPresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tinhtv on 8/16/2017.
 */

public class ApiManager {

    public void loginRequest(final LoginPresenter.loginListener listener, String type, String loginId, String password) {
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<LoginResponse> call = apiService.login(type, loginId, password);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                listener.onSuccess();
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                listener.onError();
            }
        });
    }
}
