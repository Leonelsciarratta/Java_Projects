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
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

/**
 *
 * @author alumno
 */
public class EditorialServicio {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
EntityManager em = emf.createEntityManager();
public void crearEditoral(){
Scanner sc = new Scanner(System.in);
int resp = 0;
Editorial edit= new Editorial();
System.out.println("Ingrese nombre de editorial");
edit.setNombre(sc.next());
System.out.println("esta dado de alta ?");
System.out.println("Si es si ingrese 1");
System.out.println("Si es no ingrese 2");
resp=sc.nextInt();
switch(resp) {
  case 1:
    edit.setAlta(true);
    System.out.println("La editorial esta cargada");
    break;
  case 2:
  edit.setAlta(false);
  System.out.println("La editorial no esta cargado");
    break;
}



//Iniciamos una transacción con el método getTransaction().begin();
em.getTransaction().begin();
//Persistimos el objeto
em.persist(edit);
//Terminamos la transacción con el método commit. Commit en programación
//significa confirmar un conjunto de cambios, en este caso persistir el objeto
em.getTransaction().commit(); 


}

 public void listEditorial(){
  em.getTransaction() .begin();
  List<Editorial> lista = em.createQuery("SELECT e from Editorial e").getResultList();
  em.getTransaction().commit();
  for (Editorial edit : lista){
      System.out.println(edit.getId()+ "" + edit.getNombre());
  }
}
 public void eliminarEditorial(){
     Scanner sc = new Scanner(System.in);
     Editorial edit= new Editorial();
     
     System.out.println("Ingrese el id de la editorial que desea eliminar");
     Integer id =sc.nextInt();
     edit = em.find(Editorial.class,id);
     em.getTransaction().begin();
     
     em.remove(edit);
     em.getTransaction().commit();
     
     
 }  
 public void modificarEditorial(){
     Scanner sc = new Scanner(System.in);
     Editorial edit= new Editorial();
     Integer resp =0;
     System.out.println("Ingrese el id de la editorial que desea modificar");
     Integer id =sc.nextInt();
     edit = em.find(Editorial.class,id);
     System.out.println("Que desea modificar");
System.out.println("Si desea modificar el nombre ingrese 1");
System.out.println("Si desea modificar el alta ingrese 2");
resp=sc.nextInt();
switch(resp) {
  case 1:
    System.out.println("ingrese el nuevo nombre");
    edit.setNombre(sc.next());
    em.getTransaction().begin();
    em.merge(edit);
    em.getTransaction().commit();
    System.out.println("Nombre modificado");
    break;
  case 2:
  System.out.println("ingrese el nuevo estado de alta");
    edit.setAlta(sc.nextBoolean());
    em.getTransaction().begin();
    em.merge(edit);
    em.getTransaction().commit();
    System.out.println("Alta modificada");
    break;
   
}
 }     
}
    

