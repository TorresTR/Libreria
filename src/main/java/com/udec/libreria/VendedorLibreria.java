/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.libreria;

/**
 *  Esta clase es la usada por el vendedor para vender libros
 * @author David
 */
public class VendedorLibreria {
    
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

   /*
   *generarFactura este metodo permite generar las facturas que le senran entregadas a los usuarios
   */
   public void generarFactura(){
   } 
}
