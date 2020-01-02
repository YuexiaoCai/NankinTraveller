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

public class ArticleCollection extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIvCollectionBack;
    private Spot[] spots=
            {

            };

    private DBOpenHelper mDBOpenHelper;
    private SpotAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_collection);
        mDBOpenHelper = new DBOpenHelper(this);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.article_collection);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        initView();
        String title;
        String type;
        String content;
        String author;
        String articleTitle;
        String likeAuthor;
        String favoriteAuthor;

        List<Spot> list = Arrays.asList(spots);
        ArrayList newList = new ArrayList<>(list);

        ArrayList<Article> data = mDBOpenHelper.getAllArticle();
        ArrayList<Favorite> data1 = mDBOpenHelper.getAllFavorite();
        for (int i = 0; i < data.size(); i++) {
            if(data.size()!=0){
                Article article = data.get(i);
                title = article.getTitle();
                type = article.getType();
                content = article.getContent();
                author = article.getAuthor();

                for (int j = 0; j < data1.size(); j++) {
                    Favorite favorite = data1.get(j);
                    articleTitle = favorite.getArticleTitle();
                    favoriteAuthor = favorite.getAuthor();
                    if(title.equals(articleTitle)&&(MainActivity.userName.equals(favoriteAuthor))){
                        newList.add(new Spot(title,content.substring(0,5),author,type,R.drawable.jnzzf,R.drawable.yzj));
                    }
                }
            }

        }

        adapter=new SpotAdapter(newList);
        recyclerView.setAdapter(adapter);

    }

    private void initView(){

        mIvCollectionBack = findViewById(R.id.collection_toolbar_image_left);

        mIvCollectionBack.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");

        switch (view.getId()) {
            case R.id.collection_toolbar_image_left: //返回文章列表界面
                finish();
                break;
        }
    }

}
