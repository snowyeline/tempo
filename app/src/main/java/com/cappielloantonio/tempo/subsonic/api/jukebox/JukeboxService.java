package com.cappielloantonio.tempo.subsonic.api.jukebox;

import com.cappielloantonio.tempo.subsonic.base.ApiResponse;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface JukeboxService {
    @GET("jukeboxControl")
    Call<ApiResponse> status(@QueryMap Map<String, String> params, @Query("action") String action);

    @GET("jukeboxControl")
    Call<ApiResponse> remove(@QueryMap Map<String, String> params, @Query("action") String action, @Query("index") int index);

    @GET("jukeboxControl")
    Call<ApiResponse> set(@QueryMap Map<String, String> params, @Query("action") String action, @Query("id") ArrayList<String> songsId);
}