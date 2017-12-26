package com.zcf.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangchf on 26/12/2017.
 */
@Controller
public class SillyController {

    @RequestMapping("helloWorldForm")
    public String displayForm() {
        return "silly";
    }
}
