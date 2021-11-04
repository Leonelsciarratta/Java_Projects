/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
     public punto crearpunto() {
         
         System.out.println("Escriba el x del punto 1 ");
         Integer x1 = sc.nextInt();
         System.out.println("Escriba el y del punto 1");
         Integer y1 = sc.nextInt();
         System.out.println("Escriba el x del punto 2 ");
         Integer x2 = sc.nextInt();
         System.out.println("Escriba el y del punto 2");
         Integer y2 = sc.nextInt();
         punto c = new punto (x1, y1, x2, y2);
         double distance = Math.hypot(x1-x2, y1-y2);
         System.out.println("la distancia entre los puntos es " + distance);
        return c;
     }
     
}
