/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mistrabajos;

/**
 *
 * @author alumno
 */
public class ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = {  {11, 26, 36, 47, 52, 65, 72, 81, 95, 10},
                            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                            {56, 78, 87, 90, 32, 90, 17, 12, 87, 67},
                            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                            {32, 76, 79, 12, 36, 52, 67, 96, 12, 11},
                            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        
        int[][] buscada = { {41, 87, 24},
                            {32, 76, 79},
                            {99, 13, 54}};
        
        int[][] subM = new int [3][3];
        
        boolean encontrada = true;

        //Recorrer la matriz 8x8
        for (int fila = 0; fila < 8; fila++) {  //fila = 0

            for (int columna = 0; columna < 8; columna++) { //columna = 1
                
                encontrada = true;
                
                //Generador de subm
                for (int filaSub = fila;  filaSub < 3 + fila  ; filaSub++) {
                    
                    for (int columnaSub = 0 + columna; columnaSub < 3 + columna ; columnaSub++) {
                        
                        subM[filaSub - fila][columnaSub - columna] = matriz[filaSub][columnaSub];

                    }
                }
                
                //Comparar subM con la matriz buscada
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (subM[i][j] != buscada[i][j]) {
                            encontrada = false;
                        }
                    }
                }
                
                if (encontrada) {
                    System.out.println("La encontre en la fila: " + fila + " columna: " + columna);
                    break;
                } 
            }
            
            if (encontrada) {
                break;
            }

        }

        if (!encontrada) {
            System.out.println("No fue encontrada");
        }

    }

}
    
    

