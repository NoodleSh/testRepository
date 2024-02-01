package com.ohgiraffers.section04.sort;

public class Aplication01 {
    public static void main(String[] args) {
        /*변수의 두 값 변경하기*/
        int num1 = 10;
        int num2 = 20;

        int temp;

        temp = num1;//temp에 10
        num1 = num2; //num1에 20
        num2 = temp; //num2에 10

        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);

        System.out.println("--------------------------");

        int[]arr = {2,1,3};

        int temp2;

        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
