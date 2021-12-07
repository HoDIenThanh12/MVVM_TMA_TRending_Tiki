package com.example.tikithanh.modules;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;

public class Products {
    //@SerializedName("month")
    private String title;
    private String category_id;
    private int images;
    private Images img;

    public Products() {
    }

    public Products(String title, int images, String category_id) {
        this.title = title;
        this.category_id = category_id;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public Images getImg() {
        return img;
    }

    public void setImg(Images img) {
        this.img = img;
    }
}
