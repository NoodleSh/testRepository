package com.ohgiraffers.section05.logical;

public class Aplication02 {
    public static void main(String[] args) {
        /*논리 연산자의 우선순위
        *  && : 11순위
        * || : 12순위
        * */

        int num1 = 55;
        /*1 <= 변수 <= 100 (X)
        * 변수 >= 1 && 변수 <= 100 (O)*/
        System.out.println("1부터 100사이인지?? : "+ ( num1 >= 1 && num1 <= 100 )+"\n");

        int num2= 175;
        System.out.println("1부터 100사이인지?:"+ (num2>=1 && num2<=100)+"\n");

        /*문자변수 >= 'A' && 문자변수 <='Z'*/
        char ch='T';
        System.out.println("대문자인가?: "+ (ch >= 'A' && ch<='Z'));

        char ch2='w';
        System.out.println("대문자인가?: "+ (ch2 >= 'A' && ch2 <= 'Z')+"\n");

        /*대소문자 상관없이 영문자 'y'인지 확인*/
        char ch3='y';
        System.out.println("영문자 y 인지??: "+ (ch3 == 'y' && ch3 == 'Y')+"\n");

        /*영문자인지??*/
        /*A~Z : 65~90
        * a~z: 97~120
        * */
        char ch4='k';
        System.out.println("영문자인지??: "+ ((ch4 >= 'A' && ch3 <= 'Z')||(ch4 >= 'a' && ch3 <= 'z'))+ "\n");
        System.out.println("영문자인지??: "+ ((ch4 >= 65 && ch3 <= 90)||(ch4 >= 97 && ch3 <= 120))+ "\n");
    }
}
