package com.ohgiraffers.section01.array;
import java.lang.Math;
import java.util.Scanner;

public class Aplication04 {
    public static void main(String[] args) {
        /*[카드 뽑기]
        * 1. 문자열 배열에 SPADE, CLOVER, HEART, DIAMOND를 저장
        * 2. 문자열 배열에 2,3,4,5,6,7,8,9,10, JACK, QUEEN, KING, ACE 를 저장
        * 3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생시킨다.
        * 4. 위에서 발생시킨 난수를 황용하여 카드를 출력한다.
        *
        * === 출력예시 ===
        * 당신이 뽑은 카드는 DIAMOND 9 카드 입니다.
        * */
        
        
        // 1. String 타입 배열에 카드이름을 저장
        // 2. String 타입 배열에 카드 번호를 저장 
        // 3. Math.random() * 카드이름.length
        //    Math.random() * 카드번호.length
            //3-1. Math는 기본적으로 실수를 반환하므로,
            //     원하는 자료형으로 형변환을 해준다.
        // 4. 3번을 int형 변수를 만들어 각각 저장해준다.
        // 5. 출력문을 작성한 뒤 카드이름[저장한 배열 길이],
        //    카드번호[저장한 배열 길이]로 출력한다


       //카드 이름, 카드 번호
       String[] cardName = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
       String[] cardNum = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN"," KING","ACE"};

        //배열 길이
        //Math는 기본적으로 실수(float, double)
        int randCardName = (int)Math.random() * cardName.length;
        int randCardNum = (int)Math.random() * cardNum.length;

        System.out.println("당신이 뽑은 카드는 " + cardName[randCardName] + " " + cardNum[randCardNum]+ " 입니다.");



    }
}
