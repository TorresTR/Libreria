/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.libreria;

/**
 *  Esta clase contiene los atributos para poder genrar facturas
 * @author David
 */
public class FacturaLibros {
    
    /*
    numeroFactura alamacena el numero de la factura 
    */
    private int numeroFactura;
    
    /*
    nombreavendedor guarda el nombre del vendedor 
    */
    private String nombreavendedor;
    
    /*
    nombreLibro Guarda el nombre del libro 
    */
    private String nombreLibro;

    /**
     * El contructor FacturaLibros contiene los datos basicos para crear una factura
     * @param numeroFactura
     * @param nombreavendedor
     * @param nombreLibro 
     */
    public FacturaLibros(int numeroFactura, String nombreavendedor, String nombreLibro) {
        this.numeroFactura = numeroFactura;
        this.nombreavendedor = nombreavendedor;
        this.nombreLibro = nombreLibro;
    }

    /**
     * getNumeroFactura Retorna el dato del numero de la factura actual
     * @return numeroFactura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * setNumeroFactura Permite asignar el numero de la factura
     * @param numeroFactura 
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * getNombreavendedor Retorna el nombre del vendedor 
     * @return nombreavendedor
     */
    public String getNombreavendedor() {
        return nombreavendedor;
    }

    /**
     * setNombreavendedor Permite Asignar el nombre del vendedor
     * @param nombreavendedor 
     */
    public void setNombreavendedor(String nombreavendedor) {
        this.nombreavendedor = nombreavendedor;
    }
    

    /**
     * getNombreLibro Retorna el nombre del Libro
     * @return nombreLibro
     */
    public String getNombreLibro() {
        return nombreLibro;
    }

    /**
     * setNombreLibro Permite Asignar el nombre del libro
     * @param nombreLibro 
     */
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
}
