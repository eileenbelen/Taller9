/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creacional;

import comportamentales.Esquema;
import comportamentales.EsquemaOffline;
import comportamentales.EsquemaOnline;
import creacional.ComprobanteElectronico;
import creacional.FabricaAbstracta;


public class EsquemaFactory implements FabricaAbstracta{
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
