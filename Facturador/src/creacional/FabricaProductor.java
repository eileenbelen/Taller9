/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creacional;


public class FabricaProductor {
    
    public static FabricaAbstracta getFabrica(String tipoFabrica){
     
      if(tipoFabrica == null){
         return null;
      }		
      if(tipoFabrica.equalsIgnoreCase("COMPROBANTE ELECTRONICO FABRICA")){
         return new ComprobanteFactory();
         
      } else if(tipoFabrica.equalsIgnoreCase("ESQUEMA FABRICA")){
         return new EsquemaFactory();
      }
      
      return null;
  
        
    }

}
