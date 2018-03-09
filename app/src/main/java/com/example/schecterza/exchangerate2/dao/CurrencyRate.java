package com.example.schecterza.exchangerate2.dao;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * Created by schecterza on 6/16/2017 AD.
 */

public class CurrencyRate {

    @SerializedName("STATUS")
    int status;
    @SerializedName("DETAILS")
    String details;
    @SerializedName("UPDATE_TIME")
    Date updateTime;
    @SerializedName("KTB")
    KTB ktb;
    @SerializedName("KBANK")
    KBANK kbank;
    @SerializedName("BAY")
    BAY bay;
    @SerializedName("SCB")
    SCB scb;
    @SerializedName("UOB")
    UOB uob;
    @SerializedName("BOT")
    BOT bot;
    @SerializedName("SIA")
    SIA sia;
    @SerializedName("BBL")
    BBL bbl;
    @SerializedName("GSB")
    GSB gsb;
    @SerializedName("TMB")
    TMB tmb;
    @SerializedName("SIAM")
    SIAM siam;
    @SerializedName("YENJIT")
    YENJIT yenjit;


    public class KTB {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class KBANK {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class BAY {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class SCB {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class UOB {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class BOT {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class SIA {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class BBL {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class GSB {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class TMB {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class SIAM {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public class YENJIT {
        @SerializedName("FETCH_LOG")
        FetchLog fetchLog;
        @SerializedName("LIST_EXCHANGE_RATE")
        List<ExchangeRate> exchangeRateList;

        public FetchLog getFetchLog() {
            return fetchLog;
        }

        public void setFetchLog(FetchLog fetchLog) {
            this.fetchLog = fetchLog;
        }

        public List<ExchangeRate> getExchangeRateList() {
            return exchangeRateList;
        }

        public void setExchangeRateList(List<ExchangeRate> exchangeRateList) {
            this.exchangeRateList = exchangeRateList;
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public KTB getKtb() {
        return ktb;
    }

    public void setKtb(KTB ktb) {
        this.ktb = ktb;
    }

    public KBANK getKbank() {
        return kbank;
    }

    public void setKbank(KBANK kbank) {
        this.kbank = kbank;
    }

    public BAY getBay() {
        return bay;
    }

    public void setBay(BAY bay) {
        this.bay = bay;
    }

    public SCB getScb() {
        return scb;
    }

    public void setScb(SCB scb) {
        this.scb = scb;
    }

    public UOB getUob() {
        return uob;
    }

    public void setUob(UOB uob) {
        this.uob = uob;
    }

    public BOT getBot() {
        return bot;
    }

    public void setBot(BOT bot) {
        this.bot = bot;
    }

    public SIA getSia() {
        return sia;
    }

    public void setSia(SIA sia) {
        this.sia = sia;
    }

    public BBL getBbl() {
        return bbl;
    }

    public void setBbl(BBL bbl) {
        this.bbl = bbl;
    }

    public GSB getGsb() {
        return gsb;
    }

    public void setGsb(GSB gsb) {
        this.gsb = gsb;
    }

    public TMB getTmb() {
        return tmb;
    }

    public void setTmb(TMB tmb) {
        this.tmb = tmb;
    }

    public SIAM getSiam() {
        return siam;
    }

    public void setSiam(SIAM siam) {
        this.siam = siam;
    }

    public YENJIT getYenjit() {
        return yenjit;
    }

    public void setYenjit(YENJIT yenjit) {
        this.yenjit = yenjit;
    }
}
