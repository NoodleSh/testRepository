package com.ohgiraffers.section02.encapsulation.solution01;


public class Aplication {
    public static void main(String[] args) {

        Monster mt1 = new Monster();
        mt1.setInfo("드라큘라");
        mt1.setHp(100);

        Monster mt2 = new Monster();
        mt2.setInfo("프랑켄슈타인");
        mt2.setHp(200);

        Monster mt3 = new Monster();
        mt3.setInfo("늑대인간");
        mt3.setHp(-100);

        Monster mt4 = new Monster();
        mt3.setInfo("미이라");
        mt3.setHp(400);

        System.out.println(mt1.getInfo());
        System.out.println(mt2.getInfo());
        System.out.println(mt3.getInfo());
        System.out.println(mt4.getInfo());
    }
}
