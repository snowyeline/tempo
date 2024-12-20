package com.cappielloantonio.tempo.subsonic.api.jukebox;

import android.util.Log;

import com.cappielloantonio.tempo.subsonic.RetrofitClient;
import com.cappielloantonio.tempo.subsonic.Subsonic;
import com.cappielloantonio.tempo.subsonic.base.ApiResponse;

import java.util.ArrayList;

import retrofit2.Call;

public class JukeboxClient {
    private static final String TAG = "JukeboxClient";
    private final Subsonic subsonic;
    private final JukeboxService jukeboxService;

    public JukeboxClient(Subsonic subsonic) {
        this.subsonic = subsonic;
        this.jukeboxService = new RetrofitClient(subsonic).getRetrofit().create(JukeboxService.class);
    }

    public Call<ApiResponse> jukeboxControl(String action) {
        Log.d(TAG, "jukeboxControl()");
        return jukeboxService.status(subsonic.getParams(), action);
    }

    public Call<ApiResponse> removeTrack(int index) {
        Log.d(TAG, "jukeboxControl()");
        return jukeboxService.remove(subsonic.getParams(), "remove", index);
    }

    public Call<ApiResponse> setJukeboxPlaylist(ArrayList<String> songsId) {
        Log.d(TAG, "jukeboxControl()");
        return jukeboxService.set(subsonic.getParams(), "set", songsId);
    }
}