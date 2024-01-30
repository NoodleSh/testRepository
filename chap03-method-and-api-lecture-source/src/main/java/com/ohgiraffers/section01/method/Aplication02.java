package com.ohgiraffers.section01.method;

public class Aplication02 {
    public static void main(String[] args) {
        Aplication02 app2 = new Aplication02();

        System.out.println("main() 시작됨..");

        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨..");

    }

    public void methodA(){
        System.out.println("methodA() 호출함..");
        System.out.println("methodA() 종료됨..");
    }

    public void methodB(){
        System.out.println("methodB() 호출함..");
        System.out.println("methodB() 종료됨..");
    }

    public void methodC(){
        System.out.println("methodC() 호출함..");
        System.out.println("methodC() 종료됨..");
    }
}
