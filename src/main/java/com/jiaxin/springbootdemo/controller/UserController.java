package com.jiaxin.springbootdemo.controller;

import com.jiaxin.springbootdemo.po.User;
import com.jiaxin.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String findall(Model model){
        model.addAttribute("users",userService.findAll());
        return "index";
    }
}
