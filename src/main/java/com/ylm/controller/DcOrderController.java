package com.ylm.controller;

import com.ylm.common.BaseResult;
import com.ylm.pojo.DcFood;
import com.ylm.pojo.DcOrder;
import com.ylm.pojo.DcOrderDetail;
import com.ylm.service.DcFoodService;
import com.ylm.service.DcOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@CrossOrigin
public class DcOrderController {

    @Autowired
    DcOrderService dcOrderService;

    @Autowired
    DcFoodService dcFoodService;

    @RequestMapping("/getOrders")
    @ResponseBody
    public List<DcOrder> getOrders(){
        return dcOrderService.selectByExample(null);
    }

    @RequestMapping("/selectOrder")
    @ResponseBody
    public Object selectOrder(@RequestParam(value = "id",required = false,defaultValue = "1")String id ){
        return dcOrderService.selectByPrimaryKey(id);
    }

    @RequestMapping("/editOrderSubmit")
    @ResponseBody
    public Object editOrderSubmit(DcOrder order){
        return dcOrderService.updateByPrimaryKey(order)>0?
                new BaseResult(true,"修改订单成功"):
                new BaseResult(false,"修改订单失败");
    }

    @RequestMapping("/deleteOrder")
    @ResponseBody
    public Object deleteOrder(@RequestParam(value = "id",required = false,defaultValue = "1")String id){
        return dcOrderService.deleteByPrimaryKey(id)>0?
                new BaseResult(true,"删除订单成功"):
                new BaseResult(false,"删除订单失败");
    }


    @RequestMapping("/deleteOrders")
    @ResponseBody
    public Object deleteOrders(@RequestParam("id[]") List<Integer> id){
        return dcOrderService.deleteByPrimaryKeys(id)>0?
                new BaseResult(true,"批量删除订单成功"):
                new BaseResult(false,"批量删除订单失败");
    }

    @RequestMapping("/getOrderDetail")
    @ResponseBody
    public List<DcOrderDetail> getOrderDetail(@RequestParam(value = "foodId") String foodId,@RequestParam(value = "foodNum") String foodNum){
        List<DcOrderDetail> result = new ArrayList<DcOrderDetail>();
        String[] ids = foodId.split("|");
        String[] nums = foodNum.split("|");
        List<DcFood> foods = dcFoodService.selectByPrimaryKeys(Arrays.asList(ids));
        for (int i = 0;i<foods.size();i++){
            result.add(new DcOrderDetail(foods.get(i),Integer.parseInt(nums[i])));
        }
        return result;
    }
}
