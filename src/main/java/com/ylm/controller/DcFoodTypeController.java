package com.ylm.controller;

import com.ylm.mapper.DcFoodtypeMapper;
import com.ylm.pojo.DcFoodtype;
import com.ylm.service.DcFoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DcFoodTypeController {

    @Autowired
    DcFoodTypeService dcFoodTypeService;

    @RequestMapping("/getFoodTypes")
    public String getFoodTypes(Model model){
        model.addAttribute("foodTypes",dcFoodTypeService.selectByExample(null));
        return "getFoodTypes";
    }

    @RequestMapping("/selectFoodType")
    public String selectFoodType(Model model, @RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        model.addAttribute("type",dcFoodTypeService.selectByPrimaryKey(id));
        return "selectFoodType";
    }

    @RequestMapping("/editFoodTypeSubmit")
    public String editFoodSubmit(DcFoodtype type){
        dcFoodTypeService.updateByPrimaryKey(type);
        return "redirect:getFoodTypes";
    }

    @RequestMapping("deleteFoodType")
    public String deleteFoodType(Model model,@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
        dcFoodTypeService.deleteByPrimaryKey(id);
        return "redirect:getFoodTypes";
    }

    @RequestMapping("/addFoodType")
    public String addFoodType(Model model){
        model.addAttribute("type",null);
        return "addFoodType";
    }

    @RequestMapping("/newFoodTypeSubmit")
    public String newFoodTypeSubmit(DcFoodtype dcFood){
        dcFoodTypeService.insert(dcFood);
        return "redirect:getFoodTypes";
    }

}
