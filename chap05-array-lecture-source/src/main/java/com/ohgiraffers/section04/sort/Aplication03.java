package com.ohgiraffers.section04.sort;

public class Aplication03 {
    public static void main(String[] args) {
        /*
        * 버블정렬
        * 인접한 두개의 원소를 검사하여 정렬하는 방법
        * 구현이 쉽다는 장점이 있다.
        * 단점으로는 다른 정렬에 비해 정렬 속도가 느리며,
        * 역순으로 정렬을 할때 가장 느린 속도를 가진다
        * */

        int[] arr = {3,7,2,4,1,5};


         3 7
         3 2 7
         3 2 4 7
         3 2 4 1 7
         3 2 4 1 5 7  // 1회차 회전

         2 3
         2 3 4
         2 3 1 4
         2 3 1 4 5
         2 3 1 4 5 7 // 2회차

         2 3
         2 1 3
         2 1 3 4
         2 1 3 4 5
         2 1 3 4 5 7 // 3회차

         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         1 2 3 4 5 7 // 4회차

        
        


        //버블 정렬: 인접한 인덱스를 비교해서 정렬
        
        //n번째 인덱스와 n+1째 인덱스를 비교했을때 n번째 인덱스가 크면 서로의 위치를 교환
        int temp;
        for(int i = arr.length-1; i>=0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }



    }
}
