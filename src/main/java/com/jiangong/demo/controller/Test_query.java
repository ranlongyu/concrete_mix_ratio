package com.jiangong.demo.controller;

import com.jiangong.demo.VO.RecordingVO;
import com.jiangong.demo.entity.Rating_item;
import com.jiangong.demo.entity.database.Construction_mix;
import com.jiangong.demo.entity.database.Scoring_rules;
import com.jiangong.demo.repository.Construction_mix_Repository;
import com.jiangong.demo.repository.Scoring_rules_Repository;
import com.jiangong.demo.service.Match_query_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test_query {

    @Autowired
    private Construction_mix_Repository Con_R;

    //service注入
    @Autowired
    private Match_query_service match_queryService;

    @Autowired
    private Scoring_rules_Repository Sco_R;

    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "/con_query")
    public Construction_mix constructionFind(){
        List<Construction_mix> lists = Con_R.findByConcretevarietyAndStrengthlevel1AndImpermeabilityrating
                ("抗渗混凝土","C40","P8");
        return lists.get(0);
    }

    @GetMapping(value = "/consql_query")
    public List<Construction_mix> sqlFind(){
        //return Con_R.findBySampleid();
        List<String> list = new ArrayList<>();
        list.add("常规混凝土");
        list.add("抗渗混凝土");

        String[] yu=new String[]{"常规混凝土","抗渗混凝土"};
        //return Con_R.findByIdIn(list);
        return Con_R.getVarietys(yu,"C30","P8");
    }

    @GetMapping(value = "/scoring")
    public Scoring_rules scoring_rules(){
        Scoring_rules scoring_rules = Sco_R.findOne(1);
        //System.out.println(scoring_rules.toString());
        System.out.println(scoring_rules.getWorkperformance()/2);
        return Sco_R.findOne(1);
    }

}
