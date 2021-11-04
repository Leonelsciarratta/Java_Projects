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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese una nota del 0 al 10");
            valor=teclado.nextInt();
            if (valor>0 || valor<10) {
                System.out.println(valor);
               
            } 
            
        } 
        while (valor<0 || valor>10); 
 
    }
}

