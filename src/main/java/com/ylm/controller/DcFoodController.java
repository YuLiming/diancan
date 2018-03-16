package com.ylm.controller;

import com.ylm.common.BaseResult;
import com.ylm.mapper.DcFoodMapper;
import com.ylm.pojo.DcBoard;
import com.ylm.pojo.DcFood;
import com.ylm.service.DcFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DcFoodController {

    @Autowired
    private DcFoodService dcFoodService;

    @RequestMapping("/getFoods")
    @ResponseBody
    public List<DcFood> getFoods(){
        List<DcFood> result = new ArrayList<DcFood>();
        List<DcFood> foods = dcFoodService.selectByExample(null);
        for (DcFood food : foods){
            if (food.getFoodIsdel()==0){
                result.add(food);
            }
        }
        return result;
    }

    @RequestMapping("/selectFood")
    @ResponseBody
    public DcFood selectFood(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        return dcFoodService.selectByPrimaryKey(id);
    }

    @RequestMapping("/editFoodSubmit")
    @ResponseBody
    public Object editFoodSubmit(@ModelAttribute DcFood food){
        food.setFoodIsdel(0);
        return dcFoodService.updateByPrimaryKey(food)>0?
                new BaseResult(true,"修改菜品成功"):
                new BaseResult(false,"修改菜品失败");
    }

    @RequestMapping("deleteFood")
    @ResponseBody
    public Object deleteFood(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
        return dcFoodService.deleteByPrimaryKey(id)>0?
                new BaseResult(true,"删除菜品成功"):
                new BaseResult(false,"删除菜品失败");
    }


    @RequestMapping("/newFoodSubmit")
    @ResponseBody
    public Object newFoodSubmit(DcFood dcFood){
        dcFood.setFoodIsdel(0);
        return dcFoodService.insert(dcFood)>0?
                new BaseResult(true,"新增菜品成功"):
                new BaseResult(false,"新增菜品失败");
    }

    @RequestMapping("/deleteFoods")
    @ResponseBody
    public Object deleteFoods(@RequestParam("id[]") List<Integer> id){
        return dcFoodService.deleteByPrimaryKeys(id)>0?
                new BaseResult(true,"批量删除菜品成功"):
                new BaseResult(false,"批量删除菜品失败");
    }
}
