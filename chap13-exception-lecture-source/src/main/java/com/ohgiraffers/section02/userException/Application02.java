package com.ohgiraffers.section02.userException;

import com.ohgiraffers.section02.userException.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userException.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userException.exception.PriceNagativeException;

import java.util.regex.PatternSyntaxException;

public class Application02 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000,10000);

        }catch (NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException 발생..");
            System.out.println(e.getMessage());
        }catch (PriceNagativeException e){
            System.out.println("PriceNagativeException 발생..");
            System.out.println(e.getMessage());
        }catch (MoneyNegativeException e){
            System.out.println("MoneyNegativeException 발생..");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally 블럭 내용 동작..");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
