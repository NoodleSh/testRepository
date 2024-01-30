package com.ohgiraffers.section03.math;

public class Aplication02 {
    public static void main(String[] args) {
        /* 난수의 활용
        * (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        int random1 = (int)(Math.random() * 10);
            System.out.println("난수 출력1 : " + random1);

        int random2 = (int)(Math.random() * 10)+1;
            System.out.println("난수 출력2 : " + random2);

        int random3 = (int)(Math.random() * 6)+10;
            System.out.println("난수 출력(10~15) : " + random3);



            int randInt = 5;
                System.out.println("난수 출력: " + randNum(randInt));



    }

    public static int randNum(int randInt){
        randInt *= (int)(Math.random() * 10);
        return randInt;
    }
}
