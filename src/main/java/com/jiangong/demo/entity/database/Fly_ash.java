package com.jiangong.demo.entity.database;

import javax.persistence.*;

@Entity
@Table(name = "粉煤灰质量检测列表")
public class Fly_ash {
    @Id
    @Column(name = "样品编号")
    private String sampleid;

    @Column(name = "生产车间")
    private String productionworkshop;

    @Column(name = "样品类别")
    private String samplecategory;

    @Column(name = "品种等级")
    private String breedgrade;

    @Column(name = "供应单位")
    private String supplyunit;

    @Column(name = "批号")
    private String batchnumber;

    @Column(name = "取样日期")
    private String samplingdate;

    @Column(name = "检测日期")
    private String dateofinspection;

    @Column(name = "取样基数")
    private String samplingbase;

    @Column(name = "取样人")
    private String sampler;

    @Column(name = "样品到期处理日期")
    private String sampleexpirationdate;

    @Column(name = "样品到期处理人")
    private String sampleexpirationprocessor;

    @Column(name = "样品到期处理批准人")
    private String sampleexpirationprocessingapprover;

    @Column(name = "含水量")
    private String watercontent;

    @Column(name = "细度")
    private String fineness;

    @Column(name = "需水量比")
    private String waterdemandratio;

    @Column(name = "烧失量")
    private String lossonignition;

    @Column(name = "活性指数")
    private String activityindex;

    @Column(name = "报告日期")
    private String reportdate;

    @Column(name = "备注")
    private String remarks;

    @Column(name = "检测人")
    private String inspector;

    @Column(name = "录入时间")
    private String entryTime;


    public String getSampleid() {
        return sampleid;
    }

    public void setSampleid(String sampleid) {
        this.sampleid = sampleid;
    }

    public String getProductionworkshop() {
        return productionworkshop;
    }

    public void setProductionworkshop(String productionworkshop) {
        this.productionworkshop = productionworkshop;
    }

    public String getSamplecategory() {
        return samplecategory;
    }

    public void setSamplecategory(String samplecategory) {
        this.samplecategory = samplecategory;
    }

    public String getBreedgrade() {
        return breedgrade;
    }

    public void setBreedgrade(String breedgrade) {
        this.breedgrade = breedgrade;
    }

    public String getSupplyunit() {
        return supplyunit;
    }

    public void setSupplyunit(String supplyunit) {
        this.supplyunit = supplyunit;
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber;
    }

    public String getSamplingdate() {
        return samplingdate;
    }

    public void setSamplingdate(String samplingdate) {
        this.samplingdate = samplingdate;
    }

    public String getDateofinspection() {
        return dateofinspection;
    }

    public void setDateofinspection(String dateofinspection) {
        this.dateofinspection = dateofinspection;
    }

    public String getSamplingbase() {
        return samplingbase;
    }

    public void setSamplingbase(String samplingbase) {
        this.samplingbase = samplingbase;
    }

    public String getSampler() {
        return sampler;
    }

    public void setSampler(String sampler) {
        this.sampler = sampler;
    }

    public String getSampleexpirationdate() {
        return sampleexpirationdate;
    }

    public void setSampleexpirationdate(String sampleexpirationdate) {
        this.sampleexpirationdate = sampleexpirationdate;
    }

    public String getSampleexpirationprocessor() {
        return sampleexpirationprocessor;
    }

    public void setSampleexpirationprocessor(String sampleexpirationprocessor) {
        this.sampleexpirationprocessor = sampleexpirationprocessor;
    }

    public String getSampleexpirationprocessingapprover() {
        return sampleexpirationprocessingapprover;
    }

    public void setSampleexpirationprocessingapprover(String sampleexpirationprocessingapprover) {
        this.sampleexpirationprocessingapprover = sampleexpirationprocessingapprover;
    }

    public String getWatercontent() {
        return watercontent;
    }

    public void setWatercontent(String watercontent) {
        this.watercontent = watercontent;
    }

    public String getFineness() {
        return fineness;
    }

    public void setFineness(String fineness) {
        this.fineness = fineness;
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

    public String getActivityindex() {
        return activityindex;
    }

    public void setActivityindex(String activityindex) {
        this.activityindex = activityindex;
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }
}
