/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import model.CongTy;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Luc
 */
public class CongTyCtr {
    public List<CongTy> getAllCongTy() {
        List<CongTy> congTy = new ArrayList<CongTy>();
        
        Connection connection = (Connection) ConnectionSQLServer.getConnectionDB();
        
        String sql = "SELECT * FROM CTY_TAU_CAO_TOC";
    try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        while (rs.next()) {
            CongTy congty = new CongTy();
            
            congty.setMaCTy(rs.getString("MA_CTY"));
            congty.setTenCTy(rs.getString("TEN_CTY"));
            congty.setDCWeb(rs.getString("WEBSITE"));
            congty.setDiaChi(rs.getString("DIA_CHI"));
            congty.setSDT(rs.getString("SDT"));
            
            congTy.add(congty);
        }    
    }      catch (SQLException e) {
            e.printStackTrace();
    }
        return congTy;
       
}
    
    public CongTy getCongTyByMaCTy(String MaCTy) {
        
        try{
            Connection connection = (Connection) ConnectionSQLServer.getConnectionDB();
        
            String sql = "SELECT * FROM CTY_TAU_CAO_TOC WHERE MA_CTY = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, MaCTy);
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {
                CongTy congty = new CongTy();
            
                congty.setMaCTy(rs.getString("MA_CTY"));
                congty.setTenCTy(rs.getString("TEN_CTY"));
                congty.setDCWeb(rs.getString("WEBSITE"));
                congty.setDiaChi(rs.getString("DIA_CHI"));
                congty.setSDT(rs.getString("SDT"));
            
                return congty;
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

        
    }

    public void ThemCongTy(CongTy congty){
        Connection connection = (Connection) ConnectionSQLServer.getConnectionDB();
        String sql = "INSERT INTO CTY_TAU_CAO_TOC(MA_CTY,TEN_CTY,WEBSITE,DIA_CHI,SDT) VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, congty.getMaCTy());
            preparedStatement.setString(2, congty.getTenCTy());
            preparedStatement.setString(3, congty.getDCWeb());        
            preparedStatement.setString(4, congty.getDiaChi());
            preparedStatement.setString(5, congty.getSDT());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void SuaCongTy(CongTy congty){
        
        try{
            
            Connection connection = (Connection) ConnectionSQLServer.getConnectionDB();
            String sql = "UPDATE CTY_TAU_CAO_TOC SET TEN_CTY = ?, WEBSITE = ?, DIA_CHI = ?, SDT = ? WHERE MA_CTY = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, congty.getTenCTy());
            preparedStatement.setString(2, congty.getDCWeb()); 
            preparedStatement.setString(3, congty.getDiaChi());
            preparedStatement.setString(4, congty.getSDT());
            preparedStatement.setString(5, congty.getMaCTy());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public List<CongTy> TraCuuCongTy(String TenCTy) {
        List<CongTy> congTy = new ArrayList<CongTy>();
        
        Connection connection = (Connection) ConnectionSQLServer.getConnectionDB();
        
        String sql = "SELECT * FROM CTY_TAU_CAO_TOC WHERE TEN_CTY LIKE ?";
    try{
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setString(1, "%"+TenCTy+"%");
        
        ResultSet rs = preparedStatement.executeQuery();
        
        while (rs.next()) {
            CongTy congty = new CongTy();
            
            congty.setMaCTy(rs.getString("MA_CTY"));
            congty.setTenCTy(rs.getString("TEN_CTY"));
            congty.setDCWeb(rs.getString("WEBSITE"));
            congty.setDiaChi(rs.getString("DIA_CHI"));
            congty.setSDT(rs.getString("SDT"));
            
            congTy.add(congty);
        }    
    }      catch (SQLException e) {
            e.printStackTrace();
    }
        return congTy;
       
  }
}
