package com.ohgiraffers.section01.method;

public class Aplication04 {
    public static void main(String[] args) {
        /*여러 개의 전달인자를 이용한 메소드 호출 테스트*/
        Aplication04 app4 = new Aplication04();

        String name = "신동우";
        int age = 27;
        char gender = '남';

        app4.testMethod(name, age, gender); //순서가 같아야 함

        /* 매개변수도 일종의 지역변수로 분류된다.
        * 매개변수 역시 final키워드를 사용할 수 있다.
        * 지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다.
        * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.
        * */

    }

    public void testMethod(String name, int age, char gender){
        System.out.println("당신의 이름은 " + name +", 나이는 "+ age + "세, 성별은 "+ gender +" 입니다.") ;
    }

}
