package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello world你好世界";
    }
}
