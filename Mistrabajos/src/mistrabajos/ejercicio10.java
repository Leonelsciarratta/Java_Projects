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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase o palabra de 8 digitos");
        palabra =leer.next();
        if (palabra.length()==8){
        System.out.println("correcto");  
    }
        else System.out.println("incorrecto");
    }
    
}
