/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.TKBC;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.time.LocalDate;


/**
 *
 * @author DELL
 */
public class TKBCCtr {
    
    public List<TKBC> getTT(String NgayBD, String NgayKT) {
    
               
        List<TKBC> tkbcs= new ArrayList<>();
        try {
            Connection conn = ConnectionSQLServer.getConnectionDB();
            String sql =" SELECT * FROM VE WHERE NGAY_MUA BETWEEN ? AND ?" ;
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setDate(1, Date.valueOf(NgayBD));
            pstm.setDate(2, Date.valueOf(NgayKT));
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()){
                TKBC tkbc= new TKBC();
                tkbc.setMaVe(rs.getString("MA_VE"));
                tkbc.setTriGia(rs.getInt("TRI_GIA")); 
                tkbc.setMaTuyen(rs.getString("MA_TUYEN"));
                tkbc.setNgayMua(rs.getDate("NGAY_MUA"));
                tkbc.setMaKM(rs.getString("MA_KM"));
                tkbc.setMaKH(rs.getString("MA_KH"));
                tkbc.setMaNV(rs.getString("MA_NV"));
                tkbc.setLoaiVe(rs.getString("LOAI_VE"));
                
                tkbcs.add(tkbc);
                 
               
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tkbcs;
    }  
    
    
    public List<TKBC> getAll() {
    
               
        List<TKBC> tkbcs= new ArrayList<>();
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql ="SELECT * FROM VE" ;
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()){
                TKBC tkbc= new TKBC();
                tkbc.setMaVe(rs.getString("MA_VE"));
                tkbc.setTriGia(rs.getInt("TRI_GIA")); 
                tkbc.setMaTuyen(rs.getString("MA_TUYEN"));
                tkbc.setNgayMua(rs.getDate("NGAY_MUA"));
                tkbc.setMaKM(rs.getString("MA_KM"));
                tkbc.setMaKH(rs.getString("MA_KH"));
                tkbc.setMaNV(rs.getString("MA_NV"));
                tkbc.setLoaiVe(rs.getString("LOAI_VE"));
                
                tkbcs.add(tkbc);
                 
               
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tkbcs;
    }  
    public void addBC(TKBC tkbc){
        Connection conn = ConnectionSQLServer.getConnectionDB();
        String sql="INSERT INTO BAO_CAO(MA_BC, NGAY_LAP, NGAY_BD, NGAY_KT, NOI_DUNG"
                + ", TONG_DOANH_THU, MA_NV ) VALUES (?,?,?,?,?,?,?) ";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, tkbc.getMaBC());
            pstm.setDate(2, Date.valueOf(LocalDate.now()));
            pstm.setDate(3, Date.valueOf(tkbc.getNgayBD()));
            pstm.setDate(4, Date.valueOf(tkbc.getNgayKT()));
            pstm.setString(5, tkbc.getNoiDung());
            pstm.setDouble(6, tkbc.getTongDoanhThu());
            pstm.setString(7, tkbc.getMaNV());
           
            
            int rs= pstm.executeUpdate();
            System.out.println(rs); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
