package com.ohgiraffers.test;


public class doodle {
    public static void main(String[] args) {

        /*문제

        사과가 23개가 있고, 상자에는 사과를 5개씩 담을 수 있습니다.
        필요한 상자의 개수를 구하는 삼항연산자를 만들어 보시고 답을 구하시오.*/
        int apple = 23;
        int result = (apple % 5 == 0 )? apple/5 : apple / 5+1;
        System.out.println(result);
//        apple / 5+1( 연산자 우선순위에 의해 나누기 한 다음 몫에 +1)

        /*문제

        정수형 변수를 선언하여 나이를 저장하고, 삼항연산자를 사용해 나이가 19살 이하면 “출입이 불가합니다.”,
        그렇지 않으면 “출입이 가능합니다.”를 출력하세요.
        */
        
        int age=17;
        
        String entrance = (age>=19)?"출입가능":"출입불가능";

        System.out.println(entrance);

        /*문제

            `int a=10;`

            `int b=15;`

            `int c=(a*3/b%4 >=++a-3*b)? 45:18;`

            `int d=(a-b/c+5 <= --b+c*a)? 32:24;`

            `boolean isSame = c==d+x;`

            여기서 isSame의 값을 true로 만드는 x의 값을 구하시오.
            */

        int a = 10;
        int b = 15;
        int c = (a*3/b%4 >=++a-3*b)? 45 : 18;//45 ++a=> 11
        int d=(a-b/c+5 <= --b+c*a)? 32 : 24; //32, a=11
        boolean isSame = c==d+x;

        System.out.println(-15/45);


    }
}
