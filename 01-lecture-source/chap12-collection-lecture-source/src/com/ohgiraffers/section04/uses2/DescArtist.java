package com.ohgiraffers.section04.uses2;

import java.util.Comparator;

public class DescArtist implements Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o1.getMusicArtist().compareTo(o2.getMusicArtist());
    }
}
