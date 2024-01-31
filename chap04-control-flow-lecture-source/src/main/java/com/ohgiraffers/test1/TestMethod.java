package com.ohgiraffers.test1;

import java.util.Scanner;
import java.lang.Math;
public class TestMethod {



    public void Calculator(int inum1, int inum2) {
        System.out.println("두 수를 더한 값은 " + (inum1 += inum2) +" 입니다.");
        System.out.println("두 수를 뺀 값은 " + (inum1 -= inum2) +" 입니다.");
        System.out.println("두 수를 곱한 값은 " + (inum1 *= inum2) +" 입니다.");
        System.out.println("두 수를 나눈 몫은 " + (inum1 /= inum2) +" 입니다.");
        System.out.println("두 수를 나눈 나머지는 " + (inum1 %= inum2) +" 입니다.");
    }

    public double CircleArea(double radius) {
        final double CIRCLE = 3.14;

        double volume = CIRCLE * radius * radius;
        return volume;
    }

    public static String randomNum(){
        int randInt = (int)(Math.random()*10)+1;

        String result = "생성된 난수는 " + randInt +" 입니다.";
        return result;
    }



}
