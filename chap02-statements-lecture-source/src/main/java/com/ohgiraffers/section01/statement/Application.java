package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;


public class Application {
    public static void main(String[] args) {
        Connection con = getConnection();
        
        /* 쿼리를 운반하고 결과를 반환하는 객체 */
        /* 쿼리문을 저장하고 실행하는 기능을 하는 용도의 인터페이스 */
        Statement stmt = null;
        
        /* 조회의 결과가 반환되는 객체 */
        /* select 결과 집합을 받아올 용도의 인터페이스 */
        ResultSet rset = null;

        try {
            /* connection을 이용하여 statement 인스턴스 생성 (쿼리를 운송할 트럭 생성)*/
           stmt = con.createStatement();
          rset = stmt.executeQuery("select EMP_ID, EMP_NAME FROM EMPLOYEE"); // 쿼리문은 대소문자 오류는 없으나 관례적으로 대문자로 작성

            while(rset.next()){
                /* next(): ResultSet의 커서 위치를 내리면서 행이 존재하면 true, 존재하지 않으면 false */
                System.out.println(rset.getString("EMP_ID") + ", " + rset.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            /* 맨 마지막에 열렸던 객체부터 순서대로 닫아줌 */
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
