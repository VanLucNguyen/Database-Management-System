/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Ga;
import controller.GaCtr;

/**
 *
 * @author DELL
 */
public class GaService { 
    private GaCtr gadao; 
    
    public GaService() {
    gadao= new GaCtr();
}

    public List<Ga> getCacGa(){
    return gadao.getCacGa(); 
    }
    
    public void addGa(Ga ga){
        gadao.addGa(ga);
    }
    public Ga getGabymaga(String MaGa){
        
        return gadao.getGabymaga(MaGa);
    
    }
   
    public void updateGa(Ga ga) {
         gadao.updateGa(ga);
    }
    public List<Ga> findGaByTenGa(String TenGa){
        return gadao.findGaByTenGa(TenGa);
    }
}
