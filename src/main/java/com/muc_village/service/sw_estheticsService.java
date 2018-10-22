package com.muc_village.service;

import com.muc_village.pojo.sw_estheticsInfo;

import java.util.ArrayList;

public interface sw_estheticsService {
    ArrayList<sw_estheticsInfo> getAllEsthetics();   //获取所有村子详情
    sw_estheticsInfo getContent(int SouthwestVillageID);     //根据id获得建筑特色内容详情
}
