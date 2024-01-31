package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    /* 중첩 for문
     * for문 안에서 for문을 이용할 수 있다.*/

    int dan = 0;

    public void Gugudan() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                dan = i * j;
                System.out.println(i + " * " + j + " = " + dan);
            }
            System.out.println();
        }


    }

    public void printStarInputRowTImes() {
        /*키보드로 정수를 하나 입력 받아서 해당 정수만큼
         * 항행에 "*을 5개 씩 출력해보기*/

//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 입력: ");
//        int row = sc.nextInt();

        for(int i=5; 5>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public void printStar(int times){
        for(int i = 1; i<=times; i++){
            System.out.print("*");
        }
    }

}
