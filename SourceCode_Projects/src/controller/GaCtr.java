/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.ArrayList;
import java.util.List;
import model.Ga;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;



/**
 *
 * @author DELL
 */
public class GaCtr { 
    public List<Ga> getCacGa(){
        List<Ga> cacga= new ArrayList<Ga>();
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql ="select * from ga";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()){
                Ga ga= new Ga();
                ga.setMaGa( rs.getString("MA_GA"));
                ga.setTenGa(rs.getString("TEN_GA")); 
                ga.setVitri(rs.getString("VI_TRI"));
                ga.setTinhTrangGa(rs.getString("TINH_TRANG_GA"));
                 
                cacga.add(ga);
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cacga;
}
    
    
    public Ga getGabymaga(String MaGa){
    
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql =" SELECT * FROM ga WHERE MA_GA = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, MaGa);
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()){
                Ga ga= new Ga();
                ga.setMaGa( rs.getString("MA_GA"));
                ga.setTenGa(rs.getString("TEN_GA")); 
                ga.setVitri(rs.getString("VI_TRI"));
                ga.setTinhTrangGa(rs.getString("TINH_TRANG_GA"));
                return ga;
                
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
}
    public void addGa(Ga ga){
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql="INSERT INTO ga(MA_GA, TEN_GA, VI_TRI, TINH_TRANG_GA) VALUES (?,?,?,?) ";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, ga.getMaGa());
            pstm.setString(2, ga.getTenGa());
            pstm.setString(3, ga.getVitri());
            pstm.setString(4, ga.getTTGa());
           
            
            int rs= pstm.executeUpdate();
            System.out.println(rs); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateGa(Ga ga) {
        
            Connection conn = ConnectionSQLServer.getConnectionDB();
            String sql="UPDATE ga SET TEN_GA = ? , VI_TRI= ? , TINH_TRANG_GA= ? WHERE MA_GA= ? ";
        
        try {
           
            PreparedStatement pstm = conn.prepareStatement(sql);
            
           
            pstm.setString(1, ga.getTenGa());
            pstm.setString(2, ga.getVitri());
            pstm.setString(3, ga.getTTGa());
            pstm.setString(4, ga.getMaGa());
            
            
            int rs= pstm.executeUpdate();
            System.out.println(rs); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Ga> findGaByTenGa(String TenGa){
        List<Ga> cacga = new ArrayList<Ga>();

        try {
            Connection conn = ConnectionSQLServer.getConnectionDB();

            String sql = "SELECT * FROM ga WHERE TEN_GA LIKE ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+TenGa+"%");
            ResultSet rs = pstm.executeQuery();

            while (rs.next()){
                Ga ga= new Ga();
                ga.setMaGa( rs.getString("MA_GA"));
                ga.setTenGa(rs.getString("TEN_GA")); 
                ga.setVitri(rs.getString("VI_TRI"));
                ga.setTinhTrangGa(rs.getString("TINH_TRANG_GA"));
                
                cacga.add(ga);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return cacga;
    }
    
}
