/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.GaTGController;
import java.util.List;
import model.GaTrungGian;

/**
 *
 * @author nampr
 */
public class GaTGService {
    private GaTGController gtgctr;
    
    public GaTGService(){
        gtgctr = new GaTGController();
    }
    
    public List<GaTrungGian> getGTGByMaTT(String MaTT){
        return gtgctr.getGTGByMaTT(MaTT);
    }
    
    public void addGaTG(GaTrungGian gatg){
        gtgctr.addGaTG(gatg);
    }
    
    public GaTrungGian getGTGByMaGa(String MaGa){
        return gtgctr.getGTGByMaGa(MaGa);
    }
    
    public void updateGaTG(GaTrungGian gatg) {
         gtgctr.updateGaTG(gatg);
    }
    
    public List<GaTrungGian> findGaTGByMaGa(String MaGa){
        return gtgctr.findGaTGByMaGa(MaGa);
    }
}
