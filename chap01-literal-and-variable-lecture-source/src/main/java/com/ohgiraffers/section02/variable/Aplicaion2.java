package com.ohgiraffers.section02.variable;

public class Aplicaion2 {
    public static void main(String[] args) {
        /*필기. 변수를 사용하는 방법
        * 1. 변수를 준비한다(선언)
        * 2. 변수에 값을 대입한다. (값 대입 및 초기화)
        * 3. 변수를 사용한다.*/

        /*필기. 자료형 변수명;*/

        /*필기. 자료형이란?
        *  다양한 값의 형태별로 어느 정도 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        * 이러한 자료형은 기본 자료형(Primary type)과 참조 자료형(Reference type)으로 나누어진다.
        * 그 중 기본 자료형 8가지 부터 살펴보자*/

        /*필기. 정수를 취급하는 자료형 4가지*/
        byte bnum; //1byte
        short snum; //2byte
        int inum; //4byte
        long lnum; //8byte;


        /*필기. 실수를 취급하는 자료형 2가지*/
        float fnum; //4byte
        double dnum; //8byte

        /*필기. 문자를 취급하는 자료형 1가지*/
        char ch; //2byte
        char ch2;

        /*필기. 문자열을 취급하는 자료형 1가지(기본 자료형은 아니므로 참고)*/
        String str; //4byte

        /*필기. 논리값을 취급하는 자료형 1가지*/
        boolean isTrue; //1byte

        bnum=1;
        snum=2;
        inum=4;
        lnum=8; //컴파일 에러는 뜨지 않지만 L 붙여야함
        lnum=8L;

//        fnum=4.0;
        fnum=4.0f;
        dnum=8.0;

        ch='a';
        ch2=97; //오류 발생하지 않음. 아스키 코드 참조

        isTrue=true;
        isTrue=false;
//      true 혹은 false 중 한 가지의 값만 사용 가능하다.


        str="안녕하세요";
        /*필기.
        * 숫자로 된 형태으 값을 그대로 사용하는 자료형은 byte, short, int, double이다.
        * 일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 한다.
        * 정수형은 int, 실수형은 double이 대표 자료형이다.*/

        int point=100;
        int bonus = 10;
        System.out.println("====== 변수에 저장된 값 출력 ======");
        System.out.println("bnum의 값:"+ bnum);
        System.out.println("snum의 값:"+ snum);
        System.out.println("inum의 값:"+ inum);
        System.out.println("lnum의 값:"+ lnum+"\n");

        System.out.println("fnum의 값:"+ fnum);
        System.out.println("dnum의 값:"+ dnum+"\n");

        System.out.println("ch의 값: "+ch);
        System.out.println("ch2의 값: "+ch2+"\n");

        System.out.println("isTrue의 값: "+isTrue+"\n");

        System.out.println("str의 값: "+str+"\n");

        System.out.println("포인트와 보너스의 합은?: "+(point+bonus)+"\n");

        point = point + 100;
        System.out.println("point = point + 100?: "+ point+"\n");
    }
}
