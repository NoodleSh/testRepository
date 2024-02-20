package com.hi_4.test.exchange;

public class Money {

    String unit;
    double notified;
    double buy;
    int rate;
    int limit;

    public Money(){

    }

    public Money(String unit,double notified, double buy,int rate,int limit){
        this.unit = unit;
        this.notified = notified;
        this.buy = buy;
        this.rate = rate;
        this.limit = limit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return this.unit;
    }


    public void setNotified(double notified) {
        this.notified = notified;
    }
    public double getNotified() {
        return this.notified;
    }


    public void setBuy(double buy) {
        this.buy = buy;
    }
    public double getBuy() {
        return this.buy;
    }


    public void setRate(int rate) {
        this.rate = rate;
    }
    public double getRate() {
        return this.rate;
    }


    public void setLimit(int limit) {
        this.limit = limit;
    }
    public double getLimit() {
        return this.limit;
    }

    public String toString() {
        return "["+this.unit +"]"+ " 고시환율 : "+
                this.notified + " 현찰살때 : " + this.buy +
                " 환율우대 : " + this.rate + " 일일한도 : " + this.limit;
    }

}
