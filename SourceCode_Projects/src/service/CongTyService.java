/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
    
import controller.CongTyCtr;
import model.CongTy;
import java.util.List;

/**
 *
 * @author Luc
 */
public class CongTyService {
    private CongTyCtr congtydao;
    
    public CongTyService(){
       congtydao = new CongTyCtr(); 
    }
            
    public List<CongTy> getAllCongTy() {
        return congtydao.getAllCongTy();
    }
    
    public void ThemCongTy(CongTy congty){
        congtydao.ThemCongTy(congty);
    }
    
    public CongTy getCongTyByMaCTy(String MaCTy){
        return congtydao.getCongTyByMaCTy(MaCTy);
    } 
    
    public void SuaCongTy(CongTy congty){
        congtydao.SuaCongTy(congty);
    }
    public List<CongTy> TraCuuCongTy(String TenCTy){
        return congtydao.TraCuuCongTy(TenCTy);
    }
}

