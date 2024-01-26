package com.ohgiraffers.test;
import java.util.Scanner;

public class doodle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주문하실 메뉴를 입력해주세요: ");
        String coffee=sc.nextLine();

        String americano = "americano";
        String caffelatte = "caffelatte";
        String icetea = "icetea";

        if(coffee.equals(americano)){
            System.out.println("아메리카노 입니다.");
        }else if(coffee.equals(caffelatte)){
            System.out.println("카페라떼 입니다.");
        }else if(coffee.equals(icetea)){
            System.out.println("아이스티입니다.");
        }else{
            System.out.println("다시 입력해주세요");
        }
    }
}
