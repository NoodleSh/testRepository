package com.ohgirafers.section01.polymorpihsm;

public class Aplication03 {
    public static void main(String[] args) {
        Aplication03 app3 = new Aplication03();

        Animal animal1 = new Cat();
        Animal animal2 = new Tiger();

        app3.feed(animal1); //동일한 타입이기 때문에 가능함(Animal 타입)
        app3.feed(animal2);

        Cat animal3 = new Cat();
        Tiger animal4 = new Tiger();

        app3.feed((Animal) animal3); // Animal 타입으로 형변환(up-casting), 명시적 형변환 불필요(자동으로 묵시적 형변환)
        app3.feed((Animal) animal4);

        app3.feed(new Cat());// 이런 방식도 가능(Cat과 Tiger가 Animal을 상속받고있기 때문에 바로 호출가능)
        app3.feed(new Tiger());

    }
    public void feed(Animal animal){
        animal.eat();
    }
//    public void feed(Cat cat){ }
//    public void feed(Tiger tiger){ }


}
