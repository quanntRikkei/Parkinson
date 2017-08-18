package jp.android.parkinson.data.network;

import jp.android.parkinson.data.network.model.LoginResponse;
import jp.android.parkinson.utils.Define;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by tinhtv on 8/16/2017.
 */

public interface ApiInterface {
    @POST(Define.Api.LOGIN_URL)
    Call<LoginResponse> login(@Field(Define.Fields.TYPE) String apiKey,
                              @Field(Define.Fields.LOGIN_ID) String loginId,
                              @Field(Define.Fields.PASSWORD) String password);
}
