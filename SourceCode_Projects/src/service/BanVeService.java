/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.BanVeController;
import java.util.List;
import model.ThongTinVe;
import model.TuyenTau;

/**
 *
 * @author nampr
 */
public class BanVeService {  
    
    private BanVeController banvectr;

    public BanVeService() {
        banvectr =  new BanVeController();
    }
 
    public List<TuyenTau> getAllTuyenTau(){
       return banvectr.getAllTuyenTau();
    }
    public List<ThongTinVe> getAllKhachHang(){
       return banvectr.getAllKhachHang();
    }
     public TuyenTau getTuyenTauByMaTuyen(String MaTuyen){
        return banvectr.getTuyenTauByMaTuyen(MaTuyen);
    }
     public List<TuyenTau> getTuyenTauByTenGa(String TenTuyen){
        return banvectr.getTuyenTauByTenGa(TenTuyen);
    }
    public void ThemVe(ThongTinVe thongtinve){
        banvectr.ThemVe(thongtinve);
    }
    public void ThemKhachHang(ThongTinVe thongtinve){
        banvectr.ThemKhachHang(thongtinve);
    }
    public void HuyVe(String mave){
        banvectr.HuyVe(mave);
    }
    public String getMaKMByLoaiKH(String LoaiKhachHang){
        return banvectr.getMaKMByLoaiKH(LoaiKhachHang);
    }
    public String getTriGiaByMaVe(String MaVe){
        return banvectr.getTriGiaByMaVe(MaVe);
    }
    public void HuyKH(String makh){
        banvectr.HuyKH(makh);
    }
    public void ThemVeThuong(ThongTinVe thongtinve){
        banvectr.ThemVeThuong(thongtinve);
    }
    public void ThemVeThang(ThongTinVe thongtinve){
        banvectr.ThemVeThang(thongtinve);
    }
}
