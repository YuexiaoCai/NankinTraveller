package com.example.test3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopActivity extends AppCompatActivity implements View.OnClickListener
{

    private TopRecycler[] topRecyclerList1 =
            {       new TopRecycler("江宁织造博物馆","江宁织造博物馆是展示元明清历代云锦织物和《红楼梦》历史文化的新型博物馆",R.drawable.jnzzbwg),
                    new TopRecycler("明孝陵","明孝陵位于钟山风景名胜区内，是明太祖朱元璋与其皇后的合葬陵墓",R.drawable.mxl),
                    new TopRecycler("鸡鸣寺","鸡鸣寺有 “南朝四百八十寺”之首的美誉，是南朝时期中国的佛教中心",R.drawable.jms),
                    new TopRecycler("中山陵","中山陵是中国近代伟大的民主革命先行者孙中山先生的陵寝",R.drawable.zsl),
                    new TopRecycler("音乐台","音乐台是纪念孙中山先生仪式时的音乐表演及集会演讲的场所",R.drawable.yyt),
                    new TopRecycler("玄武湖","玄武湖是中国最大的皇家园林湖泊，被誉为“金陵明珠”",R.drawable.xwh),
                    new TopRecycler("甘熙故居","甘熙故居俗称“九十九间半”，是中国最大的私人民宅",R.drawable.gxgj),
                    new TopRecycler("牛首山","牛首山是中国佛教名山，文化底蕴深厚，是佛教牛头禅宗的开教处和发祥地。",R.drawable.nss),
                    new TopRecycler("中华门","中华门是是中国现存规模最大的城门，也是世界上保存最完好、结构最复杂的堡垒瓮城",R.drawable.zhm),
                    new TopRecycler("曾公祠","曾公祠为祭祀曾国荃的专祠，现为南京市钟英中学的北校区",R.drawable.zgc)
            };
    private TopRecycler[] topRecyclerList2 =
            {       new TopRecycler("中华门","中华门是是中国现存规模最大的城门，也是世界上保存最完好、结构最复杂的堡垒瓮城",R.drawable.zhm),
                    new TopRecycler("牛首山","牛首山是中国佛教名山，文化底蕴深厚，是佛教牛头禅宗的开教处和发祥地。",R.drawable.nss),
                    new TopRecycler("玄武湖","玄武湖是中国最大的皇家园林湖泊，被誉为“金陵明珠”",R.drawable.xwh),
                    new TopRecycler("总统府","南京总统府是中国近代建筑遗存中规模最大、保存最完整的建筑群",R.mipmap.view2),
                    new TopRecycler("夫子庙","南京夫子庙为供奉祭祀孔子之地，是中国第一所国家最高学府，也是中国四大文庙",R.mipmap.view3),
                    new TopRecycler("明孝陵","明孝陵是明太祖朱元璋与其皇后的合葬陵墓",R.mipmap.view1)
            };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);


        TextView textView1_1 = findViewById(R.id.top_1_text_1);
        TextView textView1_2 = findViewById(R.id.top_1_text_2);
        TextView textView1_3 = findViewById(R.id.top_1_text_3);
        TextView textView1_4 = findViewById(R.id.top_1_text_4);
        //TextView textView2_1 = findViewById(R.id.top_2_text_1);
        //TextView textView2_2 = findViewById(R.id.top_2_text_2);
        //TextView textView2_3 = findViewById(R.id.top_2_text_3);
        //TextView textView2_4 = findViewById(R.id.top_2_text_4);

        textView1_1.setOnClickListener(this);
        textView1_2.setOnClickListener(this);
        textView1_3.setOnClickListener(this);
        textView1_4.setOnClickListener(this);
        //textView2_1.setOnClickListener(this);
        //textView2_2.setOnClickListener(this);
        //textView2_3.setOnClickListener(this);
        //textView2_4.setOnClickListener(this);

        textView1_1.getPaint().setFakeBoldText(true);



        RecyclerView recyclerView = findViewById(R.id.top_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TopRecyclerAdapter adapter = new TopRecyclerAdapter(Arrays.asList(topRecyclerList1));
        recyclerView.setAdapter(adapter);
    }



    @Override
    protected void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null)
            toolbar.setTitle("");
        ImageView imageToolBar = findViewById(R.id.top_toolbar_image_left);
        Glide.with(this).load(R.mipmap.back_white).into(imageToolBar);
        imageToolBar.setOnClickListener(view -> finish());
    }

    @Override
    public void onClick(View view)
    {
        TextView textView1_1 = findViewById(R.id.top_1_text_1);
        TextView textView1_2 = findViewById(R.id.top_1_text_2);
        TextView textView1_3 = findViewById(R.id.top_1_text_3);
        TextView textView1_4 = findViewById(R.id.top_1_text_4);
        TextView textView2_1 = findViewById(R.id.top_2_text_1);
        TextView textView2_2 = findViewById(R.id.top_2_text_2);
        TextView textView2_3 = findViewById(R.id.top_2_text_3);
        TextView textView2_4 = findViewById(R.id.top_2_text_4);
        RecyclerView recyclerView = findViewById(R.id.top_recycler);
        clear();
        switch (view.getId())
        {
            case R.id.top_1_text_1:
                textView1_1.setTextColor(Color.parseColor("#32a3fd"));
                textView2_1.setBackgroundColor(Color.parseColor("#32a3fd"));
                textView1_1.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter1 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList1));
                recyclerView.setAdapter(adapter1);
                break;
            case R.id.top_1_text_2:
                textView1_2.setTextColor(Color.parseColor("#32a3fd"));
                textView2_2.setBackgroundColor(Color.parseColor("#32a3fd"));
                textView1_2.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter2 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList2));
                recyclerView.setAdapter(adapter2);
                break;
            case R.id.top_1_text_3:
                textView1_3.setTextColor(Color.parseColor("#32a3fd"));
                textView2_3.setBackgroundColor(Color.parseColor("#32a3fd"));
                textView1_3.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter3 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList1));
                recyclerView.setAdapter(adapter3);
                break;
            case R.id.top_1_text_4:
                textView1_4.setTextColor(Color.parseColor("#32a3fd"));
                textView2_4.setBackgroundColor(Color.parseColor("#32a3fd"));
                textView1_4.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter4 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList2));
                recyclerView.setAdapter(adapter4);
                break;
            default:
                break;
        }
    }

    private void clear()
    {
        TextView textView1_1 = findViewById(R.id.top_1_text_1);
        TextView textView1_2 = findViewById(R.id.top_1_text_2);
        TextView textView1_3 = findViewById(R.id.top_1_text_3);
        TextView textView1_4 = findViewById(R.id.top_1_text_4);
        TextView textView2_1 = findViewById(R.id.top_2_text_1);
        TextView textView2_2 = findViewById(R.id.top_2_text_2);
        TextView textView2_3 = findViewById(R.id.top_2_text_3);
        TextView textView2_4 = findViewById(R.id.top_2_text_4);
        textView1_1.setTextColor(Color.parseColor("#999999"));
        textView1_2.setTextColor(Color.parseColor("#999999"));
        textView1_3.setTextColor(Color.parseColor("#999999"));
        textView1_4.setTextColor(Color.parseColor("#999999"));
        textView2_1.setBackgroundColor(Color.parseColor("#ffffff"));
        textView2_2.setBackgroundColor(Color.parseColor("#ffffff"));
        textView2_3.setBackgroundColor(Color.parseColor("#ffffff"));
        textView2_4.setBackgroundColor(Color.parseColor("#ffffff"));
        textView1_1.getPaint().setFakeBoldText(false);
        textView1_2.getPaint().setFakeBoldText(false);
        textView1_3.getPaint().setFakeBoldText(false);
        textView1_4.getPaint().setFakeBoldText(false);
    }

}

