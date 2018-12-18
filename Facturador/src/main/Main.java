/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import creacional.ComprobanteElectronico;
import creacional.FabricaAbstracta;
import creacional.FabricaProductor;
import creacional.Factura;
import estructural.ComprobanteE;
import estructural.Esquema;
import estructural.LemaDecorador;

/**
 *
 * @author Patricio
 */
public class Main {
    
    
    public static void main(String[] args) {
        Factura f=new Factura();
        f.agregarLema();
        ComprobanteE c=new LemaDecorador(f);
        c.agregarLema();
        
        FabricaAbstracta fabricaComprobante=FabricaProductor.getFabrica("COMPROBANTE ELECTRONICO FABRICA");
        ComprobanteElectronico c1=fabricaComprobante.getComprobante("FACTURA");
        System.out.println("FACTURA: "+c1);
        ComprobanteElectronico c2=fabricaComprobante.getComprobante("GUIAREMISION");
        System.out.println("GUIA EMISION: "+c2);
        ComprobanteElectronico c3=fabricaComprobante.getComprobante("NOTACREDITO");
        System.out.println("NOTA CREDITO: "+c3);
        
        FabricaAbstracta fabricaEsquema=FabricaProductor.getFabrica("ESQUEMA FABRICA");
        Esquema es1=fabricaComprobante.getEsquema("ESQUEMA ONLINE");
        System.out.println("ESQUEMA ONLINE: "+es1);
        Esquema es2=fabricaComprobante.getEsquema("ESQUEMA OFFLINE");
        System.out.println("ESQUEMA OFFLINE: "+es2);
       
        
    }
    
}
