package com.muc_village.service;

import com.muc_village.dao.sw_cultureMapper;
import com.muc_village.pojo.sw_cultureInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service("sw_cultureService")
public class sw_cultureServiceImpl implements sw_cultureService{
    @Autowired
    private sw_cultureMapper sw_cultureMapper;

    public ArrayList<sw_cultureInfo> getAllCulture()
    {
        return sw_cultureMapper.getAllCulture();
    }  //获取所有村子

    public sw_cultureInfo getContent(int SouthwestVillageID)
    {
        return sw_cultureMapper.getContent(SouthwestVillageID);
    }//根据id获得该村子的内容
}
