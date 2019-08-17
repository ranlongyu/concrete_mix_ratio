package com.jiangong.demo.entity.database;

import javax.persistence.*;

@Entity
@Table(name = "施工配合比相关数据")
public class Construction_mix {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "抽检单ID")
    private String sampleid;

    @Column(name = "抽检单号")
    private String samplenumber;

    @Column(name = "生产车间")
    private String productionworkshop;

    @Column(name = "主供车间")
    private String mainworkshop;

    @Column(name = "基准配合比")
    private String benchmarkratio;

    @Column(name = "小票号")
    private String smallticketnumber;

    @Column(name = "工程名称")
    private String projectname;

    @Column(name = "施工部位")
    private String constructionsite;

    @Column(name = "强度等级")
    private String powerlevel;

    @Column(name = "生产线")
    private String productionline;

    @Column(name = "小票时间")
    private String smalltickettime;

    @Column(name = "浇注方式")
    private String pouringmethod;

    @Column(name = "配合比属性")
    private String mixratioattribute;

    @Column(name = "施工配合比")
    private String constructionmix;

    @Column(name = "坍落度")
    private String slump;

    @Column(name = "扩展度")
    private String expansion;

    @Column(name = "表观密度")
    private String apparentdensity;

    @Column(name = "3d强度")
    private String intensity3d;

    @Column(name = "7d强度")
    private String intensity7d;

    @Column(name = "28d强度")
    private String intensity28d;

    @Column(name = "60d强度")
    private String intensity60d;

    @Column(name = "减水剂用量")
    private String waterreducingagentdosage;

    @Column(name = "减水剂样品编号")
    private String waterreducersamplenumber;

    @Column(name = "特细砂用量")
    private String extrafinesandconsumption;

    @Column(name = "特细砂样品编号")
    private String extrafinesandsamplenumber;

    @Column(name = "石灰石粉用量")
    private String limestonepowderconsumption;

    @Column(name = "石灰石粉样品编号")
    private String limestonepowdersamplenumber;

    @Column(name = "大石用量")
    private String bigstonedosage;

    @Column(name = "大石样品编号")
    private String bigstonesamplenumber;

    @Column(name = "膨胀剂用量")
    private String expansionagentdosage;

    @Column(name = "膨胀剂样品编号")
    private String expansionagentsamplenumber;

    @Column(name = "矿渣粉用量")
    private String slagpowderconsumption;

    @Column(name = "矿渣粉样品编号")
    private String slagpowdersamplenumber;

    @Column(name = "水泥用量")
    private String cementconsumption;

    @Column(name = "水泥样品编号")
    private String cementsamplenumber;

    @Column(name = "粗砂用量")
    private String coarsesandconsumption;

    @Column(name = "粗砂样品编号")
    private String coarsesandsamplenumber;

    @Column(name = "回收水用量")
    private String recycledwaterconsumption;

    @Column(name = "回收水样品编号")
    private String recycledwatersamplenumber;

    @Column(name = "停用材料用量")
    private String disablematerialusage;

    @Column(name = "停用材料样品编号")
    private String disablematerialsamplenumber;

    @Column(name = "粉煤灰用量")
    private String flyashdosage;

    @Column(name = "粉煤灰样品编号")
    private String flyashsamplenumber;

    @Column(name = "水用量")
    private String waterconsumption;

    @Column(name = "水样品编号")
    private String watersamplenumber;

    @Column(name = "特殊材料用量")
    private String specialmaterialdosage;

    @Column(name = "特殊材料样品编号")
    private String specialmaterialsamplenumber;

    @Column(name = "小石用量")
    private String smallstonedosage;

    @Column(name = "小石样品编号")
    private String smallstonesamplenumber;

    @Column(name = "中砂用量")
    private String mediumsandconsumption;

    @Column(name = "中砂样品编号")
    private String mediumsandsamplenumber;

    @Column(name = "混凝土品种")
    private String concretevariety;

    @Column(name = "强度等级1")
    private String strengthlevel1;

    @Column(name = "抗渗等级")
    private String impermeabilityrating;

    @Column(name = "材料要求")
    private String materialrequirements;

    @Column(name = "限制膨胀率")
    private String limitexpansionrate;

    @Column(name = "其它特性")
    private String othercharacteristics;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSampleid() {
        return sampleid;
    }

    public void setSampleid(String sampleid) {
        this.sampleid = sampleid;
    }

    public String getSamplenumber() {
        return samplenumber;
    }

    public void setSamplenumber(String samplenumber) {
        this.samplenumber = samplenumber;
    }

    public String getProductionworkshop() {
        return productionworkshop;
    }

    public void setProductionworkshop(String productionworkshop) {
        this.productionworkshop = productionworkshop;
    }

    public String getMainworkshop() {
        return mainworkshop;
    }

    public void setMainworkshop(String mainworkshop) {
        this.mainworkshop = mainworkshop;
    }

    public String getBenchmarkratio() {
        return benchmarkratio;
    }

    public void setBenchmarkratio(String benchmarkratio) {
        this.benchmarkratio = benchmarkratio;
    }

    public String getSmallticketnumber() {
        return smallticketnumber;
    }

    public void setSmallticketnumber(String smallticketnumber) {
        this.smallticketnumber = smallticketnumber;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getConstructionsite() {
        return constructionsite;
    }

    public void setConstructionsite(String constructionsite) {
        this.constructionsite = constructionsite;
    }

    public String getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(String powerlevel) {
        this.powerlevel = powerlevel;
    }

    public String getProductionline() {
        return productionline;
    }

    public void setProductionline(String productionline) {
        this.productionline = productionline;
    }

    public String getSmalltickettime() {
        return smalltickettime;
    }

    public void setSmalltickettime(String smalltickettime) {
        this.smalltickettime = smalltickettime;
    }

    public String getPouringmethod() {
        return pouringmethod;
    }

    public void setPouringmethod(String pouringmethod) {
        this.pouringmethod = pouringmethod;
    }

    public String getMixratioattribute() {
        return mixratioattribute;
    }

    public void setMixratioattribute(String mixratioattribute) {
        this.mixratioattribute = mixratioattribute;
    }

    public String getConstructionmix() {
        return constructionmix;
    }

    public void setConstructionmix(String constructionmix) {
        this.constructionmix = constructionmix;
    }

    public String getSlump() {
        return slump;
    }

    public void setSlump(String slump) {
        this.slump = slump;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getApparentdensity() {
        return apparentdensity;
    }

    public void setApparentdensity(String apparentdensity) {
        this.apparentdensity = apparentdensity;
    }

    public String getIntensity3d() {
        return intensity3d;
    }

    public void setIntensity3d(String intensity3d) {
        this.intensity3d = intensity3d;
    }

    public String getIntensity7d() {
        return intensity7d;
    }

    public void setIntensity7d(String intensity7d) {
        this.intensity7d = intensity7d;
    }

    public String getIntensity28d() {
        return intensity28d;
    }

    public void setIntensity28d(String intensity28d) {
        this.intensity28d = intensity28d;
    }

    public String getIntensity60d() {
        return intensity60d;
    }

    public void setIntensity60d(String intensity60d) {
        this.intensity60d = intensity60d;
    }

    public String getWaterreducingagentdosage() {
        return waterreducingagentdosage;
    }

    public void setWaterreducingagentdosage(String waterreducingagentdosage) {
        this.waterreducingagentdosage = waterreducingagentdosage;
    }

    public String getWaterreducersamplenumber() {
        return waterreducersamplenumber;
    }

    public void setWaterreducersamplenumber(String waterreducersamplenumber) {
        this.waterreducersamplenumber = waterreducersamplenumber;
    }

    public String getExtrafinesandconsumption() {
        return extrafinesandconsumption;
    }

    public void setExtrafinesandconsumption(String extrafinesandconsumption) {
        this.extrafinesandconsumption = extrafinesandconsumption;
    }

    public String getExtrafinesandsamplenumber() {
        return extrafinesandsamplenumber;
    }

    public void setExtrafinesandsamplenumber(String extrafinesandsamplenumber) {
        this.extrafinesandsamplenumber = extrafinesandsamplenumber;
    }

    public String getLimestonepowderconsumption() {
        return limestonepowderconsumption;
    }

    public void setLimestonepowderconsumption(String limestonepowderconsumption) {
        this.limestonepowderconsumption = limestonepowderconsumption;
    }

    public String getLimestonepowdersamplenumber() {
        return limestonepowdersamplenumber;
    }

    public void setLimestonepowdersamplenumber(String limestonepowdersamplenumber) {
        this.limestonepowdersamplenumber = limestonepowdersamplenumber;
    }

    public String getBigstonedosage() {
        return bigstonedosage;
    }

    public void setBigstonedosage(String bigstonedosage) {
        this.bigstonedosage = bigstonedosage;
    }

    public String getBigstonesamplenumber() {
        return bigstonesamplenumber;
    }

    public void setBigstonesamplenumber(String bigstonesamplenumber) {
        this.bigstonesamplenumber = bigstonesamplenumber;
    }

    public String getExpansionagentdosage() {
        return expansionagentdosage;
    }

    public void setExpansionagentdosage(String expansionagentdosage) {
        this.expansionagentdosage = expansionagentdosage;
    }

    public String getExpansionagentsamplenumber() {
        return expansionagentsamplenumber;
    }

    public void setExpansionagentsamplenumber(String expansionagentsamplenumber) {
        this.expansionagentsamplenumber = expansionagentsamplenumber;
    }

    public String getSlagpowderconsumption() {
        return slagpowderconsumption;
    }

    public void setSlagpowderconsumption(String slagpowderconsumption) {
        this.slagpowderconsumption = slagpowderconsumption;
    }

    public String getSlagpowdersamplenumber() {
        return slagpowdersamplenumber;
    }

    public void setSlagpowdersamplenumber(String slagpowdersamplenumber) {
        this.slagpowdersamplenumber = slagpowdersamplenumber;
    }

    public String getCementconsumption() {
        return cementconsumption;
    }

    public void setCementconsumption(String cementconsumption) {
        this.cementconsumption = cementconsumption;
    }

    public String getCementsamplenumber() {
        return cementsamplenumber;
    }

    public void setCementsamplenumber(String cementsamplenumber) {
        this.cementsamplenumber = cementsamplenumber;
    }

    public String getCoarsesandconsumption() {
        return coarsesandconsumption;
    }

    public void setCoarsesandconsumption(String coarsesandconsumption) {
        this.coarsesandconsumption = coarsesandconsumption;
    }

    public String getCoarsesandsamplenumber() {
        return coarsesandsamplenumber;
    }

    public void setCoarsesandsamplenumber(String coarsesandsamplenumber) {
        this.coarsesandsamplenumber = coarsesandsamplenumber;
    }

    public String getRecycledwaterconsumption() {
        return recycledwaterconsumption;
    }

    public void setRecycledwaterconsumption(String recycledwaterconsumption) {
        this.recycledwaterconsumption = recycledwaterconsumption;
    }

    public String getRecycledwatersamplenumber() {
        return recycledwatersamplenumber;
    }

    public void setRecycledwatersamplenumber(String recycledwatersamplenumber) {
        this.recycledwatersamplenumber = recycledwatersamplenumber;
    }

    public String getDisablematerialusage() {
        return disablematerialusage;
    }

    public void setDisablematerialusage(String disablematerialusage) {
        this.disablematerialusage = disablematerialusage;
    }

    public String getDisablematerialsamplenumber() {
        return disablematerialsamplenumber;
    }

    public void setDisablematerialsamplenumber(String disablematerialsamplenumber) {
        this.disablematerialsamplenumber = disablematerialsamplenumber;
    }

    public String getFlyashdosage() {
        return flyashdosage;
    }

    public void setFlyashdosage(String flyashdosage) {
        this.flyashdosage = flyashdosage;
    }

    public String getFlyashsamplenumber() {
        return flyashsamplenumber;
    }

    public void setFlyashsamplenumber(String flyashsamplenumber) {
        this.flyashsamplenumber = flyashsamplenumber;
    }

    public String getWaterconsumption() {
        return waterconsumption;
    }

    public void setWaterconsumption(String waterconsumption) {
        this.waterconsumption = waterconsumption;
    }

    public String getWatersamplenumber() {
        return watersamplenumber;
    }

    public void setWatersamplenumber(String watersamplenumber) {
        this.watersamplenumber = watersamplenumber;
    }

    public String getSpecialmaterialdosage() {
        return specialmaterialdosage;
    }

    public void setSpecialmaterialdosage(String specialmaterialdosage) {
        this.specialmaterialdosage = specialmaterialdosage;
    }

    public String getSpecialmaterialsamplenumber() {
        return specialmaterialsamplenumber;
    }

    public void setSpecialmaterialsamplenumber(String specialmaterialsamplenumber) {
        this.specialmaterialsamplenumber = specialmaterialsamplenumber;
    }

    public String getSmallstonedosage() {
        return smallstonedosage;
    }

    public void setSmallstonedosage(String smallstonedosage) {
        this.smallstonedosage = smallstonedosage;
    }

    public String getSmallstonesamplenumber() {
        return smallstonesamplenumber;
    }

    public void setSmallstonesamplenumber(String smallstonesamplenumber) {
        this.smallstonesamplenumber = smallstonesamplenumber;
    }

    public String getMediumsandconsumption() {
        return mediumsandconsumption;
    }

    public void setMediumsandconsumption(String mediumsandconsumption) {
        this.mediumsandconsumption = mediumsandconsumption;
    }

    public String getMediumsandsamplenumber() {
        return mediumsandsamplenumber;
    }

    public void setMediumsandsamplenumber(String mediumsandsamplenumber) {
        this.mediumsandsamplenumber = mediumsandsamplenumber;
    }

    public String getConcretevariety() {
        return concretevariety;
    }

    public void setConcretevariety(String concretevariety) {
        this.concretevariety = concretevariety;
    }

    public String getStrengthlevel1() {
        return strengthlevel1;
    }

    public void setStrengthlevel1(String strengthlevel1) {
        this.strengthlevel1 = strengthlevel1;
    }

    public String getImpermeabilityrating() {
        return impermeabilityrating;
    }

    public void setImpermeabilityrating(String impermeabilityrating) {
        this.impermeabilityrating = impermeabilityrating;
    }

    public String getMaterialrequirements() {
        return materialrequirements;
    }

    public void setMaterialrequirements(String materialrequirements) {
        this.materialrequirements = materialrequirements;
    }

    public String getLimitexpansionrate() {
        return limitexpansionrate;
    }

    public void setLimitexpansionrate(String limitexpansionrate) {
        this.limitexpansionrate = limitexpansionrate;
    }

    public String getOthercharacteristics() {
        return othercharacteristics;
    }

    public void setOthercharacteristics(String othercharacteristics) {
        this.othercharacteristics = othercharacteristics;
    }
}













