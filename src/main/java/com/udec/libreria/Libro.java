/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.libreria;

/**
 * En esta clase se capturan los datos necesarios para manejar la insercion de los libros 
 donde se guardara su autor, la version del Libro, su precio, y su nombre 
 * @author David
 * @version  1.0
 */
public class Libro {

    /*
     La variable autor se usa para guardar el nombre del autor
    */
    private String autor; 
    
    /*
    La variablre version se usa para guardar la version del Libro 
    */
    private String version;
    
    /*
    La Variable precioindividual guarda el precio individual del Libro 
    */
    private int precioIndividual;
    
    /*
    La variable nombreLibro almacena el nombre del libro que se quiere guardar
    */
    private String nombreLibro;
    

   
    /**
     * 
     * El cosnturctor recibe los datos minimos para almacenar un libro; y poder ejecutarse
     * @param autor = Se usara para guardar el nombre de la persona que escribio el libro 
     * @param version = Guardara la version del libro 
     * @param precioIndividual = Guardara el Precio individual del Libro agregado
     * @param nombreLibro = Almacenara el Nombre del libro que se agrega
     */
    public Libro(String autor, String version, int precioIndividual, String nombreLibro) {
        this.autor = autor;
        this.version = version;
        this.precioIndividual = precioIndividual;
        this.nombreLibro = nombreLibro;
    }

    
    
    /**
     * getAutor Retornaria el nombre del autor 
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * setAutor Puede asignar un autor 
     * @param autor 
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * getVersion Retorna la version del libro 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * setVersion asigna un nuevo valor a version
     * @param version 
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * getPrecioIndividual Retorna el Precio del libro
     * @return precioIndividual
     */
    public int getPrecioIndividual() {
        return precioIndividual;
    }

    /**
     * setPrecioIndividual Se puede asignar un valor para el precio individual
     * @param precioIndividual 
     */
    public void setPrecioIndividual(int precioIndividual) {
        this.precioIndividual = precioIndividual;
    }
    

    /**
     * getNombreLibro Retorna el valor del Nombre del libro
     * @return nombreLibro
     */
    public String getNombreLibro() {
        return nombreLibro;
    }

    /**
     * setNombreLibro Asigna un valor para el nombre del Libro
     * @param nombreLibro 
     */
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    
}
