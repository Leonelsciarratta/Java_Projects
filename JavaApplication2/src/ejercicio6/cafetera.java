/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
public class cafetera {
    private Integer capacidadmaxima;
    private Integer capacidadactual;
    public void cafe(){
    }   
    public void cafe(Integer capacidadmaxima, Integer capacidadactual){
        this.capacidadmaxima=capacidadmaxima;
        this.capacidadactual=capacidadactual;
        
    }

    public Integer getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public void setCapacidadmaxima(Integer capacidadmaxima) {
        this.capacidadmaxima = capacidadmaxima;
    }

    public Integer getCapacidadactual() {
        return capacidadactual;
    }

    public void setCapacidadactual(Integer capacidadactual) {
        this.capacidadactual = capacidadactual;
    }
    
}
 

