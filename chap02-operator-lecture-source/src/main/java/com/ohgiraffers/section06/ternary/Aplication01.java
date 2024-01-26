package com.ohgiraffers.section06.ternary;

public class Aplication01 {
    public static void main(String[] args) {
        /*삼항연산자
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        * (조건식)? 참일 떄 사용할 값 : 거짓일떄 사용할 값
        * */

        /*삼항 연산자 단독 사용*/

        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0)? "양수":"음수";
        String result2 = (num2 > 0)? "양수":"음수";
        System.out.println("num1은 "+result1);
        System.out.println("num2는  "+result2+"\n");

        /*삼항 연산자 중첩 사용*/
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0 )? "양수네": (num3 == 0)? "0이다" : "음수네";
        String result4 = (num4 > 0 )? "양수네": (num3 == 0)? "0이다" : "음수네";
        String result5 = (num5 > 0 )? "양수네": (num3 == 0)? "0이다" : "음수네";
        System.out.println("num3는 "+result3);
        System.out.println("num4는 "+result4);
        System.out.println("num5는 "+result5);

    }
}
