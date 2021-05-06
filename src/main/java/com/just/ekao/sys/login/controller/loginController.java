package com.just.ekao.sys.login.controller;

import com.just.ekao.sys.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class loginController {
    @Autowired
    private UserService service;
    @RequestMapping("doLogin")
    @ResponseBody
    public String doLogin(@RequestParam("username") String username,@RequestParam("pwd") String pwd,HttpServletRequest request){
        System.out.println("user:"+username+"pwd:"+pwd);
        if(service.isUser(username,pwd)){
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10*20);
            session.setAttribute("username",username);
            session.setAttribute("pwd",pwd);
            return "1";
        }
        else return "0";

    }

}

