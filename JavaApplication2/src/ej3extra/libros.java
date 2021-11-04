/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3extra;

/**
 *
 * @author alumno
 */
public class libros {
    private String namelbro;
    private String autorlibro;
    private Integer stock;

    public libros(String namelbro, String autorlibro, Integer stock) {
        this.namelbro = namelbro;
        this.autorlibro = autorlibro;
        this.stock = stock;
    }

    public String getNamelbro() {
        return namelbro;
    }

    public void setNamelbro(String namelbro) {
        this.namelbro = namelbro;
    }

    public String getAutorlibro() {
        return autorlibro;
    }

    public void setAutorlibro(String autorlibro) {
        this.autorlibro = autorlibro;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "libros{" + "namelbro=" + namelbro + ", autorlibro=" + autorlibro + ", stock=" + stock + '}';
    }
    
    
}
