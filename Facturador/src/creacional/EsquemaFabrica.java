/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creacional;

import estructural.Esquema;

/**
 * 
 * @author Luis A. Sarango-Parrales
 */
public class EsquemaFabrica implements FabricaAbstracta{
    @Override
    public ComprobanteElectronico getComprobante(String tipoComprobante){
         return null;
   }


    @Override
    public Esquema getEsquema(String tipoEsquema) {
            if(tipoEsquema == null){
         return null;
      }		
      if(tipoEsquema.equalsIgnoreCase("ESQUEMA ONLINE")){
         return new EsquemaOnline("passwordOnline");
         
      } else if(tipoEsquema.equalsIgnoreCase("ESQUEMA OFFLINE")){
         return new EsquemaOffline("passwordOffline");
      }
      
      return null;
       
    }
    
}
