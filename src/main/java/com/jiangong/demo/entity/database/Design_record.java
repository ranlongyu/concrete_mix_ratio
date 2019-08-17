package com.jiangong.demo.entity.database;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "设计记录表")
public class Design_record {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "用户名")
    private String username;
    @Column(name = "设计时间")
    private Date time;

    @Column(name = "时间段")
    private String period;
    @Column(name = "混凝土品种")
    private String concretevariety;
    @Column(name = "强度等级")
    private String powerlevel;
    @Column(name = "抗渗等级")
    private String impermerating;
    @Column(name = "材料要求")
    private String materialrequirements;
    @Column(name = "限制膨胀率")
    private String limitexpansionrate;
    @Column(name = "坍落度")
    private String slump;
    @Column(name = "扩展度")
    private String expansion;

    @Column(name = "耐久性技术要求")
    private String durrequirements;
    @Column(name = "其他技术要求")
    private String otherrequirements;

    @Column(name = "水泥等级")
    private String cementgrade;
    @Column(name = "水泥28d抗压强度")
    private String cementcompress28d;
    @Column(name = "水泥生产厂家")
    private String cementmanufacturer;

    @Column(name = "细集料1品种")
    private String fineaggregate1variety;
    @Column(name = "细集料1型号")
    private String fineaggregate1model;
    @Column(name = "细集料1细度模数")
    private String fineaggregate1fm;
    @Column(name = "细集料2品种")
    private String fineaggregate2variety;
    @Column(name = "细集料2型号")
    private String fineaggregate2model;
    @Column(name = "细集料2细度模数")
    private String fineaggregate2fm;
    @Column(name = "细集料3品种")
    private String fineaggregate3variety;
    @Column(name = "细集料3型号")
    private String fineaggregate3model;
    @Column(name = "细集料3细度模数")
    private String fineaggregate3fm;
    @Column(name = "粗集料1品种")
    private String coarseaggregate1variety;
    @Column(name = "粗集料1型号")
    private String coarseaggregate1model;
    @Column(name = "粗集料2品种")
    private String coarseaggregate2variety;
    @Column(name = "粗集料2型号")
    private String coarseaggregate2model;
    @Column(name = "粗集料3品种")
    private String coarseaggregate3variety;
    @Column(name = "粗集料3型号")
    private String coarseaggregate3model;

    @Column(name = "减水剂等级")
    private String reducewaterlevel;
    @Column(name = "减推荐掺量")
    private String reducerecommendamount;
    @Column(name = "减水率")
    private String reducewaterrate;
    @Column(name = "减含气量")
    private String reducegascontent;
    @Column(name = "减抗压强度比28d")
    private String reducecompress28d;
    @Column(name = "减泌水率比")
    private String reducebleedratio;

    @Column(name = "粉煤灰类别")
    private String flyashcategory;
    @Column(name = "粉煤灰等级")
    private String flyashgrade;
    @Column(name = "粉细度")
    private String flyfineness;
    @Column(name = "粉需水量比")
    private String flywaterneed;
    @Column(name = "粉烧失量")
    private String flyloss;
    @Column(name = "粉28d活性指数")
    private String fly28dactivity;

    @Column(name = "矿渣粉等级")
    private String slagpowdergrade;
    @Column(name = "矿28d活性指数")
    private String slag28dactivity;
    @Column(name = "矿生产厂家")
    private String slagmanufacturer;
    @Column(name = "矿细度")
    private String slagfineness;

    @Column(name = "石灰石粉细度")
    private String limestonefineness;
    @Column(name = "石亚甲蓝值")
    private String limestonebluevalue;
    @Column(name = "石28d活性指数")
    private String limestone28dactivity;

    @Column(name = "膨胀剂型号")
    private String expansionmodel;
    @Column(name = "膨28d抗压强度")
    private String expansion28d;
    @Column(name = "膨限制膨胀率")
    private String expansionlimit;

    @Column(name = "其他材料名称")
    private String othermaterialname;
    @Column(name = "其他材料型号")
    private String othermaterialmodel;
    @Column(name = "其他材料用量")
    private String othermaterialconsumption;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getConcretevariety() {
        return concretevariety;
    }

    public void setConcretevariety(String concretevariety) {
        this.concretevariety = concretevariety;
    }

    public String getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(String powerlevel) {
        this.powerlevel = powerlevel;
    }

    public String getImpermerating() {
        return impermerating;
    }

    public void setImpermerating(String impermerating) {
        this.impermerating = impermerating;
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

    public String getDurrequirements() {
        return durrequirements;
    }

    public void setDurrequirements(String durrequirements) {
        this.durrequirements = durrequirements;
    }

    public String getOtherrequirements() {
        return otherrequirements;
    }

    public void setOtherrequirements(String otherrequirements) {
        this.otherrequirements = otherrequirements;
    }

    public String getCementgrade() {
        return cementgrade;
    }

    public void setCementgrade(String cementgrade) {
        this.cementgrade = cementgrade;
    }

    public String getCementcompress28d() {
        return cementcompress28d;
    }

    public void setCementcompress28d(String cementcompress28d) {
        this.cementcompress28d = cementcompress28d;
    }

    public String getCementmanufacturer() {
        return cementmanufacturer;
    }

    public void setCementmanufacturer(String cementmanufacturer) {
        this.cementmanufacturer = cementmanufacturer;
    }

    public String getFineaggregate1variety() {
        return fineaggregate1variety;
    }

    public void setFineaggregate1variety(String fineaggregate1variety) {
        this.fineaggregate1variety = fineaggregate1variety;
    }

    public String getFineaggregate1model() {
        return fineaggregate1model;
    }

    public void setFineaggregate1model(String fineaggregate1model) {
        this.fineaggregate1model = fineaggregate1model;
    }

    public String getFineaggregate1fm() {
        return fineaggregate1fm;
    }

    public void setFineaggregate1fm(String fineaggregate1fm) {
        this.fineaggregate1fm = fineaggregate1fm;
    }

    public String getFineaggregate2variety() {
        return fineaggregate2variety;
    }

    public void setFineaggregate2variety(String fineaggregate2variety) {
        this.fineaggregate2variety = fineaggregate2variety;
    }

    public String getFineaggregate2model() {
        return fineaggregate2model;
    }

    public void setFineaggregate2model(String fineaggregate2model) {
        this.fineaggregate2model = fineaggregate2model;
    }

    public String getFineaggregate2fm() {
        return fineaggregate2fm;
    }

    public void setFineaggregate2fm(String fineaggregate2fm) {
        this.fineaggregate2fm = fineaggregate2fm;
    }

    public String getFineaggregate3variety() {
        return fineaggregate3variety;
    }

    public void setFineaggregate3variety(String fineaggregate3variety) {
        this.fineaggregate3variety = fineaggregate3variety;
    }

    public String getFineaggregate3model() {
        return fineaggregate3model;
    }

    public void setFineaggregate3model(String fineaggregate3model) {
        this.fineaggregate3model = fineaggregate3model;
    }

    public String getFineaggregate3fm() {
        return fineaggregate3fm;
    }

    public void setFineaggregate3fm(String fineaggregate3fm) {
        this.fineaggregate3fm = fineaggregate3fm;
    }

    public String getCoarseaggregate3variety() {
        return coarseaggregate3variety;
    }

    public void setCoarseaggregate3variety(String coarseaggregate3variety) {
        this.coarseaggregate3variety = coarseaggregate3variety;
    }

    public String getCoarseaggregate3model() {
        return coarseaggregate3model;
    }

    public void setCoarseaggregate3model(String coarseaggregate3model) {
        this.coarseaggregate3model = coarseaggregate3model;
    }

    public String getCoarseaggregate1variety() {
        return coarseaggregate1variety;
    }

    public void setCoarseaggregate1variety(String coarseaggregate1variety) {
        this.coarseaggregate1variety = coarseaggregate1variety;
    }

    public String getCoarseaggregate1model() {
        return coarseaggregate1model;
    }

    public void setCoarseaggregate1model(String coarseaggregate1model) {
        this.coarseaggregate1model = coarseaggregate1model;
    }

    public String getCoarseaggregate2variety() {
        return coarseaggregate2variety;
    }

    public void setCoarseaggregate2variety(String coarseaggregate2variety) {
        this.coarseaggregate2variety = coarseaggregate2variety;
    }

    public String getCoarseaggregate2model() {
        return coarseaggregate2model;
    }

    public void setCoarseaggregate2model(String coarseaggregate2model) {
        this.coarseaggregate2model = coarseaggregate2model;
    }

    public String getReducewaterlevel() {
        return reducewaterlevel;
    }

    public void setReducewaterlevel(String reducewaterlevel) {
        this.reducewaterlevel = reducewaterlevel;
    }

    public String getReducerecommendamount() {
        return reducerecommendamount;
    }

    public void setReducerecommendamount(String reducerecommendamount) {
        this.reducerecommendamount = reducerecommendamount;
    }

    public String getReducewaterrate() {
        return reducewaterrate;
    }

    public void setReducewaterrate(String reducewaterrate) {
        this.reducewaterrate = reducewaterrate;
    }

    public String getReducegascontent() {
        return reducegascontent;
    }

    public void setReducegascontent(String reducegascontent) {
        this.reducegascontent = reducegascontent;
    }

    public String getReducecompress28d() {
        return reducecompress28d;
    }

    public void setReducecompress28d(String reducecompress28d) {
        this.reducecompress28d = reducecompress28d;
    }

    public String getReducebleedratio() {
        return reducebleedratio;
    }

    public void setReducebleedratio(String reducebleedratio) {
        this.reducebleedratio = reducebleedratio;
    }

    public String getFlyashcategory() {
        return flyashcategory;
    }

    public void setFlyashcategory(String flyashcategory) {
        this.flyashcategory = flyashcategory;
    }

    public String getFlyashgrade() {
        return flyashgrade;
    }

    public void setFlyashgrade(String flyashgrade) {
        this.flyashgrade = flyashgrade;
    }

    public String getFlyfineness() {
        return flyfineness;
    }

    public void setFlyfineness(String flyfineness) {
        this.flyfineness = flyfineness;
    }

    public String getFlywaterneed() {
        return flywaterneed;
    }

    public void setFlywaterneed(String flywaterneed) {
        this.flywaterneed = flywaterneed;
    }

    public String getFlyloss() {
        return flyloss;
    }

    public void setFlyloss(String flyloss) {
        this.flyloss = flyloss;
    }

    public String getFly28dactivity() {
        return fly28dactivity;
    }

    public void setFly28dactivity(String fly28dactivity) {
        this.fly28dactivity = fly28dactivity;
    }

    public String getSlagpowdergrade() {
        return slagpowdergrade;
    }

    public void setSlagpowdergrade(String slagpowdergrade) {
        this.slagpowdergrade = slagpowdergrade;
    }

    public String getSlag28dactivity() {
        return slag28dactivity;
    }

    public void setSlag28dactivity(String slag28dactivity) {
        this.slag28dactivity = slag28dactivity;
    }

    public String getSlagmanufacturer() {
        return slagmanufacturer;
    }

    public void setSlagmanufacturer(String slagmanufacturer) {
        this.slagmanufacturer = slagmanufacturer;
    }

    public String getSlagfineness() {
        return slagfineness;
    }

    public void setSlagfineness(String slagfineness) {
        this.slagfineness = slagfineness;
    }

    public String getLimestonefineness() {
        return limestonefineness;
    }

    public void setLimestonefineness(String limestonefineness) {
        this.limestonefineness = limestonefineness;
    }

    public String getLimestonebluevalue() {
        return limestonebluevalue;
    }

    public void setLimestonebluevalue(String limestonebluevalue) {
        this.limestonebluevalue = limestonebluevalue;
    }

    public String getLimestone28dactivity() {
        return limestone28dactivity;
    }

    public void setLimestone28dactivity(String limestone28dactivity) {
        this.limestone28dactivity = limestone28dactivity;
    }

    public String getExpansionmodel() {
        return expansionmodel;
    }

    public void setExpansionmodel(String expansionmodel) {
        this.expansionmodel = expansionmodel;
    }

    public String getExpansion28d() {
        return expansion28d;
    }

    public void setExpansion28d(String expansion28d) {
        this.expansion28d = expansion28d;
    }

    public String getExpansionlimit() {
        return expansionlimit;
    }

    public void setExpansionlimit(String expansionlimit) {
        this.expansionlimit = expansionlimit;
    }

    public String getOthermaterialname() {
        return othermaterialname;
    }

    public void setOthermaterialname(String othermaterialname) {
        this.othermaterialname = othermaterialname;
    }

    public String getOthermaterialmodel() {
        return othermaterialmodel;
    }

    public void setOthermaterialmodel(String othermaterialmodel) {
        this.othermaterialmodel = othermaterialmodel;
    }

    public String getOthermaterialconsumption() {
        return othermaterialconsumption;
    }

    public void setOthermaterialconsumption(String othermaterialconsumption) {
        this.othermaterialconsumption = othermaterialconsumption;
    }

    @Override
    public String toString() {
        return "Design_record{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", time=" + time +
                ", period='" + period + '\'' +
                ", concretevariety='" + concretevariety + '\'' +
                ", powerlevel='" + powerlevel + '\'' +
                ", impermerating='" + impermerating + '\'' +
                ", materialrequirements='" + materialrequirements + '\'' +
                ", limitexpansionrate='" + limitexpansionrate + '\'' +
                ", slump='" + slump + '\'' +
                ", expansion='" + expansion + '\'' +
                ", durrequirements='" + durrequirements + '\'' +
                ", otherrequirements='" + otherrequirements + '\'' +
                ", cementgrade='" + cementgrade + '\'' +
                ", cementcompress28d='" + cementcompress28d + '\'' +
                ", cementmanufacturer='" + cementmanufacturer + '\'' +
                ", fineaggregate1variety='" + fineaggregate1variety + '\'' +
                ", fineaggregate1model='" + fineaggregate1model + '\'' +
                ", fineaggregate1fm='" + fineaggregate1fm + '\'' +
                ", fineaggregate2variety='" + fineaggregate2variety + '\'' +
                ", fineaggregate2model='" + fineaggregate2model + '\'' +
                ", fineaggregate2fm='" + fineaggregate2fm + '\'' +
                ", fineaggregate3variety='" + fineaggregate3variety + '\'' +
                ", fineaggregate3model='" + fineaggregate3model + '\'' +
                ", fineaggregate3fm='" + fineaggregate3fm + '\'' +
                ", coarseaggregate1variety='" + coarseaggregate1variety + '\'' +
                ", coarseaggregate1model='" + coarseaggregate1model + '\'' +
                ", coarseaggregate2variety='" + coarseaggregate2variety + '\'' +
                ", coarseaggregate2model='" + coarseaggregate2model + '\'' +
                ", coarseaggregate3variety='" + coarseaggregate3variety + '\'' +
                ", coarseaggregate3model='" + coarseaggregate3model + '\'' +
                ", reducewaterlevel='" + reducewaterlevel + '\'' +
                ", reducerecommendamount='" + reducerecommendamount + '\'' +
                ", reducewaterrate='" + reducewaterrate + '\'' +
                ", reducegascontent='" + reducegascontent + '\'' +
                ", reducecompress28d='" + reducecompress28d + '\'' +
                ", reducebleedratio='" + reducebleedratio + '\'' +
                ", flyashcategory='" + flyashcategory + '\'' +
                ", flyashgrade='" + flyashgrade + '\'' +
                ", flyfineness='" + flyfineness + '\'' +
                ", flywaterneed='" + flywaterneed + '\'' +
                ", flyloss='" + flyloss + '\'' +
                ", fly28dactivity='" + fly28dactivity + '\'' +
                ", slagpowdergrade='" + slagpowdergrade + '\'' +
                ", slag28dactivity='" + slag28dactivity + '\'' +
                ", slagmanufacturer='" + slagmanufacturer + '\'' +
                ", slagfineness='" + slagfineness + '\'' +
                ", limestonefineness='" + limestonefineness + '\'' +
                ", limestonebluevalue='" + limestonebluevalue + '\'' +
                ", limestone28dactivity='" + limestone28dactivity + '\'' +
                ", expansionmodel='" + expansionmodel + '\'' +
                ", expansion28d='" + expansion28d + '\'' +
                ", expansionlimit='" + expansionlimit + '\'' +
                ", othermaterialname='" + othermaterialname + '\'' +
                ", othermaterialmodel='" + othermaterialmodel + '\'' +
                ", othermaterialconsumption='" + othermaterialconsumption + '\'' +
                '}';
    }
}
