/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;
import estructural.ComprobanteE;
import java.time.LocalDate;

/**
 *
 * @author Palacios
 */
public class NotaCredito extends ComprobanteElectronico implements ComprobanteE{
    private String detalleModificacion;
    private double valorAPagar;

    public NotaCredito(String detalleModificacion, double valorAPagar, Cliente cliente, long codigo, LocalDate fecha) {
        super(cliente, codigo, fecha);
        this.detalleModificacion = detalleModificacion;
        this.valorAPagar = valorAPagar;
    }

    public NotaCredito() {
    }

    public String getDetalleModificacion() {
        return detalleModificacion;
    }

    public void setDetalleModificacion(String detalleModificacion) {
        this.detalleModificacion = detalleModificacion;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    
        @Override
    public void agregarLogo() {
        System.out.println("SIN LOGO");
    }

    @Override
    public void agregarLema() {
        System.out.println("SIN LEMA");
    }

    @Override
    public String toString() {
        return "NotaCredito{" + "detalleModificacion=" + detalleModificacion + ", valorAPagar=" + valorAPagar + '}';
    }
    
    
    
}