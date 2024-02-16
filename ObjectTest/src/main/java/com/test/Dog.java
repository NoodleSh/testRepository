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


    public Dog(String name) {
        this.name = name;
    }

    public Dog(String[] ability) {
        this.ability = ability;
    }

    public Dog(String name, String[] ability) {
        this.name = name;
        this.ability = ability;
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

    public void setAbility(String[] ability) {
        this.ability = ability;
    }



    public void playVoidAbility(String Ability) {

        /* switch문 사용 */

        switch (Ability) {
            case "앉아":
                System.out.println(Ability + "를 배웠어요!");
                break;
            case "기다려":
                System.out.println(Ability + "를 배웠어요!");
                break;
            case "빵!":
                System.out.println(Ability + "를 배웠어요!");
                break;
            default:
                System.out.println("배우지 못햇어요 :(");
                break;
        }

    }



    public String playStringAbility(String ability) {
        /* switch문 사용 */

        String str = "";
        switch (ability) {
            case "앉아":
                str += getName() + "는 " + ability + "를 할수 있어요 :)";
                break;
            case "기다려":
                str += getName() + "는 " + ability + "를 할수 있어요 :)";
                break;
            case "빵!":
                str += getName() + "는 " + ability + "를 할수 있어요 :)";
                break;
            default:
                str += getName() + "는 " + ability + "를 할수 없어요 :(";
                break;
        }

        return str;
    }


    /* */
    public boolean playBoolAbility(String boolAbility) {

        /* switch문 사용 */

        boolean isTrue;
        switch (boolAbility) {
            case "앉아":
                isTrue = true;
                break; // break 없이 return으로 바로 넘겨줘도 가능
            case "기다려":
                isTrue = true;
                break;
            case "빵!":
                isTrue = true;
                break;
            default:
                isTrue = false;
                break;
        }
        return isTrue;
    }

    
    
    
    
    @Override
    public String toString() {
        return "{" +
                "이름 ='" + name + '\'' +
                ", 재주 =" + Arrays.toString(this.ability) +
                '}';
    }

//    @Override
//    public String toString() {
//        return name + ability;
//    }
}
