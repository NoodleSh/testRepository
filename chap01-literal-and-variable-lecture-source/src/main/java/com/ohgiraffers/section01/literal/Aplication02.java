package com.ohgiraffers.section01.literal;

public class Aplication02 {
    public static  void main(String[]args){
        System.out.println("=========정수와 정수의 연산=========");
        System.out.println(123+56);
        System.out.println(123-23);
        System.out.println(123*10);
        System.out.println(123/10);
        System.out.println(123%10+"\n");


        System.out.println("=========실수와 실수의 연산=========");
        System.out.println(1.23+1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23/10.0);
        System.out.println(1.23%1.0+"\n");//약간의 오차 발생


        System.out.println("=========정수와 실수의 연산=========");
        System.out.println(123+0.5);
        System.out.println(123-0.5);
        System.out.println(123*0.5);
        System.out.println(123/0.5);
        System.out.println(123%0.5+"\n");


        System.out.println("=========문자와 문자의 연산=========");
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b'+"\n");


        System.out.println("=========문자와 정수의 연산=========");
        System.out.println('a'+1);
        System.out.println('a'-1);
        System.out.println('a'*2);
        System.out.println('a'/2);
        System.out.println('a'%2+"\n");


        System.out.println("=========문자와 실수의 연산=========");
        System.out.println('a'+1.0);
        System.out.println('a'-1.0);
        System.out.println('a'*2.0);
        System.out.println('a'/2.0);
        System.out.println('a'%2.0+"\n");


        System.out.println("=========문자열과 문자열의 연산=========");
        System.out.println("hello"+" world"+"\n");
//        System.out.println("hello"-" world");
//        System.out.println("hello"*" world");
//        System.out.println("hello"/" world");
//        System.out.println("hello"%" world");


        /*문자열을 다른 형태의 값과 연산하면 문자열 결과가 도출된다*/
        System.out.println("=========문자열과 다른 형태의 값 연산=========");
        System.out.println("hello world"+123);
        System.out.println("hello world"+123.456);
        System.out.println("hello world"+'a');
        System.out.println("hello world"+true+"\n");

        /*논리값끼리의 연산은 불가능*/
        System.out.println("=========문자열 형태의 값 연산=========");
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false)

        /*논리값과 정수의 연산은 불가능*/
//        System.out.println(true + 1);
//        System.out.println(true - 2);
//        System.out.println(true * 3);
//        System.out.println(true / 4);
//        System.out.println(true % 5);

        /*논리값과 실수의 연산은 불가능*/
//        System.out.println(true + 1.0);
//        System.out.println(true - 2.0);
//        System.out.println(true * 3.0);
//        System.out.println(true / 4.0);
//        System.out.println(true % 5.0);

        /*논리값과 문자의 연산은 불가능*/
//        System.out.println(true+'a');
//        System.out.println(true-'a');
//        System.out.println(true*'a');
//        System.out.println(true/'a');
//        System.out.println(true%'a');


        System.out.println("=========문자열 형태의 숫자 '+' 연산=========");
        System.out.println("123"+"456"+"\n");//문자열로 인식


        System.out.println("=========논리와 문자열 연산=========");
        System.out.println(true+"a");
//        System.out.println(true-"a");
//        System.out.println(true*"a");
//        System.out.println(true/"a");
//        System.out.println(true%"a");

    }
}
