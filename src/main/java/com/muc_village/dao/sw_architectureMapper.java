package com.muc_village.dao;

import com.muc_village.pojo.sw_architectureInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("sw_architectureMapper")
public interface sw_architectureMapper {
    ArrayList<sw_architectureInfo> getAllArchitecture();   //获取所有村子详情
    boolean addArchitecture(sw_architectureInfo sw_architectureInfo);       //向数据库添加一个建筑特色详情
    boolean deleteArchitecture(int SouthwestVillageID);         //根据id删除数据库中一条建筑特色详情
    boolean updateArchitecture(sw_architectureInfo sw_villageInfo);    //根据id更新数据库中建筑特色详情
    sw_architectureInfo getContent(int SouthwestVillageID);     //根据id获得建筑特色内容详情
}
