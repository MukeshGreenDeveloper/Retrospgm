package com.example.retrospgm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {


    Activity activity;
    ArrayList<Products> getcontentArrayList;
    LinearLayoutManager linearLayoutManager;
    Products getcontent;

    public ProductAdapter(Activity activity, ArrayList<Products> getcontentArrayList, LinearLayoutManager linearLayoutManager) {
        this.activity = activity;
        this.getcontentArrayList = getcontentArrayList;
        this.linearLayoutManager = linearLayoutManager;
//
    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_product, parent, false);
        return new ProductAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductAdapter.MyViewHolder holder, final int position) {


        getcontent = getcontentArrayList.get(position);
        holder.tv_redeem_id.setText(getcontentArrayList.get(position).getProduct_id());
     holder.tv_user_id.setText(getcontentArrayList.get(position).getBrand_name());


    }


    @Override
    public int getItemCount() {
        return getcontentArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView  tv_redeem_id, tv_user_id;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


         tv_redeem_id = itemView.findViewById(R.id.product_idt);
            tv_user_id = itemView.findViewById(R.id.brand_namet);

        }
    }
}
