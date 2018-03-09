package com.example.schecterza.exchangerate2;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.schecterza.exchangerate2.adapter.PagerAdapter;
import com.example.schecterza.exchangerate2.dao.CurrencyRate;
import com.example.schecterza.exchangerate2.manager.HttpManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.container_viewpager_content) ViewPager vpContainer;

    CurrencyRate currencyRate;
    List<Object> bankList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initInstances();

    }

    private void initInstances() {

        Call<CurrencyRate> call = HttpManager.getInstance().getService().listRepos();
        call.enqueue(new Callback<CurrencyRate>() {
            @Override
            public void onResponse(Call<CurrencyRate> call, Response<CurrencyRate> response) {
                if (response.isSuccessful()) {
                    currencyRate = response.body();
                    bankList = new ArrayList<>();
                    bankList.add(currencyRate.getKtb());
                    bankList.add(currencyRate.getKbank());
                    bankList.add(currencyRate.getBay());
                    bankList.add(currencyRate.getScb());
                    bankList.add(currencyRate.getUob());
                    bankList.add(currencyRate.getBot());
                    bankList.add(currencyRate.getSia());
                    bankList.add(currencyRate.getBbl());
                    bankList.add(currencyRate.getGsb());
                    bankList.add(currencyRate.getTmb());
                    bankList.add(currencyRate.getSiam());
                    bankList.add(currencyRate.getYenjit());

                    PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), bankList, currencyRate.getUpdateTime());
                    vpContainer.setAdapter(pagerAdapter);

                } else {
                    try {
                        Toast.makeText(MainActivity.this, response.errorBody().string(), Toast.LENGTH_LONG).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<CurrencyRate> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
