package com.example.test3;

public class Spot {
    private String name;

    private String preview;

    private String author;

    private String category;

    private  int imageId;

    private int portraitId;

    public Spot(String name, String preview, String author,String category,int imageId,int portraitId){
        this.name=name;
        this.preview=preview;
        this.imageId=imageId;
        this.portraitId=portraitId;
        this.author=author;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public String getPreview() {
        return preview;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getImageId() {
        return imageId;
    }

    public int getPortraitId() {
        return portraitId;
    }
}
