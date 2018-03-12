package com.ylm.controller;

import com.ylm.mapper.DcFoodMapper;
import com.ylm.pojo.DcBoard;
import com.ylm.pojo.DcFood;
import com.ylm.service.DcFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DcFoodController {

    @Autowired
    private DcFoodService dcFoodService;

    @RequestMapping("/getFoods")
    public String getFoods(Model model){
        model.addAttribute("foods",dcFoodService.selectByExample(null));
        return "getFoods";
    }

    @RequestMapping("/selectFood")
    public String selectFood(Model model, @RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        model.addAttribute("food",dcFoodService.selectByPrimaryKey(id));
        return "selectFood";
    }

    @RequestMapping("/editFoodSubmit")
    public String editFoodSubmit(DcFood food){
        dcFoodService.updateByPrimaryKey(food);
        return "redirect:getFoods";
    }

    @RequestMapping("deleteFood")
    public String deleteFood(Model model,@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
        dcFoodService.deleteByPrimaryKey(id);
        return "redirect:getFoods";
    }

    @RequestMapping("/addFood")
    public String addFood(Model model){
        return "addFood";
    }

    @RequestMapping("/newFoodSubmit")
    public String newFoodSubmit(DcFood dcFood){
        dcFoodService.insert(dcFood);
        return "redirect:getFoods";
    }
}
