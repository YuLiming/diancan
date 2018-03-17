package com.ylm.pojo;

import java.math.BigDecimal;

public class DcOrderDetail {
    private DcFood food;

    private Integer foodNum;

    public DcOrderDetail(DcFood food,Integer num){
        this.food = food;
        this.foodNum = num;
    }

    public void setFoodNum(Integer num){
        this.foodNum = num;
    }

    public Integer getFoodNum(){
        return foodNum;
    }

    public DcFood getFood() {
        return food;
    }

    public void setFood(DcFood food) {
        this.food = food;
    }

}
