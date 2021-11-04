/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author alumno
 */
public class ejerciciolibro {
    private Integer ISBN;
    private String titulo;
    private String autor;
    private Integer numPag; 
    public ejerciciolibro(){
    }
    public ejerciciolibro(Integer ISBN, String titulo, String autor, Integer numPage){
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.numPag = numPag;
    
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }
    
    }


