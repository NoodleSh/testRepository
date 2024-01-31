package com.ohgiraffers.section02.looping;

import java.util.Scanner;
import  java.lang.Math;
public class A_for {
    /* [for문 표현식]
    * for(초기식; 조건식; 증감식){
    *   조건을 만족하는 경우 수행할 구문(반복할 구문)
    * }
    * */

 public void simpleForStatement(){
     /*1~10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문*/
     for(int i = 1; i <= 10; i++){
         System.out.print(i+" ");
     }
 }

 public void testForExample(){
     Scanner sc = new Scanner(System.in);
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu1 = sc.nextLine();
//     System.out.println(menu1 + "을 1순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu2 = sc.nextLine();
//     System.out.println(menu2 + "을 2순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu3 = sc.nextLine();
//     System.out.println(menu3 + "을 3순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu4 = sc.nextLine();
//     System.out.println(menu1 + "을 4순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu5 = sc.nextLine();
//     System.out.println(menu1 + "을 5순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu6 = sc.nextLine();
//     System.out.println(menu1 + "을 6순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu7 = sc.nextLine();
//     System.out.println(menu1 + "을 7순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu8 = sc.nextLine();
//     System.out.println(menu1 + "을 8순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu9 = sc.nextLine();
//     System.out.println(menu1 + "을 9순위로 먹고싶습니다!");
//
//     System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//     String menu10 = sc.nextLine();
//     System.out.println(menu1 + "을 10순위로 먹고싶습니다!");

        for(int i=1; i<=10; i++ ){
            System.out.print("먹고 싶은 메뉴를 입력하세요 : ");
            String menu = sc.nextLine();
            System.out.println(menu + "을 " + i + "순위로 먹고싶습니다!" +"\n");
        }
     System.out.println("돼지 되겠다..");


    }
    public void testExample2(){
//        int num1=1;
//        int num2=2;
//        int num3=3;
//        int num4=4;
//        int num5=5;
//        int num6=6;
//        int num7=7;
//        int num8=8;
//
//        int sum = 0;
//
//        sum += num1; // 1
//        sum += num2; // 3
//        sum += num3; // 6
//        sum += num4; // 10
//        sum += num5; // 15
//        sum += num6; // 21
//        sum += num7; // 28
//        sum += num8; // 36

        int sum2=0;
        for(int i=1; i<=8; i++){
            sum2+=i;
        System.out.println(sum2);
        }

    }

    public void testExample3(){
     int random = (int)(Math.random()*6) + 5;
     int sum = 0;

     for(int i =0; i<random; i++){
         sum+=i;
     }
         System.out.println("1부터 "+ random + "까지의 합은 : "+sum);


//        System.out.println("random: "+ random);

//        int sum = 0;
//
//        if(random == 5){
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//        }else if(random == 6){
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//        }else if(random == 7){
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//        }else if(random == 8){
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//            sum += 8;
//        }
//        else if(random == 9){
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//            sum += 8;
//            sum += 9;
//        }else{
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//            sum += 8;
//            sum += 9;
//            sum += 10;
//        }
//        System.out.println("1부터 "+ random + "까지의 합은 : "+sum);
    }
    public void testForExample4(){
     /*
     * [두 수의 합]
     * 1. Scanner를 이용하여 두 개의 정수를 입력받는다.
     *    (단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 진행)
     * 2. 입력된 두 수 중, 작은 수부터 큰 수까지의 합계를 구한다.
     * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수: ");
        int num2 = sc.nextInt();

/*
        int sum = 0;
        if(num1>num2){
            for(int i= num2; i<num1; i++){
                sum+=i;
            }
        }else{
            for(int i = num1; i<num2; i++){
                sum+=i;
            }
        }
        System.out.println("sum: "+ sum);
*/


        int sum2 = 0;
        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);

        for(int i = max; i>=min; i--){
            sum2+=i;
        }
        System.out.println("sum2 : " + sum2);
    }


}
