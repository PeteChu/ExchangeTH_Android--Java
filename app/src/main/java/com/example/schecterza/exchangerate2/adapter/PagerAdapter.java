package com.example.schecterza.exchangerate2.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;


import com.example.schecterza.exchangerate2.fragment.MainFragment;

import java.util.Date;
import java.util.List;

/**
 * Created by schecterza on 6/21/2017 AD.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    List<Object> bankList;
    Date updateTime;

    public PagerAdapter(FragmentManager fm, List<Object> bankList, Date updateTime) {
        super(fm);
        this.bankList = bankList;
        this.updateTime = updateTime;
    }

    @Override
    public Fragment getItem(int position) {

        if (getCount() > 0) {
            return new MainFragment().newInstance(position, bankList.get(position), updateTime);
        } else {
            return null;
        }

    }

    @Override
    public int getCount() {
        return bankList.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
