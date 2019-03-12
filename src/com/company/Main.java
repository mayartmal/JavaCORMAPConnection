package com.company;

import java.sql.*;


public class Main {

    Connection connection = null;

    public static void main(String[] args) {

        Connection connection = null;
        Statement insertStmt = null;
        Statement selectStmt = null;
        String url = "***";
        String user = "***";
        String password = "***";


        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection(url, user, password);
            selectStmt = connection.createStatement();
            ResultSet rs = selectStmt.executeQuery("SELECT * FROM MAXIMO.WORKORDER WHERE WORKORDER.WONUM = 'D555011'");
            while(rs.next()) {
                System.out.println(rs.getString(1));
            }

            //System.out.println(rs.getString(1));
            connection.close();


        } catch (Exception e) {
            System.out.println(e.toString());
        }

	// write your code here
    }
}
