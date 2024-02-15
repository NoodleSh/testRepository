package com.test;

public class Aplication {
    public static void main(String[] args) {
        /*
        * 1. 사람 생성(이름, 나이는 생성과 동시에 초기화 되어야 함)
        * */
        
        /*
        * 2. 1에서 만든 사람의 국적 설정
        * (한국, 일본, 중국, 홍콩, 터키 중 하나만 가능 / 만약 다른 국가를 입력했다면 자동으로 '한국' 설정)
        * */
        
        /*
        * 3. 강아지 입양 -> 사림이 할 수 있는 일 ( = person의 메소드를 호출해서 Dog를 추가)
        * 단, 강아지는 반드시 이름이 있어야 함(강아지 입력 스캐너로 받기)
        * */

        /*
        * 4. 강아지에게 재주 가르치기 -> 사람이 할 수 있는 일
        * (= Person의 매개변수가 있는 메소드를 호출해서 dog의 ablity 추가)
        * */

        String[] teachingAbility = new String[]{"앉아", "빵!", "기다려"};

        Person person  =  new Person("남주혁", 28);


        person.setNationality("일본");
        System.out.println(person.getNationality());

        System.out.println();
        System.out.println("----------------------------------------");




        person.adoptDog();
        System.out.println(person.getMyDog()+"의 주인은 " + person.getName() + "입니다.");
        System.out.println("----------------------------------------");

        person.teachDog(teachingAbility);
        System.out.println(person.getMyDog());





        
    }


}
