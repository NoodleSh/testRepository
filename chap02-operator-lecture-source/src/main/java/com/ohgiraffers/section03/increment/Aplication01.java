package com.ohgiraffers.section03.increment;

public class Aplication01 {
    public static void main(String[] args) {
        /*필기.
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * '++' : 1 증가의 의미
        * '--' : 1 감소의 의미
        * */

        int num = 20;
        System.out.println("num : "+num);
        num++;
        System.out.println("num++ : "+num);
        ++num;
        System.out.println("++num : "+num);
        num--;
        System.out.println("num-- : "+num);
        --num;
        System.out.println("num-- : "+num+"\n");

        /*주의사항
        * 증감연산자는 다른 연산자와 함께 사용할 때 의미기 달라진다는 것이다.
        * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
        * 'var++' : 다른 연산을 먼저 진행하고 난뒤 마지막에 피여ㅑㄴ산자의 값을 1 증가시킴
        * '++var' : 피연산자의 값을 먼저 1 증가시킨 후 다른 연산을 진행
        * 'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
        * '--var' : 피연산자의 값을 먼저 1 감소시킨 후 다른 연산을 진행
        * */

        int firstNum = 20;
        int result1 = firstNum++ * 3; // 다른 연산을 먼저 처리하고 마지막에 증가 처리
        System.out.println("result : " + result1);
        System.out.println("firstNum : "+ firstNum+"\n");

        int secondNum = 20;
        int result2 = --secondNum * 3; // 먼저 감소한다음 다른 연산 처리
        System.out.println("result : " + result2);
        System.out.println("firstNum : "+ secondNum+"\n");

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1 + "\n");

    }
}
