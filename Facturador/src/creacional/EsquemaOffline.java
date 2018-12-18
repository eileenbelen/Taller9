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
public class EsquemaOffline implements Esquema{

    private String claveAcceso;

    public EsquemaOffline(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }
    
   
    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        comprobante.setClaveAcceso(this.getClaveAcceso());
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
        return "EsquemaOffline{" + "claveAcceso=" + claveAcceso + '}';
    }

  
    
}
