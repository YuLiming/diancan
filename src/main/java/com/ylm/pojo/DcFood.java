package com.ylm.pojo;

import java.math.BigDecimal;

public class DcFood {
    private Integer foodId;

    private String foodName;

    private Integer foodTypeId;

    private BigDecimal foodPrice;

    private String foodRemark;

    private Integer foodGrounding;

    private Integer foodMonthlysales;

    private BigDecimal foodVipPrice;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public Integer getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public BigDecimal getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(BigDecimal foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodRemark() {
        return foodRemark;
    }

    public void setFoodRemark(String foodRemark) {
        this.foodRemark = foodRemark == null ? null : foodRemark.trim();
    }

    public Integer getFoodGrounding() {
        return foodGrounding;
    }

    public void setFoodGrounding(Integer foodGrounding) {
        this.foodGrounding = foodGrounding;
    }

    public Integer getFoodMonthlysales() {
        return foodMonthlysales;
    }

    public void setFoodMonthlysales(Integer foodMonthlysales) {
        this.foodMonthlysales = foodMonthlysales;
    }

    public BigDecimal getFoodVipPrice() {
        return foodVipPrice;
    }

    public void setFoodVipPrice(BigDecimal foodVipPrice) {
        this.foodVipPrice = foodVipPrice;
    }
}