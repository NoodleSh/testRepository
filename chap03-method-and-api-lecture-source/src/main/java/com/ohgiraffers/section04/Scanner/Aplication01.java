package com.ohgiraffers.section04.Scanner;

import java.util.Scanner;

public class Aplication01 {
    public static void main(String[] args) {
        /*java.util.Scanner 를 이용한 다양한 자료형 값 입력 받기*/

        Scanner sc= new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.print("키를 입력하세요: ");
        float height = sc.nextFloat();
        System.out.println("입력하신 이름은 "+ name + ", "
                            + " 나이는 " + age +"살,"
                            + "키는 " + height + "cm 입니다");

        System.out.print("true 또는 false를 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("\n");
        System.out.println("입력하신 논리값은 " + isTrue + " 입니다.");

        System.out.println("-----------------------------------");
        sc.nextLine();
        System.out.println("아무 문자열을 입력해 주세요: ");
        char ch = sc.nextLine().charAt(3);
        System.out.println("입력하신 문자는 "+ ch + " 입니다.");

    }
}
