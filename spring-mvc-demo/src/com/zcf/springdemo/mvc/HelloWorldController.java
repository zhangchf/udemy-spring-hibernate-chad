package com.zcf.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhangchf on 22/12/2017.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/helloWorldForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processHelloWorldForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processHelloWorldFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String message = "Yo! " + theName;
        model.addAttribute("message", message);
        return "helloworld";
    }

    @RequestMapping("/processHelloWorldFormV3")
    public String processFormV3(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();
        String message = "Yo! " + theName;
        model.addAttribute("message", message);
        return "helloworld";
    }
}
