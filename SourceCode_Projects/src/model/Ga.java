/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class Ga {
    private String MaGa;
    private String TenGa;
    private String TTGa;
    private String Vitri; 

   public Ga() {
    }

    public Ga(String MaGa, String TenGa, String ViTri, String TTGa) {
        this.MaGa = MaGa;
        this.TenGa = TenGa;
        this.Vitri = Vitri;
        this.TTGa = TTGa;
        
    } 

    public String getMaGa() {
        return MaGa;
    }

    public void setMaGa(String MaGa) {
        this.MaGa = MaGa;
    }

    public String getTenGa() {
        return TenGa;
    }

    public void setTenGa(String TenGa) {
        this.TenGa = TenGa;
    }

    public String getTTGa() {
        return TTGa;
    }

    public void setTinhTrangGa(String TTGa) {
        this.TTGa = TTGa;
    }

    public String getVitri() {
        return Vitri;
    }

    public void setVitri(String Vitri) {
        this.Vitri = Vitri;
    }
    
}
