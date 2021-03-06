/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comportamentales;

import creacional.ComprobanteElectronico;


public class EsquemaOnline implements Esquema{
    private String codigoSRI;

    public EsquemaOnline(String codigoSRI) {
        this.codigoSRI = codigoSRI;
    }
    
   
    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        comprobante.setClaveAcceso(this.getCodigoSRI());
    }

    public String getCodigoSRI() {
        return codigoSRI;
    }

    public void setCodigoSRI(String codigoSRI) {
        this.codigoSRI = codigoSRI;
    }

    @Override
    public String toString() {
        return "EsquemaOnline{" + "codigoSRI=" + codigoSRI + '}';
    }

    
}
