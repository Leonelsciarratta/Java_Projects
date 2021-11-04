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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        Scanner leer=new Scanner(System.in);
        int suma,valor,limite;
        suma=0;
        System.out.println("Ingrese el limite de la suma");
        limite=leer.nextInt();
        do {
            System.out.print(""+"Ingrese los valores ");
            valor=teclado.nextInt();
            if (valor>0) {
                suma=suma+valor;
                System.out.print("el resultado es " + suma + ""); 
            }
        } while (suma<limite);
        
    }
}  
    
    

