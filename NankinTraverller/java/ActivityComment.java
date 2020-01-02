package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityComment extends AppCompatActivity implements View.OnClickListener {
    private Button mBtSendComment;
    private EditText mEtCommentToSend;
    private DBOpenHelper mDBOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        mDBOpenHelper = new DBOpenHelper(this);

        initView();
        String content;
        String author;
        String articleTitle;
        TextView commentText1 = findViewById(R.id.comment_textView);
        TextView commentText2 = findViewById(R.id.comment_textView2);

        Intent intent = getIntent();
        String title = intent.getStringExtra("articleTitle");

        ArrayList<Comment> data = mDBOpenHelper.getAllComment();
        for (int i = 0; i < data.size(); i++) {
            if(data.size()!=0){
                Comment comment = data.get(i);
                content = comment.getContent();
                author = comment.getAuthor();
                articleTitle = comment.getArticleTitle();

                if(articleTitle.equals(title)){
                    commentText1.setText(author);
                    commentText2.setText(content);
                }


            }

        }


    }

    private void initView(){

        mBtSendComment = findViewById(R.id.send_comment);
        mEtCommentToSend = findViewById(R.id.comment_to_send);

        mBtSendComment.setOnClickListener(this);
    }

    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.send_comment:
                Intent intent = getIntent();
                String title = intent.getStringExtra("articleTitle");
                String commentMessage = mEtCommentToSend.getText().toString().trim();

                ArrayList<Comment> data = mDBOpenHelper.getAllComment();
                mDBOpenHelper.addCommnent(title,commentMessage,MainActivity.userName);
                finish();
                break;
        }
    }
}
