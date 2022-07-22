/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import controller.TKBCCtr;
import java.util.List;
import model.TKBC;

/**
 *
 * @author DELL
 */
public class TKBCService {
    
    private TKBCCtr ctrltkbc; 
    
    public TKBCService(){
    
        ctrltkbc = new TKBCCtr(); 
    }
    
    public List<TKBC> getTT(String NgayBD, String NgayKT) {
    
        return ctrltkbc.getTT(NgayBD, NgayKT);
    }
    
    public List<TKBC> getAll() {
        return ctrltkbc.getAll();
    }
    
    public void addBC (TKBC tkbc){
        ctrltkbc.addBC(tkbc);
    }
}
