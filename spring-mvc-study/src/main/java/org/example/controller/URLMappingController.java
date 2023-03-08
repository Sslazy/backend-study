package org.example.controller;

import org.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/um")
public class URLMappingController {
//    @GetMapping("/g")

    @RequestMapping(value = "/g",method = RequestMethod.GET)
    @ResponseBody
    public String getMapping(String name){
        System.out.println("name:" + name);
        return "This is get method";
    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping(String username,String password){
        System.out.println(username + ":" + password);
        return "This is post method";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping(User user){
        System.out.println(user.getName() + ":" + user.getPassword());
        return user.toString();
    }
}
