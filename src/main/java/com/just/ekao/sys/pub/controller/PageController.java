package com.just.ekao.sys.pub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/showMain")
    public String toMainMenu(){
        return "mainMenu";
    }
}
