package com.ohgiraffers.section01.literal;

public class Aplication03 {
    public static void main(String[]args){
        System.out.println("========== 두개의 문자열 합치기 ============");
        System.out.println(9+9); //18
        System.out.println("9"+9);//99
        System.out.println(9+"9");//99
        System.out.println("9"+"9"+"\n");//99

        System.out.println("========= 세개의 문자열 합치기 ============");
        System.out.println(9+9+"9"); //189 ('+'연산은 왼쪽에서부터 오른쪽 방향)
        System.out.println(9+"9"+9); //999
        System.out.println("9"+(9+9)+"\n"); //918

        System.out.println("========= 10과 20의 사칙연산 결과============");
        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10*20);
        System.out.println(10/20);
        System.out.println(10%20+"\n");

        System.out.println("========= 10과 20의 사칙연산 결과를 가독성있게 출력============");
        System.out.println("10과 20의 합:"+(10+20));
        System.out.println("10과 20의 차:"+(10-20));
        System.out.println("10과 20의 곱:"+10*20);//'+','-'보다 '*'우선순위를 가짐(괄호 없어도 O)
        System.out.println("10과 20의 나누기 한 몫:"+10/20);//'+','-'보다 '/'우선순위를 가짐(괄호 없어도 O)
        System.out.println("10과 20의 나누기 한 나머지:"+10%20+"\n");//'+','-'보다 '%'우선순위를 가짐(괄호 없어도 O)

        System.out.println("기차");
        System.out.println("기차"+" 칙칙폭폭");
        System.out.println("기차"+ 123+ 45+" 출발");
        System.out.println(123+45+"기차"+"출발");
        
    }
}
