package com.fincityltd.controller;

import com.fincityltd.model.Student;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage1(Model model){
        System.out.println("#### Student page homePage1 is executed ####");
        String subject = "Streams";
        model.addAttribute("name","Software Testing");
        model.addAttribute("course","selenium");
        model.addAttribute("language","java");
        model.addAttribute("subject",subject);

        int studentId = new Random().nextInt(10000);
        model.addAttribute("id",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);
        numbers.add(5);
        model.addAttribute("numbers", numbers);

        Student student = new Student(101,"Mitchel", "Smith");
        model.addAttribute("student", student);
        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(Model model){
        System.out.println("#### Student page homePage2 is executed ####");

        return "student/register";
    }

}
