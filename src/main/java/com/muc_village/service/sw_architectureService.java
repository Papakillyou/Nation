package com.muc_village.service;

import com.muc_village.pojo.sw_architectureInfo;

import java.util.ArrayList;

public interface sw_architectureService {
    ArrayList<sw_architectureInfo> getAllArchitecture();   //获取所有村子详情
    boolean addarchitecture(sw_architectureInfo sw_architectureInfo);       //向数据库添加一个村子详情
    boolean deletearchitecture(int SouthwestVillageID);         //根据id删除数据库中一条村子详情
    boolean updatearchitecture(sw_architectureInfo sw_architectureInfo);    //根据id更新数据库中某条村子详情
    sw_architectureInfo getContent(int SouthwestVillageID);     //根据id获得该村子的内容详情
}
