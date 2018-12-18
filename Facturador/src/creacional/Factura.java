/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

import estructural.ComprobanteE;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Palacios
 */
public class Factura extends ComprobanteElectronico implements ComprobanteE{
    
    private List<String> productos;
    private double total;

    public Factura(List<String> productos, double total, Cliente Cliente, long codigo, LocalDate fecha) {
        super(Cliente, codigo, fecha);
        this.productos = productos;
        this.total = total;
    }

    public Factura() {
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
        return "Factura{" + "productos=" + productos + ", total=" + total + '}';
    }

    
    
    
    
}