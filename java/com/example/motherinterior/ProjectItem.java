package com.example.motherinterior;

public class ProjectItem {
    private String mImageUrl;
    private String mCreator;
    private int  mLikes;
    private String[] allImages;

    public ProjectItem() {
    }

    public ProjectItem(String mImageUrl, String mCreator, int mLikes) {
        this.mImageUrl = mImageUrl;
        this.mCreator = mCreator;
        this.mLikes = mLikes;

    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public void setmCreator(String mCreator) {
        this.mCreator = mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }

    public void setmLikes(int mLikes) {
        this.mLikes = mLikes;
    }

    public String[] getAllImages() {
        return allImages;
    }

    public void setAllImages(String[] allImages) {
        this.allImages = allImages;
    }
}
