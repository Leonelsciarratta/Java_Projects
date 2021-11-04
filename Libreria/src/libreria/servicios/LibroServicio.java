/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import static libreria.entidades.Libro_.isbn;

/**
 *
 * @author alumno
 */
public class LibroServicio extends Dao {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
EntityManager em = emf.createEntityManager();
//Creamos un objeto libro y le asignamos un nombre

public void crearlibro(){
Scanner sc = new Scanner(System.in);
Libro lib= new Libro();
Autor aut = new Autor();
Editorial edit = new Editorial();
System.out.println("Ingrese isbn del libro");
lib.setIsbn(sc.nextInt());
System.out.println("Ingrese titulo del libro");
lib.setTitulo(sc.next());
System.out.println("Ingrese anio del libro");
lib.setAnio(sc.nextInt());
System.out.println("Ingrese ejemplares del libro");
lib.setEjemplares(sc.nextInt());
System.out.println("Ingrese ejemplares prestados del libro");
lib.setEjemplaresPrestados(sc.nextInt());
System.out.println("La cantidad de ejemplares restantes es");
lib.setEjemplaresRestantes(lib.getEjemplares()- lib.getEjemplaresPrestados());
System.out.println(lib.getEjemplaresRestantes());

//Iniciamos una transacción con el método getTransaction().begin();
em.getTransaction().begin();
//Persistimos el objeto
em.persist(lib);
//Terminamos la transacción con el método commit. Commit en programación
//significa confirmar un conjunto de cambios, en este caso persistir el objeto
em.getTransaction().commit(); 


}
public void listLibro(){
  em.getTransaction() .begin();
  List<Libro> lista = em.createQuery("SELECT l from Libro l").getResultList();
  em.getTransaction().commit();
  for (Libro lib : lista){
      System.out.println(lib.getIsbn()+ "" + lib.getTitulo());
  }
}
 public void eliminarLibro(){
     Scanner sc = new Scanner(System.in);
     Libro lib= new Libro();
     
     System.out.println("Ingrese el isbn del libro que desea eliminar");
     String id =sc.next();
     lib = em.find(Libro.class,id);
     em.getTransaction().begin();
     
     em.remove(lib);
     em.getTransaction().commit();
     
     
 }  
 public void modificarLibro(){
     Scanner sc = new Scanner(System.in);
     Libro lib= new Libro();
     Integer resp =0;
     System.out.println("Ingrese el id del libro que desea modificar");
     String id =sc.next();
     lib = em.find(Libro.class,id);
     System.out.println("Que desea modificar");
System.out.println("Si desea modificar isbn ingrese 1");
System.out.println("Si desea modificar titulo ingrese 2");
System.out.println("Si desea modificar anio ingrese 3");
System.out.println("Si desea modificar cantidad de ejemplares ingrese 4");
System.out.println("Si desea modificar cantidad de ejemplares prestados ingrese 5");
System.out.println("Si desea modificar cantidad de ejemplares restantes ingrese 6");

resp=sc.nextInt();
switch(resp) {
  case 1:
    System.out.println("ingrese el nuevo isbn");
    lib.setIsbn(sc.nextInt());
    em.getTransaction().begin();
    em.merge(lib);
    em.getTransaction().commit();
    System.out.println("ISBN modificado");
    break;
  case 2:
  System.out.println("ingrese el nuevo titulo");
    lib.setTitulo(sc.next());
    em.getTransaction().begin();
    em.merge(lib);
    em.getTransaction().commit();
    System.out.println("Titulo modificado");
    break;
   case 3: 
    System.out.println("ingrese el nuevo anio");
    lib.setAnio(sc.nextInt());
    em.getTransaction().begin();
    em.merge(lib);
    em.getTransaction().commit();
    System.out.println("Anio modificado");
    break;
    case 4: 
    System.out.println("ingrese la nueva cantidad de ejemplares");
    lib.setEjemplares(sc.nextInt());
    em.getTransaction().begin();
    em.merge(lib);
    em.getTransaction().commit();
    System.out.println("Ejemplares modificado");
    break;
    case 5: 
    System.out.println("ingrese la nueva cantidad de ejemplares prestados");
    lib.setEjemplaresPrestados(sc.nextInt());
    em.getTransaction().begin();
    em.merge(lib);
    em.getTransaction().commit();
    System.out.println("Ejemplares prestados modificado");
    break;
    case 6: 
    System.out.println("ingrese la nueva cantidad de ejemplares restantes");
    lib.setEjemplaresRestantes(sc.nextInt());
    em.getTransaction().begin();
    em.merge(lib);
    em.getTransaction().commit();
    System.out.println("Ejemplares restantes modificados");
    break;
}
     
     
     
 }  
 
 public Libro buscaporISBN(Integer ISBN) {
    try{
	Libro aux = (Libro) em.createQuery("SELECT p from Libro p "
                    + "WHERE p.isbn = :isbn").setParameter("isbn", ISBN).
                    getSingleResult();
        System.out.println(ISBN);
	return aux;
    }    
    catch(Exception e){
        System.out.println("No se encontro");
    }
    return null;
    }
 public Libro buscaporTitulo(String TITULO) {
    try{
	Libro aux = (Libro) em.createQuery("SELECT p from Libro p "
                    + "WHERE p.titulo = :titulo").setParameter("titulo", TITULO).
                    getSingleResult();
        System.out.println(TITULO);
	return aux;
    }    
    catch(Exception e){
        System.out.println("No se encontro");
    }
    return null;
    }
 
 }  

   
