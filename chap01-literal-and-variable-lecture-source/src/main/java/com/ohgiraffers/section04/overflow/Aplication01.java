package com.ohgiraffers.section04.overflow;

public class Aplication01 {
    public static void main(String[] args) {
        /*필기. 오버플로우
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sgin bit를 반전시켜 최소값으로 순환시킴
        * */



        byte num1 = 127;

        System.out.println("num1: "+ num1); //127
        System.out.println("num1 overflow : "+ ++num1);

        /*필기. 언더플로우
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상*/

        byte num2 = -128;
        System.out.println("num2: " +num2);
        System.out.println("num2 underflow: "+ --num2); //127: byet의 최대 저장 범위

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println(" firstNum * secondNum: "+ multi);

        long longMulti = firstNum * secondNum;
        System.out.println(" firstNum * secondNum: "+ longMulti);

        long result = (long)firstNum * secondNum;//강제 형변환
        System.out.println(" firstNum * secondNum: "+result);
    }
}
