package com.example.weahen.wstest.Model;

public class Merchant {

    private int path;
    private String title;
    private String picName;
    private String description;

    public Merchant(int path, String title, String picName, String description) {
        this.path = path;
        this.title = title;
        this.picName = picName;
        this.description = description;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
