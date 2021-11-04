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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println ("Ingrese una palabra que comience con A ");
        String palabra; 
        palabra = leer.next();
        boolean empiezaConA = palabra.substring(0).startsWith("a") || palabra.substring(0).startsWith("A");                   
        if (empiezaConA) {System.out.println("Correcto");}
        else {System.out.println("Incorrecto");}

    }
    }
    

