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
    * insertarInventario
    * En este metodo es donde se realizara la insercion de los datos para el inventario, los cuales serian el nnombre del 
    * libro su cantidad maxima y su cantidad minima 
    * @param nombreLibroInventario
    * @param cantidadMinima
    * @param cantidadMaxima
    * @author David
    * @version 1.0
    */  
        void insertarInventario(String nombreLibroInventario, short cantidadMinima, short cantidadMaxima){
         }
    
    /**
    * venderLibros
    En el metodo venderLibros, sera el metodo que se usara para trabajar directamente la cantidad del inventrio
    saber cuantos se vendieron, y que disponibilidad de libros tenemos y si es necesario pedir mas copias del Libro 
    Cuando la compra sea exitosa se restara de la cantidad en el inventario(la cantidad maxima) y se mostrara una
    cantidad actualizada cuando se quiera relaizar una nueva venta y se sumara en un contador la venta para así llevar 
    un registro del Libro mas vendido
    * @param nombreLibroInventario
    * @param nombreCliente
    * @param cantidadComprada
    * @author David
    * @version 1.0
    */    

     public void venderLibros(String nombreLibroInventario, String nombreCliente,int cantidadComprada){
        }
      
      
    /**
     * consultarMasVendido
    En este metodo se consultara cual ah sido el Libro mas vendido, consultando la variable que aumenta en el metodo
    venderLibros, con este simplemente haremos una busqueda según que Libro tenga una mayor valor en la variable que 
    se aumenta en venderLibros, lo que retornara la busqueda sera el nombre del Libro y su cantidad y se le mostraran 
    al usuario
    * @author David
    * @version 1.0
    */    
     
    public void consultarMasVendido(){
          }
     
     
    /**
    * consultarMasCaro
    En este metodo se consultara es el Libro mas caro según su valor individual ingresado en el precio del Libro
    aque se  hara una busqueda que revise precio por precio hasta encontrar cual es el valor mas caro de todos los libros 
    cuando lo encuentre retornara el nombre del Libro y su costo 
    * @author David
    * @version 1.0
    */    
     
    public void consultarMasCaro(){
        }
      
     /**
    * consultarMasBarato
    En este metodo se consultara es el Libro mas barato según su valor individual, Bucando cual es el menor precio
    que se ingreso, retornando cuando lo encuentre el valor y el nombre del Libro
    * @author David
    * @version 1.0
    */ 
    public void consultarMasBarato(){
        }
     
    /**
    * consultarMenosVendido
     En este metodo se consultara es el Libro menos venido ya que sera del cual se hayan
     reportado menos ventas, se tomara igual la variable usada en vender libros, y se analizara cual es el menor 
    en dicha variable, retornara el nombre del Libro y su cantidad
    * @author David
    * @version 1.0
    */ 
   public  void consultarMenosVendido(){
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
