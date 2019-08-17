package com.jiangong.demo.entity.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "膨胀剂质量检测列表")
public class Expansion_agent {

    @Id
    @Column(name = "样品编号")
    private String sampleid;

    @Column(name = "生产车间")
    private String productionworkshop;

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

    @Column(name = "细度")
    private String fineness;

    @Column(name = "初凝")
    private String initialcondensation;

    @Column(name = "终凝")
    private String finalcondensation;

    @Column(name = "限制膨胀率")
    private String limitexpansionrate;

    @Column(name = "7d抗压强度")
    private String compressivestrength7d;

    @Column(name = "28d抗压强度")
    private String compressivestrength28d;

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

    public String getFineness() {
        return fineness;
    }

    public void setFineness(String fineness) {
        this.fineness = fineness;
    }

    public String getInitialcondensation() {
        return initialcondensation;
    }

    public void setInitialcondensation(String initialcondensation) {
        this.initialcondensation = initialcondensation;
    }

    public String getFinalcondensation() {
        return finalcondensation;
    }

    public void setFinalcondensation(String finalcondensation) {
        this.finalcondensation = finalcondensation;
    }

    public String getLimitexpansionrate() {
        return limitexpansionrate;
    }

    public void setLimitexpansionrate(String limitexpansionrate) {
        this.limitexpansionrate = limitexpansionrate;
    }

    public String getCompressivestrength7d() {
        return compressivestrength7d;
    }

    public void setCompressivestrength7d(String compressivestrength7d) {
        this.compressivestrength7d = compressivestrength7d;
    }


    public String getCompressivestrength28d() {
        return compressivestrength28d;
    }

    public void setCompressivestrength28d(String compressivestrength28d) {
        this.compressivestrength28d = compressivestrength28d;
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
