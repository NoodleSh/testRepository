package com.ohgiraffers.section02.variable;

public class Aplication1 {
    public static void main(String[]args){
        /* 필기. 변수의 사용 목적
        * 1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수가 쉬워진다)
        * 2. 한 번 저장 해둔 값을 재사용 하기 위한 목적( 변수를 이용하여 코들르 작성하면, 값을 변경할 때도 보다 간편하게 변경할 수 있음
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.(변하는 값을 저장하기 위한 공간이다.)*/

        //1
        int salary = 1000000;
        int bonus = 2000000;
        System.out.println("보너스를 포함한 급여:"+ (salary + bonus)+"원"+"\n");

        //2
        int point=100;
        System.out.println("1번 고객에게 "+ point+ "포인트"+ " 지급하였습니다");
        System.out.println("2번 고객에게 "+ point+ "포인트"+ " 지급하였습니다");
        System.out.println("3번 고객에게 "+ point+ "포인트"+ " 지급하였습니다");
        System.out.println("4번 고객에게 "+ point+ "포인트"+ " 지급하였습니다");
        System.out.println("5번 고객에게 "+ point+ "포인트"+ " 지급하였습니다"+"\n");


        //3
        System.out.println("================변수에 저장된 값 변경 테스트=============");
        /*변수는 하나의 값을 저장하고 사용하기 위한 공간기이 보다, 변하는 값을 저장하기 위한 공간이다*/
        int sum=0;

        sum=sum+10;
        System.out.println("sum에 10을 더함: "+sum);

        sum=sum+20;
        System.out.println("sum에 20을 더함: "+sum);

        sum=sum+30;
        System.out.println("sum에 30을 더함: "+sum);

        sum=sum+40;
        System.out.println("sum에 40을 더함: "+sum+"\n");

        int count = 0;
        count = count+1;
        System.out.println("count에 1을 더하면 현재 count의 값은?: "+ count);
    }
}
