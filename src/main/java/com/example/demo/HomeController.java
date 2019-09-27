package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){return "homePage";}
    //-----------Content--------------
    @RequestMapping("/wlb_tips")
    public String WLB(){return"wlb_tips";}

    @RequestMapping("/wlb_time")
    public String wlb_time(){ return  "wlb_time"; }

    //------------end-------------------
    @RequestMapping("/bootcamp")

    public String bootCamp(){return "bootcamp";}
    @RequestMapping("/profile")
    public String profile(){return "profile";}

}
