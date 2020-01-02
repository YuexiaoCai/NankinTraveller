package com.example.test3;

import java.io.Serializable;

public class Like implements Serializable {
    private String articleTitle;
    private String author;

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Like(String articleTitle, String author){
        this.articleTitle = articleTitle;
        this.author = author;
    }
}
