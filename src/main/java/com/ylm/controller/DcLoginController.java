package com.ylm.controller;


import com.ylm.common.BaseResult;
import com.ylm.common.InfoConstant;
import com.ylm.common.JWT;
import com.ylm.pojo.DcAdministrators;
import com.ylm.service.AdminService;
import com.ylm.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class DcLoginController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/loginSubmit",method = RequestMethod.POST)
    @ResponseBody
    public Object loginSubmit(@RequestParam(value = "name",required = false) String name, @RequestParam(value = "password",required = false) String password, HttpServletResponse response){
        try {
            int result = adminService.login(name,password);
            if (result== AdminServiceImpl.LOGIN_SUCCESS){
                DcAdministrators admin = adminService.selectByAccount(name);
                String id = JWT.sign(admin,60L* 1000L* 60L);
                return new BaseResult(true,"登陆成功",id);
            }else {
                return new BaseResult(false,"登陆失败");
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false, InfoConstant.ADMINTHROWABLE);
        }
    }


    @RequestMapping("/getAdmin")
    @ResponseBody
    public List<DcAdministrators> getAdmin(){
        List<DcAdministrators> result = new ArrayList<DcAdministrators>();
        try {
            List<DcAdministrators> administrators = adminService.selectByExample(null);
            for (DcAdministrators admin : administrators){
                if (admin.getAdminIsdel()==0){
                    result.add(admin);
                }
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }


    @RequestMapping("/selectAdmin")
    @ResponseBody
    public DcAdministrators selectAdmin(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        DcAdministrators admin = null;
        try {
            admin = adminService.selectByPrimaryKey(id);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return admin;
    }

    @RequestMapping("/editAdminSubmit")
    @ResponseBody
    public Object editAdminSubmit(DcAdministrators admin){
        try {
            admin.setAdminIsdel(0);
            return adminService.updateByPrimaryKey(admin)>0?
                    new BaseResult(true,"修改管理员信息成功"):
                    new BaseResult(false,"修改管理员信息失败");
        }catch (Throwable throwable){
            return new BaseResult(false,InfoConstant.ADMINTHROWABLE);
        }

    }

    @RequestMapping("/deleteAdmin")
    @ResponseBody
    public Object deleteAdmin(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id){
        try {
            return adminService.deleteByPrimaryKey(id)>0?
                    new BaseResult(true,"删除管理员成功"):
                    new BaseResult(false,"删除管理员失败");
        }catch (Throwable throwable){
            return new BaseResult(false,InfoConstant.ADMINTHROWABLE);
        }
    }


    @RequestMapping("/newAdminSubmit")
    @ResponseBody
    public Object newAdminSubmit(DcAdministrators admin){
        try {
            admin.setAdminIsdel(0);
            return adminService.insert(admin)>0?
                    new BaseResult(true,"新增管理员成功"):
                    new BaseResult(false,"新增管理员失败");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.ADMINTHROWABLE);
        }
    }

    @RequestMapping("/deleteAdmins")
    @ResponseBody
    public Object deleteAdmins(@RequestParam("id[]") List<Integer> id){
        try {
            return adminService.deleteByPrimaryKeys(id)>0?
                    new BaseResult(true,"批量删除管理员成功"):
                    new BaseResult(false,"批量删除管理员失败");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.ADMINTHROWABLE);
        }

    }



}
