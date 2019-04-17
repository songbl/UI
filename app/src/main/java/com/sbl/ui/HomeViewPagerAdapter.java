package com.sbl.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author long
 * @date 2019/4/17.
 * description：
 */
public class HomeViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragemntList;

    public HomeViewPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.fragemntList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return fragemntList.get(position);
    }

    @Override
    public int getCount() {
        return fragemntList == null ? 0 : fragemntList.size();
    }
}
