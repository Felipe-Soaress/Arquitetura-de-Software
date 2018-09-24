/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.cp.sa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author leona
 */
public class DatabaseConnection {
    private static String databaseURL = "jdbc:mysql://localhost:3306/Atividade04";
    private static String username = "root";
    private static String password = "utfpr";
    private static Connection conn;
        
    /*public static Connection getConnection(){
        try(Connection conn = DriverManager.getConnection(databaseURL, username, password)){
            if (conn != null) {
                System.out.println("Connected");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }*/
    
    
    //Testar qual estar certo
    public Connection getConnection(){
        try {
            if(conn != null){
                System.out.println("Connected");
            }
            return DriverManager.getConnection(databaseURL, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
