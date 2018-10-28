package com.muc_music.service;

import com.muc_music.pojo.MusicInfo;

import java.util.ArrayList;

public interface MusicService {
    ArrayList<MusicInfo> getAllMusic();   //获取所有音乐
    MusicInfo getContentByID(int MusicID);     //根据id获得音乐
    ArrayList<MusicInfo> getContentByNation(String Nation);//获得该民族所有音乐
    ArrayList<MusicInfo> getContentByArea(String Area);//获得该地区所有音乐
    ArrayList<MusicInfo> getContentByStyle(String Style);//获得该风格所有音乐
    ArrayList<MusicInfo> getContentByInstrumentsa(String Instruments);//获得该乐器所有音乐
    ArrayList<MusicInfo> getContentBySinger(String Singer);//获得该歌手所有音乐
}
