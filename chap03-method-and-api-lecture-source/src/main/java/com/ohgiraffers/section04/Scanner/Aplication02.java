package com.ohgiraffers.section04.Scanner;

import java.util.Scanner;

public class Aplication02 {
    public static void main(String[] args) {
        /*
        * nextLine(): 공백을 포함한 한줄을 입력을 위한 개행문자
        *             전 까지 읽어서 문자열로 반환(공백문자 포함)
        *
        * next(): 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환(공백문자 포함하지 않음)
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("인사말을 입력해 주세요(공백O): ");
        String greeting = sc.nextLine();
        System.out.println("인사말(공백포함): "+ greeting);
        System.out.print("인사말을 입력해 주세요(공백X): ");
        String greeting2 = sc.next();
        System.out.println("인사말(공백X): "+ greeting2);



    }
}
