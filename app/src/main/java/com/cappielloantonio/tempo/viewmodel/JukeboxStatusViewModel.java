package com.cappielloantonio.tempo.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.cappielloantonio.tempo.repository.JukeboxRepository;

import java.util.ArrayList;

public class JukeboxStatusViewModel extends AndroidViewModel  {
    private final JukeboxRepository jukeboxRepository;

    public JukeboxStatusViewModel(@NonNull Application application) {
        super(application);

        jukeboxRepository = new JukeboxRepository();
    }

    public void clearJukebox() {
        jukeboxRepository.jukeboxControl("stop");
        jukeboxRepository.jukeboxControl("clear");
        jukeboxRepository.removeTrack(0);
    }

    public void startJukebox() {
        jukeboxRepository.jukeboxControl("start");
    }

    public void setJukeboxPlaylist(ArrayList<String> trackIds) {
        jukeboxRepository.playJukebox(trackIds);
    }

}