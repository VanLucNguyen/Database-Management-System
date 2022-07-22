/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Date;

/**
 *
 * @author DELL
 */
public class TKBC {
   
    private String MaVe;
    private int TriGia;
    private String MaTuyen; 
    private Date NgayMua; 
    private String MaKM;
    private String MaKH;
    private String MaNV;
    private String LoaiVe;
    private String NgayBD;
    private String NgayKT; 
    private double TongDoanhThu;
    private String NoiDung;
    private String MaBC;
  

    public TKBC() {
    }

    public TKBC(String MaVe, int TriGia, String MaTuyen, Date NgayMua, String MaKM, String MaKH, String MaNV, String LoaiVe, String NgayBD, String NgayKT, double TongDoanhThu, String NoiDung, String MaBC) {
        this.MaVe = MaVe;
        this.TriGia = TriGia;
        this.MaTuyen = MaTuyen;
        this.NgayMua = NgayMua;
        this.MaKM = MaKM;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.LoaiVe = LoaiVe;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.TongDoanhThu = TongDoanhThu;
        this.NoiDung = NoiDung;
        this.MaBC = MaBC;
    }

    public String getMaVe() {
        return MaVe;
    }

    public void setMaVe(String MaVe) {
        this.MaVe = MaVe;
    }

    public int getTriGia() {
        return TriGia;
    }

    public void setTriGia(int TriGia) {
        this.TriGia = TriGia;
    }

    public String getMaTuyen() {
        return MaTuyen;
    }

    public void setMaTuyen(String MaTuyen) {
        this.MaTuyen = MaTuyen;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date NgayMua) {
        this.NgayMua = NgayMua;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getLoaiVe() {
        return LoaiVe;
    }

    public void setLoaiVe(String LoaiVe) {
        this.LoaiVe = LoaiVe;
    }

    public String getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(String NgayBD) {
        this.NgayBD = NgayBD;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String NgayKT) {
        this.NgayKT = NgayKT;
    }

    public double getTongDoanhThu() {
        return TongDoanhThu;
    }

    public void setTongDoanhThu(double TongDoanhThu) {
        this.TongDoanhThu = TongDoanhThu;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public String getMaBC() {
        return MaBC;
    }

    public void setMaBC(String MaBC) {
        this.MaBC = MaBC;
    }

    
}
