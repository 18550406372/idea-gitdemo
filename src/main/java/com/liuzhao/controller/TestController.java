package com.liuzhao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("info")
    public String info(){
        return "hello gitdemo 项目经理";
    }
    //开发人员zzzzz
}
