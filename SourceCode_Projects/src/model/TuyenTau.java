/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nampr
 */
public class TuyenTau {
    private String MaTT;
    private String TenTT;
    private String MaCty;
    private String GaBD;
    private String GaCuoi;
    private String LoaiTuyen;
    private String GiaTuyen;
    private String TinhTrang;
    private String TGbatdau;
    private String TGkethuc;
    private String TGcho;
    private int dungtram;

    public TuyenTau() {
    }

    public TuyenTau(String MaTT, String TenTT, String MaCty, String GaBD, String GaCuoi, String LoaiTuyen, String GiaTuyen, String TinhTrang, String TGbatdau, String TGkethuc, String TGcho, int dungtram) {
        this.MaTT = MaTT;
        this.TenTT = TenTT;
        this.MaCty = MaCty;
        this.GaBD = GaBD;
        this.GaCuoi = GaCuoi;
        this.LoaiTuyen = LoaiTuyen;
        this.GiaTuyen = GiaTuyen;
        this.TinhTrang = TinhTrang;
        this.TGbatdau = TGbatdau;
        this.TGkethuc = TGkethuc;
        this.TGcho = TGcho;
        this.dungtram = dungtram;
    }

    public String getMaTT() {
        return MaTT;
    }

    public void setMaTT(String MaTT) {
        this.MaTT = MaTT;
    }

    public String getTenTT() {
        return TenTT;
    }

    public void setTenTT(String TenTT) {
        this.TenTT = TenTT;
    }

    public String getMaCty() {
        return MaCty;
    }

    public void setMaCty(String MaCty) {
        this.MaCty = MaCty;
    }

    public String getGaBD() {
        return GaBD;
    }

    public void setGaBD(String GaBD) {
        this.GaBD = GaBD;
    }

    public String getGaCuoi() {
        return GaCuoi;
    }

    public void setGaCuoi(String GaCuoi) {
        this.GaCuoi = GaCuoi;
    }

    public String getLoaiTuyen() {
        return LoaiTuyen;
    }

    public void setLoaiTuyen(String LoaiTuyen) {
        this.LoaiTuyen = LoaiTuyen;
    }

    public String getGiaTuyen() {
        return GiaTuyen;
    }

    public void setGiaTuyen(String GiaTuyen) {
        this.GiaTuyen = GiaTuyen;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getTGbatdau() {
        return TGbatdau;
    }

    public void setTGbatdau(String TGbatdau) {
        this.TGbatdau = TGbatdau;
    }

    public String getTGkethuc() {
        return TGkethuc;
    }

    public void setTGkethuc(String TGkethuc) {
        this.TGkethuc = TGkethuc;
    }

    public String getTGcho() {
        return TGcho;
    }

    public void setTGcho(String TGcho) {
        this.TGcho = TGcho;
    }

    public int getDungtram() {
        return dungtram;
    }

    public void setDungtram(int dungtram) {
        this.dungtram = dungtram;
    }

    
}
