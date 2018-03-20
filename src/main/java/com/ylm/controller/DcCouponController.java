package com.ylm.controller;


import com.ylm.common.BaseResult;
import com.ylm.common.InfoConstant;
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
        try {
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
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/selectCoupon")
    @ResponseBody
    public DcCoupon selectCoupon(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        DcCoupon dcCoupon = null;
        try {
            dcCoupon = dcCouponService.selectByPrimaryKey(id);
            String etimetmp = dcCoupon.getExpiryTime();
            String stimetmp = dcCoupon.getStartTime();
            String etime = dcCoupon.getExpiryTime().substring(0,etimetmp.length()-2);
            String stime = dcCoupon.getStartTime().substring(0,stimetmp.length()-2);
            dcCoupon.setExpiryTime(etime);
            dcCoupon.setStartTime(stime);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return dcCoupon;
    }

    @RequestMapping("/editCouponSubmit")
    @ResponseBody
    public Object editCouponSubmit(@ModelAttribute DcCoupon coupon){
        try {
            coupon.setCouponIsdel(0);
            return dcCouponService.updateByPrimaryKey(coupon)>0?
                    new BaseResult(true, InfoConstant.UPDATESUCCESS):
                    new BaseResult(false,InfoConstant.UPDATEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.COUPONTHROWABLE);
        }
    }

    @RequestMapping("/deleteCoupon")
    @ResponseBody
    public Object deleteCoupon(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id){
        try {
            return dcCouponService.deleteByPrimaryKey(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.COUPONTHROWABLE);
        }

    }


    @RequestMapping("/newCouponSubmit")
    @ResponseBody
    public Object newCouponSubmit(DcCoupon dcCoupon){
        try {
            dcCoupon.setCouponIsdel(0);
            return dcCouponService.insert(dcCoupon)>0?
                    new BaseResult(true,InfoConstant.INSERTSUCCESS):
                    new BaseResult(false,InfoConstant.INSERTFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.COUPONTHROWABLE);
        }

    }

    @RequestMapping("/deleteCoupons")
    @ResponseBody
    public Object deleteCoupons(@RequestParam("id[]") List<Integer> id){
        try {
            return dcCouponService.deleteByPrimaryKeys(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.COUPONTHROWABLE);
        }

    }
}
