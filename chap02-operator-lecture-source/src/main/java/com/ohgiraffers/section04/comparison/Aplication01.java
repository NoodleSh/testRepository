package com.ohgiraffers.section04.comparison;

public class Aplication01 {
    public static void main(String[] args) {
        /*필기.
        * 비교 연산자
        * 비교 연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        * */
        
        /*필기.
        * 비교연산자의 종류
        * '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true, 다르면 false를 반환한다.
        * '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true, 같으면 false를 반환한다.
        *  '>=' : 왼쪽의 피연산자와 오른쪽의 피연산자보다 이상이거나 같으면 true, 미만이면 false를 반환한다.
        *  '<=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 이하거나 같으면 true, 미만이면 false를 반환한다.
        * '<' : 왼쪽의 피연산자와 오른쪽의 피연산자보다 작으면 true, 크면 false를 반환한다.
        * '>' : 왼쪽의 피연산자와 오른쪽의 피연산자보다 크면 true, 작으면 false를 반환한다.
        * */

        int inum1 = 10;
        int inum2 = 20;
        System.out.println("=========== 정수값 비교 =============");
        System.out.println(" inum1과 inum2가 같은지 비교: "+(inum1 == inum2));
        System.out.println(" inum1과 inum2가 같지 않은지 비교: "+(inum1 != inum2));
        System.out.println(" inum1이 inum2보다 큰지 비교: "+(inum1 > inum2));
        System.out.println(" inum1이 inum2보다 크거나 같은지 비교: "+(inum1 >= inum2));
        System.out.println(" inum1이 inum2보다 작은지 비교: "+(inum1 < inum2));
        System.out.println(" inum1이 inum2보다 작거나 같으지 비교: "+(inum1 <= inum2)+"\n");


        /*문자값 비교*/
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("a와 A는 같은지?: " +(ch1==ch2));
        System.out.println("a와 A는 다른지?: " +(ch1!=ch2));
        System.out.println("a보다 A가 크거나 같은지?: " +(ch1<=ch2));
        System.out.println("a보다 A가 작거나 같은지?: " +(ch1>=ch2));
        System.out.println("a보다 A가 큰지?: " +(ch1<ch2));
        System.out.println("a보다 A가 작은지?: " +(ch1>ch2));


        /*논리값과 문자열은 '==' , '!='만 비교 가능하다 */


    }
}
