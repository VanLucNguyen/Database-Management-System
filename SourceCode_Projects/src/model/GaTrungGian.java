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
public class GaTrungGian {
    private String MaGa;
    private String MaTT;
    private String ThoiGianDung;

    public GaTrungGian() {
    }

    public GaTrungGian(String MaGa, String MaTT, String ThoiGianDung) {
        this.MaGa = MaGa;
        this.MaTT = MaTT;
        this.ThoiGianDung = ThoiGianDung;
    }

    public String getMaGa() {
        return MaGa;
    }

    public void setMaGa(String MaGa) {
        this.MaGa = MaGa;
    }

    public String getMaTT() {
        return MaTT;
    }

    public void setMaTT(String MaTT) {
        this.MaTT = MaTT;
    }

    public String getThoiGianDung() {
        return ThoiGianDung;
    }

    public void setThoiGianDung(String ThoiGianDung) {
        this.ThoiGianDung = ThoiGianDung;
    }
    
}
