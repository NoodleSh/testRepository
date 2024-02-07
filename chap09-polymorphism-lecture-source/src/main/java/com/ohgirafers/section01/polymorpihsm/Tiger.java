package com.ohgirafers.section01.polymorpihsm;

public class Tiger extends Animal{

    @Override
    public void eat(){
        System.out.println("호랑이가 고기를 먹고 있습니다.");
    }

    @Override
    public void run(){
            System.out.println("호랑이가 당신 주위를 어슬렁 거립니다..");
    }

    @Override
    public void cry(){
        System.out.println("호랑이가 위협적인 소리를 냅니다...");
    }

    public void jump(){
        System.out.println("호랑이가 당신에게 달려듭니다!");
    }

    public void bite(){
        System.out.println("호랑이가 당신을 물어 뜯습니다...!!");
    }

}
