package com.jiangong.demo.entity;

public class Rating_item {
    /**混凝土类*/
    //材料要求
    private String materialrequirements;

    //工作性能要求
    //坍落度
    private String slump;
    //扩展度
    private String expansion;

    //强度检测数据：28d强度
    private String intensity28d;
    //强度等级
    private String strengthlevel1;

    //限制膨胀率
    private String limitexpansionrate1;

    //耐久性技术要求（没有，暂时不考虑）

    /**原材料类*/
    //水泥生产厂家：供应单位
    private String supplyunit;

    //细集料品种、型号（没有，暂时不考虑）
    //粗集料品种、型号（没有，暂时不考虑）

    //水泥品种等级
    private String breedgrade;
    //水泥28d抗压强度：抗压28d
    private String compression28d;

    //矿渣粉等级
    private String breedgrade1;
    //矿渣粉28d活性指数：活性指数28d
    private String activityindex28d;

    //粉煤灰等级
    private String breedgrade2;
    //粉煤灰细度：细度
    private String fineness1;
    //粉煤灰需水量比：需水量比
    private String waterdemandratio;
    //粉煤灰烧失量：烧失量
    private String lossonignition;

    //膨胀剂型号
    private String expansiongrade;
    //膨胀剂限制膨胀率：限制膨胀率
    private String limitexpansionrate2;
    //膨胀剂限制膨胀率28d抗压强度：28d抗压强度
    private String compressivestrength28d;

    //外加剂减水率：减水率
    private String waterreductionrate;

    //石灰石粉细度：细度
    private String fineness2;

    //石灰石粉亚甲蓝值：亚甲蓝值
    private String methylenebluevalue;


    public String getExpansiongrade() {
        return expansiongrade;
    }

    public void setExpansiongrade(String expansiongrade) {
        this.expansiongrade = expansiongrade;
    }

    public String getBreedgrade1() {
        return breedgrade1;
    }

    public void setBreedgrade1(String breedgrade1) {
        this.breedgrade1 = breedgrade1;
    }

    public String getBreedgrade2() {
        return breedgrade2;
    }

    public void setBreedgrade2(String breedgrade2) {
        this.breedgrade2 = breedgrade2;
    }

    public String getMaterialrequirements() {
        return materialrequirements;
    }

    public void setMaterialrequirements(String materialrequirements) {
        this.materialrequirements = materialrequirements;
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

    public void setExpansion(String degreeofexpansion) {
        this.expansion = degreeofexpansion;
    }

    public String getIntensity28d() {
        return intensity28d;
    }

    public void setIntensity28d(String intensity28d) {
        this.intensity28d = intensity28d;
    }

    public String getStrengthlevel1() {
        return strengthlevel1;
    }

    public void setStrengthlevel1(String strengthlevel1) {
        this.strengthlevel1 = strengthlevel1;
    }

    public String getLimitexpansionrate1() {
        return limitexpansionrate1;
    }

    public void setLimitexpansionrate1(String limitexpansionrate1) {
        this.limitexpansionrate1 = limitexpansionrate1;
    }

    public String getSupplyunit() {
        return supplyunit;
    }

    public void setSupplyunit(String supplyunit) {
        this.supplyunit = supplyunit;
    }

    public String getBreedgrade() {
        return breedgrade;
    }

    public void setBreedgrade(String breedgrade) {
        this.breedgrade = breedgrade;
    }

    public String getCompression28d() {
        return compression28d;
    }

    public void setCompression28d(String compression28d) {
        this.compression28d = compression28d;
    }

    public String getActivityindex28d() {
        return activityindex28d;
    }

    public void setActivityindex28d(String activityindex28d) {
        this.activityindex28d = activityindex28d;
    }

    public String getFineness1() {
        return fineness1;
    }

    public void setFineness1(String fineness1) {
        this.fineness1 = fineness1;
    }

    public String getWaterdemandratio() {
        return waterdemandratio;
    }

    public void setWaterdemandratio(String waterdemandratio) {
        this.waterdemandratio = waterdemandratio;
    }

    public String getLossonignition() {
        return lossonignition;
    }

    public void setLossonignition(String lossonignition) {
        this.lossonignition = lossonignition;
    }

    public String getLimitexpansionrate2() {
        return limitexpansionrate2;
    }

    public void setLimitexpansionrate2(String limitexpansionrate2) {
        this.limitexpansionrate2 = limitexpansionrate2;
    }

    public String getCompressivestrength28d() {
        return compressivestrength28d;
    }

    public void setCompressivestrength28d(String compressivestrength28d) {
        this.compressivestrength28d = compressivestrength28d;
    }

    public String getWaterreductionrate() {
        return waterreductionrate;
    }

    public void setWaterreductionrate(String waterreductionrate) {
        this.waterreductionrate = waterreductionrate;
    }

    public String getFineness2() {
        return fineness2;
    }

    public void setFineness2(String fineness2) {
        this.fineness2 = fineness2;
    }

    public String getMethylenebluevalue() {
        return methylenebluevalue;
    }

    public void setMethylenebluevalue(String methylenebluevalue) {
        this.methylenebluevalue = methylenebluevalue;
    }


    @Override
    public String toString() {
        return "Rating_item{" +
                "materialrequirements='" + materialrequirements + '\'' +
                ", slump='" + slump + '\'' +
                ", expansion='" + expansion + '\'' +
                ", intensity28d='" + intensity28d + '\'' +
                ", strengthlevel1='" + strengthlevel1 + '\'' +
                ", limitexpansionrate1='" + limitexpansionrate1 + '\'' +
                ", supplyunit='" + supplyunit + '\'' +
                ", breedgrade='" + breedgrade + '\'' +
                ", compression28d='" + compression28d + '\'' +
                ", breedgrade1='" + breedgrade1 + '\'' +
                ", activityindex28d='" + activityindex28d + '\'' +
                ", breedgrade2='" + breedgrade2 + '\'' +
                ", fineness1='" + fineness1 + '\'' +
                ", waterdemandratio='" + waterdemandratio + '\'' +
                ", lossonignition='" + lossonignition + '\'' +
                ", limitexpansionrate2='" + limitexpansionrate2 + '\'' +
                ", compressivestrength28d='" + compressivestrength28d + '\'' +
                ", waterreductionrate='" + waterreductionrate + '\'' +
                ", fineness2='" + fineness2 + '\'' +
                ", methylenebluevalue='" + methylenebluevalue + '\'' +
                '}';
    }
}
