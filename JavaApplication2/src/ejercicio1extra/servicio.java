/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     public cancion datosCancion() {
         System.out.println("Escriba el titulo de la cancion ");
         String titulo = sc.next();
         System.out.println("Escriba el autor de la cancion ");
         String autor = sc.next();
         cancion c = new cancion(titulo, autor);
        return c;
     }
}
