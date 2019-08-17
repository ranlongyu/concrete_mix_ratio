package com.jiangong.demo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiangong.demo.entity.database.Choose;
import com.jiangong.demo.entity.database.Constraint_rules;
import com.jiangong.demo.entity.database.Scoring_rules;

import java.util.List;

public class Design_addVO {

    @JsonProperty("choose")
    private Choose choose;

    @JsonProperty("constraint_rules")
    private List<Constraint_rules> constraint_rules;

    @JsonProperty("scoring_rules")
    private List<Scoring_rules> scoring_rules;

    public Choose getChoose() {
        return choose;
    }

    public void setChoose(Choose choose) {
        this.choose = choose;
    }

    public List<Constraint_rules> getConstraint_rules() {
        return constraint_rules;
    }

    public void setConstraint_rules(List<Constraint_rules> constraint_rules) {
        this.constraint_rules = constraint_rules;
    }

    public List<Scoring_rules> getScoring_rules() {
        return scoring_rules;
    }

    public void setScoring_rules(List<Scoring_rules> scoring_rules) {
        this.scoring_rules = scoring_rules;
    }
}
