package com.ohgiraffers.section01.insert;

import com.ohgiraffers.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application02 {
    public static void main(String[] args) {

        Properties prop = new Properties();
    /* 1. 메뉴의 이름, 가격, 카테고리 코드, 판매 여부를 입력 받기(Scanner 이용) */
        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴 : ");
        String menuName = sc.nextLine();

        System.out.print("메뉴가격 : ");
        int menuPrice = sc.nextInt();

        System.out.print("카테고리 코드 : ");
        int categoryCode = sc.nextInt(); // menuCode

        sc.nextLine(); // 버퍼에 개행문자가 남아 있어 제거하기 위한 코드

        System.out.print("판매 여부(y/n) : ");
        String orderableStatus = sc.nextLine().toUpperCase();

        /* menuDTO 객체를 생성하여 입력받은 값으로 setting */
        MenuDTO mdto = new MenuDTO();  // mdto = newMenu(선생님이 작성하신 객체이름)

        mdto.setMenuName(menuName);
        mdto.setMenuPirce(menuPrice);
        mdto.setCategoryCode(categoryCode);
        mdto.setOrderableStatus(orderableStatus);

        /* InsertCOntroller의 insertMenu()메소드 호출 */
         InsertController insertController = new InsertController();

        int result = insertController.insertMenu(mdto);
        System.out.println();
        
        /* insert 결과에 따라서 성공이면 '메뉴 등록 성공!',
        * 실패이면 '메뉴 등록 실패' 출력
        * */
        if(result > 0){
            System.out.println("메뉴 등록 성공 :)");
        }else{
            System.out.println("메뉴 등록 실패 :( ...");
        }
    }
}
