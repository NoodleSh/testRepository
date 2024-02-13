package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Aplication04 {
    public static void main(String[] args) {

        /* [Stack]
        * Stack은 리스트 계열 클래스의 Vector클래스를 상속 받아 구현 하였다.
        * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        * 후입선출(LIFO - Last Input First Out)방식의 자료 구조라 불린다.
        * */

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);


        System.out.println(integerStack);

        System.out.println(integerStack.search(4)); // 후입선출이기 때문에 두번째로 들어간 2가 4번째에 나온다.

        /* Stack에서 값을 꺼내는 메소드
        * peek() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환
        * pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거
        * */

        System.out.println("-----------------------------------------------");
        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
       // System.out.println("pop() : " + integerStack.pop()); // EmptyStackException 발생 (Stack이 비어있기 때문)
        System.out.println(integerStack);
    }
}
