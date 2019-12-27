package com.app.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("readusers.php")
    Call<List<User>> getUsers();
}
