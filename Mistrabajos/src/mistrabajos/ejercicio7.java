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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un digito");
        num1=leer.nextInt();
        System.out.println("Ingrese otro digito");
        num2=leer.nextInt();
        if (num1>num2){
        System.out.println("el mayor de los numeros es " + num1);}
        else if (num2>num1){
            System.out.println("el mayor de los numeros es " + num2);
        }
        else {
        System.out.println("Los 2 numeros son iguales ");
    }
        }
    }
    

