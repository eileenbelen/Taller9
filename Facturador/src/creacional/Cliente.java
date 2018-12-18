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
public class Cliente {
    private String cedulaRuc, nombre, telefono, domicilio;
    private Esquema esquema;

    public Cliente(String cedulaRuc, String nombre, String telefono, String domicilio, Esquema esquema) {
        this.cedulaRuc = cedulaRuc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.esquema = esquema;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Esquema getEsquema() {
        return esquema;
    }
    
    public void escogerEsquema(Esquema esquema){
        this.esquema=esquema;
    }
}
