package com.view;

import com.controller.StockManager;
import com.dto.Member;

import java.util.Scanner;

public class StockMenu {
    Scanner sc = new Scanner(System.in);
    StockManager stockManager = new StockManager();

    public void mainPage(){
        int menu ;
        while (true){
            System.out.println("1. 내정보 입력");
            System.out.println("2. 내정보 확인");
            System.out.println("3. 내정보 확인");
            System.out.println("4. 전체 주식 조회");
            System.out.println("5 .주식 구매");
            System.out.println("6. 주식 판매");
            
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    stockManager.insertMyInfo(myinfo());
                    break;
                case 2:
                    stockManager.displayMyInfo();
                    break;
                case 3:
                    stockManager.displayStock();
                    break;
                case 4:
                    stockManager.buyStock();
                    break;
                case 5:
                    stockManager.sellStock();
                    break;
            }
        }

    }

    private Member myinfo() {

        System.out.print("고객 입력 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("보유 금액 입력 : ");
        int price = sc.nextInt();

        return new Member(name, price);
    }
}
