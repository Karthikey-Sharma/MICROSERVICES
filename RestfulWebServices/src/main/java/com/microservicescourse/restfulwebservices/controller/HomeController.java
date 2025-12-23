package com.microservicescourse.restfulwebservices.controller;

import com.microservicescourse.restfulwebservices.model.User;
import org.springframework.web.bind.annotation.*;

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

    // Using Path variable
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id , @PathVariable("id2") String name){
        return "The path variable is :- " + id + " " + name;
    }

    //using request Parameterg - these are generally non mandatory = false
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name , @RequestParam(name = "email" , required = false ,defaultValue = "") String emailId){
        return "Your name is :- " + name + " and email id is :- "+ emailId;
    }


}
