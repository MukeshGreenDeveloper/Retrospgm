package com.example.retrospgm;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ProductResponse {

    @SerializedName("href")
    private String href;
    @SerializedName("country")
    private String country;
    @SerializedName("data")
    private List<Products> data = new ArrayList<Products>();


    public ProductResponse(String href, String country, List<Products> data) {
        this.href = href;
        this.country = country;
        this.data = data;

    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Products> getData() {
        return data;
    }

    public void setData(List<Products> data) {
        this.data = data;
    }


}
