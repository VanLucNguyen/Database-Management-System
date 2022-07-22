/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luc
 */
public class CongTy {
    private String MaCTy;
    private String TenCTy;
    private String DCWeb;
    private String SDT;
    private String DiaChi;

    public CongTy() {
    }

    public CongTy(String MaCTy, String TenCTy, String DCWeb, String SDT, String DiaChi) {
        this.MaCTy = MaCTy;
        this.TenCTy = TenCTy;
        this.DCWeb = DCWeb;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public String getMaCTy() {
        return MaCTy;
    }

    public void setMaCTy(String MaCTy) {
        this.MaCTy = MaCTy;
    }

    public String getTenCTy() {
        return TenCTy;
    }

    public void setTenCTy(String TenCTy) {
        this.TenCTy = TenCTy;
    }

    public String getDCWeb() {
        return DCWeb;
    }

    public void setDCWeb(String DCWeb) {
        this.DCWeb = DCWeb;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
}
