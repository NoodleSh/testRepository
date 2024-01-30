package com.ohgiraffers.section01.method;

public class Aplication05 {
    public static void main(String[] args) {
        /* 메소드 리턴에 대해 이해할 수 있다.
        * -return이란?
        *   모든 메소드 내부에는 return;이 존재한다.
        *   void 메소드의 경우 return;을 명시적으로 작성하지 않도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
        *   return은 현재 메소드를 강제 종료하고 호풀한 구문으로 다시 돌아가는 명령어이다.
        * */

        System.out.println("main() 시작");
        
       int age=20;
       String ageChk="나이확인: ";

        
        Aplication05 app5 = new Aplication05();
        app5.testMethod();
        System.out.println(app5.testMethod2(ageChk,age));
    }
    
    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        /*컴파일러에 의해 자동으로 추가되는 구문이다.
        *  가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다
        * */
        return;
//        System.out.println("testMethod() 동작 확인");
    }
    public String testMethod2(String ageChk, int age){
        if(age==20){
            ageChk+="20살입니다";
        }
        return ageChk;
    }
}
