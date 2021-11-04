/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    public String agregarProducto(){
        
        System.out.println("Ingrese un producto");
        String producto = leer.next();
        return producto;
    }
    public Double agregarPrecio(){
        System.out.println("Ingrese un precio");
        Double precio = leer.nextDouble();
        return precio;
    }
    public void agregarProd(HashMap<String, Double> menu){
        String resp;
        do {
            menu.put(agregarProducto(), agregarPrecio());
            System.out.println("Desea Ingresar otro producto");
            resp= leer.next().toLowerCase();
        }while(!(resp.equals("no")));
    }
    public void eliminaProd(HashMap<String, Double> menu){
        System.out.println("que producto desea eliminar");
        if(menu.remove(leer.next())!= null){
        System.out.println("Se ha eliminado el producto");
    } else{
            System.out.println("No se encontro el producto");
            }
    }
 public void menuprincipal(HashMap<String, Double> menu){
     int respuesta;
     do{
         System.out.println("Bienvenido");
         System.out.println("Ingrese 1 si desea agregar producto");
         System.out.println("Ingrese 2 si desea eliminar producto");
         System.out.println("Ingrese 3 si visualizar el menu");
         System.out.println("Ingrese 4 para salir");
         System.out.println("Ingrese opcion");
         respuesta = leer.nextInt();
         switch (respuesta){
             case 1:
                agregarProd(menu);
                break;
                case 2:
                eliminaProd(menu);
                break;
                case 3:
                System.out.println(menu.toString());
                break;
         }
     }while(respuesta != 4);
             System.out.println("gracias por la visita");
     
 }
}
