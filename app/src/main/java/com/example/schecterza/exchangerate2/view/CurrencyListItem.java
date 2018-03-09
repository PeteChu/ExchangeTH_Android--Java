package com.example.schecterza.exchangerate2.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.schecterza.exchangerate2.R;
import com.example.schecterza.exchangerate2.dao.CurrencyRate.*;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by schecterza on 6/22/2017 AD.
 */

public class CurrencyListItem extends FrameLayout {

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

    TextView tvCurrencyRate;
    TextView tvCurrencyBuy;
    TextView tvCurrencySell;

    public CurrencyListItem(@NonNull Context context, int position, Object bankData, String bankName) {
        super(context);
        this.position = position;
        this.bankName = bankName;
        this.bankData = bankData;
        setBank(bankName);
        initInflate();
        initInstances();
    }

    public CurrencyListItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        ButterKnife.bind(this);
        initInflate();
        initInstances();
    }

    public CurrencyListItem(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ButterKnife.bind(this);
        initInflate();
        initInstances();
    }

    @TargetApi(21)
    public CurrencyListItem(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        ButterKnife.bind(this);
        initInflate();
        initInstances();
    }

    private void initInflate() {
        inflate(getContext(), R.layout.listview_currency_rate, this);
    }

    private void initInstances() {

        tvCurrencyRate = (TextView) findViewById(R.id.tv_currency_rate);
        tvCurrencyBuy = (TextView) findViewById(R.id.tv_currency_buy);
        tvCurrencySell = (TextView) findViewById(R.id.tv_currency_sell);

        setListItem();

    }

    private void setListItem() {
        switch (bankName) {
            case "KTB":
                tvCurrencyRate.setText(ktb.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(ktb.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(ktb.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "KBANK":
                tvCurrencyRate.setText(kbank.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(kbank.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(kbank.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "BAY":
                tvCurrencyRate.setText(bay.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(bay.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(bay.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "SCB":
                tvCurrencyRate.setText(scb.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(scb.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(scb.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "UOB":
                tvCurrencyRate.setText(uob.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(uob.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(uob.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "BOT":
                tvCurrencyRate.setText(bot.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(bot.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(bot.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "SIA":
                tvCurrencyRate.setText(sia.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(sia.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(sia.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "BBL":
                tvCurrencyRate.setText(bbl.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(bbl.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(bbl.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "GSB":
                tvCurrencyRate.setText(gsb.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(gsb.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(gsb.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "TMB":
                tvCurrencyRate.setText(tmb.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(tmb.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(tmb.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "SIAM":
                tvCurrencyRate.setText(siam.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(siam.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(siam.getExchangeRateList().get(position).getSellingBankNotes());
                break;
            case "YENJIT":
                tvCurrencyRate.setText(yenjit.getExchangeRateList().get(position).getCurrencyCode());
                tvCurrencyBuy.setText(yenjit.getExchangeRateList().get(position).getBuyingBankNotes());
                tvCurrencySell.setText(yenjit.getExchangeRateList().get(position).getSellingBankNotes());
                break;
        }
    }

    private void setBank(String bankName) {

        switch (bankName) {
            case "KTB":
                ktb = (KTB) bankData;
                break;
            case "KBANK":
                kbank = (KBANK) bankData;
                break;
            case "BAY":
                bay = (BAY) bankData;
                break;
            case "SCB":
                scb = (SCB) bankData;
                break;
            case "UOB":
                uob = (UOB) bankData;
                break;
            case "BOT":
                bot = (BOT) bankData;
                break;
            case "SIA":
                sia = (SIA) bankData;
                break;
            case "BBL":
                bbl = (BBL) bankData;
                break;
            case "GSB":
                gsb = (GSB) bankData;
                break;
            case "TMB":
                tmb = (TMB) bankData;
                break;
            case "SIAM":
                siam = (SIAM) bankData;
                break;
            case "YENJIT":
                yenjit = (YENJIT) bankData;
                break;
        }

    }

}
