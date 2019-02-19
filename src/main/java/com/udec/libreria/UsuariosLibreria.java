/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.libreria;


/**
 *En esta clase se capturan los datos de las personas que vna a comprar los libros
 * @author David
 * @version 1.0
 */
public class UsuariosLibreria {
    
    /*
    usuarioComprador Almacena el nombre del usuario que comprara el libro
    */
    private String usuarioComprador;
    
    /*
    cantidadComprada almacena la cantidad de libros que compra 
    */
    private short cantidadComprada;
    
    /*
    cedula almacena el Documento de identidad de la persona 
    */
    private int cedula;

    /**
     * El constructor Solicita los datos minimos para ingresar un usuario 
     * @param usuarioComprador = nombre de la persona
     * @param cantidadComprada = cantidad que compra la persona 
     * @param cedula = documento de identidad
     */
    public UsuariosLibreria(String usuarioComprador, short cantidadComprada, int cedula) {
        this.usuarioComprador = usuarioComprador;
        this.cantidadComprada = cantidadComprada;
        this.cedula = cedula;
    }

    /**
     * getUsuarioComprador Retorna el nombre del usuario
     * @return usuarioComprador
     */
    public String getUsuarioComprador() {
        return usuarioComprador;
    }

    /**
     * setUsuarioComprador permite Asigna el nombre del usuario
     * @param usuarioComprador 
     */
    public void setUsuarioComprador(String usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    /**
     * getCantidadComprada Retorna la cantidad comprada 
     * @return cantidadComprada
     */
    public short getCantidadComprada() {
        return cantidadComprada;
    }

    /**
     * setCantidadComprada Permite asignar la cnatidad comprada
     * @param cantidadComprada 
     */
    public void setCantidadComprada(short cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    /**
     * getCedula Retorna el valor del documento de identidad
     * @return cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * setCedula Permite Asignar el valor para el domcumento de identidad
     * @param cedula 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
        
    
}