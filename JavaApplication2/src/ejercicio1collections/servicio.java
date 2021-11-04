/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    Scanner sc = new Scanner(System.in);
    private List <String> palabras;
    public servicio(){
 this.palabras = new ArrayList();  
    } 
    public void crearpalabra(){
        System.out.println("Ingrese una palabra");
        String List = sc.next();
        palabras.add(List);
    }
    public void mostrarpalabra(){
        System.out.println("las palabras de la lista son");
        for (String aux : palabras){
        System.out.println(aux);}
        System.out.println(" la cantidad es " + palabras.size());
    }
    
}
