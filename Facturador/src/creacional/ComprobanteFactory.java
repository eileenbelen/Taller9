/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

import comportamentales.Esquema;


public class ComprobanteFactory implements FabricaAbstracta {
    
    @Override
    public ComprobanteElectronico getComprobante(String tipoComprobante){
      if(tipoComprobante == null){
         return null;
      }		
      if(tipoComprobante.equalsIgnoreCase("FACTURA")){
         return new Factura();
         
      } else if(tipoComprobante.equalsIgnoreCase("GUIAREMISION")){
         return new GuiaRemision();
         
      } else if(tipoComprobante.equalsIgnoreCase("NOTACREDITO")){
         return new NotaCredito();
      }
      
      return null;
   }

  

    @Override
    public Esquema getEsquema(String tipoEsquema) {
        return null; 
    }
    
}
