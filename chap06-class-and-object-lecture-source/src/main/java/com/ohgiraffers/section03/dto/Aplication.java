package com.ohgiraffers.section03.dto;

public class Aplication {
    public static void main(String[] args) {
        /*
        * [DTO]
        * 캡슐화 원칙에는 일부 어긋나지만 다른 목적을 가진 클래스와 객체를 추상화하는 기법.
        * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우이다.
        * 캡슐화의 원칙을 준수하여 모든 필드를 private로 설정해 직접 접근을 막고,
        * 각 필드값을 변경하거나 반환하는 메ㅗ드를 세트로 미리 작성한다,
        * private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성된다.
        * 주로 계층간 데이터를 주고 받을 목적으로 사용한다.
        * */

        MemberDTO dto  = new MemberDTO();

        dto.setNumber(1);
        dto.setName("둘리");
        dto.setAge(20);
        dto.setGender('남');
        dto.setHeight(182.1);
        dto.setWeight(75.3);
        dto.setActivated(true);

        System.out.println("회원 번호: " + dto.getNumber());
        System.out.println("회원명: " + dto.getName());
        System.out.println("회원 나이: " + dto.getAge());
        System.out.println("회원 성별: " + dto.getGender());
        System.out.println("회원 키: " + dto.getHeight());
        System.out.println("회원 몸무게: " + dto.getWeight());
        System.out.println("회원 활성화 상태: " + dto.isActivated());
    }
}
