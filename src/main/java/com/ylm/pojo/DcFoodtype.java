package com.ylm.pojo;

public class DcFoodtype {
    private Integer foodtypeId;

    private String foodtypeName;

    private Integer foodtypeIsdel;

    public Integer getFoodtypeId() {
        return foodtypeId;
    }

    public void setFoodtypeId(Integer foodtypeId) {
        this.foodtypeId = foodtypeId;
    }

    public String getFoodtypeName() {
        return foodtypeName;
    }

    public void setFoodtypeName(String foodtypeName) {
        this.foodtypeName = foodtypeName == null ? null : foodtypeName.trim();
    }

    public Integer getFoodtypeIsdel() {
        return foodtypeIsdel;
    }

    public void setFoodtypeIsdel(Integer foodtypeIsdel) {
        this.foodtypeIsdel = foodtypeIsdel;
    }
}