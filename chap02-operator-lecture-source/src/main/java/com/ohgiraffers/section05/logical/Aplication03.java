package com.ohgiraffers.section05.logical;
import java.util.Scanner;
public class Aplication03 {
    public static void main(String[] args) {
        /*AND 연산과 OR연산의 특징
        * 논리식 && 논리식: 앞의 결과가 false이면 뒤를 실행 안함
        *   -조건식 모두 만족해야 true를 반환하기 때문에 앞의 결과가 false이면 false를 반환.(뒤에 있는 조건식 무시)
        *   -연산 횟수를 줄이기 위해서는 앞에 false가 나올 확률이 큰 조건식을 작성한다.
        *
        * 논리식 || 논리식: 앞의 결과가 true이면 뒤를 실행 안함
        *   -조건식 하나만 만족해도 true를 반환하기 때문에 앞의 결과가 true가 나오면 true를 반환.(뒤에 있는 조건식 무시)
        *   -연산 횟수를 줄이기 위해서는 앞에 true가 나올 확률이 큰 조건식을 작성한다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("입력하세요: ");
        String test=sc.nextLine();
        System.out.print(test+" ->입력테스트");
        int num = 10;
        int result = (false && ++num > 0)? num : num;
        System.out.println("&&실행 결과: "+result+"\n");

        int num2 = 10;
        int result2 = (true || ++num2 > 0)? num2 : num2;
        System.out.println("||실행 결과: "+result2+"\n");


    }
}
