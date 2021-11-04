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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un digito");
        num =leer.nextInt();
        if (num%2 == 0){
        System.out.println("El numero es par");}
        else if (num%2 == 1){
        System.out.println("El numero es impar");}
    }
    
}
