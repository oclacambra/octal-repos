package com.example.android.tourguideapp;

import java.io.Serializable;

public class ScenicView implements Serializable {

    /**Title of the scenery*/
    private String mSceneTitle;
    /**Location of the scenery*/
    private String mSceneLocation;
    /**Type of the scenery*/
    private String mSceneType;
    /**Description and notations of the scenery*/
    private String mSceneDescription;
    /**Image resource id of the scenery*/
    //private int mSceneResourceId;
    private int mSceneResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

/**Create a new Scenic Object*/
public ScenicView(String sceneTitle, String sceneLocation, String sceneType, String sceneDescription, int sceneResourceId){
    mSceneTitle = sceneTitle;
    mSceneLocation = sceneLocation;
    mSceneType = sceneType;
    mSceneDescription = sceneDescription;
    mSceneResourceId = sceneResourceId;
}
    /**Create a new another Scenic Object*/
    public ScenicView(String sceneTitle, String sceneLocation, String sceneType, String sceneDescription){
        mSceneTitle = sceneTitle;
        mSceneLocation = sceneLocation;
        mSceneType = sceneType;
        mSceneDescription = sceneDescription;
    }

/**Get the values of the ScenicView*/

    public String getSceneTitle() {
        return mSceneTitle;
    }

    public String getSceneLocation() {
        return mSceneLocation;
    }

    public String getSceneType() {
        return mSceneType;
    }

    public String getSceneDescription() {
        return mSceneDescription;
    }

    public int getSceneResourceId() {
        return mSceneResourceId;
    }
    /**
     * Returns whether there is an image for this word
     */
    public  boolean hasImage() {

        return mSceneResourceId != NO_IMAGE_PROVIDED;

    }
}
