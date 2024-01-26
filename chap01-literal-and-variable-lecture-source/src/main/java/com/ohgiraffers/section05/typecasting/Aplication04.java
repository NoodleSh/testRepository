package com.ohgiraffers.section05.typecasting;

public class Aplication04 {
    public static void main(String[] args) {
        /*필기. 형변환시 주의할 점
        * -데이터 손실에 유의해서 사용
        * */

        /*의도치 않은 데이터 손실*/
        int inum = 290;
        byte bnum = (byte)inum;

        System.out.println("inum: "+ inum);
        System.out.println("bnum: "+ bnum+"\n");  //앞부분의 비트 손실로 예측이 어려움

        /*의도한 데이터 손실*/
        double height = 175.5;
        int floorHeight = (int)height;

        System.out.println("height: "+ floorHeight);
    }
}
