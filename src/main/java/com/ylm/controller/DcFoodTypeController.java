package com.ylm.controller;

import com.ylm.common.BaseResult;
import com.ylm.pojo.DcFoodtype;
import com.ylm.service.DcFoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DcFoodTypeController {

    @Autowired
    DcFoodTypeService dcFoodTypeService;

    @RequestMapping("/getFoodTypes")
    @ResponseBody
    public List<DcFoodtype> getFoodTypes(Model model){
        List<DcFoodtype> result = new ArrayList<DcFoodtype>();
        List<DcFoodtype> foodtypes = dcFoodTypeService.selectByExample(null);
        for (DcFoodtype foodtype : foodtypes){
            if (foodtype.getFoodtypeIsdel()==0){
                result.add(foodtype);
            }
        }
        return result;
    }

    @RequestMapping("/selectFoodType")
    @ResponseBody
    public DcFoodtype selectFoodType(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        return dcFoodTypeService.selectByPrimaryKey(id);
    }

    @RequestMapping("/editFoodTypeSubmit")
    @ResponseBody
    public Object editFoodTypeSubmit(DcFoodtype type){
        type.setFoodtypeIsdel(0);
        return dcFoodTypeService.updateByPrimaryKey(type)>0?
                new BaseResult(true,"修改菜系成功"):
                new BaseResult(false,"修改菜系失败");
    }

    @RequestMapping("deleteFoodType")
    @ResponseBody
    public Object deleteFoodType(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
        return dcFoodTypeService.deleteByPrimaryKey(id)>0?
                new BaseResult(true,"删除菜系成功"):
                new BaseResult(false,"删除菜系失败");
    }



    @RequestMapping("/newFoodTypeSubmit")
    @ResponseBody
    public Object newFoodTypeSubmit(DcFoodtype dcFoodtype){
        dcFoodtype.setFoodtypeIsdel(0);
        return dcFoodTypeService.insert(dcFoodtype)>0?
                new BaseResult(true,"新增菜系成功"):
                new BaseResult(false,"新增菜系失败");
    }

    @RequestMapping("/deleteFoodTypes")
    @ResponseBody
    public Object deleteFoodTypes(@RequestParam("id[]") List<Integer> id){
        return dcFoodTypeService.deleteByPrimaryKeys(id)>0?new BaseResult(true,"删除成功"):new BaseResult(false,"删除失败");
    }

}
