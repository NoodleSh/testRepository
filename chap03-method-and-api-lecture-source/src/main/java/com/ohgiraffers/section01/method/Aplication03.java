package com.ohgiraffers.section01.method;

public class Aplication03 {
    public static void main(String[] args) {
        Aplication03 app3 = new Aplication03();
        /*전달인자와 매개변수를 이용한 메소드 호출 테스트*/

        int age2 = 20;
        byte byteAge = 40; 
        long longAge = 60;

        app3.testMethod(byteAge);// 자동형변환
        //app3.testMethod(longAge);
        app3.testMethod((int)longAge);//강제 형변환(데이터 손실 주의)
        app3.testMethod(age2 *4);

        //app3.testMethod("스물다섯살"); //매개변수와 자료형이 일치해야함
        //app3.testMethod(25,27); //매개변수와 전달값의 개수가 일치 해야함
        //aap3.testMethod(); //매개변수가 존재할 경우, 전달값이 존재해야함
        /*전달인자(arguments)와 매개변수(parameter)를 이용한 메소드 호출*/

        /*변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드)
        * 4. 클래스(static)변수
        * */

        /*지역변수는 선언한 메소드 블럭 내부에서만 사용 가능하다. 이것을 지역변수의 스코프라고 한다
        * 다른 메소드간 서롷 공유해야 하는 값이 존재하는 경우 메소드 호풀 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이 때 전달하는 값을 전달인자(argument)라고 부르고,
        * 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
        * */



    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 "+ age +"세 입니다.");
    }
}
