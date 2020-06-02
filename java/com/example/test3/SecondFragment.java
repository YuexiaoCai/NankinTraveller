package com.example.test3;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondFragment extends Fragment
{
    //分类
    private RightRecycler[] rightRecyclers=
    {

            new RightRecycler("甘熙故居",R.drawable.gxgj),
            new RightRecycler("明故宫",R.drawable.mgg),
            new RightRecycler("明孝陵",R.drawable.mxl),
            new RightRecycler("鸡鸣寺",R.drawable.jms),
            new RightRecycler("静海寺",R.drawable.jhs),
            new RightRecycler("江宁织造府",R.drawable.jnzzf),
            new RightRecycler("总统府",R.drawable.ztf),
            new RightRecycler("中山陵",R.drawable.zsl),
            new RightRecycler("音乐台",R.drawable.yyt),
            new RightRecycler("玄武湖",R.drawable.xwh),
            new RightRecycler("南京博物院",R.drawable.njbwy),
            new RightRecycler("阅江楼",R.drawable.yjl),
            new RightRecycler("南航明故宫校区",R.drawable.nhmggxq),
            new RightRecycler("那拉提",R.drawable.nlt),
            new RightRecycler("巴音布鲁克",R.drawable.byblk),
            new RightRecycler("喀纳斯",R.drawable.kns),
            new RightRecycler("可可托海",R.drawable.kkth),

    };

    private List<RightRecycler> rightRecyclerList = new ArrayList<>();


    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_second,container, false);
        RecyclerView recyclerViewRight = view.findViewById(R.id.fragment_2_recycler_right);
        LinearLayoutManager layoutManagerRight = new LinearLayoutManager(getActivity());
        recyclerViewRight.setLayoutManager(layoutManagerRight);
        RightRecyclerAdapter adapterRight = new RightRecyclerAdapter(Arrays.asList(rightRecyclers));
        recyclerViewRight.setAdapter(adapterRight);

        TextView textView1 = view.findViewById(R.id.fragment_2_text_1);
        TextView textView2 = view.findViewById(R.id.fragment_2_text_2);
        TextView textView3 = view.findViewById(R.id.fragment_2_text_3);
        TextView textView4 = view.findViewById(R.id.fragment_2_text_4);
        TextView textView6 = view.findViewById(R.id.fragment_2_text0_1);
        TextView textView7 = view.findViewById(R.id.fragment_2_text0_2);
        TextView textView8 = view.findViewById(R.id.fragment_2_text0_3);
        TextView textView9 = view.findViewById(R.id.fragment_2_text0_4);
        textView1.getPaint().setFakeBoldText(true);
        textView1.setOnClickListener(view1 ->
        {
            clear(view);
            textView1.setTextColor(Color.parseColor("#008577"));
            textView6.setBackgroundColor(Color.parseColor("#008577"));
            textView1.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(0,0);
        });
        textView2.setOnClickListener(view2 ->
        {
            clear(view);
            textView2.setTextColor(Color.parseColor("#008577"));
            textView7.setBackgroundColor(Color.parseColor("#008577"));
            textView2.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(6,0);
        });
        textView3.setOnClickListener(view3 ->
        {
            clear(view);
            textView3.setTextColor(Color.parseColor("#008577"));
            textView8.setBackgroundColor(Color.parseColor("#008577"));
            textView3.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(10,0);
        });
        textView4.setOnClickListener(view4 ->
        {
            clear(view);
            textView4.setTextColor(Color.parseColor("#008577"));
            textView9.setBackgroundColor(Color.parseColor("#008577"));
            textView4.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(13,0);
        });

        recyclerViewRight.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerViewRight, int newState) {
                super.onScrollStateChanged(recyclerViewRight, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerViewRight, int dx, int dy) {
                super.onScrolled(recyclerViewRight, dx, dy);

                int pastVisiblesItems = layoutManagerRight.findFirstVisibleItemPosition();

                if(pastVisiblesItems>0 && pastVisiblesItems<=5)
                {
                    clear(view);
                    textView1.setTextColor(Color.parseColor("#008577"));
                    textView6.setBackgroundColor(Color.parseColor("#008577"));
                    textView1.getPaint().setFakeBoldText(true);
                }

                if(pastVisiblesItems>5 && pastVisiblesItems<=7)
                {
                    clear(view);
                    textView2.setTextColor(Color.parseColor("#008577"));
                    textView7.setBackgroundColor(Color.parseColor("#008577"));
                    textView2.getPaint().setFakeBoldText(true);
                }

                if(pastVisiblesItems>9 && pastVisiblesItems<=12)
                {
                    clear(view);
                    textView3.setTextColor(Color.parseColor("#008577"));
                    textView8.setBackgroundColor(Color.parseColor("#008577"));
                    textView3.getPaint().setFakeBoldText(true);
                }

                if(pastVisiblesItems>12 && pastVisiblesItems<=16)
                {
                    clear(view);
                    textView4.setTextColor(Color.parseColor("#008577"));
                    textView9.setBackgroundColor(Color.parseColor("#008577"));
                    textView4.getPaint().setFakeBoldText(true);
                }
            }
        });




        return view;
    }




    private void clear(View view)
    {
        TextView textView1 = view.findViewById(R.id.fragment_2_text_1);
        TextView textView2 = view.findViewById(R.id.fragment_2_text_2);
        TextView textView3 = view.findViewById(R.id.fragment_2_text_3);
        TextView textView4 = view.findViewById(R.id.fragment_2_text_4);
        TextView textView6 = view.findViewById(R.id.fragment_2_text0_1);
        TextView textView7 = view.findViewById(R.id.fragment_2_text0_2);
        TextView textView8 = view.findViewById(R.id.fragment_2_text0_3);
        TextView textView9 = view.findViewById(R.id.fragment_2_text0_4);
        textView1.setTextColor(Color.parseColor("#888888"));
        textView6.setBackgroundColor(Color.parseColor("#ffffff"));
        textView2.setTextColor(Color.parseColor("#888888"));
        textView7.setBackgroundColor(Color.parseColor("#ffffff"));
        textView3.setTextColor(Color.parseColor("#888888"));
        textView8.setBackgroundColor(Color.parseColor("#ffffff"));
        textView4.setTextColor(Color.parseColor("#888888"));
        textView9.setBackgroundColor(Color.parseColor("#ffffff"));
        textView1.getPaint().setFakeBoldText(false);
        textView2.getPaint().setFakeBoldText(false);
        textView3.getPaint().setFakeBoldText(false);
        textView4.getPaint().setFakeBoldText(false);
    }

}
