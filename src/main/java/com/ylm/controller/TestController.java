package com.ylm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("test")
//    public String test(Model model){
//        return "main";
//    }
//    public String test(Model model){
//        return "navigate";
//    } 不知道是什么
//    public String test(Model model){
//        return "home";
//    }
    public String test(Model model){
        return "boards";
    }
//    public String test(Model model){
//        return "dd";
//    }
//    public String test(Model model){
//        return "main";
//    }



}
