package com.ohgiraffers.section01.init;

public class Aplication {
    public static void main(String[] args) {

        /*
        * 객체 배열은 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입의 여러 개의 인스턴스를 각각 취급하지 않고 연속처리할 수 있어서 유용하다.
        * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
        * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
        * */

        Car car1 = new Car("Jeep", 80);
        Car car2 = new Car("랜드로버",50);
        Car car3 = new Car("미니쿠페",70);
        Car car4 = new Car("포터",100);
        Car car5 = new Car("다마스",150);

//        car1.driveMaxSpeed();
//        car2.driveMaxSpeed();
//        car3.driveMaxSpeed();
//        car4.driveMaxSpeed();
//        car5.driveMaxSpeed();

        /* Car 타입의 인스턴스 주소를 보관할 5칸 짜리 배열 할당*/
        Car[] carArray = new Car[5];

        carArray[0] = new Car("Jeep", 80);
        carArray[1] = new Car("랜드로버",50);
        carArray[2] = new Car("미니쿠페",70);
        carArray[3] = new Car("포터",100);
        carArray[4] = new Car("다마스",150);

        for(int i = 0; i< carArray.length; i++){
            carArray[i].driveMaxSpeed();
        }

        System.out.println("----------------------------------");

        Car[] carArray2 = {
                new Car("Jeep", 80),
                new Car("랜드로버",50),
                new Car("미니쿠페",70),
                new Car("포터",100),
                new Car("다마스",150)
        };

        /*배열은 향상된 for문도 사용 가능하다.*/
        for(Car c : carArray2){
            c.driveMaxSpeed();
        }
    }
}
