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
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import libreria.entidades.Autor;


/**
 *
 * @author alumno
 */
public class AutorServicio {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
EntityManager em = emf.createEntityManager();
public void crearAutor(){
Scanner sc = new Scanner(System.in);
Integer resp = 0;
Autor aut= new Autor();
System.out.println("Ingrese nombre de autor");
aut.setNombre(sc.nextLine());
System.out.println("esta dado de alta ?");
System.out.println("Si es si ingrese 1");
System.out.println("Si es no ingrese 2");
resp=sc.nextInt();
switch(resp) {
  case 1:
    aut.setAlta(true);
    System.out.println("El autor esta cargado");
    break;
  case 2:
  aut.setAlta(false);
  System.out.println("El autor no esta cargado");
    break;
    
}



//Iniciamos una transacción con el método getTransaction().begin();
em.getTransaction().begin();
//Persistimos el objeto
em.persist(aut);
//Terminamos la transacción con el método commit. Commit en programación
//significa confirmar un conjunto de cambios, en este caso persistir el objeto
em.getTransaction().commit(); 


    
}
public void listAutor(){
  em.getTransaction() .begin();
  List<Autor> lista = em.createQuery("SELECT a from Autor a").getResultList();
  em.getTransaction().commit();
  for (Autor aut : lista){
      System.out.println(aut.getId()+ "" + aut.getNombre());
  }
}
 public void eliminarAutor(){
     Scanner sc = new Scanner(System.in);
     Autor aut= new Autor();
     
     System.out.println("Ingrese el id del autor que desea eliminar");
     Integer id =sc.nextInt();
     aut = em.find(Autor.class,id);
     em.getTransaction().begin();
     
     em.remove(aut);
     em.getTransaction().commit();
     
     
 }  
 public void modificarAutor(){
     Scanner sc = new Scanner(System.in);
     Autor aut= new Autor();
     Integer resp =0;
     System.out.println("Ingrese el id del autor que desea modificar");
     Integer id =sc.nextInt();
     aut = em.find(Autor.class,id);
     System.out.println("Que desea modificar");
System.out.println("Si desea modificar el nombre ingrese 1");
System.out.println("Si desea modificar el alta ingrese 2");
resp=sc.nextInt();
switch(resp) {
  case 1:
     
    System.out.println("ingrese el nuevo nombre");
    aut.setNombre(sc.next());
    em.getTransaction().begin();
    em.merge(aut);
    em.getTransaction().commit();
    System.out.println("Nombre modificado");
    break;
  case 2:
  System.out.println("ingrese el nuevo estado de alta");
    aut.setAlta(sc.nextBoolean());
    em.getTransaction().begin();
    em.merge(aut);
    em.getTransaction().commit();
    System.out.println("Alta modificada");
    break;
   
}
         
 } 

public Autor buscanom(String Nombre) {
    try{
	Autor aux = (Autor) em.createQuery("SELECT p from Autor p "
                    + "WHERE p.nombre = :nombre").setParameter("nombre", Nombre).
                    getSingleResult();
        System.out.println(Nombre);
	return aux;
    }    
    catch(Exception e){
        System.out.println("No se encontro");
    }
    return null;
    }
}
