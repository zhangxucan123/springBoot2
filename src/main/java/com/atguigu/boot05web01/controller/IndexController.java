package com.atguigu.boot05web01.controller;

import com.atguigu.boot05web01.Bean.City;
import com.atguigu.boot05web01.Bean.Friend;
import com.atguigu.boot05web01.Bean.User;
import com.atguigu.boot05web01.service.CityService;
import com.atguigu.boot05web01.service.FriendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    FriendService friendService;

    @Autowired
    CityService cityService;

    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
        return cityService.getById(id);
    }

    @ResponseBody
    @GetMapping("/friend/{id}")
    public Friend getFriendById(@PathVariable("id") Integer id){
        return friendService.getFriendById(id);
    }



    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String index(User user, HttpSession session, Model model){
        if (StringUtils.hasText(user.getUserName())&&StringUtils.hasText(user.getPassword())){
            session.setAttribute("loginUser",user);
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
        return "redirect:/main.html";
    }

    @GetMapping("/main.html")
    public String mainPage(){
        return "main";
    }

    @ResponseBody
    @GetMapping("/sql")
    public String sql(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_friend", Long.class);
        return aLong.toString();
    }
}
