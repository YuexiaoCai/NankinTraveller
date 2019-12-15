package com.example.test3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by 虾仁锅巴 on 2018/7/16.
 */
public class SecondFragment extends Fragment
{

    private RightRecycler[] rightRecyclers=
    {
            new RightRecycler("中山陵",R.drawable.zsl),
            new RightRecycler("音乐台",R.drawable.yyt),
            new RightRecycler("明孝陵",R.drawable.mxl),
            new RightRecycler("阅江楼",R.drawable.yjl),
            new RightRecycler("南京眼",R.drawable.njy),
            new RightRecycler("玄武湖",R.drawable.xwh),
            new RightRecycler("南京总统府",R.drawable.ztf),
            new RightRecycler("瞻园",R.drawable.zy),
            new RightRecycler("江宁织造博物馆",R.drawable.jnzzbwg),
            new RightRecycler("甘熙故居",R.drawable.gxgj),
            new RightRecycler("朝天宫",R.drawable.ctg),
            new RightRecycler("鸡鸣寺",R.drawable.jms),
            new RightRecycler("牛首山",R.drawable.nss),
            new RightRecycler("中山码头",R.drawable.zsmt),
            new RightRecycler("南京夫子庙",R.drawable.fzm),
            new RightRecycler("大报恩寺",R.drawable.dbes),
            new RightRecycler("中华门",R.drawable.zhm),
            new RightRecycler("南京博物院",R.drawable.njbwy),
            new RightRecycler("曾公祠",R.drawable.zgc),
            new RightRecycler("石塘竹海景区",R.drawable.stzh),

    };

    private List<RightRecycler> rightRecyclerList = new ArrayList<>();


    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_second,container,
                false);

        RecyclerView recyclerViewRight = view.findViewById(R.id.fragment_2_recycler_right);
        GridLayoutManager layoutManagerRight = new
                GridLayoutManager(view.getContext(),2);
        recyclerViewRight.setLayoutManager(layoutManagerRight);
        RightRecyclerAdapter adapterRight = new RightRecyclerAdapter(Arrays.asList(rightRecyclers));
        recyclerViewRight.setAdapter(adapterRight);



        TextView textView1 = view.findViewById(R.id.fragment_2_text_1);
        TextView textView2 = view.findViewById(R.id.fragment_2_text_2);
        TextView textView3 = view.findViewById(R.id.fragment_2_text_3);
        TextView textView4 = view.findViewById(R.id.fragment_2_text_4);
        TextView textView5 = view.findViewById(R.id.fragment_2_text_5);

        textView1.getPaint().setFakeBoldText(true);

        textView1.setOnClickListener(view1 ->
        {
            clear(view);
            textView1.setTextColor(Color.parseColor("#32a3fd"));
            textView1.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(0,0);
        });
        textView2.setOnClickListener(view2 ->
        {
            clear(view);
            textView2.setTextColor(Color.parseColor("#32a3fd"));
            textView2.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(4,0);
        });
        textView3.setOnClickListener(view3 ->
        {
            clear(view);
            textView3.setTextColor(Color.parseColor("#32a3fd"));
            textView3.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(8,0);
        });
        textView4.setOnClickListener(view4 ->
        {
            clear(view);
            textView4.setTextColor(Color.parseColor("#32a3fd"));
            textView4.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(12,0);
        });
        textView5.setOnClickListener(view5 ->
        {
            clear(view);
            textView5.setTextColor(Color.parseColor("#32a3fd"));
            textView5.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(16,0);
        });


        return view;
    }




    private void clear(View view)
    {
        TextView textView1 = view.findViewById(R.id.fragment_2_text_1);
        TextView textView2 = view.findViewById(R.id.fragment_2_text_2);
        TextView textView3 = view.findViewById(R.id.fragment_2_text_3);
        TextView textView4 = view.findViewById(R.id.fragment_2_text_4);
        TextView textView5 = view.findViewById(R.id.fragment_2_text_5);
        textView1.setTextColor(Color.parseColor("#999999"));
        textView2.setTextColor(Color.parseColor("#999999"));
        textView3.setTextColor(Color.parseColor("#999999"));
        textView4.setTextColor(Color.parseColor("#999999"));
        textView5.setTextColor(Color.parseColor("#999999"));
        textView1.getPaint().setFakeBoldText(false);
        textView2.getPaint().setFakeBoldText(false);
        textView3.getPaint().setFakeBoldText(false);
        textView4.getPaint().setFakeBoldText(false);
    }

}
