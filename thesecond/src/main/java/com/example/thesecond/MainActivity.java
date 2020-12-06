package com.example.thesecond;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=findViewById(R.id.am_bt);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,ViewPagerActivity.class);
                startActivity(intent);
            }
        });
        mButton=findViewById(R.id.am_bt2);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}