package com.ohgiraffers.test1;

import java.util.Scanner;

public class CircleArea {

    public double CircleArea(double radius){
        final double CIRCLE = 3.14;

        double volume = CIRCLE * radius * radius;
        return volume;
        
    }

    public static void main(String[] args) {

        CircleArea ca = new CircleArea();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("반지름 입력: ");
        double radius = sc.nextDouble();//반지름
        
        double volumeResult = ca.CircleArea(radius); //부피 반환값
        System.out.println("부피: "+ volumeResult);
    }
}
