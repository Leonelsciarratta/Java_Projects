/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia7;



/**
 *
 * @author alumno
 */


import java.util.ArrayList;
import java.util.Scanner;

public class servicio {

    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno() {
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno");
        String nombre = sc.next();
        alumno.setNombre(nombre);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota");
            alumno.setNota(sc.nextInt());
        }
        listaAlumnos.add(alumno);
    }

    public void crearAlumnos() {
        String resp = "no";
        do {
            crearAlumno();
            System.out.println("Desea crear otro alumno?");
            resp = sc.next().toLowerCase();
        } while (resp.equals("si"));
    }

    public void obtenerNotaFinal() {
        System.out.println("Ingrese el nombre del alumno a buscar:");
        String n = sc.next();
        for (Alumno alumno : listaAlumnos) {
            if (n.equals(alumno.getNombre())) {
                System.out.println("La nota final de " + alumno.getNombre() + " es --> " + alumno.notaFinal());
            }
        }
    }

    public void ejecutar() {
        System.out.println("Se ejecuta el programa..");
        crearAlumnos();
        obtenerNotaFinal();
    }
}


  
    