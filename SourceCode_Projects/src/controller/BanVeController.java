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
import model.ThongTinVe;
import model.TuyenTau;

/**
 *
 * @author nampr
 */
public class BanVeController {
    
    public List<TuyenTau> getAllTuyenTau() {
        List<TuyenTau> tuyenTau = new ArrayList<TuyenTau>();
 
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
        
            String sql = "SELECT * FROM TUYEN_TAU"; 
        
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {
                TuyenTau tuyentau = new TuyenTau();
            
                tuyentau.setMaTT(rs.getString("MA_TUYEN"));
                tuyentau.setTenTT(rs.getString("TEN_TUYEN"));
                tuyentau.setTGbatdau(rs.getString("THOI_GIAN_BAT_DAU"));
                tuyentau.setTGkethuc(rs.getString("THOI_GIAN_KET_THUC"));
                tuyentau.setLoaiTuyen(rs.getString("LOAI_TUYEN"));
                tuyentau.setGiaTuyen(rs.getString("GIA_TUYEN"));
                tuyentau.setTGcho(rs.getString("THOI_GIAN_CHO"));          
            
                tuyenTau.add(tuyentau);
                }    
            }catch (SQLException e) {
                e.printStackTrace();
            }
        return tuyenTau;       
    }
    
    public List<ThongTinVe> getAllKhachHang() {
        List<ThongTinVe> thongTinVe = new ArrayList<ThongTinVe>();
 
    try{
        Connection connection =  ConnectionSQLServer.getConnectionDB();
        
        String sql = "SELECT khach_hang.MA_KH,HO_TEN,LOAI_KH,MA_VE FROM khach_hang,ve WHERE VE.MA_KH=KHACH_HANG.MA_KH"; 
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        while (rs.next()) {
            ThongTinVe thongtinve = new ThongTinVe();
            
            thongtinve.setMaKhachHang(rs.getString("MA_KH"));
            thongtinve.setTenKhachHang(rs.getString("HO_TEN"));
            thongtinve.setLoaiKhachHang(rs.getString("LOAI_KH")); 
            thongtinve.setMaVe(rs.getString("MA_VE"));
   
            thongTinVe.add(thongtinve);
            }    
        }catch (SQLException e) {
            e.printStackTrace();
    }
        return thongTinVe;   
  }
    public TuyenTau getTuyenTauByMaTuyen(String MaTuyen) {
               
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
        
            String sql = "SELECT * FROM TUYEN_TAU WHERE MA_TUYEN = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, MaTuyen);
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {
                TuyenTau tuyentau = new TuyenTau();
            
                tuyentau.setMaTT(rs.getString("MA_TUYEN"));
                tuyentau.setTenTT(rs.getString("TEN_TUYEN"));
                tuyentau.setTGbatdau(rs.getString("THOI_GIAN_BAT_DAU"));
                tuyentau.setTGkethuc(rs.getString("THOI_GIAN_KET_THUC"));
                tuyentau.setLoaiTuyen(rs.getString("LOAI_TUYEN"));
                tuyentau.setGiaTuyen(rs.getString("GIA_TUYEN"));
                tuyentau.setTGcho(rs.getString("THOI_GIAN_CHO"));
            
                return tuyentau;
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<TuyenTau> getTuyenTauByTenGa(String TenTuyen) {
        List<TuyenTau> tuyenTau = new ArrayList<TuyenTau>();
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
        
            String sql = "SELECT * FROM TUYEN_TAU,GA WHERE GA.MA_GA = TUYEN_TAU.MA_GA_XUAT_PHAT AND TEN_TUYEN LIKE ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%"+TenTuyen+"%");
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {
                TuyenTau tuyentau = new TuyenTau();                
            
                tuyentau.setMaTT(rs.getString("MA_TUYEN"));
                tuyentau.setTenTT(rs.getString("TEN_TUYEN"));
                tuyentau.setTGbatdau(rs.getString("THOI_GIAN_BAT_DAU"));
                tuyentau.setTGkethuc(rs.getString("THOI_GIAN_KET_THUC"));
                tuyentau.setLoaiTuyen(rs.getString("LOAI_TUYEN"));
                tuyentau.setGiaTuyen(rs.getString("GIA_TUYEN"));
                tuyentau.setTGcho(rs.getString("THOI_GIAN_CHO"));
            
                tuyenTau.add(tuyentau);
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tuyenTau;
    }
    
    public void ThemVe(ThongTinVe thongtinve){
     
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
            String sql = "INSERT INTO VE(MA_VE,TRI_GIA,MA_TUYEN,NGAY_MUA,MA_KM,MA_KH,MA_NV,LOAI_VE) VALUES (?,?,?,?,?,?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thongtinve.getMaVe());
            preparedStatement.setString(2, thongtinve.getTriGia());
            preparedStatement.setString(3, thongtinve.getMaTuyen());        
            preparedStatement.setDate(4, thongtinve.getNgayMua());
            preparedStatement.setString(5, thongtinve.getMaKM());
            preparedStatement.setString(6, thongtinve.getMaKhachHang());
            preparedStatement.setString(7, thongtinve.getMaNV());
            preparedStatement.setString(8, thongtinve.getLoaiVe());
                      
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
   
    public void HuyVe(String mave){
     
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
            String sql = "DELETE FROM ve WHERE MA_VE = ? ";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mave);
                
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void HuyKH(String makh){
     
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
            String sql = "DELETE FROM KHACH_HANG WHERE MA_KH = ? ";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, makh);
                
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void ThemKhachHang(ThongTinVe thongtinve){
     
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
            String sql = "INSERT INTO khach_hang(MA_KH,HO_TEN,SDT,CMND,LOAI_KH) VALUES (?,?,?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thongtinve.getMaKhachHang());
            preparedStatement.setString(2, thongtinve.getTenKhachHang());
            preparedStatement.setString(3, thongtinve.getSDT());        
            preparedStatement.setString(4, thongtinve.getCMND());
            preparedStatement.setString(5, thongtinve.getLoaiKhachHang());
                        
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public String getMaKMByLoaiKH(String LoaiKhachHang) {
               ThongTinVe thongtinve = new ThongTinVe(); 
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
        
            String sql = "SELECT MA_KM FROM KHUYEN_MAI WHERE LOAI_DT = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, LoaiKhachHang);
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {               
            
                thongtinve.setMaKM(rs.getString("MA_KM"));
        
                return thongtinve.getMaKM();
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getTriGiaByMaVe(String MaVe) {
               ThongTinVe thongtinve = new ThongTinVe(); 
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
        
            String sql = "SELECT TRI_GIA FROM VE WHERE MA_VE = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, MaVe);
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {               
            
                thongtinve.setTriGia(rs.getString("TRI_GIA"));
        
                return thongtinve.getTriGia();
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void ThemVeThang(ThongTinVe thongtinve){
     
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
            String sql = "INSERT INTO ve_thang(MA_VE,SO_LAN_SU_DUNG,TINH_TRANG_VE,NGAY_BAT_DAU,NGAY_KET_THUC,MA_KH) VALUES (?,?,?,?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thongtinve.getMaVe());
            preparedStatement.setInt(2, thongtinve.getSoLanSD());
            preparedStatement.setString(3, thongtinve.getTinhTrangVe());        
            preparedStatement.setDate(4, thongtinve.getNgayMua());
            preparedStatement.setDate(5, thongtinve.getNgayKetThuc());
            preparedStatement.setString(6, thongtinve.getMaKhachHang());
                        
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void ThemVeThuong(ThongTinVe thongtinve){
     
        try{
            Connection connection =  ConnectionSQLServer.getConnectionDB();
            String sql = "INSERT INTO ve_thuong(MA_VE,THOI_DIEM_DUNG_VE,TINH_TRANG_VE,MA_KH) VALUES (?,?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thongtinve.getMaVe());
            preparedStatement.setDate(2, thongtinve.getThoiDiemDungVe());
            preparedStatement.setString(3, thongtinve.getTinhTrangVe());        
            preparedStatement.setString(4, thongtinve.getMaKhachHang());
                        
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
   
}
