package com.ohgiraffers.section01.array;

public class Aplication02 {
    public static void main(String[] args) {
        /*
         * [배열의 사용 방법]
         * 1. 배열 선언
         * 2. 배열 할당(new 연산자 이용)
         * 3. 배열 인덱스 공간에 값 대입
         * */

        /* 배열 선언
         * 자료형[] 배열명;
         * 자료형 배열명[]
         *
         * stack 영역에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.
         * */
        int[] arr;

        /* 배열 할당*/
         arr = new int[5]; //배열의 크기를 지정하지 않아 에러 발생

        int[] arr2 = new int[5];

        /*선언과 동시에 할당&초기화*/
        int[] arr3 = new int[]{11,22,33,44,55};


        for(int i = 0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
        System.out.println();

        int[]arr4 = {111,222,333,444,555};
        for(int i = 0; i< arr4.length; i++){
            System.out.println(arr4[i]);
        }
        System.out.println();


        String[]sarr = {"red",  "orange", "yellow", "green", "purple"};
        for(int i = 0; i<sarr.length; i++){
            System.out.println(sarr[i]);
        }
        System.out.println();

        System.out.println(sarr);
        /*hashCode(): 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환*/
        System.out.println("arr의 hashCode: " + arr.hashCode());
        System.out.println("arr의 길이:" + arr.length);
        System.out.println();

        /*배열의 한계점 : 길이 변경이 불가함*/
        double[] darr = new double[10];
        System.out.println("darr의 길이: " +darr.length);
        System.out.println("darr의 hashCode: " +darr.hashCode());
        System.out.println();

        darr = new double[100];// 기존 darr위에 덮어 씌워짐
        System.out.println("darr의 길이(test): " + darr.length);
        System.out.println("darr의 hashCode(test): " +darr.hashCode());
        System.out.println();
        
        /*배열의 인덱스 공간에 값 대입*/

        /* <값의 형태별 기본값>
        * 정수 : 0
        * 실수 0.0
        * 논리: false
        * 문자형:\u0000
        * 참조: null
        * */

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("===================");

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        System.out.println("===================");

        for(int i = 0; i<arr.length; i++){
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

}
