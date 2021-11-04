/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER2;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class main {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       circun circunferencia1 = new circun();
       System.out.println("Ingrese el radio");
       circunferencia1.setRadio(sc.nextDouble());
       System.out.println("Se muestran los datos de la circunferencia");
       circunferencia1.area(circunferencia1.getRadio());
       circunferencia1.perimetro(circunferencia1.getRadio());
       mostrarDatos(circunferencia1);
       
    }
    public static void mostrarDatos(circun p){
        System.out.println("Radio: " + p.getRadio());
        
    }
}

