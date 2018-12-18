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
public class LogoDecorador extends ComprobanteDecorador{
    
    public LogoDecorador(ComprobanteE ce) {
        super(ce);
    }
    
    @Override
    public void agregarLogo(){
        System.out.println("logo agregado");
    
    }
    
}
