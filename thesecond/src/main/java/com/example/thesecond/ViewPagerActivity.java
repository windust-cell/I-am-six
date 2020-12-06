package com.example.thesecond;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<View> list=new ArrayList<>();
    private VpAdapter vpAdapter=new VpAdapter(list);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        viewPager=findViewById(R.id.vp_demo);

        list.add(LayoutInflater.from(this).inflate(R.layout.item_vp_1,null,false));
        list.add(LayoutInflater.from(this).inflate(R.layout.item_vp_2,null,false));
        list.add(LayoutInflater.from(this).inflate(R.layout.item_vp_3,null,false));

        viewPager.setAdapter(vpAdapter);
    }
}

