package com.muc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.muc_village.pojo.sw_VillageInfo;
import com.muc_village.service.sw_VillageService;
import com.mysql.DbcontextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.muc.pojo.UserInfo;
import com.muc.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;


@Controller
@RequestMapping("/user")
public class UserController {
    //注入Service
    @Autowired
    private UserService userService;
    @Autowired
    private sw_VillageService sw_villageService = null;

    @Resource(name = "sw_VillageService")
    public void setsw_VillageService(sw_VillageService sw_villageService) {
        this.sw_villageService = sw_villageService;
    }
    //进入网站首页
    @RequestMapping("/com/muc")//首页，只实现“数据更新”模块
    public ModelAndView getModelAndView(@RequestParam(value="pn",defaultValue="1")Integer pn) {
        DbcontextHolder.setDbType("com/muc_village");
        ModelAndView mv = null;
        PageHelper.startPage(pn, 5);
        mv = new ModelAndView("sw_village");

        ArrayList<sw_VillageInfo> Village = sw_villageService.getAllVillage();
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo(Village,5);
        mv.addObject("pageInfo", page);
        mv.addObject("data",Village);
        return mv;
    }

    //用户注册
    @RequestMapping("regist")
    public String regist(UserInfo user, Model model) {
        DbcontextHolder.setDbType("com/muc");
        System.out.println("用户注册：" + user.getUsername() + user.getPassword());
        user.setUserid(1);
        userService.regist(user);
        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面
        return "success";
    }

    //用户登录
    @RequestMapping("login")
    public String login(String name,String password,Model model)
    {
        System.out.println("用户登录："+name+password);
        userService.login(name,password);
        model.addAttribute("msg", "登录成功");
        return "success";
    }
    //进入村寨首页
    @RequestMapping("/village")
    public String returnVillage()
    {
        DbcontextHolder.setDbType("com/muc_village");
        return "village";
    }


}
