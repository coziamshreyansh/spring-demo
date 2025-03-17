package com.shreyansh.shreyansh_demo.controller;

import com.shreyansh.shreyansh_demo.model.User;
import org.springframework.web.bind.annotation.*;

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

//    using route parameters
    @PostMapping("/user/{id1}/{id2}")
    public String getPathVariables(@PathVariable String id1, @PathVariable("id2") String name){
        // here we explicitly mapped name with id2
        return "Path variables were: "+id1+" & "+name;
    }
}