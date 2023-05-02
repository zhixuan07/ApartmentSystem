/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apartment_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author zhixu
 */
public class sqliteConn {
    public static Connection connect() {
        Connection conn = null;
        Statement stmt = null;

        try {
            // db parameters
            String url = "jdbc:sqlite:/Users/zhixu/Documents/ApartmentSystem.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            stmt = conn.createStatement();
          
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
     
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }

    
}
