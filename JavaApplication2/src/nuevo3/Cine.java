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
import java.util.HashMap;
import java.util.Objects;

public class Cine {
    private String nombrepelicula;
    private HashMap<String,String> sala;
    private Integer precio=180;

    public Cine(String nombrepelicula, HashMap<String, String> sala) {
        this.nombrepelicula = nombrepelicula;
        this.sala = sala;
        this.precio= 180;
    }

    public Cine() {
        this.precio=180;
        this.sala= new HashMap();
    }

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }

    public HashMap<String, String> getSala() {
        return sala;
    }

    public void setSala(HashMap<String, String> sala) {
        this.sala = sala;
    }    

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}

