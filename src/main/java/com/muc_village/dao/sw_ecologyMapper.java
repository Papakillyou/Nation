package com.muc_village.dao;

import com.muc_village.pojo.sw_ecologyInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("sw_ecologyMapper")
public interface sw_ecologyMapper {
    ArrayList<sw_ecologyInfo> getAllEcology();   //获取所有村子详情
    sw_ecologyInfo getContent(int SouthwestVillageID);     //根据id获得建筑特色内容详情
}