/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11ectra;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
     public persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.next();
        System.out.println("Ingrese el dia de su nacimiento");
        Integer dia = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        Integer mes = (sc.nextInt()) - 1;
        System.out.println("Ingrese el año de nacimiento");
        Integer anio = sc.nextInt() - 1900;
        Date fechanac = new Date(anio, mes, dia);
        persona p = new persona(nombre, fechanac);
        return p;
    }

    public Integer calcularEdad(persona p) {
        Date ahora = new Date();
        long milisCumple = p.getFechanac().getTime();
        long milisHoy = ahora.getTime();
        int diasCumple = (int) (milisCumple / 86400000);
        int diasHoy = (int) (milisHoy / 86400000);
        int diasDif = diasHoy - diasCumple;
        int aux = Math.abs(diasDif/365);
//        System.out.println("La persona tiene " + (diasDif/365));
        return aux;
    }
    public Integer calcularmeses(persona p) {
        Date ahora = new Date();
        long milisCumple = p.getFechanac().getTime();
        long milisHoy = ahora.getTime();
        int diasCumple = (int) (milisCumple / 86400000);
        int diasHoy = (int) (milisHoy / 86400000);
        int diasDif = diasHoy - diasCumple;
        int aux3 = Math.abs(diasDif/30);
//        System.out.println("La persona tiene " + (diasDif/365));
        return aux3;
    }
     public Integer calculardias(persona p) {
        Date ahora = new Date();
        long milisCumple = p.getFechanac().getTime();
        long milisHoy = ahora.getTime();
        int diasCumple = (int) (milisCumple / 86400000);
        int diasHoy = (int) (milisHoy / 86400000);
        int diasDif = diasHoy - diasCumple;
        int aux2 = Math.abs(diasDif);
//        System.out.println("La persona tiene " + (diasDif/365));
        return aux2;
    }
     
     
    //public static int numeroDiasEntreDosFechas(persona p){
    // long startTime = getFechanac().getTime();
     //long endTime = getFechanac().getTime();
     //long diffTime = endTime - startTime;
     //long diffDays = diffTime / (1000 * 60 * 60 * 24);
     //return (int)diffDays;
}
    
     

    
    

