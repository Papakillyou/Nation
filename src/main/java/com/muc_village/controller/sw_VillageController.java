package com.muc_village.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.muc_village.pojo.*;
import com.muc_village.service.*;
import com.mysql.operation.DbcontextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
public class sw_VillageController {

    @Autowired
    private sw_VillageService sw_villageService = null;
    @Autowired
    private sw_architectureService sw_architectureService = null;
    @Autowired
    private sw_cultureService sw_cultureService = null;
    @Autowired
    private sw_ecologyService  sw_ecologyService= null;
    @Autowired
    private sw_estheticsService sw_estheticsService= null;



    @Resource(name = "sw_VillageService")
    public void setsw_VillageService(sw_VillageService sw_villageService) {
        this.sw_villageService = sw_villageService;
    }
    @Resource(name = "sw_architectureService")
    public void setsw_architecture(sw_architectureService sw_architectureService) {
        this.sw_architectureService = sw_architectureService;
    }
    //村寨 首页,默认显示西南地区
    @RequestMapping("/village")
    public ModelAndView getModelAndView(@RequestParam(value="pn",defaultValue="1")Integer pn)
    {
        DbcontextHolder.setDbType("dataSourcemuc_village");
        ModelAndView mv = null;
        //从第一条开始 每页查询五条数据
        PageHelper.startPage(pn, 5);
//        try {
            mv = new ModelAndView("sw_village");

            ArrayList<sw_VillageInfo> Village = sw_villageService.getAllVillage();
            //将用户信息放入PageInfo对象里
            PageInfo page = new PageInfo(Village,5);
            mv.addObject("pageInfo", page);
            mv.addObject("data",Village);
//            for (sw_VillageInfo sw_villageInfo : Village) {
//
//                System.out.println(sw_villageInfo.getVillageName());
//            }
//            mv.addObject("data", Village);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return mv;
    }

    //增
    @RequestMapping("/add_village")
    public String addData_village(sw_VillageInfo sw_villageInfo) {
        boolean isDone = false;
        isDone = sw_villageService.addVillage(sw_villageInfo);
        if (isDone) {
            return "done";
        } else {
            return "failed";
        }
    }

    //删
    @RequestMapping("/delet_village")
    public String deleteData_village(int sw_VillageID) {
        boolean isDone = false;
        isDone = sw_villageService.deleteVillage(sw_VillageID);
        if (isDone) {
            return "Done";
        } else {
            return "failed";
        }
    }

    //改
    @RequestMapping("/update_village")
    public String updateData_village(sw_VillageInfo sw_villageInfo) {
        boolean isDone = false;
        isDone = sw_villageService.updateVillage(sw_villageInfo);
        if (isDone) {
            return "Done";
        } else {
            return "failed";
        }
    }

    //进入村寨详情页----建筑特色
    @RequestMapping("/read_sw_architecture")
    public ModelAndView readData_architecture(int id) {
        DbcontextHolder.setDbType("dataSourcemuc_village");
        ModelAndView mv = null;
        try {
            mv = new ModelAndView("read_sw_architecture");

            sw_architectureInfo architecture = sw_architectureService.getContent(id);

            mv.addObject("data", architecture);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }


    //进入村寨详情页----美学价值
    @RequestMapping("/read_esthetics")
    public ModelAndView readData_esthetics(int id)
    {
        DbcontextHolder.setDbType("dataSourcemuc_village");
        ModelAndView mv=null;
        try{
            mv=new ModelAndView("sw_esthetics");

            sw_estheticsInfo esthetics=sw_estheticsService.getContent(id);

            mv.addObject("data",esthetics);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    //进入村寨详情页----生态和谐
    @RequestMapping("/read_ecology")
    public ModelAndView readData_ecology(int id)
    {
        DbcontextHolder.setDbType("dataSourcemuc_village");
        ModelAndView mv=null;
        try{
            mv=new ModelAndView("sw_ecology");

            sw_ecologyInfo ecology=sw_ecologyService.getContent(id);

            mv.addObject("data",ecology);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }



    //进入村寨详情页----文化特色
    @RequestMapping("/read_culture")
    public ModelAndView readData_culture(int id)
    {
        DbcontextHolder.setDbType("dataSourcemuc_village");
        ModelAndView mv=null;
        try{
            mv=new ModelAndView("sw_culture");

            sw_cultureInfo culture=sw_cultureService.getContent(id);

            mv.addObject("data",culture);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
}
