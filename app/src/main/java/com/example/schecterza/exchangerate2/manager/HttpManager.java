package com.example.schecterza.exchangerate2.manager;

import android.content.Context;

import com.example.schecterza.exchangerate2.manager.http.ApiService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by schecterza on 6/20/2017 AD.
 */

public class HttpManager {

    ApiService service;
    private static HttpManager instance;

    public static HttpManager getInstance() {
        if (instance == null)
            instance = new HttpManager();
        return instance;
    }

    private Context mContext;

    private HttpManager() {

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://128.199.116.54/money-exchange/api/v1/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        service = retrofit.create(ApiService.class);

    }

    public void init(Context mContext){
        this.mContext = mContext;
    }

    public Context getmContext() {
        return mContext;
    }

    public ApiService getService() {
        return service;
    }
}
