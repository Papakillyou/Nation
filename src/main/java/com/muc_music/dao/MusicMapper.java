package com.muc_music.dao;

import com.muc_music.pojo.MusicInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("")
public interface MusicMapper {
    ArrayList<MusicInfo> getAllMusic();   //获取所有音乐
    MusicInfo getContent(int MusicID);     //根据id获得建筑特色内容详情
}
