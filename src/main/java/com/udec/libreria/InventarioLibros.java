/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.libreria;

/**
 * En esta clase se capturaran los valores, que se usaran para el manejo del inventario
 * @author David
 * @version 1.0
 */
public class InventarioLibros {
    
    /*
    nombreLibroInventario Guarda el nombre del libro que se quiere almacenar en el inventrario
    */
    private String nombreLibroInventario;
    
    /*
    cantidadMinima guarda la cantidad minima de los libros que se pueden tener 
    */
    private short cantidadMinima;
    
    /*
    cantidadMaxima guarda cual es el tope de libros que se pueden llegar a tener 
    */
    private short cantidadMaxima;

    /**
     * El constructor Solicita los datos minimos que requiere para poder empezar a almecenar en el inventario
     * @param nombreLibroInventario = Guarda el nombre del libro que estara en el inventario
     * @param cantidadMinima = la cantidad minima de copias del libro en el invetario 
     * @param cantidadMaxima = la cantidad maxima de copoas del libro en el inventario
     */
    public InventarioLibros(String nombreLibroInventario, short cantidadMinima, short cantidadMaxima) {
        this.nombreLibroInventario = nombreLibroInventario;
        this.cantidadMinima = cantidadMinima;
        this.cantidadMaxima = cantidadMaxima;
    }

    
    
   

    
    /**
     * getNombreLibroInventario Retorna el nombre del libro en el inventario
     * @return nombreLibroInventario
     */    
    public String getNombreLibroInventario() {
        return nombreLibroInventario;
    }

    /**
     * setNombreLibroInventario Permite asignar un nombre de libro 
     * @param nombreLibroInventario 
     */
    public void setNombreLibroInventario(String nombreLibroInventario) {
        this.nombreLibroInventario = nombreLibroInventario;
    }

    /**
     * getCantidadMinima Retorna la cantidad minima de libros en el inventario
     * @return cantidadMinima
     */
    public short getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * setCantidadMinima Permite asiganr una cantidad minima al inventario
     * @param cantidadMinima 
     */
    public void setCantidadMinima(short cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    /**
     * getCantidadMaxima Retorna la cantidad maxima de copias En el inventario
     * @return cantidadMaxima
     */
    public short getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     * setCantidadMaxima Permite asignar la cantidad maxima de copias en el inventario
     * @param cantidadMaxima 
     */
    public void setCantidadMaxima(short cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    
    
    
}
