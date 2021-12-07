package com.example.tikithanh.api;

import com.example.tikithanh.modules.Products;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    //https://api.tiki.vn/shopping-trend/api/trendings/hub?cursor=0&limit=20
    String dumen="https://api.tiki.vn/";
    Gson gson =new GsonBuilder()
            .setDateFormat("yyyy-mm-dd HH:mm:ss")
            .create();
    ApiService apiService =new Retrofit.Builder()
            .baseUrl(dumen)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

//    @GET("shopping-trend/api/trendings/hub?cursor=0&limit=1")
//    Call<Products> conProductsCall(@Query(""))

//    ApiServic apiServic=new Retrofit.Builder()
//            .baseUrl(dumen)
//     static String DEFAULT_URL = "https://api.tiki.vn/";
//    @GET("shopping-trend/api/trendings/hub?")
//    Call<Response> getCategory(
//            @Query("cursor") int cursor,
//            @Query("limit") int limit);
//
//    @GET("shopping-trend/api/trendings/hub/category_id/{id}?")
//    Call<Response> getProduct(
//            @Path("id") int id,
//            @Query("cursor") int cursor,
//            @Query("limit") int limit
//    );
//
//    @GET
//    Call<Response> getProduct(@Url String url);
//
////    @GET("api/v2/search/suggestion?")
//    Call<SearchSuggestionModel> searchSuggestion(@Query("q") String searchText);
//
//    @GET("api/v2/products?")
//    Call<Data> getProductByName(@Query("q") String searchText);
}
