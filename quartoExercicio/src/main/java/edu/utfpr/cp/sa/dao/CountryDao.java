/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.cp.sa.dao;

import edu.utfpr.cp.sa.entity.Country;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author leona
 */
public class CountryDao {
    private final Connection conn;
    
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
    public ArrayList<Country> getListaCountry(){
        String sql = "select * from country";
        ArrayList<Country> cd = new ArrayList();
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
    
    public void update(Country country){
        String sql = "update country set countryName = ?, acronym = ?, phoneDigits = ? where countryId = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, country.getName());
            stmt.setString(2, country.getAcronym());
            stmt.setInt(3, country.getPhoneDigits());
            stmt.setInt(4, country.getId());

        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex); 
        }
    }
    
    public void delete(int id){
        String sql = "delete from country where countryId = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            //stmt.setString(1, country.getName());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex); 
        }
    }
}
