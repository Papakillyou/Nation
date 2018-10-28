package com.muc_music.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.muc_music.pojo.MusicInfo;
import com.muc_music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @Resource(name = "MusicService")
    public void setMusicService(MusicService musicService) {
        this.musicService = musicService;
    }

    @RequestMapping("/allmusic")
    public ModelAndView getAllMusic(@RequestParam(value="pn",defaultValue="1")Integer pn)
    {
        ModelAndView mv = null;
        //从第一条开始 每页查询12条数据
        PageHelper.startPage(pn, 12);
        mv = new ModelAndView("allmusic");//jsp名字

        ArrayList<MusicInfo> allMusic = musicService.getAllMusic();
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo(allMusic,12);
        mv.addObject("pageInfo", page);
        mv.addObject("data",allMusic);

        return mv;
    }
//根据地区筛选
    @RequestMapping("/areamusic")
    public ModelAndView getAreaMusic(@RequestParam(value="pn",defaultValue="1")Integer pn,String Area)
    {
        ModelAndView mv = null;
        //从第一条开始 每页查询12条数据
        PageHelper.startPage(pn, 12);
        mv = new ModelAndView("areamusic");//jsp名字

        ArrayList<MusicInfo> areaMusic = musicService.getContentByArea(Area);
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo(areaMusic,12);
        mv.addObject("pageInfo", page);
        mv.addObject("data",areaMusic);

        return mv;
    }
//根据民族筛选
    @RequestMapping("/nationmusic")
    public ModelAndView getNationMusic(@RequestParam(value="pn",defaultValue="1")Integer pn,String Nation)
    {
        ModelAndView mv = null;
        //从第一条开始 每页查询12条数据
        PageHelper.startPage(pn, 12);
        mv = new ModelAndView("nationmusic");//jsp名字

        ArrayList<MusicInfo> nationMusic = musicService.getContentByNation(Nation);
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo(nationMusic,12);
        mv.addObject("pageInfo", page);
        mv.addObject("data",nationMusic);

        return mv;
    }
    //根据Style风格筛选
    @RequestMapping("/stylemusic")
    public ModelAndView getStyleMusic(@RequestParam(value="pn",defaultValue="1")Integer pn,String Style)
    {
        ModelAndView mv = null;
        //从第一条开始 每页查询12条数据
        PageHelper.startPage(pn, 12);
        mv = new ModelAndView("stylemusic");//jsp名字

        ArrayList<MusicInfo> styleMusic = musicService.getContentByNation(Style);
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo(styleMusic,12);
        mv.addObject("pageInfo", page);
        mv.addObject("data",styleMusic);

        return mv;
    }
    //根据Instrumentsa乐器筛选
    @RequestMapping("/instrumentsamusic")
    public ModelAndView getInstrumentsaMusic(@RequestParam(value="pn",defaultValue="1")Integer pn,String Instrumentsa)
    {
        ModelAndView mv = null;
        //从第一条开始 每页查询12条数据
        PageHelper.startPage(pn, 12);
        mv = new ModelAndView("stylemusic");//jsp名字

        ArrayList<MusicInfo> instrumentsaMusic = musicService.getContentByNation(Instrumentsa);
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo( instrumentsaMusic,12);
        mv.addObject("pageInfo", page);
        mv.addObject("data", instrumentsaMusic);

        return mv;
    }
    //根据Singer歌手筛选
    @RequestMapping("/singermusic")
    public ModelAndView getSingerMusic(@RequestParam(value="pn",defaultValue="1")Integer pn,String Singer)
    {
        ModelAndView mv = null;
        //从第一条开始 每页查询12条数据
        PageHelper.startPage(pn, 12);
        mv = new ModelAndView("stylemusic");//jsp名字

        ArrayList<MusicInfo> singerMusic = musicService.getContentByNation(Singer);
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo( singerMusic,12);
        mv.addObject("pageInfo", page);
        mv.addObject("data", singerMusic);

        return mv;
    }

    //进入音乐详情
    @RequestMapping("/idmusic")
    public String intoMusic(){
        return "";//音乐详情页的jsp名字
    }

    //此方法根据id把数据库中的此条数据信息放入data中，具体如何实现播放没有写
    @RequestMapping("/idmusic1")
    public ModelAndView getIDMusic(int id)
    {
        ModelAndView mv=null;
        try{
            mv=new ModelAndView("musicplay");//jsp名字

            MusicInfo musicInfo=musicService.getContentByID(id);

            mv.addObject("data",musicInfo);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
}
