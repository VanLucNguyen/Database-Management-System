/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author nampr
 */
public class ThongTinVe {
    private String MaKhachHang;
    private String TenKhachHang;
    private String SDT;
    private String CMND;
    private String LoaiKhachHang;
    private String MaVe;
    private String MaKM;
    private String LoaiVe;
    private String MaNV;
    private String MaTuyen;
    private Date NgayMua;
    private String TriGia;
    private String TinhTrangVe;
    private Date NgayKetThuc;
    private int SoLanSD;
    private Date ThoiDiemDungVe;

    public ThongTinVe() {
    }

    public ThongTinVe(String MaKhachHang, String TenKhachHang, String SDT, String CMND, String LoaiKhachHang, String MaVe, String MaKM, String LoaiVe, String MaNV, String MaTuyen, Date NgayMua, String TriGia, String TinhTrangVe, Date NgayKetThuc, int SoLanSD, Date ThoiDiemDungVe) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.SDT = SDT;
        this.CMND = CMND;
        this.LoaiKhachHang = LoaiKhachHang;
        this.MaVe = MaVe;
        this.MaKM = MaKM;
        this.LoaiVe = LoaiVe;
        this.MaNV = MaNV;
        this.MaTuyen = MaTuyen;
        this.NgayMua = NgayMua;
        this.TriGia = TriGia;
        this.TinhTrangVe = TinhTrangVe;
        this.NgayKetThuc = NgayKetThuc;
        this.SoLanSD = SoLanSD;
        this.ThoiDiemDungVe = ThoiDiemDungVe;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    public void setLoaiKhachHang(String LoaiKhachHang) {
        this.LoaiKhachHang = LoaiKhachHang;
    }

    public String getMaVe() {
        return MaVe;
    }

    public void setMaVe(String MaVe) {
        this.MaVe = MaVe;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getLoaiVe() {
        return LoaiVe;
    }

    public void setLoaiVe(String LoaiVe) {
        this.LoaiVe = LoaiVe;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
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

    public String getTriGia() {
        return TriGia;
    }

    public void setTriGia(String TriGia) {
        this.TriGia = TriGia;
    }

    public String getTinhTrangVe() {
        return TinhTrangVe;
    }

    public void setTinhTrangVe(String TinhTrangVe) {
        this.TinhTrangVe = TinhTrangVe;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public int getSoLanSD() {
        return SoLanSD;
    }

    public void setSoLanSD(int SoLanSD) {
        this.SoLanSD = SoLanSD;
    }

    public Date getThoiDiemDungVe() {
        return ThoiDiemDungVe;
    }

    public void setThoiDiemDungVe(Date ThoiDiemDungVe) {
        this.ThoiDiemDungVe = ThoiDiemDungVe;
    }
    
}
