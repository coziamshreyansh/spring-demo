package com.shreyansh.shreyansh_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//adding annotations so that my class will behave as controller
//2nd annotation is to tell that this class will return a data in a response body
@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello Shreyansh!";
    }
}
