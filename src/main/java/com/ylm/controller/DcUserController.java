package com.ylm.controller;

import com.ylm.pojo.DcUser;
import com.ylm.service.DcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DcUserController {
    @Autowired
    private DcUserService dcUserService;

    @RequestMapping("/getUsers")
    public String getUsers(Model model){
        model.addAttribute("users",dcUserService.selectByExample(null));
        return "getUser";
    }

    @RequestMapping("/selectUser")
    public String selectUser(Model model, @RequestParam(value = "id",required = false,defaultValue = "1")String id ){
        model.addAttribute("user",dcUserService.selectByPrimaryKey(id));
        return "selectUser";
    }

    @RequestMapping("/editUserSubmit")
    public String editUserSubmit(DcUser user){
        user.setAccumulatePoints(2);
        user.setBalance(3);
        user.setMemberLevel("adf");
        user.setUserIsDel(1);
        user.setUserPassword("123123");
        dcUserService.updateByPrimaryKey(user);
        System.out.println("edit:"+user.getUserName());
        return "redirect:getUsers";
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
