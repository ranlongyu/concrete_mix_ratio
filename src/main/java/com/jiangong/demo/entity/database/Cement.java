package com.jiangong.demo.entity.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "水泥质检列表")
public class Cement {

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

    @Column(name = "密度")
    private String density;

    @Column(name = "比表面积")
    private String specificsurfacearea;

    @Column(name = "标准稠度用水量")
    private String standardconsistencywaterconsumption;

    @Column(name = "安定性")
    private String stability;

    @Column(name = "初凝")
    private String initialcondensation;

    @Column(name = "终凝")
    private String finalcondensation;

    @Column(name = "抗压3d")
    private String compression3d;

    @Column(name = "抗压28d")
    private String compression28d;

    @Column(name = "抗折3d")
    private String antifold3d;

    @Column(name = "抗折28d")
    private String antifold28d;

    @Column(name = "报告日期")
    private String reportdate;

    @Column(name = "备注")
    private String remarks;

    @Column(name = "检测人")
    private String inspector;

    @Column(name = "录入时间")
    private String entrytime;


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

    public String getStandardconsistencywaterconsumption() {
        return standardconsistencywaterconsumption;
    }

    public void setStandardconsistencywaterconsumption(String standardconsistencywaterconsumption) {
        this.standardconsistencywaterconsumption = standardconsistencywaterconsumption;
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability;
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

    public String getCompression3d() {
        return compression3d;
    }

    public void setCompression3d(String compression3d) {
        this.compression3d = compression3d;
    }

    public String getCompression28d() {
        return compression28d;
    }

    public void setCompression28d(String compression28d) {
        this.compression28d = compression28d;
    }

    public String getAntifold3d() {
        return antifold3d;
    }

    public void setAntifold3d(String antifold3d) {
        this.antifold3d = antifold3d;
    }

    public String getAntifold28d() {
        return antifold28d;
    }

    public void setAntifold28d(String antifold28d) {
        this.antifold28d = antifold28d;
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

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }
}
