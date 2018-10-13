package com.muc_village.pojo;


public class sw_architectureInfo {
    private static int SouthwestVillageID;
    private String BudingForm;
    private String Characteristics;
    private String Combination;
    private String MasterialStructure;
    private String ArtisticEvaluation;

    public sw_architectureInfo(int SouthwestVillageID,
                               String BudingForm,
                               String Characteristics,
                               String Combination,
                               String MasterialStructure,
                               String ArtisticEvaluation)
    {

        super();
        this.SouthwestVillageID=SouthwestVillageID;
        this.BudingForm=BudingForm;
        this.Characteristics=Characteristics;
        this.Combination=Combination;
        this.MasterialStructure=MasterialStructure;
        this.ArtisticEvaluation=ArtisticEvaluation;
    }

    public sw_architectureInfo()
    {
        super();
    }

    public static int getSouthwestVillageID() {
        return SouthwestVillageID;
    }

    public void setSouthwestVillageID(int southwestVillageID) {
        SouthwestVillageID = southwestVillageID;
    }

    public String getBudingForm() {
        return BudingForm;
    }

    public void setBudingForm(String budingForm) {
        BudingForm = budingForm;
    }

    public String getCharacteristics() {
        return Characteristics;
    }

    public void setCharacteristics(String characteristics) {
        Characteristics = characteristics;
    }

    public String getCombination() {
        return Combination;
    }

    public void setCombination(String combination) {
        Combination = combination;
    }

    public String getMasterialStructure() {
        return MasterialStructure;
    }

    public void setMasterialStructure(String masterialStructure) {
        MasterialStructure = masterialStructure;
    }

    public String getArtisticEvaluation() {
        return ArtisticEvaluation;
    }

    public void setArtisticEvaluation(String artisticEvaluation) {
        ArtisticEvaluation = artisticEvaluation;
    }


}
