package com.example.test3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivityComment extends AppCompatActivity implements View.OnClickListener {
    private Button mBtSendComment;
    private EditText mEtCommentToSend;
    private DBOpenHelper mDBOpenHelper;
    private CommentAdapter adapter;
    private Comment[] comments=
            {

            };
    private SwipeRefreshLayout swipeRefresh;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        android.support.v7.widget.Toolbar toolbar=findViewById(R.id.comment_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//添加默认的返回图标
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用


        swipeRefresh=(SwipeRefreshLayout)findViewById(R.id.comment_swipe_refresh);
        swipeRefresh.setColorSchemeColors(R.color.colorPrimary);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){

            @Override
            public void onRefresh() {
                refreshComment();
            }
        });

        initView();

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        android.support.v7.widget.Toolbar toolbar=findViewById(R.id.comment_toolbar);
        if (toolbar != null)
            toolbar.setTitle("");
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void initView(){

        mBtSendComment = findViewById(R.id.send_comment);
        mEtCommentToSend = findViewById(R.id.comment_to_send);
        mBtSendComment.setOnClickListener(this);
        mDBOpenHelper = new DBOpenHelper(this);

        RecyclerView recyclerView = findViewById(R.id.comment_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        String content;
        String author;
        String articleTitle;

        Intent intent = getIntent();
        String title = intent.getStringExtra("articleTitle");

        List<Comment> list = Arrays.asList(comments);
        ArrayList newList = new ArrayList<>(list);
        ArrayList<Comment> data = mDBOpenHelper.getAllComment();
        for (int i = 0; i < data.size(); i++) {
            if(data.size()!=0){
                Comment comment = data.get(i);
                author = comment.getAuthor();
                content = comment.getContent();
                articleTitle = comment.getArticleTitle();

                if(articleTitle.equals(title)){
                    newList.add(new Comment(articleTitle,content,author));
                }
            }
        }
        adapter=new CommentAdapter(newList);
        recyclerView.setAdapter(adapter);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.send_comment:
                Intent intent = getIntent();
                String title = intent.getStringExtra("articleTitle");
                String commentMessage = mEtCommentToSend.getText().toString().trim();
                mDBOpenHelper.addCommnent(title,commentMessage,MainActivity.userName);
                mEtCommentToSend.setText(null);
                refreshComment();
                break;
        }
    }

    private void refreshComment(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(200);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        initView();

                        adapter.notifyDataSetChanged();
                        swipeRefresh.setRefreshing(false);
                    }
                });
            }
        }).start();
    }


}


