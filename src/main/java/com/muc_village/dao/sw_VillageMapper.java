package com.muc_village.dao;

import com.muc_village.pojo.sw_VillageInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("sw_VillageMapper")
public interface sw_VillageMapper {

    ArrayList<sw_VillageInfo> getAllVillage();   //获取所有村子

    boolean addVillage(sw_VillageInfo sw_villageInfo);       //向数据库添加一个村子

    boolean deleteVillage(int SouthwestVillageID);         //根据id删除数据库中一条

    boolean updateVillage(sw_VillageInfo sw_villageInfo);    //根据id更新数据库中某条村子

    sw_VillageInfo getContent(int SouthwestVillageID);     //根据id获得该村子的内容
}
