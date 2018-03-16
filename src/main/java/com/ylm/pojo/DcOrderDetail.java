package com.ylm.pojo;

public class DcOrderDetail {
    private DcFood dcFood;

    private Integer foodNum;

    public DcOrderDetail(DcFood food,Integer num){
        this.dcFood = food;
        this.foodNum = num;
    }

    public void setDcFood(DcFood food){
        this.dcFood = food;
    }

    public void setFoodNum(Integer num){
        this.foodNum = num;
    }

    public DcFood getDcFood(){
        return dcFood;
    }

    public Integer getFoodNum(){
        return foodNum;
    }
}
