/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.TuyenTauCtr;
import java.util.List;
import model.TuyenTau;

/**
 *
 * @author nampr
 */
public class TuyenTauService {
    private TuyenTauCtr ttCtr;
    
    public TuyenTauService(){
        ttCtr = new TuyenTauCtr();
    }
    
    public List<TuyenTau> getAllTTs(String MaCTy){
        return ttCtr.getAllTTs(MaCTy);
    }
    
    public void addTT(TuyenTau tuyentau){
        ttCtr.addTT(tuyentau);
    }
    
    public TuyenTau getTTById(String MaTT){
        return ttCtr.getTTByMaTT(MaTT);
    }
    
    public void updateTT(TuyenTau tuyentau){
        ttCtr.updateTT(tuyentau);
    }
    
    public List<TuyenTau> findTTByTenTT(String MaCTy, String TenTT){
        return ttCtr.findTTByTenTT(MaCTy, TenTT);
    }
    
    public void ThemTuyenTocHanh(TuyenTau tuyentau){
        ttCtr.ThemTuyenTocHanh(tuyentau);
    }
    
}
