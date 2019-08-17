package com.jiangong.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Warehouse_management {

    //砼库管理
    @GetMapping("/warehouse/list")
    public String page4() {
        return "warehouse_management/warehouse_list";
    }

}
