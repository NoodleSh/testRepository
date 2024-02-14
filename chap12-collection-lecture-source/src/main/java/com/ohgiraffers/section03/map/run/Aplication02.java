package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Aplication02 {
    public static void main(String[] args) {
        /*
        * [ Properties]
        * HashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이디.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 떄 사용한다.
        * */

        Properties prop  = new Properties();

        prop.setProperty("driver","com.mysql.cj.jdbc.Driver \n");
        prop.setProperty("url","jdbc:mysql://localhost/menudb \n");
        prop.setProperty("user","ohgiraffers \n");
        prop.setProperty("password", "ohgiraffers \n");

        System.out.println(prop);
        System.out.println("-------------------------------------------------");

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.store(new FileOutputStream("driver.xml"), "jdbc driver");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------------------------------------");

        Properties prop2 = new Properties();
        try {
            prop2.load(new FileInputStream("diver.dat"));
            prop2.load(new FileInputStream("diver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            prop2.list(System.out);
            System.out.println(prop.getProperty("driver"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("user"));
            System.out.println(prop.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
