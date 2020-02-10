package com.example.retrospgm;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

public interface ApiInterface {

//    @GET("movie/top_rated")
//    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);
//
//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);


//    https://api.vauchar.com/details/presents/IN
//    public interface IDictionariesApi {

//    @FormUrlEncoded
    @GET("/details/presents/IN")
    Call<ProductResponse> getProductEntriesNew(@HeaderMap Map<String, String> headers);


//   ("Authorization") String Authorization);

//    @Headers("Authorization: Basic M2NkZTJkYzYtYzIyMC00OGQ3LWFiZjUtNmMxZGQzZWE3MGY3OjQ2MzgwYTI1ZTlmZDk2YTQ0NjViMWQ3MWYwMWMzYzFk")
//    @GET
//    Call<ProductResponse> getProductEntries;


}






