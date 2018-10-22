package com.muc_village.dao;

import com.muc_village.pojo.sw_estheticsInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("sw_estheticsMapper")
public interface sw_estheticsMapper {
    ArrayList<sw_estheticsInfo> getAllEsthetics();   //获取所有村子详情
    sw_estheticsInfo getContent(int SouthwestVillageID);     //根据id获得建筑特色内容详情
}