package com.ohgiraffers.section01.method;

public class Aplication06 {
    public static void main(String[] args) {
        /*메소드는 항상 마지막에 return 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때 그냥 복귀를 할 수 도 있지만, 값을 가지고 복귀할 수도 있다.
        * 이 때 가지고 가는 값을 리턴값이라고 한다,*/

        /*
        * return값을 반환받기 위해서는 메소드 선언부에 리턴 탑일을 명시해 주어야 한다.
        * void는 아무 반환값도 가지지 않겠다는 리턴 타입에 사용할 수 있는 키워드이다.
        * 반환값이 없는 경우 return 구문을 생략해도 무관하다.
        * 반환값이 있는 경우는 return 구문을 반드시 작성해야 한다.
        * 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야 한다.
        * */

        Aplication06 app6 = new Aplication06();
        String returnText = app6.testMethod();

        System.out.println(returnText);
        System.out.println(app6.testMethod());
    }

    public String testMethod() {
        /*
         * ㅔpublic 뒤에 바로 return으로 가자고 갈 타입을 명시한다.
         * 아무 값도 리턴하지 않는 경우 void, 값을 반환하는 경우 자료형을 명시한다
         * */
        return "hello world!";
    }

}

