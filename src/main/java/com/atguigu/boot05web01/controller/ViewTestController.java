package com.atguigu.boot05web01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model){
        model.addAttribute("hello","world");
        return "success";
    }
}
