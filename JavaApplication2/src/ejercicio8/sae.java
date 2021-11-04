/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class sae {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public cadena crearcadena(){
        cadena crearcadena= new cadena();
        System.out.println("Ingrese una frase");
        crearcadena.setFrase(sc.next());
        crearcadena.setLongitud(crearcadena.getFrase().length());
        
        return crearcadena;
    } 
     public void contarVocales(cadena crearcadena) {
        int vocal = crearcadena.getFrase().toLowerCase().replaceAll("[^aeiou]", "").length();
        System.out.println("Las vocales ingresadas son " + vocal);
    }
     public void invertirFrase(cadena crearcadena) {
        StringBuilder frase = new StringBuilder(crearcadena.getFrase()).reverse();
        System.out.println("Frase invertidad: " + frase);
    }

    public void vacesRepetidos(cadena crearcadena) {
        System.out.println("Elija una vocal");
        String letra;

        letra = sc.nextLine();

        int cont = crearcadena.getFrase().toLowerCase().split(letra).length;
        System.out.println("La cantidad de " + letra + " es " + cont);
    }
    
    public void compararLongitud(cadena crearcadena){
        System.out.println("Ingresar frase a comparar");
        String frase2 = sc.nextLine();
        if (frase2.length() > crearcadena.getLongitud()) {
            System.out.println("La frase ingresada es mayor a la primera");
        }else{
            System.out.println("La frese ingresada es menor a la primera");
        }
    }
    
    public void unirFrase(cadena crearcadena){
        System.out.println("Ingresar frase");
        String frase2 = sc.nextLine();
        System.out.println(crearcadena.getFrase()+" "+frase2);
    }
    
    public void reemplazar(cadena crearcadena){
        System.out.println("Ingresar letra a reemplazar");
        System.out.println(crearcadena.getFrase().replace("a", sc.next()));
    }
    
    public boolean contiene(cadena crearcadena){
        System.out.println("ingresar letra");
        
        return crearcadena.getFrase().contains(sc.next());
    }
}
