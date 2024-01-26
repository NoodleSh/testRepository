package com.ohgiraffers.test.work;

public class test02_240126 {
    public static void main(String[] args) {

        System.out.println();
        /*- 실습문제 1.
                두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
                두 수 중 큰 수를 출력하는 프로그램을 작성해본다
            */
        int a= 10;
        int b= 20;
        String ab = (a<b)? "두 수 중 큰 수는 20입니다 ": " 두 수 중 가장 큰 수가 아닙니다. ";
        System.out.print(ab+"\n");

        System.out.println("-----------------------------------------");

        /*- 실습문제 2
                정수형 변수를 선언하여 점수를 저장하고,
                삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,
                그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성해본다.
            */

        int score = 59;

        String scoreChk = ( score>=60)? "합격입니다" : "아쉽지만 불합격입니다";
        System.out.println(scoreChk);

        System.out.println("-----------------------------------------");

        /*- 실습문제 3
                정수형 변수를 선언하고, 삼항연산자를 사용하여
                입력된 수가 짝수인지 홀수인지 출력하는 프로그램을 작성해본다.

                참고사항 : 조건식에 %를 활용하여 짝수인지 홀수인지를 판단해 보세요~~
            */

        int c = 23;
        String cResult = (c%2==0)?"짝수" : "홀수";
        System.out.println(cResult);

        System.out.println("-----------------------------------------");

        /*- 실습문제 4
                실수를 변수로 선언하여 점수를 저장하고, 이를 정수로 변환하여
                점수가 90점 이상이면 ”A”,
                80점 이상이면 “B”,
                70점 이상이면 “C”,
                60점 이상이면”D”,
                60점 미만이면 “F”를 출력하는 프로그램을 작성해본다.
            */

            int testScore = 90;

            String testScoreChk = (testScore>=90)? "A":(testScore>=80)? "B":
                                    (testScore>=70)? "C":(testScore>=60)? "D":"F";
            System.out.println("등급은 "+ testScoreChk+"입니다.");



        System.out.println("-----------------------------------------");
        /*- 실습문제 5
            정수형 변수를 두개 선언하여 회원의 월(month)과 일(day)를 저장합니다.
            월이 1월부터 6월까지이면서, 일이 1일부터 15일까지인 경우 “배민 쿠폰”을,
            월이 7월부터 12월까지이면서, 일이 16일부터 31일까지인 경우 “스타벅스 커피”를
            그 외의 경우는 “사탕”이 선물로 선택되는 프로그램을 작성해본다.

            ---

            출력예시

            “본인이름”의 선물은 스타벅스 커피 입니다.
            또는 “본인이름”의 선물은 사탕 입니다.
        */


        int month = 12;
        int day = 31;


        String coupon = ((month >= 1 && month <= 6 ) && (day >= 1 && day<=15 ))? "배민 쿠폰" :
                        ((month >= 7 && month <= 12 ) && (day >= 16 && day <= 31 ))? "스타벅스 쿠폰" : "사탕";

        String coupon2 = (month <= 6 && day <= 15)? "배민 쿠폰" : ( month >= 7 && 16 <= day)? "스타벅스 쿠폰" : "사탕";

        System.out.println("선물은 "+coupon+" 입니다.");
        System.out.println("선물은 "+coupon2+" 입니다.");

    }
}
