/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class main {
    public static void main(String[] args){
    servicio Nuevoservicio= new servicio();
    persona persona1 = Nuevoservicio.nuevapersona();
    persona persona2 = Nuevoservicio.nuevapersona();
    persona persona3 = Nuevoservicio.nuevapersona();
    persona persona4 = Nuevoservicio.nuevapersona();
    servicio.crearpersona(persona1);
    servicio.calcularIMC(persona1);
    servicio.EsmayordeEdad(persona1);
    servicio.crearpersona(persona2);
    servicio.calcularIMC(persona2);
    servicio.EsmayordeEdad(persona2);
    servicio.crearpersona(persona3);
    servicio.calcularIMC(persona3);
    servicio.EsmayordeEdad(persona3);
    servicio.crearpersona(persona4);
    servicio.calcularIMC(persona4);
    servicio.EsmayordeEdad(persona4);
    System.out.println(persona1);
    System.out.println(persona2);
    System.out.println(persona3);
    System.out.println(persona4);
    }       
  
    
}
    
        