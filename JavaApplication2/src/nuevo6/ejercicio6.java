/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Float> listaProductos = new HashMap<String,Float>();
    Scanner sc = new Scanner(System.in);
    int opcionElegida = 0;
    float precio;
    String nombreproducto;

    while (opcionElegida != 5) {
        System.out.println("Introduce el numero de la opción que quieras:");
        System.out.println("1.- Introducir producto");
        System.out.println("2.- Modificar precio");
        System.out.println("3.- Mostrar todos los productos");
        System.out.println("4.- Eliminar producto");
        System.out.println("5.- Salir");
        opcionElegida = sc.nextInt();

        switch (opcionElegida) {
            case 1:
                System.out.println("Introduce el nombre del producto:");
                nombreproducto = sc.next();
                System.out.println("Introduce el precio del producto:");
                precio = sc.nextFloat();
                guardarProducto(nombreproducto, precio, listaProductos);
                break;
            case 2:
                System.out.println("Introduce el nombre del producto del que quieres cambiar el precio:");
                nombreproducto = sc.next();
                modificaPrecio(nombreproducto, listaProductos);
                break;
            case 3:
                listaProductos.toString();
               
                break;
            case 4:
                System.out.println("Introduce el nombre del producto que quieres eliminar:");
                nombreproducto = sc.next();
                eliminaProducto(nombreproducto, listaProductos);
                break;
            case 5:
                break;   // Si la opcion es 5 no se hace nada 
            default:
                System.out.println("Tienes que introducir una opción valida");
        }

    }

    }
    
    public static void guardarProducto(String nombreproducto, float precio, HashMap <String,Float> listaProductos){
    if (listaProductos.containsKey(nombreproducto)) {
        System.out.println("No se puede introducir el producto. El nombre esta repetido.");
    } else {
        listaProductos.put(nombreproducto, precio);    }
    }           
   public static void modificaPrecio(String nombreproducto, HashMap<String,Float> listaProductos){
    Scanner sc = new Scanner(System.in);
    if (listaProductos.containsKey(nombreproducto)) {
        System.out.println("Introduce el precio del producto:");
        listaProductos.put(nombreproducto, sc.nextFloat());            
    } else {
        System.out.println("No hay ningun producto con ese nombre.");
    }
}
   public static void mostrarProductos(HashMap<String, Float> listaProductos) {
    String clave;
    Iterator<String> productos = listaProductos.keySet().iterator();
    System.out.println("Hay los siguientes productos:");
    while(productos.hasNext()){
        clave = productos.next();
        System.out.println(clave + " - " + listaProductos.get(clave));
        System.out.println(listaProductos.toString());
    }        
}
   public static void eliminaProducto(String nombreproducto, HashMap<String,Float> listaProductos) {
    if (listaProductos.containsKey(nombreproducto)) {
        listaProductos.remove(nombreproducto);
    } else {
        System.out.println("No hay ningun producto con ese nombre.");  
    }       
} 

    
   
}
