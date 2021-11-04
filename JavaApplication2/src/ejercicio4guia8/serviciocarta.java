/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class serviciocarta {

    private Scanner read = new Scanner(System.in);
    ArrayList<Carta> Baraja = new ArrayList();
    ArrayList<Carta> cartasUsadas = new ArrayList(); 
      
    public void crearmazo() {
        Palo[] dePalos = {Palo.BASTO, Palo.COPA, Palo.ESPADA, Palo.ORO};
        //Carta carta = new Carta(1, Palo.BASTO);

        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 12; i++) {
                if (i == 8) {
                    i = 10;
                }
                Baraja.add(new Carta(i, dePalos[j]));
            }

        }
        
        System.out.println(Baraja.toString());
  }

    public void barajar(){
        Collections.shuffle(Baraja); //MEZCLAR TODOS LOS ELEMENTOS
        System.out.println("------------------------");
        //System.out.println(Baraja.toString());
    }
    
    public Carta siguienteCarta(){
        Carta aux = null;
        
        if (Baraja.isEmpty()){
             aux =cartasUsadas.get(0);
            System.out.println("No hay mas cartas para mostrar");
         
        }else {
             cartasUsadas.add(Baraja.get(0));
               aux = Baraja.get(0);
               Baraja.remove(0);
          
             System.out.println(aux.toString());
        }
      
        return aux;
    }
    
    public void cartasDisponibles(){
        
        System.out.println("se pueden repartir "+Baraja.size()+ " cartas");
        
    }
    
    public void menu(){
        int opcion;
        
        do {
            System.out.println("1) BARAJAR");
            System.out.println("2) SIGUIENTE CARTA");
            System.out.println("3) CARTAS DISPONIBLES ");
            System.out.println("4) DAR CARTAS");
            System.out.println("5) CARTAS MONTOS");
            System.out.println("6) MOSTRAR BARAJA");
            opcion = read.nextInt();
            switch(opcion){
                case 1: 
                    barajar();
                    break;
                case 2:   
                    siguienteCarta();
                    break;
                case 3: 
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:   
                    mostrarBaraja();
                    break;
                    
                    
            }
            
        }while(opcion!=7);
        
    }
    
    
    
    public int darCartas(){
        System.out.println("ingrese cantidad de cartas a pedir");
        int num = read.nextInt();
        
        if (num > Baraja.size() ){
            System.out.println("no hay suficientes cartas");
            return 0;
        }else {
        
        for (int i = 0; i < num; i++) {
          Carta aux =  siguienteCarta();
          
          aux.toString();
          
        }
        return num;
        }
        
    }
    
    public void cartasMonton(){
        System.out.println("cartas usadas: ");
        //cartasUsadas.toString();
        for (Carta carta : cartasUsadas) {
            System.out.println(carta.toString());
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("IMPRIMIENDO BARAJA");
        for (Carta carta : Baraja) {
            System.out.println(carta.toString());
        }
    }
    
    
    
}

    

