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

public class UpdateController {

    public int updateMenu(MenuDTO mdto){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu_query.xml"));
            String query = prop.getProperty("updateMenu");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, mdto.getMenuName());
            pstmt.setInt(2, mdto.getMenuPirce());
            pstmt.setInt(3, mdto.getMenuCode());

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
