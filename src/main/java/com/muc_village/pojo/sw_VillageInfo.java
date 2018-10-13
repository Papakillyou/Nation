package com.muc_village.pojo;

import java.sql.Date;

public class sw_VillageInfo {
    private int SouthwestVillageID;
    private String NationName;
    private String VillageName;
    private String VillageSummary;
    private Date Update;
    private int Click;

    public sw_VillageInfo(int SouthwestVillageID,
                          String NationName,
                          String VillageName,
                          String VillageSummary,
                          Date Update,
                          int Click)
    {

        super();
        this.SouthwestVillageID=SouthwestVillageID;
        this.NationName=NationName;
        this.VillageName=VillageName;
        this.VillageSummary=VillageSummary;
        this.Update=Update;
        this.Click=Click;
    }


    public sw_VillageInfo()
    {
        super();
    }

    public  int getSouthwestVillageID() {
        return SouthwestVillageID;
    }

    public void setSouthwestVillageID(int southwestVillageID) {
        SouthwestVillageID = southwestVillageID;
    }

    public String getNationName() {
        return NationName;
    }

    public void setNationName(String nationName) {
        NationName = nationName;
    }

    public String getVillageName() {
        return VillageName;
    }

    public void setVillageName(String villageName) {
        VillageName = villageName;
    }

    public String getVillageSummary() {
        return VillageSummary;
    }

    public void setVillageSummary(String villageSummary) {
        VillageSummary = villageSummary;
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


}
