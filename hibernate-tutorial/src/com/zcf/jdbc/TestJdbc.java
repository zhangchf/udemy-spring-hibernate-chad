package com.zcf.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by zhangchf on 28/12/2017.
 */
public class TestJdbc {

    public static void main(String[] args) {
//        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
