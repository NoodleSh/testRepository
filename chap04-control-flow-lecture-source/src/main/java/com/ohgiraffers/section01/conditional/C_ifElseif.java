package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {

    public void simpleifElseIfStatement(){
        /*
        * [if-else if문 표현식]
        *
        * *if(조건식1)
        *   조건식1이 true일 때 실행할 명령문;
        * }else if(조건식2){
        *   조건식1은 false이거, 조건식2는 ture일 떄 실핼할 명령문;
        * }else{
        *   조건식1,2, 모두 false인 경우 실행할 명령문;
        * }
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("펑~산신령이 나타났다!!");
        System.out.print("어느 도끼가 너의 도끼냐?(1. 금도끼 / 2. 은도끼 / 3. 쇠도끼): ");

        int answer = sc.nextInt();

        if(answer == 1){
            System.out.println("거짓말 하지 말거라~~~ 욕심이 과하구나 이놈!");
        } else if (answer == 2) {
            System.out.println("욕심을 크게 부리지는 않았지만 거짓말을 하는구나!!");
        }else{
            System.out.println("너는 정말 정직하구나~ 다 가져가러가~!!");
        }
        System.out.println("산신령 사라짐..");

    }

    public void nestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름: ");
        String name = sc.nextLine();
        
        System.out.print("점수: ");
        int point = sc.nextInt();

        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            } else if (point >= 60) {
                grade = "D";
                if (point >= 65) {
                    grade += "+";
                }
            }
        }else{
            grade = "F";
        }
        System.out.println(name+" 학생의 점수는 " + point+"점, " + "등급은 "+ grade + " 입니다." );
    }
}
