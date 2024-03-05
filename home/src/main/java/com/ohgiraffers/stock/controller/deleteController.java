package com.ohgiraffers.stock.controller;

import com.ohgiraffers.stock.dto.stockDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.stock.common.JDBCTemplate.close;
import static com.ohgiraffers.stock.common.JDBCTemplate.getConnection;

public class deleteController {
    public int deleteInfo(stockDTO sdto){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;
        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/stock/mapper/stock-query.xml"));
            String query = prop.getProperty("deleteStock");
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, sdto.getStockName());

            result = pstmt.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        return result;
    }

}
