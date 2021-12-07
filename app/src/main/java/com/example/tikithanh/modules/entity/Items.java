package com.example.tikithanh.modules.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Items {
    @SerializedName("images")
    private List<String> images;

    @SerializedName("category_id")
    private int categoryId;

    @SerializedName("title")
    private String title;

    public List<String> getImages(){
        return images;
    }

    public int getCategoryId(){
        return categoryId;
    }

    public String getTitle(){
        return title;
    }
}
