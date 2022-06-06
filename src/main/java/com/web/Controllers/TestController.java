package com.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {


    @RequestMapping("/")
    public String test(){
        return "New2";
    }


    @RequestMapping("/about")
    public String about(){
        return "aboutus";
    }

    @RequestMapping("/dashboard")
    public String dashboard(){
        return "SideBar";
    }
}
