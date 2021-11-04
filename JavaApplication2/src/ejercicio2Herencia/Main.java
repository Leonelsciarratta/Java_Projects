/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2Herencia;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */



public class Main {

    public static void main(String[] args) {
        // TODO code application logicz here
        
     //Lavadora uno = new Lavadora();
//        uno.crearLavadora();
//        System.out.println(uno);
//        
//        Televisor tv = new Televisor();
//        tv.crearTelevisor();
//        System.out.println(tv);
//        
//        System.out.println("El precio final de la lavadora es: " + uno.getPrecio());
//        System.out.println("El precio final del tv es: " + tv.getPrecio());
        
        
        ArrayList<Electrodomesticos> listaProductos = new ArrayList();
//        listaProductos.add(tv);
//        listaProductos.add(uno);

        Double suma = 0D; 
        Double sumaL = 0D;
        Double sumaT = 0.0;
               
        listaProductos.add(new Televisor(50D, true, "blanco", "B", 1000D, 30D));
        listaProductos.add(new Televisor(100D, true, "blanco", "B", 1000D, 30D));
        listaProductos.add(new Lavadora(25D, "blanco", "B", 1000D, 30D));
        listaProductos.add(new Lavadora(12D, "blanco", "B", 1000D, 30D));
        
             for (Electrodomesticos producto : listaProductos) {
            producto.precioFinal();
            suma=suma+producto.getPrecio();
            
            
                 if (producto instanceof Lavadora) {
//                     Lavadora aux = (Lavadora) producto;
                     sumaL = sumaL + producto.getPrecio();
                     System.out.println(producto);
                 }
                 
                 if (producto instanceof Televisor) {
//                     Televisor aux = (Televisor) producto;
                     sumaT = sumaT + producto.getPrecio();
                     System.out.println(producto);
                 }
           
        }
 
        System.out.println("La suma total es de: " + suma + " " + sumaL + " De lavarropas. " + sumaT + " De televisores. ");
        
    }
    
}
   
    
   
        



