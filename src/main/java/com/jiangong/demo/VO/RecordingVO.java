package com.jiangong.demo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecordingVO {

    private String id;

    //水泥
    @JsonProperty("cementconsumption")
    private String cementconsumption;

    //细集料1
    @JsonProperty("fineaggregate1")
    private String fineaggregate1;

    //细集料2
    @JsonProperty("fineaggregate2")
    private String fineaggregate2;

    //细集料3
    @JsonProperty("fineaggregate3")
    private String fineaggregate3;

    //粗集料1
    @JsonProperty("coarseaggregate1")
    private String coarseaggregate1;

    //粗集料2
    @JsonProperty("coarseaggregate2")
    private String coarseaggregate2;

    //粗集料3
    @JsonProperty("coarseaggregate3")
    private String coarseaggregate3;

    //水
    @JsonProperty("waterconsumption")
    private String waterconsumption;

    //减水剂
    @JsonProperty("waterreducingagentdosage")
    private String waterreducingagentdosage;

    //粉煤灰
    @JsonProperty("flyashdosage")
    private String flyashdosage;

    //矿渣粉
    @JsonProperty("slagpowderconsumption")
    private String slagpowderconsumption;

    //石灰石粉
    @JsonProperty("limestonepowderconsumption")
    private String limestonepowderconsumption;

    //膨胀剂
    @JsonProperty("expansionagentdosage")
    private String expansionagentdosage;

    //其他材料
    @JsonProperty("specialmaterialdosage")
    private String specialmaterialdosage;

    //预估28抗压强度（MPa）
    @JsonProperty("intensity28d")
    private String intensity28d;

    //表观密度（kg/m3）
    @JsonProperty("apparentdensity")
    private String apparentdensity;

    //材料成本（元/方）
    @JsonProperty("materialcosts")
    private String materialcosts;

    //分数
    @JsonProperty("rating")
    private String rating;

    //综合评分
    @JsonProperty("overallrating")
    private String overallrating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCementconsumption() {
        return cementconsumption;
    }

    public void setCementconsumption(String cementconsumption) {
        this.cementconsumption = cementconsumption;
    }

    public String getFineaggregate1() {
        return fineaggregate1;
    }

    public void setFineaggregate1(String fineaggregate1) {
        this.fineaggregate1 = fineaggregate1;
    }

    public String getFineaggregate2() {
        return fineaggregate2;
    }

    public void setFineaggregate2(String fineaggregate2) {
        this.fineaggregate2 = fineaggregate2;
    }

    public String getFineaggregate3() {
        return fineaggregate3;
    }

    public void setFineaggregate3(String fineaggregate3) {
        this.fineaggregate3 = fineaggregate3;
    }

    public String getCoarseaggregate1() {
        return coarseaggregate1;
    }

    public void setCoarseaggregate1(String coarseaggregate1) {
        this.coarseaggregate1 = coarseaggregate1;
    }

    public String getCoarseaggregate2() {
        return coarseaggregate2;
    }

    public void setCoarseaggregate2(String coarseaggregate2) {
        this.coarseaggregate2 = coarseaggregate2;
    }

    public String getCoarseaggregate3() {
        return coarseaggregate3;
    }

    public void setCoarseaggregate3(String coarseaggregate3) {
        this.coarseaggregate3 = coarseaggregate3;
    }

    public String getWaterconsumption() {
        return waterconsumption;
    }

    public void setWaterconsumption(String waterconsumption) {
        this.waterconsumption = waterconsumption;
    }

    public String getWaterreducingagentdosage() {
        return waterreducingagentdosage;
    }

    public void setWaterreducingagentdosage(String waterreducingagentdosage) {
        this.waterreducingagentdosage = waterreducingagentdosage;
    }

    public String getFlyashdosage() {
        return flyashdosage;
    }

    public void setFlyashdosage(String flyashdosage) {
        this.flyashdosage = flyashdosage;
    }

    public String getSlagpowderconsumption() {
        return slagpowderconsumption;
    }

    public void setSlagpowderconsumption(String slagpowderconsumption) {
        this.slagpowderconsumption = slagpowderconsumption;
    }

    public String getLimestonepowderconsumption() {
        return limestonepowderconsumption;
    }

    public void setLimestonepowderconsumption(String limestonepowderconsumption) {
        this.limestonepowderconsumption = limestonepowderconsumption;
    }

    public String getExpansionagentdosage() {
        return expansionagentdosage;
    }

    public void setExpansionagentdosage(String expansionagentdosage) {
        this.expansionagentdosage = expansionagentdosage;
    }

    public String getSpecialmaterialdosage() {
        return specialmaterialdosage;
    }

    public void setSpecialmaterialdosage(String specialmaterialdosage) {
        this.specialmaterialdosage = specialmaterialdosage;
    }

    public String getIntensity28d() {
        return intensity28d;
    }

    public void setIntensity28d(String intensity28d) {
        this.intensity28d = intensity28d;
    }

    public String getApparentdensity() {
        return apparentdensity;
    }

    public void setApparentdensity(String apparentdensity) {
        this.apparentdensity = apparentdensity;
    }

    public String getMaterialcosts() {
        return materialcosts;
    }

    public void setMaterialcosts(String materialcosts) {
        this.materialcosts = materialcosts;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOverallrating() {
        return overallrating;
    }

    public void setOverallrating(String overallrating) {
        this.overallrating = overallrating;
    }

    @Override
    public String toString() {
        return "RecordingVO{" +
                "cementconsumption='" + cementconsumption + '\'' +
                ", fineaggregate1='" + fineaggregate1 + '\'' +
                ", fineaggregate2='" + fineaggregate2 + '\'' +
                ", fineaggregate3='" + fineaggregate3 + '\'' +
                ", coarseaggregate1='" + coarseaggregate1 + '\'' +
                ", coarseaggregate2='" + coarseaggregate2 + '\'' +
                ", coarseaggregate3='" + coarseaggregate3 + '\'' +
                ", waterconsumption='" + waterconsumption + '\'' +
                ", waterreducingagentdosage='" + waterreducingagentdosage + '\'' +
                ", flyashdosage='" + flyashdosage + '\'' +
                ", slagpowderconsumption='" + slagpowderconsumption + '\'' +
                ", limestonepowderconsumption='" + limestonepowderconsumption + '\'' +
                ", expansionagentdosage='" + expansionagentdosage + '\'' +
                ", specialmaterialdosage='" + specialmaterialdosage + '\'' +
                ", intensity28d='" + intensity28d + '\'' +
                ", apparentdensity='" + apparentdensity + '\'' +
                ", materialcosts='" + materialcosts + '\'' +
                ", rating='" + rating + '\'' +
                ", overallrating='" + overallrating + '\'' +
                '}';
    }
}
