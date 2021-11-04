/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Cine {
    private Pelicula peli;
    private ArrayList<Espectadores> espert;
    private Integer precio;
    private String[][] sala;

    public Cine() {
        
        this.sala = new String[8][6];
    }

    public Cine(Pelicula peli, ArrayList<Espectadores> espert, Integer precio, String[][] sala) {
        this.peli = peli;
        this.espert = espert;
        this.precio = precio;
        this.sala = sala;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public ArrayList<Espectadores> getEspert() {
        return espert;
    }

    public void setEspert(ArrayList<Espectadores> espert) {
        this.espert = espert;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli.toString() + ", espert=" + espert.toString() + ", precio=" + precio + '}';
    }

    void Precio(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
    

