package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailInfo extends AppCompatActivity {
    private TextView mView1;
    private TextView mView2;
    Intent intent = getIntent();
    String password = intent.getStringExtra("password");
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);
        mView1.setText(MainActivity.userName);
        mView2.setText(password);
    }

}
