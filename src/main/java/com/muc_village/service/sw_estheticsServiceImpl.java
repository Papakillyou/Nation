package com.muc_village.service;

import com.muc_village.dao.sw_estheticsMapper;
import com.muc_village.pojo.sw_estheticsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service("sw_estheticsService")
public class sw_estheticsServiceImpl implements sw_estheticsService{
    @Autowired
    private sw_estheticsMapper sw_estheticsMapper;

    public ArrayList<sw_estheticsInfo> getAllEsthetics()
    {
        return sw_estheticsMapper.getAllEsthetics();
    }  //获取所有村子

    public sw_estheticsInfo getContent(int SouthwestVillageID)
    {
        return sw_estheticsMapper.getContent(SouthwestVillageID);
    }//根据id获得该村子的内容
}
