/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo6;

/**
 *
 * @author alumno
 */
public class producto {
    private String nombreproducto;
    private Double precio;

    public producto(String nombreproducto, Double precio) {
        this.nombreproducto = nombreproducto;
        this.precio = precio;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "producto{" + "nombreproducto=" + nombreproducto + ", precio=" + precio + '}';
    }
    
    
}
