package com.dto;

public class Member {

    private String customerName;
    private int customerMoney;


    public Member(){

    }

    public Member(String customerName, int customerMoney) {
        this.customerName = customerName;
        this.customerMoney = customerMoney;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /* 주식 구매후 차감되는 금액 */
    public void minusMoney( int customerMoney){
        this.customerMoney -= customerMoney;
    }
    
    /* 주식 판매후 금액*/
    public void addMoney( int customerMoney){
        this.customerMoney += customerMoney;
    }

    public int getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(int customerMoney) {
        this.customerMoney = customerMoney;
    }

    @Override
    public String toString() {
        return "{" +
                "고객이름 = '" + customerName + '\'' +
                ", 보유금액 = " + customerMoney +
                '}';
    }
}
