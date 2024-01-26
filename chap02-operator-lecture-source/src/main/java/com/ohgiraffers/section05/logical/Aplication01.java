package com.ohgiraffers.section05.logical;

public class Aplication01 {
    public static void main(String[] args) {

        /* 논리 연산자의 종류
        * 1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 두 개의 논리식을 판단하여 참과 거짓을 판단한다.
        *   1-1. &&(논리 AND) 연산자: 두개의 논리식중 모두 참 일 경우 참을 반환, 하나라도 거짓이면 거짓을 반환
        *   1-2. ||(논리 OR) 연산자 : 두개의 논리식중 하나라도 참 일 경우
        * 2. 논리 부정 연산자 : 피연산자가 하나인 단항 연산자
        *   2-1. !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참 반환
        * */


        /*AND*/
        System.out.println("true && true: "+ (true && true));
        System.out.println("true && false: "+ (true && false)+"\n");//앞에 조건이 false면 AND는 바로 거짓으로 판단

        /*OR*/
        System.out.println("true || true: "+ (true || true));//앞에 조건이 false여도 뒤에 조건까지 본 다음 판단
        System.out.println("true || false: "+ (true || false));
        System.out.println("false || false: "+ (false || false)+"\n");

        /*NOT*/
        System.out.println("true의 NOT연산: "+(!true));
        System.out.println("false의 NOT연산: "+(!false)+"\n");

        /*논리식의 논리 연산자 활용*/
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        /*ADN활용*/
        System.out.println("a < b && c < d: "+(a<b && c<d));
        System.out.println("a < b && c > d: "+(a<b && c>d));
        System.out.println("a > b && c < d: "+(a > b && c < d));
        System.out.println("a > b && c > d: "+(a > b && c > d)+"\n");

        /*OR활용*/
        System.out.println("a < b || c < d: "+(a<b || c<d));
        System.out.println("a > b || c < d: "+(a>b || c<d));
        System.out.println("a < b || c > d: "+(a<b || c>d));
        System.out.println("a > b || c > d: "+(a>b || c>d)+"\n");









    }
}
