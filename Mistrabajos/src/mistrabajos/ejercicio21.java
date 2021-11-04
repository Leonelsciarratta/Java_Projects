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
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int euro, moneda;
        double dolar , libra, yen;
        dolar=1.28611;
        libra=0.86;
        yen=129.852;
        System.out.println("Cuantos euros tiene ");
        euro=leer.nextInt();
        System.out.println("a que moneda quiere onvertir");
        System.out.println("1. cambio a dolar");
        System.out.println("2. cambio a libra");
        System.out.println("3. cambio a yen");
        moneda=leer.nextInt();
        switch (moneda) {
            case 1:
                cambio(euro,dolar);
                break;
            case 2:
                cambio2(euro,libra);
                break;
            case 3:
                cambio3(euro,yen);
                break;
            default:
                System.out.println("Solo puede ingresar 1, 2 o 3");          
        }     
    }
    public static void cambio(double euro, double dolar){
    double cambio;
    cambio=euro*dolar;
    System.out.println("la cantidad de dolares que tiene es" + cambio);
    }
    public static void cambio2(double euro, double libra){
    double cambio2;
    cambio2=euro*libra;
    System.out.println("la cantidad de libra que tiene es" + cambio2);
    }
    public static void cambio3(double euro, double yen){
    double cambio3;
    cambio3=euro*yen;
    System.out.println("la cantidad de yenes que tiene es" + cambio3);
    }
}
