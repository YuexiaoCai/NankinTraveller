package com.example.test3;

public class ViewRecycler
{
    private String name;

    private int imageId;

    public ViewRecycler (String name,int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {return name;}

    public int getImageId() {return imageId;}
}
