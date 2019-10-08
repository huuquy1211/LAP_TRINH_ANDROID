package com.example.student.baitap;

public class Item {
    private String url;
    private String imagePath;

    public Item(String url, String imagePath) {
        this.url = url;
        this.imagePath = imagePath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
