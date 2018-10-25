package com.muc_music.service;

import com.muc_music.dao.MusicMapper;
import com.muc_music.pojo.MusicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("MusicService")
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicMapper musicMapper;

    public ArrayList<MusicInfo> getAllMusic() {
        return musicMapper.getAllMusic();
    }

    public MusicInfo getContentByID(int MusicID) {
        return musicMapper.getContentByID(MusicID);
    }
}
