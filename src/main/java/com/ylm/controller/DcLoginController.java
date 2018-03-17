package com.ylm.controller;


import com.ylm.common.BaseResult;
import com.ylm.pojo.DcAdministrators;
import com.ylm.service.AdminService;
import com.ylm.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@SessionAttributes(value = {"name","password"},types = {String.class,String.class})
public class DcLoginController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/loginSubmit",method = RequestMethod.POST)
    @ResponseBody
    public Object loginSubmit(@RequestParam(value = "name",required = false) String name,@RequestParam(value = "password",required = false) String password){
        System.out.print(name+password);
        int result = adminService.login(name,password);
        if (result== AdminServiceImpl.LOGIN_SUCCESS){
            return new BaseResult(true,"登陆成功");
        }else {
            return new BaseResult(false,"登陆失败");
        }
    }


    @RequestMapping("/getAdmin")
    @ResponseBody
    public List<DcAdministrators> getAdmin(){
        List<DcAdministrators> result = new ArrayList<DcAdministrators>();
        List<DcAdministrators> administrators = adminService.selectByExample(null);
        for (DcAdministrators admin : administrators){
            if (admin.getAdminIsdel()==0){
                result.add(admin);
            }
        }
        return result;
    }
//
//    @RequestMapping("/session/attributes/test")
//    @ResponseBody
//    public String sessionAttributesage(HttpSession session){
//        String name = (String) session.getAttribute("name");
//        return name;
//    }

    @RequestMapping("/selectAdmin")
    @ResponseBody
    public Object selectAdmin(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        return adminService.selectByPrimaryKey(id);
    }

    @RequestMapping("/editAdminSubmit")
    @ResponseBody
    public Object editAdminSubmit(DcAdministrators admin){
        admin.setAdminIsdel(0);
        return adminService.updateByPrimaryKey(admin)>0?
                new BaseResult(true,"修改管理员信息成功"):
                new BaseResult(false,"修改管理员信息失败");
    }

    @RequestMapping("/deleteAdmin")
    @ResponseBody
    public Object deleteAdmin(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id){
        return adminService.deleteByPrimaryKey(id)>0?
                new BaseResult(true,"删除管理员成功"):
                new BaseResult(false,"删除管理员失败");
    }


    @RequestMapping("/newAdminSubmit")
    @ResponseBody
    public Object newAdminSubmit(DcAdministrators admin){
        admin.setAdminIsdel(0);
        return adminService.insert(admin)>0?
                new BaseResult(true,"新增管理员成功"):
                new BaseResult(false,"新增管理员失败");
    }

    @RequestMapping("/deleteAdmins")
    @ResponseBody
    public Object deleteAdmins(@RequestParam("id[]") List<Integer> id){
        return adminService.deleteByPrimaryKeys(id)>0?
                new BaseResult(true,"批量删除管理员成功"):
                new BaseResult(false,"批量删除管理员失败");
    }



}
