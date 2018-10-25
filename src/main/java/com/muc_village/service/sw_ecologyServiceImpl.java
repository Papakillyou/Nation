package com.muc_village.service;

import com.muc_village.dao.sw_ecologyMapper;
import com.muc_village.pojo.sw_ecologyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service("sw_ecologyService")
public class sw_ecologyServiceImpl implements sw_ecologyService{
    @Autowired
    private sw_ecologyMapper sw_ecologyMapper;

    public ArrayList<sw_ecologyInfo> getAllEcology()
    {
        return sw_ecologyMapper.getAllEcology();
    }  //获取所有村子

    public sw_ecologyInfo getContent(int SouthwestVillageID)
    {
        return sw_ecologyMapper.getContent(SouthwestVillageID);
    }//根据id获得该村子的内容
}
