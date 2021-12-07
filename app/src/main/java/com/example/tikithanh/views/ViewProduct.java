package com.example.tikithanh.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tikithanh.R;
import com.example.tikithanh.modules.Images;
import com.example.tikithanh.modules.Products;
import com.example.tikithanh.viewmodules.ProductAdaper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ViewProduct extends AppCompatActivity {
    private RecyclerView rcvProduct;
    private ProductAdaper productAdaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

//        rcvProduct=findViewById(R.id.rcv_lproduct);
//
//        ProductAdaper productAdaper=new ProductAdaper(this);
//
//        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
//        rcvProduct.setLayoutManager(linearLayoutManager);
//        productAdaper.setData(getList());
//        rcvProduct.setAdapter(productAdaper);
        try {
            ViewProduct.MyGETRequest();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public List<Products> getList(){
        List<Products> temp =new ArrayList<>();
        temp.add(new Products("123",R.drawable.demo,"123"));
        temp.add(new Products("123",R.drawable.demo,"123"));
        temp.add(new Products("123",R.drawable.demo,"123"));
        temp.add(new Products("123",R.drawable.demo,"123"));
        return  temp;
    }
    public static void MyGETRequest() throws IOException {
        URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/1");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
        int responseCode = conection.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            //GetAndPost.POSTRequest(response.toString());
        } else {
            System.out.println("GET NOT WORKED");
        }

    }
}