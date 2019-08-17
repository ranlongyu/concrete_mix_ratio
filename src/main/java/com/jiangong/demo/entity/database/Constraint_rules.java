package com.jiangong.demo.entity.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "约束规则表")
public class Constraint_rules {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "被约束项")
    private String constraineditem;

    @Column(name = "被约束项值")
    private String constraineditemvalue;

    @Column(name = "依赖项")
    private String dependency;

    @Column(name = "依赖项值")
    private String dependencyvalue;

    @Column(name = "约束")
    private String constraint;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConstraineditem() {
        return constraineditem;
    }

    public void setConstraineditem(String constraineditem) {
        this.constraineditem = constraineditem;
    }

    public String getConstraineditemvalue() {
        return constraineditemvalue;
    }

    public void setConstraineditemvalue(String constraineditemvalue) {
        this.constraineditemvalue = constraineditemvalue;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public String getDependencyvalue() {
        return dependencyvalue;
    }

    public void setDependencyvalue(String dependencyvalue) {
        this.dependencyvalue = dependencyvalue;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    @Override
    public String toString() {
        return "Constraint_rules{" +
                "id=" + id +
                ", constraineditem='" + constraineditem + '\'' +
                ", constraineditemvalue='" + constraineditemvalue + '\'' +
                ", dependency='" + dependency + '\'' +
                ", dependencyvalue='" + dependencyvalue + '\'' +
                ", constraint='" + constraint + '\'' +
                '}';
    }
}
