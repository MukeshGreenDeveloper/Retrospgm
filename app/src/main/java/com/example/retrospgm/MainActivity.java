package com.example.retrospgm;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();
    RecyclerView recyclerView;

    // TODO - insert your themoviedb.org API KEY here
//    private final static String API_KEY = "";
    private final static String Authorization = "Basic M2NkZTJkYzYtYzIyMC00OGQ3LWFiZjUtNmMxZGQzZWE3MGY3OjQ2MzgwYTI1ZTlmZDk2YTQ0NjViMWQ3MWYwMWMzYzFk";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        HashMap<String, String> headerMap = new HashMap<>();
        headerMap.put("Authorization", Authorization);
        Call<ProductResponse> call = apiService.getProductEntriesNew(headerMap);
        call.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                List<Products> movies = response.body().getData();
                System.out.println(movies);
                Log.d(TAG, "Number of re received: " + movies.size());
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                // Log error here since request failed
                System.out.println("fail:");
                Log.e(TAG, t.toString());
            }
        });

//        Method();

    }


//    private void Method() {
//    Call<ResponseBody> responseCall = ApiInterface.getProductEntries(Authorization);
//    responseCall.enqueue(new Callback<ResponseBody>() {
//        @Override
//        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//            if (response.code() == 200) {
//                try {
//                    assert response.body() != null;
//                    String result = response.body().string();
//                    JSONArray jsonArray = new JSONArray(result);
//                } catch (Exception e) {
//                    // TODO: handle exception
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        @Override
//        public void onFailure(Call<ResponseBody> call, Throwable t) {
//            Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
//        }
//    });

}


//            tv_gift_card_id = itemView.findViewById(R.id.hreft);
//private void Method() {
//    Call<ResponseBody> responseCall = apiInterface.getVehicles();
//    responseCall.enqueue(new Callback<ResponseBody>() {
//        @Override
//        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//            if (response.code() == 200) {
//                try {
//                    assert response.body() != null;
//                    String result = response.body().string();
//                    JSONArray jsonArray = new JSONArray(result);
//                } catch (Exception e) {
//                    // TODO: handle exception
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        @Override
//        public void onFailure(Call<ResponseBody> call, Throwable t) {
//            Toast.makeText(UserProfile.this, "Something went wrong", Toast.LENGTH_SHORT).show();
//        }
//    });
//}