/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4;

/**
 *
 * @author alumno
 */
import java.util.ArrayList;
import java.util.Scanner;

public class servicio {
    
    ArrayList<Pelicula> listaPelis = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void crearPelicula(){
        String res;
        do{
            Pelicula peli = new Pelicula();
            System.out.println("Ingrese titulo de la peli");
            peli.setTitulo(leer.next());
            System.out.println("Ingrese director de peli");
            peli.setDirector(leer.next());
            System.out.println("Ingrese duracion en minutos de peli");
            peli.setDuracion(leer.nextInt());
            listaPelis.add(peli);
            System.out.println("Desea ingresar otra peli");
            res = leer.next();
            
        }while(res.equals("si"));
    }
    
    public void mostrarPelis(servicio s){
        System.out.println("Aqui estan todas las pelis de la Lista");
        for (Pelicula peli : listaPelis) {
            System.out.println(peli);
        }
    }
    
    public void mostrarPelis1hora(servicio s){
        System.out.println("");
        System.out.println("Aqui estan las pelis que tengan mas de 1 hora de duracion");
        for (Pelicula peli : listaPelis) {
            if(peli.getDuracion() > 60){
                System.out.println(peli);
            }
        }
    }
    
    public void ordenarMayMen(servicio s){
        System.out.println("");
        System.out.println("Aqui estan las pelis ordenadas de mayor duracion a menor duracion");
        listaPelis.sort(Pelicula.compararDuracion);
        for (Pelicula peli : listaPelis) {
            System.out.println(peli);
        }
    }
    
    public void ordenarMenMay(servicio s){
        System.out.println("");
        System.out.println("Aqui estan las pelis ordenadas de menor duracion a mayor duracion");
        listaPelis.sort(Pelicula.compararDuracionn);
        for (Pelicula peli : listaPelis) {
            System.out.println(peli);
        }
    }
    
    public void ordenarTitulo(servicio s){
        System.out.println("");
        System.out.println("Aqui estan las pelis ordenadas por titulo alfabeticamente");
        listaPelis.sort(Pelicula.compararTitulos);
        for (Pelicula peli : listaPelis) {
            System.out.println(peli);
        }
    }
    
    public void ordenarDirector(servicio s){
        System.out.println("");
        System.out.println("Aqui estan las pelis ordenadas por director alfabeticamente");
        listaPelis.sort(Pelicula.compararDirectores);
        for (Pelicula peli : listaPelis) {
            System.out.println(peli);
        }
    }
    
    public void ejecutar(servicio s){
        crearPelicula();
        mostrarPelis(s);
        mostrarPelis1hora(s);
        ordenarMayMen(s);
        ordenarMenMay(s);
        ordenarTitulo(s);
        ordenarDirector(s);
    }
}    

