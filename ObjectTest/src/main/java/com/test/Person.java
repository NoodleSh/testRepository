package com.test;

import java.util.Scanner;

public class Person {
    /*
    * 사람의 속성 : 이름(string), 나이(int), 국적(String), 강아지(클래스) --- 캡슐화
    * */

    private String name;
    private int age;
    private String nationality;
    private Dog myDog;


    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality="한국";
        String[] nationalityArr = {"한국","일본","중국","홍콩","터키"};
        for(int i = 0; i < nationalityArr.length; i++){
            if(nationalityArr[i].equals(nationality)) {
                this.nationality = nationality;
                break;
                //return으로 할 경우, return구문에서 바로 프로그램이 끝나므로 더 간결함
            }
        }
        System.out.println("선택하신 국가는 " + this.nationality + " 입니다.");
    }

    /* 강아지 이름을 입력받고, 입력받은 이름을 속성으로 강아지 객체를 생성하여
    * 이 사람의 강아지로 설정
    * */

    public void adoptDog() {
        Scanner sc = new Scanner(System.in);

        System.out.print("강아지 이름: ");
        String dogName = sc.nextLine();

        this.myDog = new Dog(dogName);

    }

    public void teachDog(String[] ability) {
        /* 내 강아지의 재주를 설정*/
//        String[] dogAbility = new String[3];
//        for(int i = 0; i < ability.length; i++){
//                dogAbility[i]+=ability[i];
//            }
//       //this.myDog = new Dog(dogAbility);
////        myDog.learnAbility(dogAbility);
//        myDog.setAbility(dogAbility);

//           this.myDog.setAbility(ability);

//        Dog dog = new Dog();

        this.myDog.learnAbility(ability);
        }



    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }





}
