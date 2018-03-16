package com.ylm.controller;

import com.ylm.common.BaseResult;
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
        List<DcUser> users = dcUserService.selectByExample(null);
        for (DcUser user : users){
            if (user.getUserIsDel()==0){
                result.add(user);
            }
        }
        return result;
    }

    @RequestMapping("/selectUser")
    @ResponseBody
    public Object selectUser(@RequestParam(value = "id",required = false,defaultValue = "1")String id ){
        return dcUserService.selectByPrimaryKey(id);
    }

    @RequestMapping("/editUserSubmit")
    @ResponseBody
    public Object editUserSubmit(DcUser user){
        user.setUserIsDel(0);
        return dcUserService.updateByPrimaryKey(user)>0?
                new BaseResult(true,"修改会员信息成功"):
                new BaseResult(false,"修改会员信息失败");
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public Object deleteUser(@RequestParam(value = "id",required = false,defaultValue = "1") String id){
        return dcUserService.deleteByPrimaryKey(id)>0?
                new BaseResult(true,"删除用户成功"):
                new BaseResult(false,"删除用户失败");
    }

    @RequestMapping("/newUserSubmit")
    @ResponseBody
    public Object newUserSubmit(DcUser user){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        user.setUserId(uuid);
        user.setUserIsDel(0);
        return dcUserService.insert(user)>0?
                new BaseResult(true,"新增用户成功"):
                new BaseResult(false,"新增用户失败");
    }

    @RequestMapping("/deleteUsers")
    @ResponseBody
    public Object deleteUsers(@RequestParam("id[]") List<Integer> id){
        return dcUserService.deleteByPrimaryKeys(id)>0?
                new BaseResult(true,"批量删除用户成功"):
                new BaseResult(false,"批量删除用户失败");
    }

//    @RequestMapping(value = "/editItems",method = RequestMethod.GET)
//    public void editItems(HttpServletRequest request, HttpServletResponse response) throws Exception
//    {
//        //调用service查询商品的信息
//        ItemsCustom itemsCustom=itemsService.findItemsById(id);
//        request.setAttribute("item",itemsCustom);
//        //注意如果使用request转向页面，这里需要指定页面的完整路径
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("application/json;charset=utf-8");
//        response.getWriter().write("json串");
//        request.getRequestDispatcher("/WEB-INF/jsp/editItem.jsp").forward(request,response);
//    }


}
