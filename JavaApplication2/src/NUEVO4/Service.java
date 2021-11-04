package NUEVO4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
import java.util.ArrayList;
 import java.util.Collections;
import java.util.Scanner;

  
/**
 *
 * @author alumno
 */
enum palo{
 copa, oro, espada, basto   
};
public class Service {
    private ArrayList<Carta> desc = new ArrayList();
    Scanner sc = new Scanner(System.in);
    public Baraja crearBaraja(){
        Baraja b = new Baraja();
    for (palo p : palo.values()){
        for (int i =0; i<12;i++){
            if(((i+1)!=8 && (i+1) !=9 )){
                Carta c= new Carta();
                c.setNum(i+1);
                c.setPalo(p.toString());
                b.getCartas().add(c);
            }
        }
    }
    return b;
    }
    public void mostrarBaraja(Baraja b){
        System.out.println("Mostrar baraja");
        for (Carta b1: b.getCartas()){
            System.out.println(b1);
        }
    }
    public void barajar(Baraja b){
        System.out.println("Cartas mezcladas");
       Collections.shuffle(b.getCartas());
        }
    public void siguienteCarta(Baraja b){
        System.out.println("Siguiente carta");
        if (b.getCartas().size()!=0){
       System.out.println(b.getCartas().get(0));
       desc.add(b.getCartas().get(0));
       b.getCartas().remove(0);
}else{
       System.out.println("No hay mas cartas"); }
    }

   public void ejecutar(){
       Baraja b = crearBaraja();
       barajar(b);
       mostrarBaraja(b);
       siguienteCarta(b);
       cartasdisp(b);
       darCartas(b);
       cartasMonton(b);
       mostrarBaraja(b);
   }
   public void cartasdisp(Baraja b){
     System.out.println("Cartas Disponibles"); 
     System.out.println(b.getCartas().size());
   }
     public void darCartas(Baraja b){
     System.out.println("Cuantas cartas queres"); 
     Integer x = sc.nextInt();
     if(b.getCartas().size()>=x){
         for(int i=0; i<x;i++){
             siguienteCarta(b);
         }
     }else{
         System.out.println("No te puedo dar esa cantidad");
     }
   }  
     public void  cartasMonton(Baraja b){
         System.out.println("Cartas del monton");
         if(desc.isEmpty()){
             System.out.println("No hay cartas");
         } else{
             for(Carta c: desc){
                 System.out.println(c);
             }
         }
     }
   }
        
    
