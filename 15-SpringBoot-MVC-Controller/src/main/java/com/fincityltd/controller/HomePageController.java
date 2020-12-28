package com.fincityltd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePageController {

    @RequestMapping
    public String getRequestMapping1(){
     return "homePage";
    }

    @GetMapping("/home")
    public String getMapping1(){
        return "homePage";
    }

    @PostMapping("/main")
    public String postMapping1(){
        return "homePage";
    }

    @GetMapping("/home/{name}")
    public String getMapping2 (@PathVariable("name") String name){

        System.out.println("Path variable name is: " + name);
        return "homePage";
    }

    @GetMapping("/home/{name}/{surname}")
    public String getMapping3 (@PathVariable("name") String name, @PathVariable("surname") String surname){

        System.out.println("Path variable name is: " + name);
        System.out.println("Path variable surname is: " + surname);
        return "homePage";
    }

    @GetMapping("/home/course")
    public String getMapping4(@RequestParam("course") String course){
        System.out.println("Request param is: " + course);
        return "homePage";
    }

    @GetMapping("/course")
    public String getMapping5(@RequestParam(value = "name", required = false, defaultValue = "FinCity") String name){
        System.out.println("Request param is: " + name);
        return "homePage";
    }


}
