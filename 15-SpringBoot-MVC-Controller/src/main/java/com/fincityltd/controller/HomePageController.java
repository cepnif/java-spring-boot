package com.fincityltd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping
    public String getRequestMapping1(){
     return "homePage";
    }

    @RequestMapping("/home")
    public String getRequestMapping2(){
        return "homePage";
    }

    @RequestMapping("/main")
    public String getRequestMapping3(){
        return "homePage";
    }
}
