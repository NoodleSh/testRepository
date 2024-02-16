package com.test;

import java.util.Arrays;
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
        this.myDog.learnAbility(ability);
        }

     public void orderDog() {
        Scanner sc = new Scanner(System.in);

        System.out.println("재주 입력:");
        String play = sc.nextLine();

//        this.myDog.playAbility(play);
         
        /* 1. void 메소드 출력
        *  2. String으로 변경하여 출력
        *       출력예시) 뽀삐는 앉아!를 할 수 있어요 :) or 뽀삐는 짖어!를 배우지 않았어요
        *
        * 3 . boolean으로 변경하여 출력
        *       출력예시) 뽀삐는 앉아!를 배웠어요 or 뽀삐는 짖어!를 할 수 없어요*/


         /* void 타입으로 반환 받음 */
         this.myDog.playVoidAbility(play);

         /* String 타입으로 반환 받은 출력문 */
         System.out.println(this.myDog.playStringAbility(play));

         /* boolean 타입으로 반환 받은 출력문 */
         if(myDog.playBoolAbility(play) == true){
             System.out.println(myDog.getName() + "는 " + play + "를 배웠어요 :) " );
         }else{
             System.out.println(myDog.getName() + "는 " + play+ "를 배우지 않았어요 :( " );
         }
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
                Arrays.toString(this.myDog.getAbility())+
                '}';
    }





}
