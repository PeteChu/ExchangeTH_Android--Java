package com.example.schecterza.exchangerate2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.schecterza.exchangerate2.fragment.CalculateCurrencyFragment;

public class SecondActivity extends AppCompatActivity {

    String currencyCode;
    String currencyBuy;
    String currencySell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initInstances();
    }

    private void initInstances() {

        Intent intent = getIntent();
        currencyCode = intent.getStringExtra("currencyCode");
        currencyBuy = intent.getStringExtra("currencyBuy");
        currencySell = intent.getStringExtra("currencySell");

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_second_activity, new CalculateCurrencyFragment().newInstance(currencyCode, currencyBuy, currencySell))
                .commit();
    }


}
