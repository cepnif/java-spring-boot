package com.fincityltd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorPageController {
    @GetMapping("/show")
    public String showForm(){
        System.out.println("#### Mentor page showForm is executed ####");
        return "mentorPage";
    }
}
