package com.ohgirafers.section01.polymorpihsm;

public class Aplication04 {
    public static void main(String[] args) {
        Aplication04 app4 = new Aplication04();

        Animal randomAnimal = app4.getRandomAnimal(); // Animal 타입의 인스턴스 변수
        randomAnimal.cry();


    }

    public Animal getRandomAnimal(){
        int random = (int)(Math.random()*2);
        System.out.println("난수:"+random);
        return random == 0 ? new Cat(): new Tiger();

        /*
        * new Cat(), new Tiger()를 받아올수 있는 이유는
        * Cat과 Tiger가 Animal을 상속받고 있기 때문에
        * Animal 타입으로 반환형을 사용해도 자식 클래스인
        * Cat과 Tiger의 값을 불러올수 있는것이다.
        * */
    }
}
