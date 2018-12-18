/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

/**
 *
 * @author Patricio
 */
public class LemaDecorador extends ComprobanteDecorador{
    
    public LemaDecorador(ComprobanteE ce) {
        super(ce);
    }
    
    @Override
    public void agregarLema(){
    
        System.out.println("lema agregado");
    }
    
}
