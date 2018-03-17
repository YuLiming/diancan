package com.ylm.controller;

import com.ylm.common.BaseResult;
import com.ylm.pojo.DcFood;
import com.ylm.pojo.DcOrder;
import com.ylm.pojo.DcOrderDetail;
import com.ylm.pojo.DcTotal;
import com.ylm.service.DcFoodService;
import com.ylm.service.DcOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @RequestMapping("/editOrderDetailSubmit")
    @ResponseBody
    public Object editOrderDetailSubmit(@RequestParam(value = "orderId") String orderId,@RequestParam(value = "foodIds") String foodIds,@RequestParam(value = "foodNum") String foodNum){
        return dcOrderService.updateOrderDetailByPrimaryKey(orderId, foodIds, foodNum)>0?
                new BaseResult(true,"修改成功"):
                new BaseResult(false,"修改失败");
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
        if (foodId==null||foodNum==null){
            return null;
        }
        List<DcOrderDetail> result = new ArrayList<DcOrderDetail>();
        System.out.print(foodId+" num:"+foodNum);
        String[] ids = foodId.split("\\|");
        Integer[] id = new Integer[ids.length];
        for (int i = 0;i<ids.length;i++){
            id[i] = Integer.parseInt(ids[i]);
        }
        String[] nums = foodNum.split("\\|");
        List<DcFood> foods = dcFoodService.selectByPrimaryKeys(Arrays.asList(id));
        for (int i = 0;i<foods.size();i++){
            result.add(new DcOrderDetail(foods.get(i),Integer.parseInt(nums[i])));
        }
        return result;
    }

    @RequestMapping("/getTotal")
    @ResponseBody
    public List<DcTotal> getPassengerFlow(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String endTime = dateFormat.format(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-6);
        Date startData = calendar.getTime();
        String startTime = dateFormat.format(startData);
        List<DcOrder> data = dcOrderService.selectOrderNum(startTime,endTime);
        List<DcTotal> result = new ArrayList<DcTotal>();
        LinkedHashMap<String,DcTotal> map = new LinkedHashMap<String, DcTotal>();
        Calendar calendar2 = new GregorianCalendar();
        calendar2.setTime(date);
        calendar2.add(Calendar.DATE,-7);
        for (int i = 0;i<7;i++){
            calendar2.add(Calendar.DATE,1);
            String tmp = dateFormat.format(calendar2.getTime());
            map.put(tmp,new DcTotal(tmp));
        }
        for (DcOrder order :data){
            if (map.containsKey(order.getOrderBoardDate())){
                DcTotal totaltmp = map.get(order.getOrderBoardDate());
                totaltmp.setPassengerFlow(totaltmp.getPassengerFlow()+order.getOrderPeopleNumber());
                totaltmp.setMoney(order.getOrderDiscountAmount().add(totaltmp.getMoney()));
                map.put(order.getOrderBoardDate(),totaltmp);
            }else {
                map.put(order.getOrderBoardDate(),
                        new DcTotal(order.getOrderBoardDate(),order.getOrderPeopleNumber(),order.getOrderDiscountAmount()));
            }
        }
        for (String str :map.keySet()){
            result.add(map.get(str));
        }
        return result;
    }
}
