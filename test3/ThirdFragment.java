package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


/**
 * Created by 虾仁锅巴 on 2018/7/16.
 */
public class ThirdFragment extends Fragment
{
    private ViewRecycler[] viewRecyclers =
            {
                    new ViewRecycler("江宁织造府",R.drawable.jnzzbwg),
                    new ViewRecycler("明孝陵",R.drawable.mxl),
                    new ViewRecycler("鸡鸣寺",R.drawable.jms),
                    new ViewRecycler("中山陵",R.drawable.zsl),
                    new ViewRecycler("音乐台",R.drawable.yyt),
                    new ViewRecycler("玄武湖",R.drawable.xwh),
                    new ViewRecycler("甘熙故居",R.drawable.gxgj),
                    new ViewRecycler("牛首山",R.drawable.nss),
                    new ViewRecycler("中华门",R.drawable.zhm),
                    new ViewRecycler("曾公祠",R.drawable.zgc),
            };

    //private List<ViewRecycler> viewRecyclerList = new ArrayList<>();

    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_third,container,
                false);
        ImageView imageView = view.findViewById(R.id.fragment_3_1_image);
        Glide.with(view.getContext()).load(R.drawable.njdy).into(imageView);

        TextView text_2_fight = view.findViewById(R.id.fragment_3_2_text_right);
        text_2_fight.setOnClickListener(view1 ->
        {
            Intent intent = new Intent(view1.getContext(),TopActivity.class);
            startActivity(intent);
        });


        RecyclerView recyclerView = view.findViewById(R.id.fragment_3_2_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        ViewRecyclerAdapter adapter = new ViewRecyclerAdapter(Arrays.asList(viewRecyclers));
        recyclerView.setAdapter(adapter);





        return view;
    }


}
