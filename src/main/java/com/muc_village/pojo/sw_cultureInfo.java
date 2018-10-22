package com.muc_village.pojo;

public class sw_cultureInfo {
    private Integer southwestvillageid;

    private String dwellingstypes;

    private String folkculture;

    private String dwellingschange;

    private String socialspace;

    private String sacredspace;

    public Integer getSouthwestvillageid() {
        return southwestvillageid;
    }

    public void setSouthwestvillageid(Integer southwestvillageid) {
        this.southwestvillageid = southwestvillageid;
    }

    public String getDwellingstypes() {
        return dwellingstypes;
    }

    public void setDwellingstypes(String dwellingstypes) {
        this.dwellingstypes = dwellingstypes == null ? null : dwellingstypes.trim();
    }

    public String getFolkculture() {
        return folkculture;
    }

    public void setFolkculture(String folkculture) {
        this.folkculture = folkculture == null ? null : folkculture.trim();
    }

    public String getDwellingschange() {
        return dwellingschange;
    }

    public void setDwellingschange(String dwellingschange) {
        this.dwellingschange = dwellingschange == null ? null : dwellingschange.trim();
    }

    public String getSocialspace() {
        return socialspace;
    }

    public void setSocialspace(String socialspace) {
        this.socialspace = socialspace == null ? null : socialspace.trim();
    }

    public String getSacredspace() {
        return sacredspace;
    }

    public void setSacredspace(String sacredspace) {
        this.sacredspace = sacredspace == null ? null : sacredspace.trim();
    }
}