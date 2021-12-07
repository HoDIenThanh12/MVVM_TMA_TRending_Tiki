package com.example.tikithanh.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.tikithanh.R;
import com.example.tikithanh.modules.entity.Photos;
import com.example.tikithanh.modules.sevices.SevicePhoto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ViewPhotos extends AppCompatActivity {
    private static final String url="https://jsonplaceholder.typicode.com/";
    private final String TAG=getClass().getSimpleName();
    //Hồ Diên Công - may client
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photos);
        getJsonData();
    }
    public void getJsonData(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .client(okHttpClient)
                .build();


        SevicePhoto sevicePhoto = retrofit.create(SevicePhoto.class);
        Call<List<Photos>> call = sevicePhoto.getAllPhoto();
        call.enqueue(new Callback<List<Photos>>() {
            @Override
            public void onResponse(Call<List<Photos>> call, Response<List<Photos>> response) {
                Log.d(TAG,"Thành công");
                kkk(response.body());
            }

            @Override
            public void onFailure(Call<List<Photos>> call, Throwable t) {
                Log.d(TAG,"Thất bại");
            }
        });
    }
    private void kkk(List<Photos> ls){
        Log.i("///size:  ","fssdf"+ls.size());
        for(Photos p:ls){
            Log.i("///size:  ","==>"+p.toString());
        }
    }
}