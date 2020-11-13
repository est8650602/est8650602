package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import model.Student;

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        Student temp=new Student();
        temp.setStudentId("1");
        temp.setName("John");
        temp.setAddress("Tainan");
        return new ModelAndView("jqstudent", "command", temp);
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("address", student.getAddress());
        model.addAttribute("studentId", student.getStudentId());

        return "result";
    }
}


