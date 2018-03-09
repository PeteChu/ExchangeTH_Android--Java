package com.example.schecterza.exchangerate2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.schecterza.exchangerate2.R;
import com.example.schecterza.exchangerate2.dao.CurrencyRate.*;
import com.example.schecterza.exchangerate2.view.CurrencyListItem;

/**
 * Created by schecterza on 6/22/2017 AD.
 */

public class ListViewCurrencyRateAdapter extends BaseAdapter {

    Object bankData;
    int position;
    String bankName;

    KTB ktb;
    KBANK kbank;
    BAY bay;
    SCB scb;
    UOB uob;
    BOT bot;
    SIA sia;
    BBL bbl;
    GSB gsb;
    TMB tmb;
    SIAM siam;
    YENJIT yenjit;

    public ListViewCurrencyRateAdapter(int position, Object bankData, String bankName) {
        this.position = position;
        this.bankData = bankData;
        this.bankName = bankName;
        setBank(position);
    }

    @Override
    public int getCount() {
        switch (position) {
            case 0:
                ktb = (KTB) bankData;
                return ktb.getExchangeRateList().size();
            case 1:
                kbank = (KBANK) bankData;
                return kbank.getExchangeRateList().size();
            case 2:
                bay = (BAY) bankData;
                return bay.getExchangeRateList().size();
            case 3:
                scb = (SCB) bankData;
                return scb.getExchangeRateList().size();
            case 4:
                uob = (UOB) bankData;
                return uob.getExchangeRateList().size();
            case 5:
                bot = (BOT) bankData;
                return bot.getExchangeRateList().size();
            case 6:
                sia = (SIA) bankData;
                return sia.getExchangeRateList().size();
            case 7:
                bbl = (BBL) bankData;
                return bbl.getExchangeRateList().size();
            case 8:
                gsb = (GSB) bankData;
                return gsb.getExchangeRateList().size();
            case 9:
                tmb = (TMB) bankData;
                return tmb.getExchangeRateList().size();
            case 10:
                siam = (SIAM) bankData;
                return siam.getExchangeRateList().size();
            case 11:
                yenjit = (YENJIT) bankData;
                return yenjit.getExchangeRateList().size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CurrencyListItem item;

        if (convertView != null) {
            item = (CurrencyListItem) convertView;
        } else {
            item = new CurrencyListItem(parent.getContext(), position, getBank(), bankName);
        }





        return item;
    }

    private void setBank(int position) {

        switch (position) {
            case 0:
                ktb = (KTB) bankData;
                break;
            case 1:
                kbank = (KBANK) bankData;
                break;
            case 2:
                bay = (BAY) bankData;
                break;
            case 3:
                scb = (SCB) bankData;
                break;
            case 4:
                uob = (UOB) bankData;
                break;
            case 5:
                bot = (BOT) bankData;
                break;
            case 6:
                sia = (SIA) bankData;
                break;
            case 7:
                bbl = (BBL) bankData;
                break;
            case 8:
                gsb = (GSB) bankData;
                break;
            case 9:
                tmb = (TMB) bankData;
                break;
            case 10:
                siam = (SIAM) bankData;
                break;
            case 11:
                yenjit = (YENJIT) bankData;
                break;
        }

    }

    private Object getBank() {

        if (ktb != null) {
            return ktb;
        } else if (kbank != null) {
            return kbank;
        } else if (bay != null) {
            return bay;
        } else if (scb != null) {
            return scb;
        } else if (uob != null) {
            return uob;
        } else if (bot != null) {
            return bot;
        } else if (sia != null) {
            return sia;
        } else if (bbl != null) {
            return bbl;
        } else if (gsb != null) {
            return gsb;
        } else if (tmb != null) {
            return tmb;
        } else if (siam != null) {
            return siam;
        } else if (yenjit != null) {
            return yenjit;
        }

        return null;

    }


}
