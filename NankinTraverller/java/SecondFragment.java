package com.example.test3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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

    private RightRecycler[] rightRecyclers=
    {

            new RightRecycler("甘熙故居",R.drawable.gxgj),
            new RightRecycler("明故宫",R.drawable.mgg),
            new RightRecycler("明孝陵",R.drawable.mxl),
            new RightRecycler("南京博物院",R.drawable.njbwy),
            new RightRecycler("江宁织造府",R.drawable.jnzzf),
            new RightRecycler("总统府",R.drawable.ztf),
            new RightRecycler("中山陵",R.drawable.zsl),
            new RightRecycler("鸡鸣寺",R.drawable.jms),
            new RightRecycler("静海寺",R.drawable.jhs),
            new RightRecycler("玄武湖",R.drawable.xwh),
            new RightRecycler("阅江楼",R.drawable.yjl),
            new RightRecycler("南航明故宫校区",R.drawable.nhmggxq),

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
        TextView textView6 = view.findViewById(R.id.fragment_2_text0_1);
        TextView textView7 = view.findViewById(R.id.fragment_2_text0_2);
        TextView textView8 = view.findViewById(R.id.fragment_2_text0_3);
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
                    .scrollToPositionWithOffset(5,0);
        });
        textView3.setOnClickListener(view3 ->
        {
            clear(view);
            textView3.setTextColor(Color.parseColor("#008577"));
            textView8.setBackgroundColor(Color.parseColor("#008577"));
            textView3.getPaint().setFakeBoldText(true);
            ((LinearLayoutManager)recyclerViewRight.getLayoutManager())
                    .scrollToPositionWithOffset(7,0);
        });


        return view;
    }




    private void clear(View view)
    {
        TextView textView1 = view.findViewById(R.id.fragment_2_text_1);
        TextView textView2 = view.findViewById(R.id.fragment_2_text_2);
        TextView textView3 = view.findViewById(R.id.fragment_2_text_3);
        TextView textView6 = view.findViewById(R.id.fragment_2_text0_1);
        TextView textView7 = view.findViewById(R.id.fragment_2_text0_2);
        TextView textView8 = view.findViewById(R.id.fragment_2_text0_3);
        textView1.setTextColor(Color.parseColor("#999999"));
        textView6.setBackgroundColor(Color.parseColor("#ffffff"));
        textView2.setTextColor(Color.parseColor("#999999"));
        textView7.setBackgroundColor(Color.parseColor("#ffffff"));
        textView3.setTextColor(Color.parseColor("#999999"));
        textView8.setBackgroundColor(Color.parseColor("#ffffff"));
        textView1.getPaint().setFakeBoldText(false);
        textView2.getPaint().setFakeBoldText(false);
        textView3.getPaint().setFakeBoldText(false);
    }

}
