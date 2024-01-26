package com.ohgiraffers.section05.typecasting;

public class Aplication03 {
    public static void main(String[] args) {
        /*필기.
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변화 후 연산 처리 된다.
        * */

        int inum = 10;
        long lnum = 100;

//        int isum = inum + lnum; //long은 int에 담길수 없음;
        int result = inum + (int)lnum;
        System.out.println("r1: "+ result+"\n");

        int result2 = (int)(inum+lnum);
        System.out.println("r2: "+ result2);

        long result3 = inum + lnum;//자동 형변환 이용
        System.out.println("r3: "+ result3+"\n");


        /*주의사항. int 미만의 연산의 처리 결과는 int형*/
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

        int resultA = byteNum1 + byteNum2;
        int resultB = byteNum1 + shortNum1;
        int resultC = shortNum1 + byteNum1;
        int resultD = shortNum1 + shortNum2;

        System.out.println("resultA: "+ resultA );
        System.out.println("resultB: "+ resultB );
        System.out.println("resultC: "+ resultC );
        System.out.println("resultD: "+ resultD );

    }
}
