package com.ohgiraffers.section01.method;

public class Aplication07 {
    public static void main(String[] args) {
        /*매개변수와 리턴값 복합 활용*/

        int first = 20;
        int second = 10;

        Aplication07 app7 = new Aplication07();

        System.out.println("더하기: "+app7.plusTwoNumbers(first, second));
        System.out.println("빼기: "+app7.minusTwoNumbers(first, second));
        System.out.println("곱하기: "+app7.multipleTwoNumbers(first, second));
        System.out.println("나누기: "+app7. divideTwoNumbers(first, second));
    }

    public int plusTwoNumbers(int first, int second){
        return first + second;
    }

    public int minusTwoNumbers(int first, int second){
        return first - second;
    }

    public int multipleTwoNumbers(int first, int second){
        return first * second;
    }

    public int divideTwoNumbers(int first, int second){
        return first / second;
    }
}
