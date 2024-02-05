package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void PrimaryTypeParameter(int num) {}
    public void PrimaryTypeArrayParameter(int[] iarr) {

        /*
        * 배열의 주소가 전달된다.
        * 즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가르킨다. (얕은 복사)*/
        System.out.println("매개변수로 전달 받은 값: ");
        System.out.println("배열 값 출력: ");

        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.println("변경 후 배열의 값 출력: ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i]+" ");
        }
        System.out.println();

    }
    public void ClassTypeParameter(RectAngle rectAngle) {
        System.out.println("매개변수로 전달 받은 값: " + rectAngle);
        System.out.println("변경 전 사각형의 넓이와 둘레 =====================");
        rectAngle.calcArea();
        rectAngle.calcRound();

        System.out.println("변경 후 사각형의 넓이와 둘레 =====================");
        rectAngle.setWidth(100);
        rectAngle.setHeight(100);
    }
    public void VariableLengthArrayParameter(String name, String...hobby) { // 가변 인자( 작성시 마지막에 작성)
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : ");
            for(int i = 0; i< hobby.length; i++){
                System.out.print(hobby[i]+" ");
            }
        System.out.println();
    }

    /* 오버로딩 시 주의해야한다.
    *  둘 중 어떤 메소드를 호출하는 것인지에 대한 모호성이 발생했기 때문에 에러가 난다.
    * 가변 배열을 매개변수로 이용한 메소드는 모호성으로 인해 오버로딩 하지 않는것이 좋다*/
//    public void VariableLengthArrayParameter(String...hobby) { // 메소드 오버로딩
//        System.out.println("취미의 갯수 : " + hobby.length);
//        System.out.println("취미 : ");
//        for(int i = 0; i< hobby.length; i++){
//            System.out.print(hobby[i]+" ");
//        }
//        System.out.println();
//    }
}
