package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /* 메소드 이름 변경 에러 */
    // @Override
    // public void method2(int num){}

    /* 메소드 리턴타입 변경 에러 */
    // @Override
    // public int method2(int num){return 0;}

    /* 매개변수 갯수, 타입 변경 에러 */
    // @Override // 어노테이션 미작성시 SubClass에서 새로 작성한 메소드라고 판단
    // public void method(int num, String num){}

    @Override
    public void method(int num){}

    /* private 메소드는 오버라이딩 불가*/
    // @Override
    // private void priavteMethod(){}

    /* final 메소드 오버라이딩 불가 */
    // @Override
    // public final void finalMethod(){}

    /* protected는 같은 패키지내에서만 접근이 가능하나, 상속 관계에서는 접근이 가능하다.
    * default는 같은 패키지내에서만 접근이 가능하고, 상속 관계에서도 접근이 불가능하다.*/
    // @Override
    // void protectedMethod(){} // 더 좁은 범위로 불가능

    // @Override
    // protected void protectedMethod(){}// 같은 범위이므로 접근가능

    // @Override
    // public void protectedMethod(){}// 더 넓은 범위이므로 접근가능
    
    // 같은 메소드를 같이 사용하기 위해서는 오버로딩 사용
}
