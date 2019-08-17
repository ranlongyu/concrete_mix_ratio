package com.jiangong.demo.entity.database;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "选项")
public class Choose {

    @Id
    @Field("_id")
    private String id;

    @Field("强度等级")
    private List<String> powerlevel;

    @Field("抗渗等级")
    private List<String> impermerating;

    @Field("材料要求")
    private List<String> materialrequirements;

    @Field("限制膨胀率")
    private List<String> limitexpansion;

    @Field("坍落度")
    private List<String> slump;

    @Field("扩展度")
    private List<String> expansion;

    @Field("test")
    private String test;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(List<String> powerlevel) {
        this.powerlevel = powerlevel;
    }

    public List<String> getImpermerating() {
        return impermerating;
    }

    public void setImpermerating(List<String> impermerating) {
        this.impermerating = impermerating;
    }

    public List<String> getMaterialrequirements() {
        return materialrequirements;
    }

    public void setMaterialrequirements(List<String> materialrequirements) {
        this.materialrequirements = materialrequirements;
    }

    public List<String> getLimitexpansion() {
        return limitexpansion;
    }

    public void setLimitexpansion(List<String> limitexpansion) {
        this.limitexpansion = limitexpansion;
    }

    public List<String> getSlump() {
        return slump;
    }

    public void setSlump(List<String> slump) {
        this.slump = slump;
    }

    public List<String> getExpansion() {
        return expansion;
    }

    public void setExpansion(List<String> expansion) {
        this.expansion = expansion;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
