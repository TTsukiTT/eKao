package com.just.ekao.sys.pub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/showMain")
    public String toMainMenu(Model model){
        model.addAttribute("user","Kerwin Zach");
        return "mainMenu";
    }
    @RequestMapping("/{value}")
    public String genMapping(@PathVariable String value){
        return value;
    }
    @RequestMapping("/doEmpQuery")
    public String toEmpDetail(){
        return "empDetail";
    }
}
