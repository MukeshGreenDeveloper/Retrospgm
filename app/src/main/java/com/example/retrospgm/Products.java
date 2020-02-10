package com.example.retrospgm;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Products {

    @SerializedName("_id")
    private String _id;
    @SerializedName("product_id")
    private String product_id;
    @SerializedName("brand_name")
    private String brand_name;

    public Products(String _id, String product_id, String brand_name) {
        this._id = _id;
        this.product_id = product_id;
        this.brand_name = brand_name;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
}
