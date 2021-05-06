package com.just.ekao.sys.pub.controller;

import com.just.ekao.sys.pub.service.TDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class PageController {
    @Autowired
    private TDepartmentService depService;
    @RequestMapping("/{value}")
    public String genMapping(@PathVariable String value){
        return value;
    }
    @RequestMapping("/mainMenu")
    public String toMain(HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        String pwd = (String)session.getAttribute("pwd");
        if(username==""||username==null||pwd==""||pwd==null){
            return "login";
        }
        System.out.println(depService.findAll());
        session.setAttribute("depList",depService.findAll());
        model.addAttribute("user",username);
        return "mainMenu";
    }
    @RequestMapping("/doEmpQuery")
    public String toEmpDetail(){
        return "empDetail";
    }
}
