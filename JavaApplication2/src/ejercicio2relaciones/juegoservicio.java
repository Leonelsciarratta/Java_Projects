/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class juegoservicio {
    revolver r = new revolver();
    Scanner sc = new Scanner(System.in);
    Integer cantidad;
    ArrayList <jugador> jugadores = new ArrayList();
     public void llenarjuego(){
         System.out.println("Comienza el juego");
         System.out.println("ingrese la cantidad de jugadores");
         Integer cantidad = sc.nextInt();
        if (cantidad <=6){
         for(int i=0; i<cantidad;i++ ){
             System.out.println("Indique el id");
             Integer id = sc.nextInt();
             System.out.println("Indique el nombre");
             String nombre = sc.next();
             jugador j= new jugador(id, nombre);
             jugadores.add(j);}
         
         }
         else{
                 System.out.println("El maximo de jugadores es 6");}
     }
    
    public void ronda(){
       revolverservicio revolv = new revolverservicio();
        System.out.println("SE INICIA LA RONDA");
            for (jugador j: jugadores){
                System.out.println("El jugador que dispara es " + j.getNombre());
                System.out.println(j.toString());
            }
            }
             //for (jugador j: jugadores){
                
        }
    

