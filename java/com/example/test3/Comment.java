package com.example.test3;

import java.io.Serializable;

public class Comment implements Serializable {
    private String articleTitle;
    private String content;
    private String author;

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Comment(String articleTitle, String content, String author){
        this.articleTitle = articleTitle;
        this.content = content;
        this.author = author;
    }
}
