/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        Date fecha = new Date(anio, mes, dia);
        persona p = new persona(nombre,fecha);
        return p;
     }
      public Integer calcularEdad(persona p) {
        Date ahora = new Date();
        long milisCumple = p.getFecha().getTime();
        long milisHoy = ahora.getTime();
        int diasCumple = (int) (milisCumple / 86400000);
        int diasHoy = (int) (milisHoy / 86400000);
        int diasDif = diasHoy - diasCumple;
        int aux = Math.round(diasDif/365);
//        System.out.println("La persona tiene " + (diasDif/365));
        return aux;
    }
    }
    