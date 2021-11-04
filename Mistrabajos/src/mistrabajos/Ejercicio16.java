package mistrabajos;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma, cont;
        suma =0;
        cont=0;
        
        
        do {
        System.out.println("Ingrese 1 numero");
        num = leer.nextInt();
        if (cont<20){
        suma=suma+num;
        cont=cont+1;
            }
            else System.out.println("solo puede ingresar 20 numeros");
        } while (num != 0);
        System.out.println("Se capturo el numero 0 ");
        System.out.println("El resultado de la suma es " + suma);
    }
    
}
