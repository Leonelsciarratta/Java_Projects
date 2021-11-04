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

   public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;
    private Integer edadminima;

    public Pelicula(String titulo, String director, Integer duracion, Integer edadminima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadminima = edadminima;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(Integer edadminima) {
        this.edadminima = edadminima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edadminima=" + edadminima + '}';
    }
    
    
    
    
}

