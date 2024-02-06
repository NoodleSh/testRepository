package com.ohgiraffers.section08.initblock;

public class Product {
    /* 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체 생성 */
//    private String name;
//    private int price;
//    private static String brand;


    /* 명시적 초기화 */
    private String name = "라떼";
    private int price = 5000;
    private static String brand = "스타벅스";


    /* 인스턴스 초기화 블럭으로 필드 초기화 */
    {
        name = "아메리카노";
        price = 4000;
        brand = "할리스";
        System.out.println("인스턴스 초기화 블럭 동작함");
    }

    static {
        /* static 초기화 블럭에서는 non-static 필드를 초기화 하지 못한다.
        * 정적 초기화 블럭은 클래스 로드 시에 동작한다.
        * 따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에,
        * 존재하지 않는 인스턴스 변수에 초기화 하는 것은 시기상으로 불가능하다.*/
//      name = "미숫가루";
//      price = 4500;
        brand = "탐앤탐스";
        System.out.println("정적 초기화 블럭 동작함");
    }

    public Product(){
        System.out.println("기본 생성자 호출됨");
    }
    public Product(String name, int price, String brand){
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨");
    }

    /*  실행순서 static 초기화 블럭 -> 인스턴스 초기화 블럭이기 때문에 출력은 인스턴스 초기화 블럭 값으로 출력 된다. */

    public String getInformation(){
        return "Prodcut [name = " + this.name + ", price = " + this.price +", brand = " + Product.brand +"]";
    }

    /* [여기서 알 수 있는 초기화 순서]
    * 인스턴스 변수: 기본값 -> 명시적 초기값 -> 인스턴스 초기화 블럭 -> 생성자
    * 클래스 변수: 기본값 -> 명시적 초기값 -> 정적 초기화 블럭 -> 인스턴스 초기화 블럭-> 생성자
    * */

}
