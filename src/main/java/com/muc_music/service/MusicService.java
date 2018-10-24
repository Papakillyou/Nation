package com.muc_music.service;

import com.muc_music.pojo.MusicInfo;

import java.util.ArrayList;

public interface MusicService {
    ArrayList<MusicInfo> getAllMusic();   //获取所有音乐
    MusicInfo getContentByID(int MusicID);     //根据id获得音乐
}
