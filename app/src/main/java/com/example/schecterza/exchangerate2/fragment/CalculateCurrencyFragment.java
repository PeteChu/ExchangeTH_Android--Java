package com.example.schecterza.exchangerate2.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.schecterza.exchangerate2.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class CalculateCurrencyFragment extends Fragment {

    @BindView(R.id.btn_enter_currency)
    LinearLayout btnEnterCurrency;
    @BindView(R.id.tv_amount)
    TextView tvAmount;
    @BindView(R.id.btn_calculate)
    TextView btnCalculate;
    @BindView(R.id.tv_currency_calculated)
    TextView tvCurrencyCalculated;

    String currencyCode;
    String currencyBuy;
    String currencySell;
    double buyPrice = 0;
    double sellPrice = 0;
    int amount = 0;

    public CalculateCurrencyFragment() {
        super();
    }

    public static CalculateCurrencyFragment newInstance(String currencyCode, String currencyBuy, String currencySell) {
        CalculateCurrencyFragment fragment = new CalculateCurrencyFragment();
        Bundle args = new Bundle();
        args.putString("currencyCode", currencyCode);
        args.putString("currencyBuy", currencyBuy);
        args.putString("currencySell", currencySell);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        currencyCode = getArguments().getString("currencyCode");
        currencyBuy = getArguments().getString("currencyBuy");
        currencySell = getArguments().getString("currencySell");
        getArguments().remove("currencyCode");
        getArguments().remove("currencyBuy");
        getArguments().remove("currencySell");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calculate_currency, container, false);
        ButterKnife.bind(this, rootView);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        TextView tvCurrencyCode = (TextView) rootView.findViewById(R.id.tv_currency_code);
        TextView tvCurrencyCalculateBuy = (TextView) rootView.findViewById(R.id.tv_currency_calculate_buy);
        TextView tvCurrencyCalculateSell = (TextView) rootView.findViewById(R.id.tv_currency_calculate_sell);

        tvCurrencyCode.setText(currencyCode);
        tvCurrencyCalculateBuy.setText(currencyBuy);
        tvCurrencyCalculateSell.setText(currencySell);

        if (isNumber(currencyBuy)) {
            buyPrice = Double.parseDouble(currencyBuy);
        }

        if (isNumber(currencySell)) {
            sellPrice = Double.parseDouble(currencySell);
        }



        btnEnterCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog();
            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCurrency();
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

    private void calculateCurrency() {

        if (amount != 0) {
            double result = amount * buyPrice;
            tvCurrencyCalculated.setText(result+"");
        } else {
            tvCurrencyCalculated.setText("0");
        }

    }

    private void showInputDialog() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View promptView = inflater.inflate(R.layout.dialog_input, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
        alertDialogBuilder.setView(promptView);

        final EditText editText = (EditText) promptView.findViewById(R.id.et_currency_amount);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvAmount.setText(editText.getText().toString());
                        amount = Integer.parseInt(editText.getText().toString());
                    }
                })
                .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = alertDialogBuilder.create();
        alert.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        alert.show();
    }

    private boolean isNumber(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
