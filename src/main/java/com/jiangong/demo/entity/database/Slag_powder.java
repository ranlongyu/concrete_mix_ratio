package com.jiangong.demo.entity.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "矿渣粉质量检测列表")
public class Slag_powder {
    @Id
    @Column(name = "样品编号")
    private String sampleid;

    @Column(name = "生产车间")
    private String productionworkshop;

    @Column(name = "抽检单号")
    private String samplenumber;

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

    @Column(name = "密度")
    private String density;

    @Column(name = "比表面积")
    private String specificsurfacearea;

    @Column(name = "流动度比")
    private String liquidityratio;

    @Column(name = "活性指数7d")
    private String activityindex7d;

    @Column(name = "活性指数28d")
    private String activityindex28d;

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

    public String getSamplenumber() {
        return samplenumber;
    }

    public void setSamplenumber(String samplenumber) {
        this.samplenumber = samplenumber;
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

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getSpecificsurfacearea() {
        return specificsurfacearea;
    }

    public void setSpecificsurfacearea(String specificsurfacearea) {
        this.specificsurfacearea = specificsurfacearea;
    }

    public String getLiquidityratio() {
        return liquidityratio;
    }

    public void setLiquidityratio(String liquidityratio) {
        this.liquidityratio = liquidityratio;
    }

    public String getActivityindex7d() {
        return activityindex7d;
    }

    public void setActivityindex7d(String activityindex7d) {
        this.activityindex7d = activityindex7d;
    }

    public String getActivityindex28d() {
        return activityindex28d;
    }

    public void setActivityindex28d(String activityindex28d) {
        this.activityindex28d = activityindex28d;
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
