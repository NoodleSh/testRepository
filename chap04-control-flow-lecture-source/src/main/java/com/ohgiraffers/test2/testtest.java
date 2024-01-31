package com.ohgiraffers.test2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class testtest {
    public static void main(String[] args) {
        /*
        실수를 하나 입력 받고 그 수의 약수를 구하는 프로그램을 만드세요.
        입력 받은 수가 소수라면 “입력 받은 수는 소수입니다.”
        라는 문장도 함께 출력하세요.
        */
        Scanner sc = new Scanner(System.in);



//
//        int num = sc.nextInt();
//
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) { //num을 i로 나눴을때 나머지가 0이면
//                System.out.print(i + "\t"); // i(약수)를 출력
//                count++; // count(약수의 개수) 증가
//            }
//        }
//            System.out.println("은(는) " +num + " 의 약수입니다.");
//
//
//        if (count == 2) { // 약수의 개수가 2개 밖에 없으면 출력
//            System.out.println(num + "은(는) 소수입니다.");
//        }


//        Scanner sc = new Scanner(System.in);

        int i =1;
        int j = 1;
//      int gop = 0;

        while (i<=9){
            i++;
            while (j<=i){
                System.out.print(i + " * " + j + " = " + (i*j));
                j++;
            }
            System.out.println();
        }


 /*       System.out.print("내 월급: ");
        int myPay = sc.nextInt();//월급
        System.out.print("매출액: ");
        int Sale = sc.nextInt();//매출액

        double bonus = 0.0;
        int totalPay = 0; // 총

        if(Sale >= 50000000) {
            bonus = 0.05;
            totalPay = (int)(myPay +(Sale * bonus));
        }else if(Sale >= 30000000) {
            bonus = 0.03;
            totalPay = (int)(myPay +(Sale * bonus));
        }else if(Sale >= 10000000) {
            bonus = 0.01;
            totalPay = (int)(myPay +(Sale * bonus));
        }else {
            bonus = 0.0;
        }

        int bonusPay = (int)(Sale * bonus);
        bonus = (int)(bonus*100);


        System.out.println("---------------------------");
        System.out.println("매출액: "+ Sale);
        System.out.println("보너스율: "+ (int)bonus + "%");
        System.out.println("월 급여: "+ myPay );
        System.out.println("보너스 금액: "+ bonusPay);
        System.out.println("---------------------------");
        System.out.println("총급여: "+ totalPay);*/

    }
}
