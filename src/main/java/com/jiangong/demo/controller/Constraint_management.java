package com.jiangong.demo.controller;

import com.jiangong.demo.entity.database.Choose;
import com.jiangong.demo.entity.database.Constraint_rules;
import com.jiangong.demo.repository.Choose_Repository;
import com.jiangong.demo.repository.Constraint_rules_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Constraint_management {

    @Autowired
    Constraint_rules_Repository Con_R;

    @Autowired
    Choose_Repository Cho_R;

    //约束规则管理
    @GetMapping("/rule/list")
    public String page6(Model model) {
        List<Constraint_rules> constraint_rules = Con_R.findAll();
        model.addAttribute("constraint_rules",constraint_rules);
        return "constraint_management/rule_list";
    }

    //转到添加规则页面
    @GetMapping("/rule/add")
    public String toAddPage(Model model){
        return "constraint_management/rule_add";
    }

    //添加规则
    @PostMapping("/rule/add")
    public String rule_add(Constraint_rules constraint_rules){
        Con_R.save(constraint_rules);
        return "redirect:/rule/list";
    }

    //来到修改页面，查出当前规则，在页面回显
    @GetMapping("/rule/edit/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Constraint_rules constraint_rules = Con_R.findOne(id);
        model.addAttribute("rule",constraint_rules);
        //回到修改页面(add是一个修改添加二合一的页面);
        return "constraint_management/rule_add";
    }

    //规则修改；需要提交规则id；
    @PutMapping("/rule/add")
    public String updateRule(Constraint_rules constraint_rules){
        Con_R.save(constraint_rules);
        return "redirect:/rule/list";
    }

    //规则删除
    @DeleteMapping("/rule/delete/{id}")
    public String deleteRule(@PathVariable("id") String _id){

        String[] arr = _id.split(",");
        for (String id:arr
        ) {
            Con_R.delete(Integer.parseInt(id));
        }
        return "redirect:/rule/list";
    }

    //测试
    @ResponseBody
    @GetMapping("/rule/chooses")
    public List<Choose> page6() {
        List<Choose> chooses = Cho_R.findAll();
        return chooses;
    }
}
