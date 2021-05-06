package com.just.ekao.sys.pos.controller;

import com.just.ekao.sys.pos.pojo.TPosition;
import com.just.ekao.sys.pos.service.TPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("pos")
public class TPositionController {
    @Autowired
    private TPositionService service;
    @RequestMapping("/getPosList")
    @ResponseBody
    public List<TPosition> getPosByDepId(@RequestParam("depId") String depId){
        return service.findByDepId(depId);
    }

}
