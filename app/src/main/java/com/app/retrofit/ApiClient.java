package com.app.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL="https://testapivolley.000webhostapp.com/readusers.php/";
    public static Retrofit retrofit=null;



    public static Retrofit getApiClient(){


        if (retrofit==null){


            retrofit=new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();


        }

        return retrofit;
    }
}
