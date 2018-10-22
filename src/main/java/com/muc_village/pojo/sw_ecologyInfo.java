package com.muc_village.pojo;

public class sw_ecologyInfo {
    private Integer southwestvillageid;

    private String supportinginfrastructure;

    private String landmarkbuilding;

    private String energyutilization;

    private String dwellingsfunction;

    private String economicdevelopment;

    public Integer getSouthwestvillageid() {
        return southwestvillageid;
    }

    public void setSouthwestvillageid(Integer southwestvillageid) {
        this.southwestvillageid = southwestvillageid;
    }

    public String getSupportinginfrastructure() {
        return supportinginfrastructure;
    }

    public void setSupportinginfrastructure(String supportinginfrastructure) {
        this.supportinginfrastructure = supportinginfrastructure == null ? null : supportinginfrastructure.trim();
    }

    public String getLandmarkbuilding() {
        return landmarkbuilding;
    }

    public void setLandmarkbuilding(String landmarkbuilding) {
        this.landmarkbuilding = landmarkbuilding == null ? null : landmarkbuilding.trim();
    }

    public String getEnergyutilization() {
        return energyutilization;
    }

    public void setEnergyutilization(String energyutilization) {
        this.energyutilization = energyutilization == null ? null : energyutilization.trim();
    }

    public String getDwellingsfunction() {
        return dwellingsfunction;
    }

    public void setDwellingsfunction(String dwellingsfunction) {
        this.dwellingsfunction = dwellingsfunction == null ? null : dwellingsfunction.trim();
    }

    public String getEconomicdevelopment() {
        return economicdevelopment;
    }

    public void setEconomicdevelopment(String economicdevelopment) {
        this.economicdevelopment = economicdevelopment == null ? null : economicdevelopment.trim();
    }
}