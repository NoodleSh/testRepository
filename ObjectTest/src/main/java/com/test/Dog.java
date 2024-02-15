package com.test;

import java.util.Arrays;

public class Dog {
    /*
    * 강아지의 속성: 이름( String ), 재주( String [] )
    * */

    private String name;
    private String[] ability;

    public Dog() {

    }


    /* 강아지가 배운 재주*/
    public void learnAbility(String[] ability) {
        this.ability = ability;
    }


    public Dog(String name){
        this.name = name;
    }
    public Dog(String[] ability){
        this.ability= ability;
    }
    public Dog(String name, String[] ability){
        this.name = name;
        this.ability= ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAbility() {
        return ability;
    }

    public void setAbility(String[] skills) {
        this.ability = skills;
    }

    @Override
    public String toString() {
        return "{" +
                "이름 ='" + name + '\'' +
                ", 재주 =" + Arrays.toString(ability) +
                '}';
    }

//    @Override
//    public String toString() {
//        return name + ability;
//    }
}
