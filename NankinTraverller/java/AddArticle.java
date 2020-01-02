package com.example.test3;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class AddArticle extends AppCompatActivity implements View.OnClickListener {

    private DBOpenHelper mDBOpenHelper;
    private EditText mEtAddArticleTitle;
    private EditText mEtAddArticleContent;
    private EditText mEtAddArticleType;
    private ImageView mIvAddArticleBack;
    private Button mBtAddArticleConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addarticle);


        initView();

        Intent intent=getIntent();
        Article article= (Article) intent.getSerializableExtra("article");
        String title = article.getTitle();
        String type= article.getType();
        String content = article.getContent();
        String author = article.getAuthor();
        mEtAddArticleTitle.setText(title);
        mEtAddArticleType.setText(type);
        mEtAddArticleContent.setText(content);

        mDBOpenHelper = new DBOpenHelper(this);

    }

    private void initView(){

        mEtAddArticleTitle = findViewById(R.id.addArticle_title);
        mEtAddArticleType = findViewById(R.id.addArticle_type);
        mEtAddArticleContent = findViewById(R.id.addArticle_content);
        mBtAddArticleConfirm = findViewById(R.id.addArticle_confirm);
        mIvAddArticleBack = findViewById(R.id.addArticle_toolbar_image_left);

        mBtAddArticleConfirm.setOnClickListener(this);
        mIvAddArticleBack.setOnClickListener(this);

        //Glide.with(this).load(R.mipmap.back_white).into(mIvAddArticleBack);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.addArticle_toolbar_image_left: //返回文章列表界面
                finish();
                break;
            case R.id.addArticle_confirm:    //发布按钮
                String title = mEtAddArticleTitle.getText().toString().trim();
                String type = mEtAddArticleType.getText().toString().trim();
                String content = mEtAddArticleContent.getText().toString().trim();
                String oldtitle;
                Intent intent=getIntent();
                Article article= (Article) intent.getSerializableExtra("article");
                String existTitle=article.getTitle();
                if(existTitle!=null){
                    ArrayList<Article> data1 = mDBOpenHelper.getAllArticle();
                    for (int i = 0; i < data1.size(); i++) {
                        if(data1.size()!=0){
                            Article article1 = data1.get(i);
                            oldtitle = article1.getTitle();
                            if(existTitle.equals(oldtitle)){
                                mDBOpenHelper.deleteArticle(oldtitle);
                            }
                        }
                    }
                }


                //if((author.equals(MainActivity.userName))&&(title.equals()))
                ArrayList<Article> data = mDBOpenHelper.getAllArticle();
                mDBOpenHelper.addArticle(title, type, content, MainActivity.userName);
                finish();
                break;
        }
    }
}
