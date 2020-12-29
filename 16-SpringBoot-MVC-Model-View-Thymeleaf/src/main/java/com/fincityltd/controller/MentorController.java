package com.fincityltd.controller;

import com.fincityltd.enums.Gender;
import com.fincityltd.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model) {
        System.out.println("#### Mentor page showTable is executed ####");

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Dave","Corney", Gender.MALE, 34));
        mentorList.add(new Mentor("Mariah","Philips", Gender.FEMALE, 47));
        mentorList.add(new Mentor("Antony","Williams", Gender.MALE, 23));

        model.addAttribute("mentors", mentorList);
        return "mentor/mentor-list";
    }
}
