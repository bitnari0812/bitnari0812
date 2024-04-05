package com.ohgiraffers.section04.uses2;

import java.util.Comparator;

public class DescTitle implements Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o2.getMusicTitle().compareTo(o1.getMusicTitle());
    }
}
