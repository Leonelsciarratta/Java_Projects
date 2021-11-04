/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia7;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Alumno {
   private String nombre;
   private ArrayList<Integer> notas;

    public Alumno() {
        this.notas = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
   
    public void setNota(Integer n){
        this.notas.add(n);
    }
    
    public void setTresNotas(Integer n1, Integer n2, Integer n3){
        this.notas.add(n1);
        this.notas.add(n2);
        this.notas.add(n3);
    }
    
    public Double notaFinal(){
        Double notaFinal = ((double)(notas.get(0) + notas.get(1) + notas.get(2)))/3;
        return notaFinal;
    }
}


