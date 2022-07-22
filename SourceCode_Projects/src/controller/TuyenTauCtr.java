/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TuyenTau;

/**
 *
 * @author nampr
 */
public class TuyenTauCtr {
    public List<TuyenTau> getAllTTs(String MaCTy){
        List<TuyenTau> tuyentaus = new ArrayList<TuyenTau>();
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql = "SELECT * FROM tuyen_tau WHERE MA_CTY = ?";
        try {                              
            PreparedStatement pst = conn.prepareStatement(sql); 
            pst.setString(1, MaCTy);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()) {
                TuyenTau tuyentau = new TuyenTau();
                
                tuyentau.setMaTT(rs.getString("MA_TUYEN"));
                tuyentau.setTenTT(rs.getString("TEN_TUYEN"));
                tuyentau.setMaCty(rs.getString("MA_CTY"));
                tuyentau.setGaBD(rs.getString("MA_GA_XUAT_PHAT"));
                tuyentau.setGaCuoi(rs.getString("MA_GA_KET_THUC"));
                tuyentau.setLoaiTuyen(rs.getString("LOAI_TUYEN"));
                tuyentau.setGiaTuyen(rs.getString("GIA_TUYEN"));
                tuyentau.setTinhTrang(rs.getString("TINH_TRANG_TUYEN"));
                tuyentau.setTGbatdau(rs.getString("THOI_GIAN_BAT_DAU"));
                tuyentau.setTGkethuc(rs.getString("THOI_GIAN_KET_THUC"));
                tuyentau.setTGcho(rs.getString("THOI_GIAN_CHO"));
                
                tuyentaus.add(tuyentau);
            }
            
//        conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return tuyentaus;
    }
    
    public TuyenTau getTTByMaTT(String MaTT){
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql = "SELECT * FROM tuyen_tau WHERE MA_TUYEN = ?";
        try {                                   
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, MaTT);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()) {
                TuyenTau tuyentau = new TuyenTau();
                
                tuyentau.setMaTT(rs.getString("MA_TUYEN"));
                tuyentau.setTenTT(rs.getString("TEN_TUYEN"));
                tuyentau.setMaCty(rs.getString("MA_CTY"));
                tuyentau.setGaBD(rs.getString("MA_GA_XUAT_PHAT"));
                tuyentau.setGaCuoi(rs.getString("MA_GA_KET_THUC"));
                tuyentau.setLoaiTuyen(rs.getString("LOAI_TUYEN"));
                tuyentau.setGiaTuyen(rs.getString("GIA_TUYEN"));
                tuyentau.setTinhTrang(rs.getString("TINH_TRANG_TUYEN"));
                tuyentau.setTGbatdau(rs.getString("THOI_GIAN_BAT_DAU"));
                tuyentau.setTGkethuc(rs.getString("THOI_GIAN_KET_THUC"));
                tuyentau.setTGcho(rs.getString("THOI_GIAN_CHO"));
  
                return tuyentau;
            }
            
//        conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public void addTT(TuyenTau tuyentau){
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql = "INSERT INTO tuyen_tau(MA_TUYEN, TEN_TUYEN, MA_CTY, MA_GA_XUAT_PHAT, MA_GA_KET_THUC, LOAI_TUYEN, GIA_TUYEN, TINH_TRANG_TUYEN, THOI_GIAN_BAT_DAU, THOI_GIAN_KET_THUC, THOI_GIAN_CHO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{                       
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tuyentau.getMaTT());
            pst.setString(2, tuyentau.getTenTT());
            pst.setString(3, tuyentau.getMaCty());
            pst.setString(4, tuyentau.getGaBD());
            pst.setString(5, tuyentau.getGaCuoi());
            pst.setString(6, tuyentau.getLoaiTuyen());
            pst.setString(7, tuyentau.getGiaTuyen());
            pst.setString(8, tuyentau.getTinhTrang());
            pst.setString(9, tuyentau.getTGbatdau());
            pst.setString(10, tuyentau.getTGkethuc());
            pst.setString(11, tuyentau.getTGcho());

            int rs = pst.executeUpdate();
            System.out.println(rs);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateTT(TuyenTau tuyentau){
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql = "UPDATE tuyen_tau SET TEN_TUYEN = ?, MA_CTY = ?, MA_GA_XUAT_PHAT = ?, MA_GA_KET_THUC = ?, LOAI_TUYEN = ?, GIA_TUYEN = ?, TINH_TRANG_TUYEN = ?, THOI_GIAN_BAT_DAU = ?, THOI_GIAN_KET_THUC = ?, THOI_GIAN_CHO = ? WHERE MA_TUYEN = ?";
        try{                        
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tuyentau.getTenTT());
            pst.setString(2, tuyentau.getMaCty());
            pst.setString(3, tuyentau.getGaBD());
            pst.setString(4, tuyentau.getGaCuoi());
            pst.setString(5, tuyentau.getLoaiTuyen());
            pst.setString(6, tuyentau.getGiaTuyen());
            pst.setString(7, tuyentau.getTinhTrang());
            pst.setString(8, tuyentau.getTGbatdau());
            pst.setString(9, tuyentau.getTGkethuc());
            pst.setString(10, tuyentau.getTGcho());
            pst.setString(11, tuyentau.getMaTT());

            
            int rs = pst.executeUpdate();
            System.out.println(rs);
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<TuyenTau> findTTByTenTT(String MaCTy, String TenTT){
        List<TuyenTau> tuyentaus = new ArrayList<TuyenTau>();
        
        try { 
            Connection conn = ConnectionSQLServer.getConnectionDB();
            String sql = "SELECT * FROM tuyen_tau WHERE MA_CTY = ? AND TEN_TUYEN LIKE ?";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, MaCTy);
            pst.setString(2, "%"+TenTT+"%");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                TuyenTau tuyentau = new TuyenTau();
                tuyentau.setMaTT(rs.getString("MA_TUYEN"));
                tuyentau.setTenTT(rs.getString("TEN_TUYEN"));
                tuyentau.setMaCty(rs.getString("MA_CTY"));
                tuyentau.setGaBD(rs.getString("MA_GA_XUAT_PHAT"));
                tuyentau.setGaCuoi(rs.getString("MA_GA_KET_THUC"));
                tuyentau.setLoaiTuyen(rs.getString("LOAI_TUYEN"));
                tuyentau.setGiaTuyen(rs.getString("GIA_TUYEN"));
                tuyentau.setTinhTrang(rs.getString("TINH_TRANG_TUYEN"));
                tuyentau.setTGbatdau(rs.getString("THOI_GIAN_BAT_DAU"));
                tuyentau.setTGkethuc(rs.getString("THOI_GIAN_KET_THUC"));
                tuyentau.setTGcho(rs.getString("THOI_GIAN_CHO"));
                
                tuyentaus.add(tuyentau);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        return tuyentaus;
    }
    
    public void ThemTuyenTocHanh(TuyenTau tuyentau){

        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
            String sql = "INSERT INTO TUYEN_TOC_HANH(MA_TUYEN, DUNG_TRAM) VALUES (?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tuyentau.getMaTT());
            preparedStatement.setInt(2, tuyentau.getDungtram());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
