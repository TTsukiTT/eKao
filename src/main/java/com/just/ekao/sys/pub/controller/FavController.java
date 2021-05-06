package com.just.ekao.sys.pub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class FavController {
 @GetMapping("favicon.ico")
        @ResponseBody
        void returnNoFavicon() {

    }
}
