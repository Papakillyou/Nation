package com.muc_village.service;

import com.muc_village.dao.sw_architectureMapper;
import com.muc_village.pojo.sw_architectureInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("sw_architectureService")
public class sw_architectureServiceImpl implements sw_architectureService{

    @Autowired
    private sw_architectureMapper sw_architecturemapper;

    public ArrayList<sw_architectureInfo> getAllArchitecture()
    {
        return sw_architecturemapper.getAllArchitecture();
    }  //获取所有村子

    public boolean addarchitecture(sw_architectureInfo sw_architectureInfo)
    {
        return sw_architecturemapper.addArchitecture(sw_architectureInfo);
    }       //向数据库添加一个村子
    public boolean deletearchitecture(int SouthwestVillageID)
    {
        return sw_architecturemapper.deleteArchitecture(SouthwestVillageID);
    }//根据id删除数据库中一条村子
    public boolean updatearchitecture(sw_architectureInfo sw_architectureInfo)
    {
        return sw_architecturemapper.updateArchitecture(sw_architectureInfo);
    }//根据id更新数据库中某条村子
    public sw_architectureInfo getContent(int SouthwestVillageID)
    {
        return sw_architecturemapper.getContent(SouthwestVillageID);
    }//根据id获得该村子的内容

    public ArrayList<sw_architectureInfo> getContent1(String BudingForm)
    {
        return sw_architecturemapper.getContent1(BudingForm);
    }
}
