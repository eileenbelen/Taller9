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
public interface FabricaAbstracta {
    
    public ComprobanteElectronico getComprobante(String tipoComprobante) ;
    public Esquema getEsquema(String tipoEsquema);

}
