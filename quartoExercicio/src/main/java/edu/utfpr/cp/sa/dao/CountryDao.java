/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.cp.sa.dao;

import edu.utfpr.cp.sa.entity.Country;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author leona
 */
public class CountryDao {
    private Connection conn;
    
    public CountryDao(){
        this.conn = new DatabaseConnection().getConnection();
    }
    
    public void insert(Country country){
    	String sql = "insert into country (countryName, acronym, phoneDigits) values(?,?,?)";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, country.getName());
            stmt.setString(2, country.getAcronym());
            stmt.setInt(3, country.getPhoneDigits());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    
    public Set<Country> getListaCountry(){
        String sql = "select * from country";
        Set<Country> cd = new HashSet<Country>();
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Country c = new Country();
                
                c.setId(rs.getInt("countryId"));
                c.setName(rs.getString("countryName"));
                c.setAcronym(rs.getString("acronym"));
                c.setPhoneDigits(rs.getInt("phoneDigits"));
                
                cd.add(c);
            }

            rs.close();
            stmt.close();
            return cd;
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    //não está dando certo
    public void update(Country country){
        String sql = "update country set acronym = ?, phoneDigits = ? where countryName = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            //stmt.setString(1, country.getName());
            stmt.setString(1, country.getAcronym());
            stmt.setInt(2, country.getPhoneDigits());
            stmt.setString (3, country.getName());

        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex); 
        }
    }
    
    //Para deletar é usado o nome do país, já que o nome é único
    public void delete(String countryName){
        String sql = "delete from country where countryName = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, countryName);
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex); 
        }
    }
}
