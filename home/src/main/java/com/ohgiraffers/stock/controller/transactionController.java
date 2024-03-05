package com.ohgiraffers.stock.controller;

import com.ohgiraffers.stock.dto.transactDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.ohgiraffers.stock.common.JDBCTemplate.close;
import static com.ohgiraffers.stock.common.JDBCTemplate.getConnection;

public class transactionController {
    public void showTransaction() {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        Properties prop = new Properties();

        transactDTO row = null;
        List<transactDTO> empList = null;

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/stock/mapper/stock-query.xml"));
            String query = prop.getProperty("viewallTransaction");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();

            empList = new ArrayList<>();

            while(rset.next()){
                row = new transactDTO();
                row.setCode(rset.getInt("CODE"));
                row.setMemName(rset.getString("MEM_NAME"));
                row.setStkName(rset.getString("STK_NAME"));
                row.setStkPrice(rset.getInt("STK_PRICE"));
                row.setStkCount(rset.getInt("STK_COUNT"));

                empList.add(row);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        for(transactDTO i : empList){
            System.out.println(i);
        }
    }
}
