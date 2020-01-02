package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForthFragment extends Fragment
{

    private Spot[] spots=
            {
            new Spot("江宁织造府","如切如磋，如琢如磨\n——江宁织造博物馆游记","叶竹静","文学",R.drawable.jnzzf,R.drawable.yzj),
            new Spot("阅江楼","天下幽冥处，皆照我光辉\n——阅江楼游记","段仕伟","生活",R.drawable.yjl,R.drawable.dsw),
            new Spot("明故宫","断井颓垣背后的山河旧梦\n——南京明故宫游记","叶竹静","文学",R.drawable.mgg,R.drawable.yzj),
            new Spot("南航明故宫校区","皇城沉睡地下，楼宇拔地而起\n——南航明故宫校区游记","叶竹静","文学",R.drawable.nhmggxq,R.drawable.yzj),
            new Spot("南京博物院","也许是一种缘分，来南京一年的时间里，我竟然三次走入南京博物院，三次与南博相遇，" +
                    "给了我深深的记忆。","段仕伟","生活",R.drawable.njbwy,R.drawable.dsw),
            new Spot("静海寺","并记辉煌与耻辱\n——静海寺游记","叶竹静","文学",R.drawable.jhs,R.drawable.yzj),
            new Spot("中山陵","游玩，有时只是一种心境\n——钟山风景区游记","段仕伟","生活",R.drawable.zsl,R.drawable.dsw),
            new Spot("明孝陵","二十四年兴大业，龙盘虎踞在江东。","叶竹静","文学",R.drawable.mxl,R.drawable.yzj),
            new Spot("鸡鸣寺","喧嚣中的一份宁静\n——鸡鸣寺游记","叶竹静","文学",R.drawable.jms,R.drawable.yzj),
            new Spot("总统府","一个府，记录一座城\n——总统府游记","段仕伟","生活",R.drawable.ztf,R.drawable.dsw),
            new Spot("玄武湖","玄武烟柳里的金陵\n——南京玄武湖游记","叶竹静","文学",R.drawable.xwh,R.drawable.yzj),
            new Spot("甘熙故居","九十九间半的传闻不可信","段仕伟","生活",R.drawable.gxgj,R.drawable.dsw)
            };

    private DBOpenHelper mDBOpenHelper;
    private SpotAdapter adapter;
    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_forth,container,
                false);
        mDBOpenHelper = new DBOpenHelper(view.getContext());
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        String title;
        String type;
        String content;
        String author;

        List<Spot> list = Arrays.asList(spots);
        ArrayList newList = new ArrayList<>(list);

        ArrayList<Article> data = mDBOpenHelper.getAllArticle();
        for (int i = 0; i < data.size(); i++) {
            if(data.size()!=0){
                Article article = data.get(i);
                title = article.getTitle();
                type = article.getType();
                content = article.getContent();
                author = article.getAuthor();
                newList.add(new Spot(title,content.substring(0,5),author,type,R.drawable.jnzzf,R.drawable.yzj));
            }

        }

        adapter=new SpotAdapter(newList);
        recyclerView.setAdapter(adapter);


        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(MainActivity.userName.equals("Visitor"))
                {
                    Toast.makeText(view.getContext(),"请登录后发布游记", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(view.getContext(), AddArticle.class);
                    intent.putExtra("article",new Article(null,null,null,null));
                    view.getContext().startActivity(intent);
                }

            }
        });
        return view;
    }
}
