/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4herencia;

/**
 *
 * @author alumno
 */
public interface calculosFormas {
    public void calcularArea();
    public void calcularPerimetro();
    public final Double constante = 3.14;

    @Override
    public String toString();
    
}
