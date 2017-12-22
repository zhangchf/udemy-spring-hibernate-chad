package com.zcf.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangchf on 22/12/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "home";
    }
}
