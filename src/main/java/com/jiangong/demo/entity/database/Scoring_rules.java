package com.jiangong.demo.entity.database;

import javax.persistence.*;

@Entity
@Table(name = "评分规则")
public class Scoring_rules {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "材料要求")
    private Integer materialrequirements;
    @Column(name = "工作性能")
    private Integer workperformance;
    @Column(name = "强度检测数据")
    private Integer intensitydd;
    @Column(name = "限制膨胀率")
    private Integer limitexpansionrate;
    @Column(name = "耐久性技术要求")
    private Integer durabilitytr;
    @Column(name = "水泥生产厂家")
    private Integer cementmanufacturer;
    @Column(name = "细集料品种、型号")
    private Integer fineaggregate;
    @Column(name = "粗集料品种、型号")
    private Integer coarseaggregate;
    @Column(name = "水泥28d抗压强度")
    private Integer cementcs28d;
    @Column(name = "矿渣粉28d活性指数")
    private Integer slagpowderi28d;
    @Column(name = "粉煤灰细度、需水量比")
    private Integer flyash;
    @Column(name = "膨胀剂限制膨胀率")
    private Integer expansionagent;
    @Column(name = "减水剂减水率")
    private Integer waterreducer;
    @Column(name = "石灰石粉细度")
    private Integer limestonefineness;
    @Column(name = "石灰石粉亚甲蓝值")
    private Integer limestonepowdermbv;
    @Column(name = "粉煤灰烧失量")
    private Integer flyashloss;
    @Column(name = "膨胀剂28d抗压强度")
    private Integer expansionagentcs28d;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMaterialrequirements() {
        return materialrequirements;
    }

    public void setMaterialrequirements(Integer materialrequirements) {
        this.materialrequirements = materialrequirements;
    }

    public Integer getWorkperformance() {
        return workperformance;
    }

    public void setWorkperformance(Integer workperformance) {
        this.workperformance = workperformance;
    }

    public Integer getIntensitydd() {
        return intensitydd;
    }

    public void setIntensitydd(Integer intensitydd) {
        this.intensitydd = intensitydd;
    }

    public Integer getLimitexpansionrate() {
        return limitexpansionrate;
    }

    public void setLimitexpansionrate(Integer limitexpansionrate) {
        this.limitexpansionrate = limitexpansionrate;
    }

    public Integer getDurabilitytr() {
        return durabilitytr;
    }

    public void setDurabilitytr(Integer durabilitytr) {
        this.durabilitytr = durabilitytr;
    }

    public Integer getCementmanufacturer() {
        return cementmanufacturer;
    }

    public void setCementmanufacturer(Integer cementmanufacturer) {
        this.cementmanufacturer = cementmanufacturer;
    }

    public Integer getFineaggregate() {
        return fineaggregate;
    }

    public void setFineaggregate(Integer fineaggregate) {
        this.fineaggregate = fineaggregate;
    }

    public Integer getCoarseaggregate() {
        return coarseaggregate;
    }

    public void setCoarseaggregate(Integer coarseaggregate) {
        this.coarseaggregate = coarseaggregate;
    }

    public Integer getCementcs28d() {
        return cementcs28d;
    }

    public void setCementcs28d(Integer cementcs28d) {
        this.cementcs28d = cementcs28d;
    }

    public Integer getSlagpowderi28d() {
        return slagpowderi28d;
    }

    public void setSlagpowderi28d(Integer slagpowderi28d) {
        this.slagpowderi28d = slagpowderi28d;
    }

    public Integer getFlyash() {
        return flyash;
    }

    public void setFlyash(Integer flyash) {
        this.flyash = flyash;
    }

    public Integer getExpansionagent() {
        return expansionagent;
    }

    public void setExpansionagent(Integer expansionagent) {
        this.expansionagent = expansionagent;
    }

    public Integer getWaterreducer() {
        return waterreducer;
    }

    public void setWaterreducer(Integer waterreducer) {
        this.waterreducer = waterreducer;
    }

    public Integer getLimestonefineness() {
        return limestonefineness;
    }

    public void setLimestonefineness(Integer limestonefineness) {
        this.limestonefineness = limestonefineness;
    }

    public Integer getLimestonepowdermbv() {
        return limestonepowdermbv;
    }

    public void setLimestonepowdermbv(Integer limestonepowdermbv) {
        this.limestonepowdermbv = limestonepowdermbv;
    }

    public Integer getFlyashloss() {
        return flyashloss;
    }

    public void setFlyashloss(Integer flyashloss) {
        this.flyashloss = flyashloss;
    }

    public Integer getExpansionagentcs28d() {
        return expansionagentcs28d;
    }

    public void setExpansionagentcs28d(Integer expansionagentcs28d) {
        this.expansionagentcs28d = expansionagentcs28d;
    }

    @Override
    public String toString() {
        return "Scoring_rules{" +
                "id=" + id +
                ", materialrequirements=" + materialrequirements +
                ", workperformance=" + workperformance +
                ", intensitydd=" + intensitydd +
                ", limitexpansionrate=" + limitexpansionrate +
                ", durabilitytr=" + durabilitytr +
                ", cementmanufacturer=" + cementmanufacturer +
                ", fineaggregate=" + fineaggregate +
                ", coarseaggregate=" + coarseaggregate +
                ", cementcs28d=" + cementcs28d +
                ", slagpowderi28d=" + slagpowderi28d +
                ", flyash=" + flyash +
                ", expansionagent=" + expansionagent +
                ", waterreducer=" + waterreducer +
                ", limestonefineness=" + limestonefineness +
                ", limestonepowdermbv=" + limestonepowdermbv +
                ", flyashloss=" + flyashloss +
                ", expansionagentcs28d=" + expansionagentcs28d +
                '}';
    }
}
