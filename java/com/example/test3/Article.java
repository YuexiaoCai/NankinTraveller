package com.example.test3;

import java.io.Serializable;

public class Article implements Serializable {
    private String title;
    private String type;
    private String content;
    private String author;
    private String url;


    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getContent() { return content; }

    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Article(String title, String type, String content, String author,String url){
        this.title = title;
        this.type = type;
        this.content = content;
        this.author = author;
        this.url = url;
    }
}
