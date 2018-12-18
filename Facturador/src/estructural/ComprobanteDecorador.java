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
public abstract class ComprobanteDecorador implements ComprobanteE{
    
    protected ComprobanteE c;
    
    
    public ComprobanteDecorador(ComprobanteE ce){
        c=ce;
    }

    @Override
    public void agregarLogo() {
        c.agregarLogo();
    }

    @Override
    public void agregarLema() {
        c.agregarLema();
    }
    
    
}
