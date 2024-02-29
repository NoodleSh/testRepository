package com.ohgiraffers.update;

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
        /* 1. 변경할 메뉴 코드, 이름, 가격을 입력 받기 */
        /* 2. MenuDTO 객체를 생성하여 입력받은 값으로 setting */
        /* 3 .UpdateController의 UpdateMenu() 메소드 호출 */
        /* 4. update 결과에 따라 성공 , 실패 메세지 출력*/

        Connection con = getConnection();
        PreparedStatement pstmt = null;

        Properties prop = new Properties();

        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 메뉴의 번호를 입력하세요 :  ");
        int menuCode = sc.nextInt();
        sc.nextLine();
        System.out.print("변경할 메뉴의 이름을 입력하세요 :  ");
        String menuName = sc.nextLine();
        System.out.println("가격은 얼마로 설정하시겠습니까? : ");
        int menuPrice = sc.nextInt();

        MenuDTO mdto = new MenuDTO();
        mdto.setMenuCode(menuCode);
        mdto.setMenuName(menuName);
        mdto.setMenuPirce(menuPrice);

        UpdateController updateController = new UpdateController();

        int result = updateController.updateMenu(mdto);

        if(result > 0){
            System.out.println("메뉴 등록 성공 :)");
        }else{
            System.out.println("메뉴 등록 실패 :(");
        }
    }
}
