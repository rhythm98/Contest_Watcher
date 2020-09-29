package com.example.contestwatcher;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("contest.list?gym=false")
    Call<ListOfContest>getContests();
}
