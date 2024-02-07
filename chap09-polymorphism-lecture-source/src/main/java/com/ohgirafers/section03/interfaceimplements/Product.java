package com.ohgirafers.section03.interfaceimplements;

public class Product extends Object implements InterProduct, java.io.Serializable {
    /*
    * 클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
    * 또한 인터페이시는 여러 개를 상속받을 수 있으며,
    * extends로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가상속이 가능해진다.
    * 단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다. (순서 바뀌면 에러발생)
    * */
    // implements는 다중 상속 가능
    // extends를 동시에 선언할때는 implements 키워드보다 앞에 작성해야함
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출됨");
    }

    /* static 메소드는 오버라이딩 할 수 없다. */
//    @Override
//    public static void staticMethod(){}


    /* default 메소드는 인터페이스에서만 작성 가능하다. */
//    @Override
//    public default defaultMethod() {}


    /* default 키워드를 제외하면 오버라이딩이 가능하다. */
    @Override
    public void defaultMethod() {
//        InterProduct.super.defaultMethod();
        System.out.println("Product 클래스의 defaultMethod 호출됨");
    }
}
