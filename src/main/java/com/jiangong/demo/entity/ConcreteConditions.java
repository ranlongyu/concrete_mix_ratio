package com.jiangong.demo.entity;

import javax.validation.constraints.NotNull;

public class ConcreteConditions {
    @NotNull
    private String timeSegement;//时间段
    @NotNull
    private String mixtureKind;//混凝土品种
    @NotNull
    private String collapse;//强度等级

    private String divergence;//工作性能

    private String imperviousRate;//抗渗等级
    private String restrictRate;//限制膨胀率
    private String materialRequirements; //材料要求

    @NotNull
    public String getTimeSegement() {
        return timeSegement;
    }

    public void setTimeSegement(@NotNull String timeSegement) {
        this.timeSegement = timeSegement;
    }

    public String getMixtureKind() {
        return mixtureKind;
    }

    public void setMixtureKind(String mixtureKind) {
        this.mixtureKind = mixtureKind;
    }

    public String getCollapse() {
        return collapse;
    }

    public void setCollapse(String collapse) {
        this.collapse = collapse;
    }

    public String getDivergence() {
        return divergence;
    }

    public void setDivergence(String divergence) {
        this.divergence = divergence;
    }

    public String getImperviousRate() {
        return imperviousRate;
    }

    public void setImperviousRate(String imperviousRate) {
        this.imperviousRate = imperviousRate;
    }

    public String getRestrictRate() {
        return restrictRate;
    }

    public void setRestrictRate(String restrictRate) {
        this.restrictRate = restrictRate;
    }

    public String getMaterialRequirements() {
        return materialRequirements;
    }

    public void setMaterialRequirements(String materialRequirements) {
        this.materialRequirements = materialRequirements;
    }
}
