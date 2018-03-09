package com.example.schecterza.exchangerate2.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by schecterza on 6/16/2017 AD.
 */

public class ExchangeRate {

    @SerializedName("CURRENCY_CODE")
    String currencyCode;
    @SerializedName("BUYING_BANK_NOTES")
    String buyingBankNotes;
    @SerializedName("SELLING_BANK_NOTES")
    String sellingBankNotes;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getBuyingBankNotes() {
        return buyingBankNotes;
    }

    public void setBuyingBankNotes(String buyingBankNotes) {
        this.buyingBankNotes = buyingBankNotes;
    }

    public String getSellingBankNotes() {
        return sellingBankNotes;
    }

    public void setSellingBankNotes(String sellingBankNotes) {
        this.sellingBankNotes = sellingBankNotes;
    }
}
