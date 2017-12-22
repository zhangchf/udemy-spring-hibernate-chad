package com.zcf.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
