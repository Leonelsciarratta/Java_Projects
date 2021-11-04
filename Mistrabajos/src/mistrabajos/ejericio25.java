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
public class ejericio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        Random rnd = new Random();
        int [][] matriz = new int[4][4]; 
        
        for (int i=0;i<matriz.length; i++){
        
        for (int j=0;j<matriz.length; j++){
            matriz [i][j]=rnd.nextInt(100); 
        }
        }   
        for (int i=0; i < matriz.length; i++) {
  System.out.print("|");
  for (int j=0; j < matriz[i].length; j++) {
    System.out.print (matriz[i][j]);
    if (j!=matriz[i].length-1) System.out.print("\t");
  
  }
  System.out.println("|");
}
System.out.println("ordenar de forma ascendente");
        for (int  i=matriz.length-1;i>=0;i--){//imprime la matriz ascendentemente
			for( int j=matriz.length-1;j>=0;j--){
				System.out.print(matriz[i][j]+"	");
			}
			System.out.println("");
		}
    }
    
}
