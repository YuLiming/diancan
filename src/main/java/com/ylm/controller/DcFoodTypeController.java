package com.ylm.controller;

import com.ylm.common.BaseResult;
import com.ylm.common.InfoConstant;
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
        try {
            List<DcFoodtype> foodtypes = dcFoodTypeService.selectByExample(null);
            for (DcFoodtype foodtype : foodtypes){
                if (foodtype.getFoodtypeIsdel()==0){
                    result.add(foodtype);
                }
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/selectFoodType")
    @ResponseBody
    public DcFoodtype selectFoodType(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        DcFoodtype dcFoodtype = null;
        try {
            dcFoodtype = dcFoodTypeService.selectByPrimaryKey(id);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return dcFoodtype;
    }

    @RequestMapping("/editFoodTypeSubmit")
    @ResponseBody
    public Object editFoodTypeSubmit(DcFoodtype type){
        try {
            type.setFoodtypeIsdel(0);
            return dcFoodTypeService.updateByPrimaryKey(type)>0?
                    new BaseResult(true,InfoConstant.UPDATESUCCESS):
                    new BaseResult(false,InfoConstant.UPDATEFAIL);
        }catch (Throwable throwable){
            return new BaseResult(false, InfoConstant.FOODTYPETHROWABLE);
        }
    }

    @RequestMapping("deleteFoodType")
    @ResponseBody
    public Object deleteFoodType(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
        try{
            return dcFoodTypeService.deleteByPrimaryKey(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.FOODTYPETHROWABLE);
        }

    }



    @RequestMapping("/newFoodTypeSubmit")
    @ResponseBody
    public Object newFoodTypeSubmit(DcFoodtype dcFoodtype){
        try {
            dcFoodtype.setFoodtypeIsdel(0);
            return dcFoodTypeService.insert(dcFoodtype)>0?
                    new BaseResult(true,InfoConstant.INSERTSUCCESS):
                    new BaseResult(false,InfoConstant.INSERTFAIL);
        }catch (Throwable throwable){
            return new BaseResult(false,InfoConstant.FOODTYPETHROWABLE);
        }
    }

    @RequestMapping("/deleteFoodTypes")
    @ResponseBody
    public Object deleteFoodTypes(@RequestParam("id[]") List<Integer> id){
        try {
            return dcFoodTypeService.deleteByPrimaryKeys(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            return new BaseResult(false,InfoConstant.FOODTYPETHROWABLE);
        }
    }

}
