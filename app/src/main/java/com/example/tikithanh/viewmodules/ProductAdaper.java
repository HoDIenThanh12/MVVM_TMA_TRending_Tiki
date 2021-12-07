package com.example.tikithanh.viewmodules;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikithanh.R;
import com.example.tikithanh.modules.Images;
import com.example.tikithanh.modules.Products;

import java.util.List;

public class ProductAdaper extends RecyclerView.Adapter<ProductAdaper.ProductsViewHolder> {
    private List<Products> mProduct;
    private Context mContent;

    public void setData(List<Products> lP){
        this.mProduct=lP;
        notifyDataSetChanged();
    }
    public ProductAdaper (Context mContent){
        this.mContent=mContent;
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_produces,parent,false);

        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        Products b=mProduct.get(position);
        if(b==null)
            return;
        //hello
        holder.imgProduct.setImageResource(b.getImages());
        holder.tvTitle.setText(b.getTitle());
        holder.tvCategory.setText(b.getCategory_id());
    }

    @Override
    public int getItemCount() {
        if(mProduct!=null)
            return mProduct.size();
        return 0;
    }

    public class ProductsViewHolder  extends RecyclerView.ViewHolder{
        private ImageView imgProduct;
        private TextView tvTitle;
        private TextView tvCategory;
        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct=itemView.findViewById(R.id.imgProduct);
            tvTitle=itemView.findViewById(R.id.tv_Product);
            tvCategory= itemView.findViewById(R.id.tv_category_id);
        }
    }
}
