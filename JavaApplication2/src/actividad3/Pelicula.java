/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

/**
 *
 * @author alumno
 */
public class Pelicula {
    private String name;
    private Integer duracion;
    private Integer edad;
    private String director;

    public Pelicula() {
        this.name = "Jurassi";
        this.duracion = 230;
        this.edad = 12;
        this.director = "Juan Pedro Spilberto";
    }

    public Pelicula(String name, Integer duracion, Integer edad, String director) {
        this.name = name;
        this.duracion = duracion;
        this.edad = edad;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "name=" + name + ", duracion=" + duracion + ", edad=" + edad + ", director=" + director + '}';
    }
    
       
}

    

