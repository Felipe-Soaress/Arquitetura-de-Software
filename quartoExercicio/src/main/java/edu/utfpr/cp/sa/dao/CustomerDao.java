package edu.utfpr.cp.sa.dao;

import edu.utfpr.cp.sa.entity.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;


public class CustomerDao {
	private Connection conn;
    
    public CustomerDao(){
        this.conn = new DatabaseConnection().getConnection();
    }
    
    public void insert(Customer customer){
    	String sql = "insert into country (customerName, phone, age, creditLimit, countryId) values(?,?,?,?,?)";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getPhone());
            stmt.setInt(3, customer.getAge());
            stmt.setDouble(4, customer.getCreditLimit());
            stmt.setInt(5, customer.getCountry().getId());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
