package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section01.method.Calculator;
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//ㄴstatic 메소드를 사용하는 경우 임포트 방법
import java.util.Scanner;

public class Aplication02 {
    public static void main(String[] args) {
        /* 임포트란?
        * 서로 다른 패키지에 존자해는 클래스를 사용하는 경우,
        * 매번 풀 클래스 네임을 기술하기가 번거롭다.
        * 그래서 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해
        * 미리 선언하는 임포트문을 사용하면 풀 클래스 네임을 매번 작성하지 않아도 된다.
        * */

        /*non-static메소드 호출 방법*/
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50,60);
        System.out.println("50과 60중 더 작은 값은 : " + min);

        /*static메소드 호출방법*/
        int max = Calculator.maxNumberOf(50,60);
        int max2 = maxNumberOf(50,60);
        System.out.println("50과 60중 더 큰 값은 : " + max);
        System.out.println("50과 60중 더 큰 값은(클래스 생략) : " + max2);

    }
}
