/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ngo Tien Phong
 */
public class Connect {
    public static Connection cn;
    public void connectDatabase() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Nap drive!");
            String connectString = "jdbc:sqlserver://DESKTOP-5RB0UV4:1433;databaseName=ngotienphong;user=sa;password=123";
            cn =  DriverManager.getConnection(connectString);
            System.out.println("Ket noi csdl thanh cong");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
