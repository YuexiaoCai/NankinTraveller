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
import java.util.Calendar;
import java.util.List;


public class ThirdFragment extends Fragment
{
    private ViewRecycler[] viewRecyclers =
            {
                    new ViewRecycler("江宁织造府",R.drawable.jnzzf),
                    new ViewRecycler("明孝陵",R.drawable.mxl),
                    new ViewRecycler("鸡鸣寺",R.drawable.jms),
                    new ViewRecycler("玄武湖",R.drawable.xwh),
                    new ViewRecycler("阅江楼",R.drawable.yjl),

            };

    private ViewRecycler[] viewRecyclers2 =
            {
                    new ViewRecycler("可可托海",R.drawable.kkth),
                    new ViewRecycler("喀纳斯",R.drawable.kns),
                    new ViewRecycler("那拉提",R.drawable.nlt),
                    new ViewRecycler("中山陵",R.drawable.zsl),
                    new ViewRecycler("总统府",R.drawable.ztf),
            };

    private int[] list =
            {
             R.drawable.gxgj,R.drawable.mgg,R.drawable.mxl,R.drawable.njbwy,R.drawable.jnzzf,
                    R.drawable.ztf,R.drawable.zsl,R.drawable.jms,R.drawable.jhs,
                    R.drawable.xwh,R.drawable.yjl,R.drawable.nhmggxq
            };

    private List<ViewRecycler> viewRecyclerList = new ArrayList<>();

    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_third,container,
                false);
        ImageView imageView = view.findViewById(R.id.fragment_3_1_image);

        Intent detailUserInformation=getActivity().getIntent();//获取mainActivity传递的用户信息
        User user= (User) detailUserInformation.getSerializableExtra("userInformation");
        String userName=user.getName();
        String password=user.getPassword();

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int num = day%12;
        Glide.with(view.getContext()).load(R.drawable.nlt).into(imageView);
        imageView.setOnClickListener(view12 ->
        {
            Intent intent0 = new Intent(view12.getContext(),FruitActivity.class);
            intent0.putExtra(FruitActivity.FRUIT_IMAGE_ID,R.drawable.nlt);//list[num]
            intent0.putExtra("userInformation",new User(userName,password));
            view12.getContext().startActivity(intent0);
        });

        TextView text_2_fight = view.findViewById(R.id.fragment_3_2_text_right);
        text_2_fight.setOnClickListener(view1 ->
        {
            Intent intent = new Intent(view1.getContext(),TopActivity.class);
            intent.putExtra("userInformation",new User(userName,password));
            startActivity(intent);
        });

        RecyclerView recyclerView = view.findViewById(R.id.fragment_3_2_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        ViewRecyclerAdapter adapter = new ViewRecyclerAdapter(Arrays.asList(viewRecyclers));
        recyclerView.setAdapter(adapter);

        RecyclerView recyclerView2 = view.findViewById(R.id.fragment_3_3_recycler);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(layoutManager2);
        ViewRecyclerAdapter adapter2 = new ViewRecyclerAdapter(Arrays.asList(viewRecyclers2));
        recyclerView2.setAdapter(adapter2);

        return view;
    }


}
