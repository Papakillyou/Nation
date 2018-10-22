package com.muc_village.service;

import com.muc_village.pojo.sw_ecologyInfo;

import java.util.ArrayList;

public interface sw_ecologyService {
    ArrayList<sw_ecologyInfo> getAllEcology();   //获取所有村子详情
    sw_ecologyInfo getContent(int SouthwestVillageID);     //根据id获得建筑特色内容详情
}
