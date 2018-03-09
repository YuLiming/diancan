package com.ylm.controller;


import com.ylm.service.AdminService;
import com.ylm.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DcLoginController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping(value = "/loginSubmit",method = RequestMethod.POST)
    public String loginSubmit(@RequestParam(value = "name",required = false) String name,@RequestParam(value = "password",required = false) String password){
        int result = adminService.login(name,password);
        if (result== AdminServiceImpl.LOGIN_SUCCESS){
            return "index";
        }else {
            return "redirect:/getUsers";
        }
    }



}
