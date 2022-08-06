package com.atguigu.boot05web01.controller;

import com.atguigu.boot05web01.Bean.User;
import com.atguigu.boot05web01.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @Autowired
    UserService userService;
    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }

    @RequestMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){
//        List<User> users = Arrays.asList(new User("zhangshan", "123"),
//                new User("huhu", "123"),
//                new User("aa", "123"),
//                new User("ssss", "123"));
//        model.addAttribute("users",users);
        List<User> list = userService.list();
//        model.addAttribute("users",list);
        Page<User> userPage = new Page<>(pn, 2);
        Page<User> page = userService.page(userPage, null);
        model.addAttribute("page",page);
        return "table/dynamic_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
