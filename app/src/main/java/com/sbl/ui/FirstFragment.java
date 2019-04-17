package com.sbl.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author long
 * @date 2019/4/17.
 * description：
 */
public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragent, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();//初始化控件
    }
    private void init() {
        //初始化数据
        recyclerView =  getActivity().findViewById(R.id.recyclerview);
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            datas.add("item " + i);
        }

        //设置LayoutManager为LinearLayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Log.e("songbl","==="+datas.size());
        //设置Adapter
        recyclerView.setAdapter(new GeneralAdapter(getActivity(), datas));
    }
}
