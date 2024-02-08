package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Aplication01 {
    public static void main(String[] args) {

        /* 모든 클래스는 Object 클래스의 후손이다.
        * 따라서 Object는 클래스가 가진 메소드를 자신의 것 처럼 사용할 수 있다.
        * 또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능하다.
        * */

        Book bk1 = new Book(1, "홍길동전", "허균", 50000);
        Book bk2 = new Book(2, "목민심서", "정약용", 30000);
        Book bk3 = new Book(2, "목민심서", "정약용", 30000);

        /* 동일한 값을 가지는 인스턴스도 다른 해시코드 값을 가지고 있다.
        * 풀 클래스 이름과 @ 그리고 16진수 해시코드를 반환한다. */
        System.out.println("book1.toString() : " + bk1.toString());
        System.out.println("book2.toString() : " + bk2.toString());
        System.out.println("book3.toString() : " + bk3.toString());

        System.out.println();


        /* toString()을 호출하지 않고 레퍼런스 변수만 출력하는 경우 동일하게 결과가 나온다.
        * 이 경우 자동으로 toString() 매소드를 호출해준다.
        * 이런 편리한 점을 이용하여 toString() 메소드를 재정의해서 사용하게 된다.
        * */
        System.out.println("================ 레퍼런스 변수만 출력 ===================");
        System.out.println("bk1 : " + bk1);
        System.out.println("bk2 : " + bk2);
        System.out.println("bk3 : " + bk3);



    }
}
