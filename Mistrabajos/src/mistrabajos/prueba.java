/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mistrabajos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String s = "En un lugar de la Mancha...";
       for (int x=0;x<s.length();x++)
   System.out.println("Caracter " + x + ": " + s.charAt(x));
    }
    
}
