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
    //---------*****Content********--------------
    @RequestMapping("/wlb_tips")
    public String WLB(){return"wlb_tips";}

    @RequestMapping("/wlb_time")
    public String wlb_time(){ return  "wlb_time"; }

    //-----------Object Orinted language --------------
    @RequestMapping("/obl_java")
    public String obl_java(){ return  "obl_java"; }
    @RequestMapping("/obl_python")
    public String obl_python(){ return  "obl_python"; }
    //-----------GitHub--------------
    @RequestMapping("/git_intro")
    public String git_intro(){ return  "git_intro"; }



    //------------MVC-------------
    @RequestMapping("/mvc_under")
    public String mvc_under(){return "mvc_under";}

    @RequestMapping("/mvc_springboot")
    public String mvc_springboot(){return "mvc_springboot";}


    //------------Exc-------------
    @RequestMapping("/ex_physical")
    public String ex_physical(){return "ex_physical";}

    @RequestMapping("/ex_mental")
    public String ex_mental(){return "ex_mental";}





    //------------end-------------------


}
