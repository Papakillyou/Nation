package com.muc_village.dao;

import com.muc_village.pojo.sw_cultureInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("sw_cultureMapper")
public interface sw_cultureMapper {
    ArrayList<sw_cultureInfo> getAllCulture();   //获取所有村子详情
    sw_cultureInfo getContent(int SouthwestVillageID);     //根据id获得建筑特色内容详情
}