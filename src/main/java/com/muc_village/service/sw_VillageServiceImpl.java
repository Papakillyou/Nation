package com.muc_village.service;

import com.muc_village.dao.sw_VillageMapper;
import com.muc_village.pojo.sw_VillageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("sw_VillageService")
public class sw_VillageServiceImpl implements sw_VillageService{

    @Autowired
    private sw_VillageMapper sw_villagemapper;

    public ArrayList<sw_VillageInfo> getAllVillage()
    {
        return sw_villagemapper.getAllVillage();
    }  //获取所有村子

    public boolean addVillage(sw_VillageInfo sw_villageInfo)
    {
        return sw_villagemapper.addVillage(sw_villageInfo);
    }       //向数据库添加一个村子
    public boolean deleteVillage(int SouthwestVillageID)
    {
        return sw_villagemapper.deleteVillage(SouthwestVillageID);
    }//根据id删除数据库中一条村子
    public boolean updateVillage(sw_VillageInfo sw_villageInfo)
    {
        return sw_villagemapper.updateVillage(sw_villageInfo);
    }//根据id更新数据库中某条村子
    public sw_VillageInfo getContent(int SouthwestVillageID)
    {
        return sw_villagemapper.getContent(SouthwestVillageID);
    }//根据id获得该村子的内容
}
