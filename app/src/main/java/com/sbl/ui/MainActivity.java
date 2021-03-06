package com.sbl.ui;

import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private RecyclerView recyclerView;
    private MyViewPager myViewPager ;

    private List<Fragment> fragemnts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intercept_test);

        //反向滑动
//        myViewPager = findViewById(R.id.mvp);
//        //添加页面
//        fragemnts.add(new FirstFragment());
//        fragemnts.add(new SecondFragment());
//        myViewPager.setAdapter(new HomeViewPagerAdapter(getSupportFragmentManager(), fragemnts));


//        //去掉阴影状态栏
//        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getWindow().getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//            decorView.setSystemUiVisibility(option);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }

//初始化数据
        recyclerView = findViewById(R.id.recyclerview);
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            datas.add("item " + i);
        }

        //设置LayoutManager为LinearLayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //设置Adapter
        recyclerView.setAdapter(new GeneralAdapter(this, datas));


    }
}
