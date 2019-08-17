package com.jiangong.demo.controller;

import com.jiangong.demo.repository.Construction_mix_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @Autowired
    private Construction_mix_Repository Con_R;

    //主页
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    //显示登录信息
    @GetMapping("/welcome")
    public String welcome() {
        return "home/welcome";
    }
}
