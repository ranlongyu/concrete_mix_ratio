package com.jiangong.demo.controller;

import com.jiangong.demo.entity.database.Scoring_rules;
import com.jiangong.demo.repository.Scoring_rules_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 评分规则管理的控制器
 * */
@Controller
public class Scoring_management {

    @Autowired
    private Scoring_rules_Repository Sco_R;

    //评分显示，传给前端所有的评分规则
    @GetMapping("/score/list")
    public Object all_score(Model model){
        List<Scoring_rules> scoring_rules = Sco_R.findAll();
        model.addAttribute("scoring_rules", scoring_rules);
        return "scoring_management/score_list";
    }

    //转到添加评分页面
    @GetMapping("/score/add")
    public String toAddPage(Model model){
        return "scoring_management/score_add";
    }

    //评分添加
    @PostMapping("/score/add")
    public String add_score(Scoring_rules scoring_rule){
        Sco_R.save(scoring_rule);
        return "redirect:/score/list";
    }

    //来到修改页面，查出当前规则，在页面回显
    @GetMapping("/score/edit/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Scoring_rules scoring_rules = Sco_R.findOne(id);
        model.addAttribute("score",scoring_rules);
        //回到修改页面(add是一个修改添加二合一的页面);
        return "scoring_management/score_add";
    }

    //规则修改；需要提交规则id；
    @PutMapping("/score/add")
    public String updateRule(Scoring_rules scoring_rules){
        Sco_R.save(scoring_rules);
        return "redirect:/score/list";
    }

    //规则删除
    @DeleteMapping("/score/delete/{id}")
    public String deleteRule(@PathVariable("id") String _id){

        String[] arr = _id.split(",");
        for (String id:arr
        ) {
            Sco_R.delete(Integer.parseInt(id));
        }
        return "redirect:/score/list";
    }
}
