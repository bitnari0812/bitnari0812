package com.ohgiraffers.section04.uses2;

public class MusicDTO {

    private static int nextId = 1;
    private int num;
    private String musicArtist;
    private String musicTitle;

    public MusicDTO(String musicArtist, String musicTitle) {
        this.num = MusicDTO.nextId++;
        this.musicArtist = musicArtist;
        this.musicTitle = musicTitle;
    }

    public MusicDTO(int num, String musicArtist, String musicTitle) {
        this.num = num;
        this.musicArtist = musicArtist;
        this.musicTitle = musicTitle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(String musicArtist) {
        this.musicArtist = musicArtist;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    @Override
    public String toString() {
        return "MusicDTO{" +
                "num=" + num +
                ", musicArtist='" + musicArtist + '\'' +
                ", musicTitle='" + musicTitle + '\'' +
                '}';
    }
}
