/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAHERENCIA1;

/**
 *
 * @author alumno
 */
public class velero extends Barco {
    private Integer numero_mastiles;

    public velero() {
    }

    public velero(Integer numero_mastiles) {
        this.numero_mastiles = numero_mastiles;
    }

    public velero(Integer numero_mastiles, Integer matricula, Double eslora, Integer anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.numero_mastiles = numero_mastiles;
    }

    public Integer getNumero_mastiles() {
        return numero_mastiles;
    }

    public void setNumero_mastiles(Integer numero_mastiles) {
        this.numero_mastiles = numero_mastiles;
    }
    
    
}
