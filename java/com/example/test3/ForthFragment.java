package com.example.test3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
        String url;

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
                url = article.getUrl();

                newList.add(new Spot(title,content.substring(0,30),author,type,url,R.drawable.mrtx));
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
                    intent.putExtra("article",new Article(null,null,null,null,null));
                    view.getContext().startActivity(intent);
                }

            }
        });
        return view;
    }
}
