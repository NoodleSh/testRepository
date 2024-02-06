package com.ohgiraffers.testPac.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;
public class Test2 {
    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);

        // 정수를 입력 받아서 입력받은 정수가 발생한 난수보다 큰 경우
//         * “정수가 난수보다 큽니다."를,
//         * 입력받은 정수보다 난수가 작은 경우 "정수보다 난수가 작습니다."를 출력하며
//         * 입력한 정수와 난수와 같은 경우가 될 때까지 난수 맞추기를 반복하는 프로그램을 만드세요.
//         *
//         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. n회 만에 정답을 맞추셨습니다."라고
//         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
//         * 첫 회부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
//         *
//         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하세요.
//         *
//         * -- 프로그램 예시 --
//         * 정수를 입력하세요 : 5
//         * 입력하신 정수보다 작습니다.
//         * 정수를 입력하세요 : 3
//         * 입력하신 정수보다 큽니다.
//         * 정수를 입력하세요 : 4
//         * 정답입니다. 3회만에 정답을 맞추셨습니다.
//         *


//         1부터 100 사이의 난수를 발생시키고
//        int  randNum;
//        int inputNum ;
//        int count = 0;

//        do{
//            System.out.print("숫자입력: ");
//            inputNum = sc.nextInt();
//
//            if(inputNum > randNum){
//                System.out.println("큼");
//            }else{
//                System.out.println("작음");
//            }
//            count++;
//
//        }while (randNum != inputNum);
//        System.out.println("같음 " + count + " 회 만에 출력");
//        (do-while)





//        System.out.print("숫자 입력: ");
//        inputNum = sc.nextInt();
//
//
//        randNum = (int)(Math.random()*100)+1;
//        System.out.println("난수: "+ randNum);
//
//
//        while(inputNum != randNum){
//            if(inputNum > randNum){
//                System.out.println("난수: "+ randNum);
//                System.out.println("큼");
//                System.out.print("숫자 입력: ");
//                inputNum = sc.nextInt();
//                System.out.println();
//
//            }else if(inputNum < randNum){
//                System.out.println("난수: "+ randNum);
//                System.out.println("작음");
//                System.out.print("숫자 입력: ");
//                inputNum = sc.nextInt();
//                System.out.println();
//
//            }else{
//                System.out.println("같습니다."+ count + "회 만에 맞추셨습니다.");
//                break;
//            }
//            count++;
//
//        }
//              (while문)


//
//
//        int randNum = (int)(Math.random()*100)+1;
//        System.out.println("난수: " + randNum);
//
//
//        int count = 0;
//
//        for(int i = 0; true; i++){
//            System.out.print("숫자 입력: ");
//            int inputNum = sc.nextInt();
//
//            if(inputNum > randNum){
//                System.out.println("큼");
//                continue;
//
//            } else if (inputNum < randNum) {
//                System.out.println("작음");
//                continue;
//
//            } else {
//                System.out.println("같음 " + i + " 회 만에 출력");
//            }
//        }


        System.out.println("-----------------Array 실습문제-------------------");

        /* 1. 길이가 5인 String 배열 선언
         * 2. "딸기", "바나나", "복숭아", "키위", "사과"로 초기화
         * 3. 스캐너로 0부터 4까지의 정수를 입력받아
         * 4. 해당 정수의 인덱스에 있는 과일을 출력
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */


//        Scanner sc = new Scanner(System.in);
//        String[]str = {"딸기","바나나","복숭아","키위","사과"};
//
//        System.out.print("0부터 4까지의 정수를 입력하세요: ");
//        int strNum = sc.nextInt();
//
//        for(int i=0; i<str.length; i++){
//
//            if(strNum < str.length){
//                System.out.println(str[strNum]);
//                break;
//            }else{
//                System.out.println("준비된 과일이 없습니다.");
//                break;
//            }
//        }

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요.
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1*****
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호 입력: ");
        String str =sc.nextLine();
        char[]ch = new char[str.length()];


        for(int i=0; i<str.length(); i++){
            ch[i]+=str.charAt(i);
        }

        char[]ch2 = new char[ch.length];

        for(int i = 0; i < ch.length; i++){
            if(i<8){
                ch2[i]+=ch[i];
            }else{
                ch2[i]+= '*';
            }
        }

        for(int i=0; i<ch.length; i++){
            System.out.print(ch2[i]);
        }


        /*
         * [ 로또번호 생성기 ]
         * 6칸짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * */

//        Random rd = new Random();
//
//        //int randNum = (rd.nextInt(45))+1;
//        int[]num = new int[6];
//        int temp;
//
//
//
//        for(int i = 0; i < 6; i++){//i는 전체순회
//                num[i] = rd.nextInt(6);//num[i]에 랜덤값 생성
//                System.out.println("난수 : "+ num[i]);
//                for(int j = 0; j<i; j++){ // j는 배열안의 인덱스를 순회
//                  if(num[i] == num[j]){ // 생성된 랜덤값과 배열안의 인덱스 값이 같으면
//                       i--;// i를 감소하여 다시 한번 순회
//                  }
//                }
//            }
//
//
//        for(int i = 0; i < 6; i++){
//            for(int j = 0; j<i; j++) {
//                if (num[i] < num[j]) { //랜덤값이 기존 인덱스값 보다 작으면
//                    temp = num[j];// temp에 기존 인덱스값 저장
//                    num[j] = num[i];// 기존 인덱스 자리에 생성된 랜덤값 저장
//                    num[i] = temp;//랜덤값이 처음 들어왔던 자리에 temp에 저장된 기존 인덱스 값 저장
//                }
//            }
//        }
//
//        for(int array:num)
//            System.out.print(array+" ");


    }
}
