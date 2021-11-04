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
public class ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamanio de la matriz cuadrada");
        int n= leer.nextInt();
        int[][] matriz= new int [n][n];
        int[][] matrizopuesta= new int [n][n];
        //llenar matriz
        for(int i=0; i<n;i++ ){
            for(int j=0; j<n;j++ ){
                System.out.println("Ingrese los valores de la fila" + i+ "ingrese los valores de la columna" + j);
                matriz[i][j]=leer.nextInt();
                 matrizopuesta[j][i]=matriz[i][j];
            }
            System.out.println("");
        } 
        //mostrar matriz
       // System.out.print("La matriz ingresada es la siguiente ");  
              for (int i=0; i < matriz.length; i++) {
  System.out.print("|");
  for (int j=0; j < matriz[i].length; j++) {
    System.out.print (matriz[i][j]);
    if (j!=matriz[i].length-1) System.out.print("\t");
  
  }
  System.out.println("|");
}
              //mostrarmatrizopuesta
              //System.out.print("La matriz transpuesta es la siguiente ");
                for (int i=0; i < matriz.length; i++) {
  System.out.print("|");
  for (int j=0; j < matriz[i].length; j++) {
    System.out.print(matrizopuesta[i][j]);
    if (j!=matriz[i].length-1) System.out.print("\t");
  
  }
  System.out.println("|");
}
                //condicional para saber si la matriz es antisimetrica
       boolean condicion= true;
        terminar:
        for(int i=0; i<n;i++ ){
            for(int j=0; j<n;j++ ){
                if (matriz[i][j]!= - matrizopuesta[i][j])
                    System.out.println("la matriz ingresada no es antisimetrica");
                        condicion=false;
                        break terminar;
            }
            }
        if(condicion==true){
        System.out.println("La matriz ingresada es antisimetrica");
}
    }
     
    
}
