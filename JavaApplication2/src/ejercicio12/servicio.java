/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

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
        int aux = Math.round(diasDif/365);
//        System.out.println("La persona tiene " + (diasDif/365));
        return aux;
    }

    public void menorQue(persona p1, persona p2) {
        if (p1.getFechanac().before(p2.getFechanac())) {
            System.out.println(p1.getNombre() + " es mayor que "
                    + p2.getNombre());
        } else {
            System.out.println(p2.getNombre() + " es mayor que "
                    + p1.getNombre());
        }
    }

    public void menorQue2(persona p1, persona p2) {
        if (calcularEdad(p1) > calcularEdad(p2)) {
            System.out.println(p1.getNombre() + " es mayor que "
                    + p2.getNombre());
        } else {
            System.out.println(p2.getNombre() + " es mayor que "
                    + p1.getNombre());
        }
    }  
}
    
    

