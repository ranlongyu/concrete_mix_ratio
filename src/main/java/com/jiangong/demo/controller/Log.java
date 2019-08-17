package com.jiangong.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Log {

    @GetMapping("/login")
    public String login(){
        return "log/login";
    }

}
