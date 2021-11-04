/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAHERENCIA1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    Barco b = new Barco();
    public void seleccionarBarco(){
        Integer opciones;
        Scanner sc = new Scanner(System.in);
        System.out.println("seleccione 1 si desea alquilar un velero, seleccione 2 si desea alquilar un barco a motor, seleccione 3 si desea alquilar yate");
        opciones=sc.nextInt();
        switch(opciones){
            case 1: 
                System.out.println("Ha alquilado un velero");
                break;
                case 2: 
                System.out.println("Ha alquilado un barco a motor");
                break;
                case 3: 
                System.out.println("Ha alquilado un yate");
                break;
        }
    }
    
}
