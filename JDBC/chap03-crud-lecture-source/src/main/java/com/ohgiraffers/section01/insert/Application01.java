package com.ohgiraffers.section01.insert;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application01 {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        /* DML (insert, update, delete) 작업시에는 반환 결과가 int값이 된다.(ResultSet을 쓰지 않는다.)
        * 기존의 조회일 때 executeQuery()를 사용했지만, DML작업 시에는 executeQuery()를 사용함.
        * */

        int result = 0;  // DML작업을 하면 작업이 일어난 행의 갯수를 반환(int)

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu_query.xml"));
            String query =  prop.getProperty("insertMenu");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, "봉골레청국장");
            pstmt.setInt(2, 9000);
            pstmt.setInt(3, 1);
            pstmt.setString(4, "Y");

            /* executeUpdate() 메소드안에는 매개변수가 포함되어 있지않기 때문에 괄호안에 쿼리삽입시 에러발생
            * executeQuery 는 ResultSet으로 ㅂ*/
            result = pstmt.executeUpdate();

            System.out.println(query);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }

        System.out.println("result = " + result);
    }
}
