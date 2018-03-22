package com.ylm.controller;

import com.ylm.common.BaseResult;
import com.ylm.common.InfoConstant;
import com.ylm.common.UploadUtil;
import com.ylm.mapper.DcFoodMapper;
import com.ylm.pojo.DcBoard;
import com.ylm.pojo.DcFood;
import com.ylm.pojo.DcFoodtype;
import com.ylm.service.DcFoodService;
import com.ylm.service.DcFoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DcFoodController {

    @Autowired
    private DcFoodService dcFoodService;

    @Autowired
    private DcFoodTypeService dcFoodTypeService;

    @RequestMapping("/getFoods")
    @ResponseBody
    public List<DcFood> getFoods(){
        List<DcFood> result = new ArrayList<DcFood>();
        try {
            List<DcFoodtype> foodtypes = dcFoodTypeService.selectByExample(null);
            Map<Integer,String> map = new HashMap<Integer, String>();
            for (DcFoodtype foodtype : foodtypes){
                if (foodtype.getFoodtypeIsdel()==0){
                    map.put(foodtype.getFoodtypeId(),foodtype.getFoodtypeName());
                }
            }
            List<DcFood> foods = dcFoodService.selectByExample(null);
            for (DcFood food : foods){
                if (food.getFoodIsdel()==0){
                    if (map.containsKey(food.getFoodTypeId())){
                        food.setFoodType(map.get(food.getFoodTypeId()));
                    }
                    result.add(food);
                }
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/selectFood")
    @ResponseBody
    public DcFood selectFood(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        DcFood dcFood = null;
        try {
            dcFood = dcFoodService.selectByPrimaryKey(id);
            return dcFood;
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return dcFood;
    }

    @RequestMapping("/editFoodSubmit")
    @ResponseBody
    public Object editFoodSubmit(@ModelAttribute DcFood food){
        try {
            food.setFoodIsdel(0);
            return dcFoodService.updateByPrimaryKey(food)>0?
                    new BaseResult(true,InfoConstant.UPDATESUCCESS):
                    new BaseResult(false,InfoConstant.UPDATEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false, InfoConstant.FOODTHROWABLE);
        }
    }

    @RequestMapping("deleteFood")
    @ResponseBody
    public Object deleteFood(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
        try {
            return dcFoodService.deleteByPrimaryKey(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.FOODTHROWABLE);
        }

    }


    @RequestMapping("/newFoodSubmit")
    @ResponseBody
    public Object newFoodSubmit(DcFood dcFood){
        try {
            dcFood.setFoodIsdel(0);
            return dcFoodService.insert(dcFood)>0?
                    new BaseResult(true,InfoConstant.INSERTSUCCESS):
                    new BaseResult(false,InfoConstant.INSERTFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.FOODTHROWABLE);
        }
    }

    @RequestMapping("/deleteFoods")
    @ResponseBody
    public Object deleteFoods(@RequestParam("id[]") List<Integer> id){
        try {
            return dcFoodService.deleteByPrimaryKeys(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.FOODTHROWABLE);
        }

    }

    @RequestMapping("/upload")
    public String upload(){
        return "upload";
    }

    @RequestMapping("/uploadFoodImg")
    @ResponseBody
    public Object uploadFoodImg(@RequestParam("file") MultipartFile file) throws Exception{
        if (file.getSize() != 0) {
            String path = UploadUtil.uploadImgToQiuniu(file);
            System.out.println(path);
            return new BaseResult(true,InfoConstant.UPLOADIMGSUCCESS,200,path);
        }else {
            return new BaseResult(false,InfoConstant.UPLOADIMGFAIL);
        }

    }
}
