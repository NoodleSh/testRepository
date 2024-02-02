package com.ohgiraffers.section02.encapsulation.solution02;

public class Aplication {
    public static void main(String[] args) {
        Monster mt1 = new Monster();
//        mt1.kinds = " 프랑켄슈타인";
//        mt1.hp = 200;

        mt1.setKinds("프랑켄슈타인");
        mt1.setHp(200);

        System.out.println(mt1.getInfo());
        //메소드를 이용하여 간접적으로 접근(인스턴스 변수는 private)

    }

}
