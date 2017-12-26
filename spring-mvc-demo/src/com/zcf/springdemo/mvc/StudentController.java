package com.zcf.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by zhangchf on 26/12/2017.
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("showForm")
    public String showForm(Model theModel) {
        Student theStudent = new Student();
        theStudent.setFirstName("John");
        theStudent.setLastName("Doe");
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("propertyCountryOptions", countryOptions);
        return "student-form";
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        theStudent.setLastName(theStudent.getLastName().toUpperCase());
        return "student-confirmation";
    }
}
