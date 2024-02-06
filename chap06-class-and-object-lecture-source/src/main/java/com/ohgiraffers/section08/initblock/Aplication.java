package com.ohgiraffers.section08.initblock;

public class Aplication {
    public static void main(String[] args) {
        /*
        * 초기화 블럭
        * 1. 인스턴스 초기화 블럭
        *    인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
        *    인스턴스를 호출하는 시점마다 호출이 된다.
        *    인스턴스 변수를 초기화 하며 정적필드에는 실행시점마다 값을 덮어쓴다.
        *
        * {
        *      초기화 내용 작성
        * }
        *
        * 2. 정적 초기화 블럭
        *    클래스가 로드될 때 한 번 동작한다.
        *    정적 필드를 초기화하며, 인스턴스 변수는 초기화하지 못한다.
        *
        * static{
        *       초기화 내용 작성
        * }
        * */

        Product pd = new Product();

        /* 초기화 블럭이 실행되면 명시적 초기값을 덮어 쓴다. */
        System.out.println(pd.getInformation());

        System.out.println("-----------------------------------------------");

        /* 매개변수 있는 생성자를 이용한 초기화 확인 */
        Product pd2 = new Product("케모마일차",4200,"투썸");
        System.out.println(pd2.getInformation());
        }
    }

