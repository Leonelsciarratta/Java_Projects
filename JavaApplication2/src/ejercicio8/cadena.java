/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class cadena {
    private String frase;
    private Integer longitud;
    public cadena(){
    }
     public cadena(String frase, Integer longitud){
         this.frase=frase;
         this.longitud=longitud;
         
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
        
    }

    @Override
    public String toString() {
        return "cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

 
    }
    
    

