/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mistrabajos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int numero;   
       System.out.println("Ingrese el tamanio del vector");
        numero=sc.nextInt();
        int[] vector= new int[numero];
        for(int i =0; i <vector.length; i++) {
            vector[i]=numero=sc.nextInt();      
        }
        for(int i =0; i <vector.length; i++) {
           System.out.print(vector[i] + "/"); 
            System.out.println("El número tiene " + Integer.toString(vector[i]).length() + " dígitos");
            
            
           
            
           
    }
}
        } 
        
