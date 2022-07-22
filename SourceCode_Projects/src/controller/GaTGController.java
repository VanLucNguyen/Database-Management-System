/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.GaTrungGian;

/**
 *
 * @author nampr
 */
public class GaTGController {
    public List<GaTrungGian> getGTGByMaTT(String MaTT){
        List<GaTrungGian> gatgs = new ArrayList<GaTrungGian>();
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql = "SELECT * FROM DIEM_DUNG WHERE MA_TUYEN = ?";
        try {                              
            PreparedStatement pst = conn.prepareStatement(sql); 
            pst.setString(1, MaTT);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()) {
                GaTrungGian gatg = new GaTrungGian();
                
                gatg.setMaGa(rs.getString("MA_GA"));
                gatg.setMaTT(rs.getString("MA_TUYEN"));
                gatg.setThoiGianDung(rs.getString("THOI_GIAN_DUNG"));
                
                gatgs.add(gatg);
            }
            
//        conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return gatgs;
    }
    
    public void addGaTG(GaTrungGian gatg){
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql="INSERT INTO DIEM_DUNG(MA_GA, MA_TUYEN, THOI_GIAN_DUNG) VALUES (?,?,?) ";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, gatg.getMaGa());
            pstm.setString(2, gatg.getMaTT());
            pstm.setString(3, gatg.getThoiGianDung());          
            
            int rs= pstm.executeUpdate();
            System.out.println(rs); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public GaTrungGian getGTGByMaGa(String MaGa){
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql =" SELECT * FROM DIEM_DUNG WHERE MA_GA = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, MaGa);
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()){
                GaTrungGian gatg= new GaTrungGian();
                gatg.setMaGa( rs.getString("MA_GA"));
                gatg.setMaTT(rs.getString("MA_TUYEN")); 
                gatg.setThoiGianDung(rs.getString("THOI_GIAN_DUNG"));
                
                return gatg;
                
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }
    
    public void updateGaTG(GaTrungGian gatg) {
        
            Connection conn = ConnectionSQLServer.getConnectionDB();
            String sql="UPDATE DIEM_DUNG SET MA_TUYEN= ? , THOI_GIAN_DUNG = ? WHERE MA_GA = ? ";
        
        try {          
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, gatg.getMaTT());
            pstm.setString(2, gatg.getThoiGianDung());
            pstm.setString(3, gatg.getMaGa());
  
            int rs= pstm.executeUpdate();
            System.out.println(rs); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<GaTrungGian> findGaTGByMaGa(String MaGa){
        List<GaTrungGian> cacgatg = new ArrayList<GaTrungGian>();

        try {
            Connection conn = ConnectionSQLServer.getConnectionDB();

            String sql = "SELECT * FROM DIEM_DUNG WHERE MA_GA = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, MaGa);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()){
                GaTrungGian gatg = new GaTrungGian();
                gatg.setMaGa( rs.getString("MA_GA"));
                gatg.setMaTT(rs.getString("MA_TUYEN"));
                gatg.setThoiGianDung(rs.getString("THOI_GIAN_DUNG"));
                
                cacgatg.add(gatg);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return cacgatg;
    }
    
    
}
