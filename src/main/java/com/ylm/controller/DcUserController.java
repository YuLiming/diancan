package com.ylm.controller;

import com.ylm.service.DcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DcUserController {
    @Autowired
    private DcUserService dcUserService;

    @RequestMapping("/getUsers")
    public String getUsers(Model model){
        model.addAttribute("users",dcUserService.selectByExample(null));
        return "index";
    }

}
