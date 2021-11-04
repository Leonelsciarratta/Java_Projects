/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ejerciciolibro libro1 = new ejerciciolibro();
       System.out.println("Ingrese titulo del libro");
       libro1.setTitulo(sc.nextLine());
       System.out.println("Ingrese titulo del autor");
       libro1.setAutor(sc.nextLine());
       System.out.println("numero de paginas");
       libro1.setNumPag(sc.nextInt());
       System.out.println("ISBN");
       libro1.setISBN(sc.nextInt());
       mostrarDatos(libro1);
    }
    public static void mostrarDatos(ejerciciolibro p){
        System.out.println("Se muestran los datos del libro");
        System.out.println("Nombre: " + p.getTitulo());
        System.out.println("Autor: " + p.getAutor());
        System.out.println("Numero de paginas: " + p.getNumPag());
        System.out.println("ISBN: " + p.getISBN());
    }
}
