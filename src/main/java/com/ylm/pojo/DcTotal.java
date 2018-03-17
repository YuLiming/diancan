package com.ylm.pojo;

import java.math.BigDecimal;

public class DcTotal {
    private String date;

    private int passengerFlow;

    private BigDecimal money = new BigDecimal(0);

    public DcTotal(String date){
        this.date = date;
    }
    public DcTotal(String date,int passengerFlow,BigDecimal money){
        this.date = date;
        this.passengerFlow = passengerFlow;
        this.money = money;
    }

    public String getData(){
        return date;
    }

    public int getPassengerFlow(){
        return passengerFlow;
    }

    public BigDecimal getMoney(){
        return money;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setPassengerFlow(int passengerFlow){
        this.passengerFlow = passengerFlow;
    }

    public void setMoney(BigDecimal money){
        this.money = money;
    }
}
