package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){return "homePage";}
    @RequestMapping("/bootcamp")
    public String bootCamp(){return "bootcamp";}
    @RequestMapping("/profile")
    public String profile(){return "profile";}
}
