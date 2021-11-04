/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NewMain {
    public static void main(String[]args){
        int contadorF=0, contadorN = 0, contadorG=0, menorP=0, mayorP=0;
    Scanner sc= new Scanner(System.in);
    servicio serv = new servicio();
    persona[] cantidadpersonas = new persona[4];
    for (int i=0;i<cantidadpersonas.length;i++){
        System.out.println("ingrese sus datos");
        cantidadpersonas[i]=serv.nuevapersona();
    }
    for(int i=0;i <cantidadpersonas.length;i++){
        if(serv.calcularIMC(cantidadpersonas[i])== -1)
            contadorF++;
       if(serv.calcularIMC(cantidadpersonas[i])== 0)
            contadorN++; 
       if(serv.calcularIMC(cantidadpersonas[i])== 1)
            contadorG++;
       
    }      
    }
}
    


