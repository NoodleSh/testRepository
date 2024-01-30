package com.ohgiraffers.section03.math;

import java.util.Random;

public class Aplication03 {
    public static void main(String[] args) {
        /* java.util.Random 클래스 활용하여 난수 발생
        * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int Bound): 0부터 매개변스로 전달받은 정수 범위까지의 난수를 발생시켜 정수 형태로 반환
        * */

        /* random.nextInt(구하려는 난수 갯수) + 구하려는 난수 최소값 */

        Random random = new Random();
        int randInt = random.nextInt(10);
        System.out.println("0~9 난수: " + randInt);

        System.out.println("-------------------------------");
        int randInt2 = random.nextInt(26)+20;
        System.out.println("20~45 난수: " + randInt2);
    }
}
