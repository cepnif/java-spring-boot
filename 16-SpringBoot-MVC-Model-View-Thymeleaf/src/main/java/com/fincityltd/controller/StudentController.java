package com.fincityltd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){
        System.out.println("#### Student page homePage is executed ####");
        String subject = "Streams";
        model.addAttribute("name","Software Testing");
        model.addAttribute("course","selenium");
        model.addAttribute("language","java");
        model.addAttribute("subject",subject);

        int studentId = new Random().nextInt(10000);
        model.addAttribute("id",studentId);
        return "student/welcome";
    }
}
