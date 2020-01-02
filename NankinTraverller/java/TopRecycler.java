package com.example.test3;

public class TopRecycler
{

    private String title;

    private String content;

    private int imageId;

    public TopRecycler (String title,String content,int imageId)
    {
        this.title=title;
        this.content=content;
        this.imageId=imageId;
    }


    public String getTitle() {return title;}

    public String getContent() {return content;}

    public int getImageId() {return imageId;}
}
