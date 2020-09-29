package com.example.contestwatcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="Contest Watcher";
    RecyclerView rvContestList;
    ArrayList<Contest> contests=new ArrayList<>();
    ContestAdapter contestAdapter=new ContestAdapter(contests);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContestList=findViewById(R.id.rvContests);
        rvContestList.setLayoutManager(new LinearLayoutManager(this));

        rvContestList.setAdapter(contestAdapter);

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://codeforces.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi=retrofit.create(JsonPlaceHolderApi.class);
        Call<ListOfContest> call=jsonPlaceHolderApi.getContests();
        call.enqueue(new Callback<ListOfContest>() {
            @Override
            public void onResponse(Call<ListOfContest> call, Response<ListOfContest> response) {
                if (!response.isSuccessful()) {
//                    Log.d(TAG, "onResponse: "+response);
                    return;
                }
                ListOfContest contestList=response.body();
//                Log.d(TAG, "onResponse: "+new Gson().toJson(contestList.contests));
                contestAdapter.setContests(contestList.contests);
                contestAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ListOfContest> call, Throwable t) {
//                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });
    }
}