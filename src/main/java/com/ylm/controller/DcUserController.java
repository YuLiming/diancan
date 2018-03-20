package com.ylm.controller;

import com.ylm.common.BaseResult;
import com.ylm.common.InfoConstant;
import com.ylm.pojo.DcUser;
import com.ylm.service.DcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class DcUserController {
    @Autowired
    private DcUserService dcUserService;

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<DcUser> getUsers(){
        List<DcUser> result = new ArrayList<DcUser>();
        try {
            List<DcUser> users = dcUserService.selectByExample(null);
            for (DcUser user : users){
                if (user.getUserIsDel()==0){
                    result.add(user);
                }
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/selectUser")
    @ResponseBody
    public Object selectUser(@RequestParam(value = "id",required = false,defaultValue = "1")String id ){
        DcUser user = null;
        try {
            user = dcUserService.selectByPrimaryKey(id);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return user;
    }

    @RequestMapping("/editUserSubmit")
    @ResponseBody
    public Object editUserSubmit(DcUser user){
        try {
            user.setUserIsDel(0);
            return dcUserService.updateByPrimaryKey(user)>0?
                    new BaseResult(true,"修改会员信息成功"):
                    new BaseResult(false,"修改会员信息失败");
        }catch (Throwable throwable){
            return new BaseResult(true,InfoConstant.USERTHROWABLE);
        }
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public Object deleteUser(@RequestParam(value = "id",required = false,defaultValue = "1") String id){
        try {
            return dcUserService.deleteByPrimaryKey(id)>0?
                    new BaseResult(true,"删除用户成功"):
                    new BaseResult(false,"删除用户失败");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.USERTHROWABLE);
        }

    }

    @RequestMapping("/newUserSubmit")
    @ResponseBody
    public Object newUserSubmit(DcUser user){
        try {
            String uuid = UUID.randomUUID().toString().replace("-", "");
            user.setUserId(uuid);
            user.setUserIsDel(0);
            return dcUserService.insert(user)>0?
                    new BaseResult(true,"新增用户成功"):
                    new BaseResult(false,"新增用户失败");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.USERTHROWABLE);
        }
    }

    @RequestMapping("/deleteUsers")
    @ResponseBody
    public Object deleteUsers(@RequestParam("id[]") List<Integer> id){
        try {
            return dcUserService.deleteByPrimaryKeys(id)>0?
                    new BaseResult(true,"批量删除用户成功"):
                    new BaseResult(false,"批量删除用户失败");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false, InfoConstant.USERTHROWABLE);
        }

    }


}
