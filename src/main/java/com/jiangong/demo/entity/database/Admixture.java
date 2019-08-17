package com.jiangong.demo.entity.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "外加剂质量台账列表")
public class Admixture {

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

    @Column(name = "推荐掺量")
    private String recommendeddosage;

    @Column(name = "pH值")
    private String phvalue;

    @Column(name = "减水率")
    private String Waterreductionrate;

    @Column(name = "含气量")
    private String gascontent;

    @Column(name = "抗压强度比3d")
    private String compressivestrengthratio3d;

    @Column(name = "抗压强度比7d")
    private String compressivestrengthratio7d;

    @Column(name = "抗压强度比28d")
    private String compressivestrengthratio28d;

    @Column(name = "泌水率比")
    private String bleedingrateratio;

    @Column(name = "初凝时间差")
    private String initialsettingtimedifference;

    @Column(name = "终凝时间差")
    private String finalcondensationtimedifference;

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

    public String getRecommendeddosage() {
        return recommendeddosage;
    }

    public void setRecommendeddosage(String recommendeddosage) {
        this.recommendeddosage = recommendeddosage;
    }

    public String getPhvalue() {
        return phvalue;
    }

    public void setPhvalue(String phvalue) {
        this.phvalue = phvalue;
    }

    public String getWaterreductionrate() {
        return Waterreductionrate;
    }

    public void setWaterreductionrate(String waterreductionrate) {
        Waterreductionrate = waterreductionrate;
    }

    public String getGascontent() {
        return gascontent;
    }

    public void setGascontent(String gascontent) {
        this.gascontent = gascontent;
    }

    public String getCompressivestrengthratio3d() {
        return compressivestrengthratio3d;
    }

    public void setCompressivestrengthratio3d(String compressivestrengthratio3d) {
        this.compressivestrengthratio3d = compressivestrengthratio3d;
    }

    public String getCompressivestrengthratio7d() {
        return compressivestrengthratio7d;
    }

    public void setCompressivestrengthratio7d(String compressivestrengthratio7d) {
        this.compressivestrengthratio7d = compressivestrengthratio7d;
    }

    public String getCompressivestrengthratio28d() {
        return compressivestrengthratio28d;
    }

    public void setCompressivestrengthratio28d(String compressivestrengthratio28d) {
        this.compressivestrengthratio28d = compressivestrengthratio28d;
    }

    public String getBleedingrateratio() {
        return bleedingrateratio;
    }

    public void setBleedingrateratio(String bleedingrateratio) {
        this.bleedingrateratio = bleedingrateratio;
    }

    public String getInitialsettingtimedifference() {
        return initialsettingtimedifference;
    }

    public void setInitialsettingtimedifference(String initialsettingtimedifference) {
        this.initialsettingtimedifference = initialsettingtimedifference;
    }

    public String getFinalcondensationtimedifference() {
        return finalcondensationtimedifference;
    }

    public void setFinalcondensationtimedifference(String finalcondensationtimedifference) {
        this.finalcondensationtimedifference = finalcondensationtimedifference;
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
