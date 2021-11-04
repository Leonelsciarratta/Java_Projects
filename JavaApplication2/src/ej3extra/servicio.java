/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3extra;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    Scanner sc = new Scanner(System.in).useDelimiter("n");
    HashSet<libros> biblioteca = new HashSet();
    public libros newLibros(){
      System.out.println("Nombre del libro");
      String namelibro = sc.next();
      System.out.println("Nombre del autor");
      String autorlibro = sc.next();
      System.out.println("Stock del libro");
      Integer stock = sc.nextInt();
      
      
    }
    
}
