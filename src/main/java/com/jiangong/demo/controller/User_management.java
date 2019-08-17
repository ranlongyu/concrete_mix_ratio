package com.jiangong.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User_management {

    //系统设置
    @GetMapping("/user/list")
    public String page7() {
        return "user_management/user_list";
    }
}
