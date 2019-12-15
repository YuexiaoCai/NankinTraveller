package com.example.test3;

import android.annotation.SuppressLint;
import android.icu.util.BuddhistCalendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        TextView toolBarText = findViewById(R.id.toolbar_text);

        replaceFragment(new ThirdFragment());
        toolBarText.setText("发现");

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null)
            toolbar.setTitle("");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {

                TextView toolBarText = findViewById(R.id.toolbar_text);
                switch (item.getItemId())
                {
                    case R.id.navigation_first:
                        replaceFragment(new FirstFragment());
                        toolBarText.setText("我的");
                        return true;
                    case R.id.navigation_second:
                        replaceFragment(new SecondFragment());
                        toolBarText.setText("分类");
                        return true;
                    case R.id.navigation_third:
                        replaceFragment(new ThirdFragment());
                        toolBarText.setText("发现");
                        return true;
                    case R.id.navigation_forth:
                        replaceFragment(new ForthFragment());
                        toolBarText.setText("行迹");
                        return true;
                }
                return false;
            };

    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout,fragment);
        transaction.commit();
    }



}
