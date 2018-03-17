package com.ylm.controller;


import com.ylm.common.BaseResult;
import com.ylm.pojo.DcCoupon;
import com.ylm.service.DcCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DcCouponController {

    @Autowired
    private DcCouponService dcCouponService;

    @RequestMapping("/getCoupon")
    @ResponseBody
    public List<DcCoupon> getCoupon(){
        List<DcCoupon> result = new ArrayList<DcCoupon>();
        List<DcCoupon> list = dcCouponService.selectByExample(null);
        for (DcCoupon dcCoupon : list){
            if (dcCoupon.getCouponIsdel()==0){
                String etimetmp = dcCoupon.getExpiryTime();
                String stimetmp = dcCoupon.getStartTime();
                String etime = dcCoupon.getExpiryTime().substring(0,etimetmp.length()-2);
                String stime = dcCoupon.getStartTime().substring(0,stimetmp.length()-2);
                dcCoupon.setExpiryTime(etime);
                dcCoupon.setStartTime(stime);
                result.add(dcCoupon);
            }
        }
        return result;
    }

    @RequestMapping("/selectCoupon")
    @ResponseBody
    public DcCoupon selectCoupon(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        return dcCouponService.selectByPrimaryKey(id);
    }

    @RequestMapping("/editCouponSubmit")
    @ResponseBody
    public Object editCouponSubmit(@ModelAttribute DcCoupon coupon){
        coupon.setCouponIsdel(0);
        return dcCouponService.updateByPrimaryKey(coupon)>0?
                new BaseResult(true,"修改卡券成功"):
                new BaseResult(false,"修改卡券失败");
    }

    @RequestMapping("/deleteCoupon")
    @ResponseBody
    public Object deleteCoupon(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id){
        return dcCouponService.deleteByPrimaryKey(id)>0?new BaseResult(true,"删除卡券成功"):new BaseResult(false,"删除卡券失败");
    }


    @RequestMapping("/newCouponSubmit")
    @ResponseBody
    public Object newCouponSubmit(DcCoupon dcCoupon){
        dcCoupon.setCouponIsdel(0);
        return dcCouponService.insert(dcCoupon)>0?new BaseResult(true,"新增卡券成功"):new BaseResult(false,"新增卡券失败");
    }

    @RequestMapping("/deleteCoupons")
    @ResponseBody
    public Object deleteCoupons(@RequestParam("id[]") List<Integer> id){
        return dcCouponService.deleteByPrimaryKeys(id)>0?new BaseResult(true,"删除成功"):new BaseResult(false,"删除失败");
    }
}
