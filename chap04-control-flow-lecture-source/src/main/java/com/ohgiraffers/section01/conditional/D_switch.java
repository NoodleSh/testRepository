package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public  void simpleSwitchStatement(){
        /*
        * [switch문 표현식]
        * switch(비교 할 변수){
        *   case 비교값1 : 비교할 변수의 값 == 비교값1인 경우 실행할구문;
        *       break;
        *   case 비교값2 : 비교할 변수의 값 == 비교값2인 경우 실행할구문;
        *       break;
        *  default : 위 case에 모두 해당하지 않는 경우 실행 할 구문;
        *      break;
        * }
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력: ");
        int firstNum = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int secondNum = sc.nextInt();

        System.out.print("연산 기호 입력(+, - ,*, /, %): ");
        char op = sc.next().charAt(0);
        
        /*연산 결과를 저장할 변수*/
        int result = 0;

        switch (op){
            case '+': result = firstNum + secondNum;
                break;
            case '-': result = firstNum - secondNum;
                break;
            case '*': result = firstNum * secondNum;
                break;
            case '/': result = firstNum / secondNum;
                break;
            default:
                System.out.println("다시 입력해주세요");
                break;
        }

        System.out.println("연산결과: "+ result);
    
    }

    public void switchVendingMachine() {
            /*<switch-case>문 이용 실습
            * 1. Scanner를 이용해 음료 이름(String)과 갯수(int)를 입력받는다.
            * 2. switch-case 문을 사용해 전체 가격을 구한다.
            * 3. ['음료이름' 을 '개수' 개 선택하셨습니다. '가격'을 투입해주세요.]
            *     우와 같이 출력되도록 한다.
            * */

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------- 자판기 ------------------");
        System.out.println("코카콜라(1,700)/ 환타(1,200)/ 하늘보리(1,000)/ 핫식스(2,000) ");
        System.out.println("-----------------------------------------------");


        System.out.print("음료 선택(1.코카콜라, 2.환타, 3.하늘보리, 4.핫식스): ");
        String drinkName = sc.next();
        System.out.print("개수: ");
        int count = sc.nextInt();
        int price = 0;

        switch (drinkName){
            case "코카콜라" :
                System.out.println(drinkName+"를 "+ count+"개 선택하셨습니다. " +(1700*count)+ "원을 투입해주세요");
                break;
            case "환타" :
                System.out.println(drinkName+"를 "+ count+"개 선택하셨습니다. " +(1200*count)+ "원을 투입해주세요");
                break;
            case "하늘보리" :
                System.out.println(drinkName+"를 "+ count+"개 선택하셨습니다. " +(1000*count)+ "원을 투입해주세요");
                break;
            case "핫식스" :
                System.out.println(drinkName+"를 "+ count+"개 선택하셨습니다. " +(2000*count)+ "원을 투입해주세요");
                break;
            default:
                System.out.println("존재하지 않는 메뉴입니다.");
                break;
        }

        /*선생님 답*/
     /*   switch (drinkName){
            case"코카콜라": price = 1700*count; break;
            case"환타": price = 1200*count; break;
            case"하늘보리": price = 1000*count; break;
            case"핫식스": price = 2000*count; break;
            default:System.out.println("존재 하지 않는 메뉴입니다,"); break;
        }
        System.out.println(drinkName + "를 "+ count+"개 선택했습니다. "+ price+ "원을 투입해 주세요");
*/



    }
}
