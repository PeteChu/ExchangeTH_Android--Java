package com.example.schecterza.exchangerate2.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by schecterza on 6/16/2017 AD.
 */

public class FetchLog {

    @SerializedName("FETCH_TIME")
    String fetchTime;
    @SerializedName("ROUND")
    int round;

    public String getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(String fetchTime) {
        this.fetchTime = fetchTime;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
