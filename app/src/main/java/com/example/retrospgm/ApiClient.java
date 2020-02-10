package com.example.retrospgm;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {



    public static final String BASE_URL = "https://api.vauchar.com";
  private static Retrofit retrofit = null;

//    private static final String APP_ID = "e1477e44";
    private final static String Authorization = "Basic M2NkZTJkYzYtYzIyMC00OGQ3LWFiZjUtNmMxZGQzZWE3MGY3OjQ2MzgwYTI1ZTlmZDk2YTQ0NjViMWQ3MWYwMWMzYzFk";

    private  ApiInterface service;


//    private ApiClient() {
//
//        OkHttpClient client = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
//            @Override
//            public Response intercept(@NonNull Chain chain) throws IOException {
//                Request request = chain.request()
//                        .newBuilder()
////                        .addHeader("app_id", APP_ID)
//                        .addHeader("app_key", Authorization)
//                        .build();
//                return chain.proceed(request);
//            }
//        }).build();
//        Retrofit retrofit = new Retrofit.Builder()
//                .client(client)
//                .baseUrl("https://api.vauchar.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        service = retrofit.create(ApiInterface.class);
//
//    }

    public static Retrofit getClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
