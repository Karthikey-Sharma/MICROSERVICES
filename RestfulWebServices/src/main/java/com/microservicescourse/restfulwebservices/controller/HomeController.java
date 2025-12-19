package com.microservicescourse.restfulwebservices.controller;

import com.microservicescourse.restfulwebservices.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @RequestMapping("/")
    public String Home(){return "Hello World!";}

//    @RequestMapping("/user" , method = RequestMethod.GET)
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Karthikey");
        user.setEmailId("karthikey@gmail.com");
        return user;
    }



}
