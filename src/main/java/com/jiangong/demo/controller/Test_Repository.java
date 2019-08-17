package com.jiangong.demo.controller;

import com.jiangong.demo.entity.database.*;
import com.jiangong.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_Repository {
    @Autowired
    private Construction_mix_Repository Con_R;

    @Autowired
    private Admixture_Repository Adm_R;

    @Autowired
    private Cement_Repository Cem_R;

    @Autowired
    private Expansion_agent_Repository Exp_R;

    @Autowired
    private Fly_ash_Repository Fly_R;

    @Autowired
    private Limestone_powder_Repository Lim_R;

    @Autowired
    private Slag_powder_Repository Sla_R;

    @Autowired
    private Constraint_rules_Repository Cons_R;

    //http://localhost:8080/construction/1
    @GetMapping(value = "/construction/{id}")
    public Construction_mix constructionFindone(@PathVariable("id") Integer id){
        return Con_R.findOne(id);
    }

    //http://localhost:8080/admixture/12141800001
    @GetMapping(value = "/admixture/{id}")
    public Admixture admixtureFindone(@PathVariable("id") String id){
        return Adm_R.findOne(id);
    }

    //http://localhost:8080/expansion/12151800001
    @GetMapping(value = "/expansion/{id}")
    public Expansion_agent expansion_agentFindone(@PathVariable("id") String id){
        return Exp_R.findOne(id);
    }

    //http://localhost:8080/cement/12111800002
    @GetMapping(value = "/cement/{id}")
    public Cement cementFindone(@PathVariable("id") String id){
        return Cem_R.findOne(id);
    }

    //http://localhost:8080/fly/12171800001
    @GetMapping(value = "/fly/{id}")
    public Fly_ash flyFindone(@PathVariable("id") String id){
        return Fly_R.findOne(id);
    }

    //http://localhost:8080/limestone/12181800002
    @GetMapping(value = "/limestone/{id}")
    public Limestone_powder limestoneFindone(@PathVariable("id") String id){
        return Lim_R.findOne(id);
    }

    //http://localhost:8080/slag/41161800002
    @GetMapping(value = "/slag/{id}")
    public Slag_powder slagFindone(@PathVariable("id") String id){
        return Sla_R.findOne(id);
    }

    //http://localhost:8080/constraint/1
    @GetMapping(value = "/constraint/{id}")
    public Constraint_rules constraintFindone(@PathVariable("id") int id){
        return Cons_R.findOne(id);
    }

}
