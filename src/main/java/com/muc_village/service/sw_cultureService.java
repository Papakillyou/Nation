package com.muc_village.service;

import com.muc_village.pojo.sw_cultureInfo;

import java.util.ArrayList;

public interface sw_cultureService {
    ArrayList<sw_cultureInfo> getAllCulture();   //获取所有村子详情
    sw_cultureInfo getContent(int SouthwestVillageID);     //根据id获得建筑特色内容详情
}
