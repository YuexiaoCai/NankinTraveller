package com.example.test3;

import android.content.Intent;
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
import java.util.Arrays;

public class TopActivity extends AppCompatActivity implements View.OnClickListener
{

    private TopRecycler[] topRecyclerList1 =
            {       new TopRecycler("江宁织造府","江宁织造博物馆是展示元明清历代云锦织物和《红楼梦》历史文化的新型博物馆",R.drawable.jnzzf),
                    new TopRecycler("明孝陵","明孝陵位于钟山风景名胜区内，是明太祖朱元璋与其皇后的合葬陵墓",R.drawable.mxl),
                    new TopRecycler("鸡鸣寺","鸡鸣寺有 “南朝四百八十寺”之首的美誉，是南朝时期中国的佛教中心",R.drawable.jms),
                    new TopRecycler("玄武湖","玄武湖是中国最大的皇家园林湖泊，被誉为“金陵明珠”",R.drawable.xwh),
                    new TopRecycler("阅江楼","阅江楼屹立在扬子江畔，饮霞吞雾，是中国十大文化名楼、江南四大名楼之一",R.drawable.yjl),
                    new TopRecycler("中山陵","中山陵是中国近代伟大的民主革命先行者孙中山先生的陵寝",R.drawable.zsl),
                    new TopRecycler("总统府","南京总统府是中国近代建筑遗存中规模最大、保存最完整的建筑群",R.drawable.ztf),
            };
    private TopRecycler[] topRecyclerList2 =
            {
                    new TopRecycler("玄武湖","玄武湖是中国最大的皇家园林湖泊，被誉为“金陵明珠”",R.drawable.xwh),
                    new TopRecycler("江宁织造府","江宁织造博物馆是展示元明清历代云锦织物和《红楼梦》历史文化的新型博物馆",R.drawable.jnzzf),
                    new TopRecycler("明故宫","南京故宫，又称明故宫，是中世纪世界上最大的宫殿建筑群，被称为“世界第一宫殿”",R.drawable.mgg),
                    new TopRecycler("总统府","南京总统府是中国近代建筑遗存中规模最大、保存最完整的建筑群",R.drawable.ztf),
                    new TopRecycler("阅江楼","阅江楼屹立在扬子江畔，饮霞吞雾，是中国十大文化名楼、江南四大名楼之一",R.drawable.yjl),
                    new TopRecycler("明孝陵","明孝陵位于钟山风景名胜区内，是明太祖朱元璋与其皇后的合葬陵墓",R.drawable.mxl),
                    new TopRecycler("中山陵","中山陵是中国近代伟大的民主革命先行者孙中山先生的陵寝",R.drawable.zsl),

            };
    private TopRecycler[] topRecyclerList3 =
            {
                    new TopRecycler("江宁织造府","江宁织造博物馆是展示元明清历代云锦织物和《红楼梦》历史文化的新型博物馆",R.drawable.jnzzf),
                    new TopRecycler("阅江楼","阅江楼屹立在扬子江畔，饮霞吞雾，是中国十大文化名楼、江南四大名楼之一",R.drawable.yjl),
                    new TopRecycler("玄武湖","玄武湖是中国最大的皇家园林湖泊，被誉为“金陵明珠”",R.drawable.xwh),
                    new TopRecycler("总统府","南京总统府是中国近代建筑遗存中规模最大、保存最完整的建筑群",R.drawable.ztf),
                    new TopRecycler("南航明故宫校区","南航的本部所在，环境清幽，关键是食堂极好吃！",R.drawable.nhmggxq),
                    new TopRecycler("静海寺","寺名取四海平静，天下太平之意，新金陵四十八景之一",R.drawable.jhs),
                    new TopRecycler("南京博物院","南京博物院是中国三大博物馆之一，现为国家一级博物馆",R.drawable.njbwy),

            };
    private TopRecycler[] topRecyclerList4 =
            {
                    new TopRecycler("总统府","南京总统府是中国近代建筑遗存中规模最大、保存最完整的建筑群",R.drawable.ztf),
                    new TopRecycler("阅江楼","阅江楼屹立在扬子江畔，饮霞吞雾，是中国十大文化名楼、江南四大名楼之一",R.drawable.yjl),
                    new TopRecycler("江宁织造府","江宁织造博物馆是展示元明清历代云锦织物和《红楼梦》历史文化的新型博物馆",R.drawable.jnzzf),
                    new TopRecycler("玄武湖","玄武湖是中国最大的皇家园林湖泊，被誉为“金陵明珠”",R.drawable.xwh),
                    new TopRecycler("南航明故宫校区","南航的本部所在，环境清幽，关键是食堂极好吃！",R.drawable.nhmggxq),
                    new TopRecycler("甘熙故居","甘熙故居是中国最大的私人民宅，与明孝陵、明城墙并称为南京明清三大景观",R.drawable.gxgj),
                    new TopRecycler("南京博物院","南京博物院是中国三大博物馆之一，现为国家一级博物馆",R.drawable.njbwy),
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
        TextView textView2_1 = findViewById(R.id.top_2_text_1);
        TextView textView2_2 = findViewById(R.id.top_2_text_2);
        TextView textView2_3 = findViewById(R.id.top_2_text_3);
        TextView textView2_4 = findViewById(R.id.top_2_text_4);

        textView1_1.setOnClickListener(this);
        textView1_2.setOnClickListener(this);
        textView1_3.setOnClickListener(this);
        textView1_4.setOnClickListener(this);

        textView1_1.getPaint().setFakeBoldText(true);

        Intent detailUserInformation=getIntent();//获取mainActivity传递的用户信息
        User user= (User) detailUserInformation.getSerializableExtra("userInformation");

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
                textView1_1.setTextColor(Color.parseColor("#008577"));
                textView2_1.setBackgroundColor(Color.parseColor("#008577"));
                textView1_1.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter1 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList1));
                recyclerView.setAdapter(adapter1);
                break;
            case R.id.top_1_text_2:
                textView1_2.setTextColor(Color.parseColor("#008577"));
                textView2_2.setBackgroundColor(Color.parseColor("#008577"));
                textView1_2.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter2 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList2));
                recyclerView.setAdapter(adapter2);
                break;
            case R.id.top_1_text_3:
                textView1_3.setTextColor(Color.parseColor("#008577"));
                textView2_3.setBackgroundColor(Color.parseColor("#008577"));
                textView1_3.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter3 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList3));
                recyclerView.setAdapter(adapter3);
                break;
            case R.id.top_1_text_4:
                textView1_4.setTextColor(Color.parseColor("#008577"));
                textView2_4.setBackgroundColor(Color.parseColor("#008577"));
                textView1_4.getPaint().setFakeBoldText(true);
                TopRecyclerAdapter adapter4 = new TopRecyclerAdapter(Arrays.asList(topRecyclerList4));
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

