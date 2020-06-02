package com.example.test3;

public class Spot {
    private String name;

    private String preview;

    private String author;

    private String category;

    private String imageId;

    private int portraitId;

    public Spot(String name, String preview, String author,String category,String imageId,int portraitId){
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

    public String getImageId() { return imageId; }

    public int getPortraitId() {
        return portraitId;
    }
}
