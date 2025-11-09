package com.firstapp.example.spring_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/demo/apis")

public class DemoController {

    @GetMapping("demo1")
    public String getDemo1(){
        return "This is demo1 API";
    }

    @GetMapping("demo2")
    public String getDemo2(){
        return "This is demo2 API";
    }


}
