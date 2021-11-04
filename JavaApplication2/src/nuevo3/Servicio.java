/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo3;

/**
 *
 * @author alumno
 */
import nuevo3.Cine;
import nuevo3.Espectadores;
import nuevo3.Pelicula;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicio {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    private String [][] sala1= new String [8][6];
    private String [] letras={"A","B","C","D","E","F"};
    
    public Pelicula crearpelicula(){
        System.out.println("Ingrese titulo: ");
        String titulo= leer.next();
        System.out.println("Ingrese director: ");
        String director= leer.next();
        System.out.println("Ingrese duracion: ");
        Integer duracion=leer.nextInt();
        System.out.println("Ingrese edad minima permitida: ");
        Integer edadmin=leer.nextInt();
        
        return new Pelicula(titulo,director,duracion,edadmin);
    }
    
    public Espectadores crearespectadores(){
        System.out.println("Ingrese nombre: ");
        String nombredepila= leer.next();
        System.out.println("Ingrese edad: ");
        Integer anios= leer.nextInt();
        System.out.println("Con cuanto dinero cuenta?: ");
        Integer cash= leer.nextInt();
        
        return new Espectadores(nombredepila,anios,cash);
    }
    
    public String returnx(){
        int aux= (int)(Math.random()*3);
        if(aux==1){
            return "X";
        }
        else{
            return " ";
        }
    }
    public HashMap<String,String> crearsala(){
        HashMap<String,String> saala = new HashMap();
        for(int j=7;j>=0;j--){
            for (int i = 0; i <letras.length; i++){
                String ocupado= returnx();
                sala1[i][j]= String.valueOf((j+1)+letras[i]);
                saala.put(sala1[j][i],ocupado);
                sala1[i][j]=String.valueOf((j+1) + letras[i]+ocupado);
                System.out.println("|"+ sala1[j][i]+ "|");
            }
            System.out.println(" ");
        }
        return saala;
    }
    
    public Cine crearcine(Pelicula p){
        String nombrepelicula= p.getTitulo();
        Cine c = new Cine();
        c.setNombrepelicula(nombrepelicula);
        c.setSala(crearsala());
        return c;
    }
    
    public Boolean validaredad(Pelicula p, Espectadores e){
        return (e.getEdad()>= p.getEdadminima());
    }
    
    public Boolean validarplata(Cine c,Espectadores e){
        return (e.getDinero()>= c.getPrecio());
    }
    
    public void mostrarsala(){
        for (int i = 7; i >=0; i--) {
            for (int j = 5; j>=0; j--) {
                System.out.println("|"+ sala1[i][j]+"|");
            }
            System.out.println(" ");
        }
    }
    
    public void llenarespacio(String posicion, String ocupado){
        for (int i = 0; i <8; i++) {
            for (int j = 0; j <6; j++) {
                if(sala1[i][j].contains(posicion+" ")){
                    sala1[i][j]= sala1[i][j].replace(" ", ocupado);
                }               
            }            
        }
    }
     
    
    public void sentarlo(HashMap<String,String> sabela){
        System.out.println("Ingrese asiento: ");
        String a=leer.next();
        for (Map.Entry<String, String> asiento : sabela.entrySet()) {
            String key = asiento.getKey();
            String value = asiento.getValue();
            if(key.equalsIgnoreCase(a)){
                if(value.equals(" ")){
                    asiento.setValue("X");
                    llenarespacio(a,"X");
                }
            }
            
        }
    }
    
    

    public void ejecutar() {
        System.out.println("Bienvenido al Cine");
        Pelicula p1= crearpelicula();
        Cine c1= crearcine(p1);
        Espectadores e1= crearespectadores();
        mostrarsala();
        if(this.validarplata(c1, e1)){
            if(this.validaredad(p1, e1)){
                this.sentarlo(c1.getSala());
            }
            else{
                System.out.println("No cuenta con la edad suficiente para ver esta pelicula");
            }
        }
        else{
            System.out.println("No cuenta con el dinero suficiente para ver esta pelicula");
        }
    }
    
            
    
}

