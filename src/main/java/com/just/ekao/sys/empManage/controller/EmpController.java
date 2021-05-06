package com.just.ekao.sys.empManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("emp")
public class EmpController {
    @RequestMapping("/doEmpQry")
    @ResponseBody
    public String empQry(){
        return "[\n" +
                "   {\n" +
                "     \"id\":    \"001\",\n" +
                "     \"name\":  \"妮妮\",\n" +
                "     \"sex\":   \"女\",\n" +
                "     \"dep\":   \"HR部\",\n" +
                "     \"position\": \"HRBP\",\n" +
                "     \"city\": \"张家港\"\n" +
                "    },\n" +
                "  {\n" +
                "    \"id\":    \"002\",\n" +
                "    \"name\":  \"熊大\",\n" +
                "    \"sex\":   \"男\",\n" +
                "    \"dep\":   \"财务部\",\n" +
                "    \"position\": \"***\",\n" +
                "    \"city\": \"上海\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\":    \"003\",\n" +
                "    \"name\":  \"熊二\",\n" +
                "    \"sex\":   \"男\",\n" +
                "    \"dep\":   \"实习部\",\n" +
                "    \"position\": \"***\",\n" +
                "    \"city\": \"苏州\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\":    \"004\",\n" +
                "    \"name\":  \"妮妮\",\n" +
                "    \"sex\":   \"女\",\n" +
                "    \"dep\":   \"HR部\",\n" +
                "    \"position\": \"HRBP\",\n" +
                "    \"city\": \"张家港\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\":    \"005\",\n" +
                "    \"name\":  \"妮妮\",\n" +
                "    \"sex\":   \"女\",\n" +
                "    \"dep\":   \"HR部\",\n" +
                "    \"position\": \"HRBP\",\n" +
                "    \"city\": \"张家港\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\":    \"006\",\n" +
                "    \"name\":  \"妮妮\",\n" +
                "    \"sex\":   \"女\",\n" +
                "    \"dep\":   \"HR部\",\n" +
                "    \"position\": \"HRBP\",\n" +
                "    \"city\": \"张家港\"\n" +
                "  }\n" +
                "]";
    }
}
