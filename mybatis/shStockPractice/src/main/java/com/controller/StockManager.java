package com.controller;

import com.dto.Member;
import com.dto.Stock;

import java.util.Scanner;

public class StockManager {

    Scanner sc = new Scanner(System.in);
    Member mem;

    Stock [] account = new Stock[5];
    Stock[] stockList = new Stock[5];
    {
        stockList[0] = new Stock("로지텍",10,13000);
        stockList[1] = new Stock("엔비디아",13,63200);
        stockList[2] = new Stock("테슬라",8,144000);
        stockList[3] = new Stock("인텔",5,20000);
        stockList[4] = new Stock("AMD",7,145200);
    }
    public void insertMyInfo(Member mem) {
        this.mem = mem;
    }

    public void displayMyInfo() {
        System.out.println(mem);
        System.out.print("보유 주식 : ");
        for(int i = 0; i < account.length; i++){
            if(account[i] != null){
                System.out.println(account[i]);
            }
        }
    }

    public void displayStock(){
        for(int i = 0; i < stockList.length; i++){
            System.out.println(stockList[i]);
        }
    }

    public void buyStock(){
        System.out.print("구매 종목 : ");
        String stockTitle = sc.next();
        sc.nextLine();

        System.out.println("구매 수량 : ");
        int stockCount = sc.nextInt();
        boolean stockFound = false;

        for(int i = 0; i < stockList.length; i++){
            if(stockList[i].getStockTitle().equals(stockTitle)){
                if(mem.getCustomerMoney() >= (stockList[i].getStockPrice() * stockCount)){
                    stockFound = true;
                    for(int j = 0; j < account.length; j++){

                        // 비어있는 배열이기 때문에 비어있는 값을 확인하여 계좌에 값을 복사
                        if(account[i] == null){
                            account[i] = stockList[i];
                            break;
                        }
                    }


                    account[i].minusStockCount(stockCount); //차감되는 주식 개수(계좌에 연결?)
                    mem.minusMoney(stockList[i].getStockPrice() * stockCount); // 차감되는 금액
                    System.out.println("매수 성공하였습니다.");
                }else{
                    System.out.println("금액이 부족합니다.");
                }
            }
                if(!stockFound){
                    System.out.println("존재하지 않는 종목입니다.");
                }

        }
    }

    public void sellStock() {
        System.out.print("판매할 종목 : ");
        String stockTitle = sc.next();
        sc.nextLine();

        System.out.print("판매 개수 :");
        int stockCount = sc.nextInt();
        boolean stockFound = false;

        for(int i = 0; i < account.length; i++){
            if(account[i] != null && account[i].getStockTitle().equals(stockTitle)){
                if(account[i].getStockCount() >= stockCount){
                    stockFound = true;
                    stockList[i].addStockCount(stockCount); //판매후 증가하는 주식 개수
                    mem.addMoney(stockCount * account[i].getStockPrice()); // 판매후 돌아오는 금액
                    System.out.println("매도 성공하였습니다.");
                    return;
                }
            }
            if(!stockFound){
                System.out.println("계좌 내에 일치하는 종목이 없습니다.");
            }
        }
    }

    public void deleteStock() {}





}
