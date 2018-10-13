package com.muc_music.pojo;

import java.util.Date;

public class MusicInfo {
    private int MusicID;
    private String Title;
    private String Singer;
    private String Summary;
    private String Picture;
    private String Length;
    private String Path;
    private String Nation;
    private String Area;
    private String Style;
    private String Instruments;
    private Date Update;
    private int Click;

    public int getMusicID() {
        return MusicID;
    }

    public void setMusicID(int musicID) {
        MusicID = musicID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public String getInstruments() {
        return Instruments;
    }

    public void setInstruments(String instruments) {
        Instruments = instruments;
    }

    public Date getUpdate() {
        return Update;
    }

    public void setUpdate(Date update) {
        Update = update;
    }

    public int getClick() {
        return Click;
    }

    public void setClick(int click) {
        Click = click;
    }

    public MusicInfo(int MusicID,
                     String Title,
                     String Singer,
                     String Summary,
                     String Picture,
                     String Length,
                     String Path,
                     String Nation,
                     String Area,
                     String Style,
                     String Instruments,
                     Date Update,
                     int Click)
    {
        super();
        this.MusicID=MusicID;
        this.Title=Title;
        this.Singer=Singer;
        this.Summary=Summary;
        this.Picture=Picture;
        this.Length=Length;
        this.Path=Path;
        this.Nation=Nation;
        this.Area=Area;
        this.Style=Style;
        this.Instruments=Instruments;
        this.Update=Update;
        this.Click=Click;
    }

    public MusicInfo() {
        super();
    }

}
