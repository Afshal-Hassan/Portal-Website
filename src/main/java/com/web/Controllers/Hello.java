package com.web.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@Controller
public class Hello {

    @RequestMapping("/index")
    public String index(){
        System.out.println("Called");
        return "index";
    }

    @RequestMapping ("/login")
    public String hello(){

        return "Login";
    }










}
