package com.fincityltd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentPageController {
        @GetMapping("/show")
        public String showForm(){
            System.out.println("#### Student page showForm is executed ####");
            return "studentPage";
        }
}
