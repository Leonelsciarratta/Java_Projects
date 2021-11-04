/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Libro;
import libreria.entidades.Editorial;
import libreria.entidades.Autor;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author alumno
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
 
//LibroServicio libe= new LibroServicio();
//libe.crearlibro();
//libe.listLibro();
//libe.buscaporTitulo();
//libe.buscaporISBN();
//libe.modificarLibro();
//libe.eliminarLibro();
//EditorialServicio ed = new EditorialServicio();
//ed.listEditorial();
//ed.crearEditoral();
//ed.modificarEditorial();
//ed.eliminarEditorial();
//AutorServicio aut = new AutorServicio();
//aut.listAutor();
//aut.buscanom("");
//aut.crearAutor();
//aut.modificarAutor();
//aut.eliminarAutor();



      
    }
    
}
