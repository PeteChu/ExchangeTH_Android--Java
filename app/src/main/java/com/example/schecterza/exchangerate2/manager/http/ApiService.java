package com.example.schecterza.exchangerate2.manager.http;

import com.example.schecterza.exchangerate2.dao.CurrencyRate;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by schecterza on 6/20/2017 AD.
 */

public interface ApiService {

    @GET("latest")
    Call<CurrencyRate> listRepos();

}
