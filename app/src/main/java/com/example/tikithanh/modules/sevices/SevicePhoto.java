package com.example.tikithanh.modules.sevices;

import com.example.tikithanh.modules.entity.Photos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SevicePhoto {
    @GET("posts")
    Call<List<Photos>> getAllPhoto();
}
