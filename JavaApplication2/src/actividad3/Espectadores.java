/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Espectadores {
    Scanner write = new Scanner(System.in).useDelimiter("\n");
    private String name;
    private Integer edad;
    private Double dinero;

    public Espectadores() {
    }

    public Espectadores(String name, Integer edad, Double dinero) {
        this.name = name;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectadores{" + "name=" + name + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
    public ArrayList<Espectadores> cargaEspectadore(){
        ArrayList<Espectadores> espert = new ArrayList();
        System.out.println("Ingresar cantidad de espectadores");
        int espe = write.nextInt();
        for (int i = 0; i < espe; i++) {
            int egg = (int) (Math.random() * 45 + 1);
            double diner = Math.random()*100+40;
            espert.add(new Espectadores("jorgito",egg,diner));
        }
        return espert;
    }
    
}
