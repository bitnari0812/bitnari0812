package com.ohgiraffers.section04.uses2;

import java.util.ArrayList;
import java.util.List;

public class MusicManager {
    private List<MusicDTO> musicDTOList = new ArrayList<>();

    public void addList(MusicDTO music){
        musicDTOList.add(music);
    }

    public List<MusicDTO> allMusicList(){
        return musicDTOList;
    }

    public List<MusicDTO> searchingA(String artist){
        List<MusicDTO> searching = new ArrayList<>();
        for(MusicDTO music : allMusicList()){
            if(music.getMusicArtist().contains(artist)){
                searching.add(music);
            }

        }return searching;
    }

    public List<MusicDTO> searchingT(String title){
        List<MusicDTO> searching = new ArrayList<>();
        for(MusicDTO music : allMusicList()){
            if(music.getMusicTitle().contains(title)){
                searching.add(music);
            }
        }return searching;
    }

    public boolean update(MusicDTO update){


    }
}
