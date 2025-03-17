package com.shreyansh.shreyansh_demo.controller;

import com.shreyansh.shreyansh_demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//adding annotations so that my class will behave as controller
//2nd annotation is to tell that this class will return a data in a response body

// instead of using both annotations we can use one this will tell class to behave like restful service controller
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello Shreyansh!";
    }

    @RequestMapping( value = "/user", method = RequestMethod.POST)
    public User getUserInstance(){
        User user = new User();
        user.setUsername("shanxTumHanTum");
        user.setId("98678");
        user.setEmailID("fghj@Fghj.jhg");
        return user;
    }
}
