package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticleManagement extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIvManageBack;
    private Spot[] spots=
            {

            };

    private DBOpenHelper mDBOpenHelper;
    private SpotAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_management);
        mDBOpenHelper = new DBOpenHelper(this);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.article_management);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        initView();
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
                if(author.equals(MainActivity.userName))
                {
                    newList.add(new Spot(title,content,author,type,url,R.drawable.yzj));
                }
            }

        }

        adapter=new SpotAdapter(newList);
        recyclerView.setAdapter(adapter);

    }

    private void initView(){

        mIvManageBack = findViewById(R.id.management_toolbar_image_left);

        mIvManageBack.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");

        switch (view.getId()) {
            case R.id.management_toolbar_image_left: //返回文章列表界面
                finish();
                break;
        }
    }

}
