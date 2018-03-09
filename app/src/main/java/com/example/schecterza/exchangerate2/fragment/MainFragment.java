package com.example.schecterza.exchangerate2.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.schecterza.exchangerate2.R;
import com.example.schecterza.exchangerate2.SecondActivity;
import com.example.schecterza.exchangerate2.adapter.ListViewCurrencyRateAdapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    @BindView(R.id.listview_currency_rate)
    ListView listviewCurrencyRate;
    @BindView(R.id.tv_bank_name)
    TextView tvBankName;
    @BindView(R.id.tv_update_time)
    TextView tvUpdateTime;

    HashMap<String, Object> bankData;
    int position;
    String updateTime;
    String bankName;

    public MainFragment() {
        super();
    }

    public MainFragment newInstance(int position, Object bankData, Date updateTime) {
        // Required empty public constructor
        MainFragment mainFragment = new MainFragment();
        Bundle args = new Bundle();
        DateFormat df = new SimpleDateFormat("dd MMMM - HH:mm:ss");

        args.putInt("position", position);
        args.putString("updateTime", df.format(updateTime));
        HashMap<String, Object> tmpBankData = new HashMap<>();
        tmpBankData.put("bankData", bankData);
        args.putSerializable("bankData", tmpBankData);
        mainFragment.setArguments(args);

        return mainFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bankData = (HashMap<String, Object>) getArguments().getSerializable("bankData");
        position = getArguments().getInt("position");
        updateTime = getArguments().getString("updateTime");
        getArguments().remove("position");
        getArguments().remove("bankData");
        getArguments().remove("updateTime");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);

        initInstances(rootView);

        return rootView;
    }

    private void initInstances(final View rootView) {

        tvBankName.setText(setBankName(position));
        tvUpdateTime.setText("Last Update: " + updateTime);

        ListViewCurrencyRateAdapter listViewCurrencyRateAdapter = new ListViewCurrencyRateAdapter(position, bankData.get("bankData"), bankName);
        listviewCurrencyRate.setAdapter(listViewCurrencyRateAdapter);
        listviewCurrencyRate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView currencyCode = (TextView) view.findViewById(R.id.tv_currency_rate);
                TextView currencyBuy = (TextView) view.findViewById(R.id.tv_currency_buy);
                TextView currencySell = (TextView) view.findViewById(R.id.tv_currency_sell);
                Intent intent = new Intent(getContext(), SecondActivity.class);
                intent.putExtra("currencyCode", currencyCode.getText().toString());
                intent.putExtra("currencyBuy", currencyBuy.getText().toString());
                intent.putExtra("currencySell", currencySell.getText().toString());
                startActivity(intent);
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
    * Save Instance State Here
    */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }

    private String setBankName(int position) {

        switch (position) {
            case 0:
                bankName = "KTB";
                return "KTB";
            case 1:
                bankName = "KBANK";
                return "KBANK";
            case 2:
                bankName = "BAY";
                return "BAY";
            case 3:
                bankName = "SCB";
                return "SCB";
            case 4:
                bankName = "UOB";
                return "UOB";
            case 5:
                bankName = "BOT";
                return "BOT";
            case 6:
                bankName = "SIA";
                return "SIA";
            case 7:
                bankName = "BBL";
                return "BBL";
            case 8:
                bankName = "GSB";
                return "GSB";
            case 9:
                bankName = "TMB";
                return "TMB";
            case 10:
                bankName = "SIAM";
                return "SIAM";
            case 11:
                bankName = "YENJIT";
                return "YENJIT";
            default:
                return "";
        }

    }

}
