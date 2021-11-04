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
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        int numero, buscar, pos;
        pos=-1;
        System.out.println("Ingrese el tamanio del vector");
        numero=leer.nextInt();
        int[] vector= new int[numero];
        for(int i =0; i <vector.length; i++) {
            vector[i]=rnd.nextInt(99 - 1 + 1) + 1;      
        }
        for(int i =0; i <vector.length; i++) {
           System.out.print(vector[i] + "/");    
        } 
        System.out.println("ingrese valor a buscar");
        buscar=leer.nextInt();
        for(int i =0; i <vector.length; i++) {
            if (buscar==vector[i]){
                pos=i;
            }
        }
      if (pos==-1){
          System.out.println("No se encontro el numero");
      }else{
          System.out.println("Se encontro el numero " + buscar + "en la posicion " +pos);
      }
    }
    
}
