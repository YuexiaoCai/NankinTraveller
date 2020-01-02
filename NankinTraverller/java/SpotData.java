package com.example.test3;

import java.io.Serializable;

public class SpotData implements Serializable {
    private Integer spotID;
    private Float spotScore;
    private String userName;

    public Integer getSpotID() {
        return spotID;
    }
    public Float getSpotScore() {
        return spotScore;
    }
    public String getUserName(){ return userName;}

    public void setSpotID(Integer spotID) {
        this.spotID = spotID;
    }
    public void setSpotScore(Float spotScore) {
        this.spotScore = spotScore;
    }

    public SpotData(Integer spotID,Float spotScore,String userName)
    {
        this.spotID = spotID;
        this.spotScore = spotScore;
        this.userName = userName;
    }
}
