package com.muc_village.pojo;

public class sw_estheticsInfo {
    private Integer southwestvillageid;

    private String architecturalart;

    private String internalandexternalaesthetics;

    private String lifebeauty;

    public Integer getSouthwestvillageid() {
        return southwestvillageid;
    }

    public void setSouthwestvillageid(Integer southwestvillageid) {
        this.southwestvillageid = southwestvillageid;
    }

    public String getArchitecturalart() {
        return architecturalart;
    }

    public void setArchitecturalart(String architecturalart) {
        this.architecturalart = architecturalart == null ? null : architecturalart.trim();
    }

    public String getInternalandexternalaesthetics() {
        return internalandexternalaesthetics;
    }

    public void setInternalandexternalaesthetics(String internalandexternalaesthetics) {
        this.internalandexternalaesthetics = internalandexternalaesthetics == null ? null : internalandexternalaesthetics.trim();
    }

    public String getLifebeauty() {
        return lifebeauty;
    }

    public void setLifebeauty(String lifebeauty) {
        this.lifebeauty = lifebeauty == null ? null : lifebeauty.trim();
    }
}