/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        perro p1= new perro();
         System.out.println("iNGRESE NOMBRE DEL PERRO");
         p1.setNombre(leer.next());
         System.out.println("iNGRESE RAZA DEL PERRO");
         p1.setRaza(leer.next());
         System.out.println("iNGRESE Edad del perro");
         p1.setEdad(leer.nextInt());
         System.out.println("iNGRESE tamanio del perro");
         p1.setTamanio(leer.nextDouble());
        perro p2= new perro();
        System.out.println("iNGRESE NOMBRE DEL PERRO");
         p2.setNombre(leer.next());
         System.out.println("iNGRESE RAZA DEL PERRO");
         p2.setRaza(leer.next());
         System.out.println("iNGRESE Edad del perro");
         p2.setEdad(leer.nextInt());
         System.out.println("iNGRESE tamanio del perro");
         p2.setTamanio(leer.nextDouble());
        persona p3= new persona();
        System.out.println("iNGRESE su nombre");
         p3.setNombre(leer.next());
         System.out.println("iNGRESE su apellido");
         p3.setApellido(leer.next());
         System.out.println("iNGRESE su edad");
         p3.setEdad(leer.nextInt());
         System.out.println("INGRESE SU DNI");
         p3.setDni(leer.nextInt());
         p3.setPerro(p1);
        persona p4= new persona();
        System.out.println("iNGRESE su nombre");
         p4.setNombre(leer.next());
         System.out.println("iNGRESE su apellido");
         p4.setApellido(leer.next());
         System.out.println("iNGRESE su edad");
         p4.setEdad(leer.nextInt());
         System.out.println("INGRESE SU DNI");
         p4.setDni(leer.nextInt());
         p4.setPerro(p2);
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        persona p9= new persona();
         
    }
    public void perroAdoptado(){
        perro p1= new perro();
        perro p2= new perro();
        Scanner leer = new Scanner(System.in);
        perro p5= new perro();
        System.out.println("Que perro desea adoptar");
        p5.setNombre(leer.next());
        if (p5.getNombre().equals(p1.getNombre()) ||p5.getNombre().equals(p2.getNombre())){
            System.out.println("El perro fue adoptado correctamente");
        }else{
            System.out.println("El perro no fue encontrado");
        }
        }
    public  void perroAdoptado2(){
        perro p5= new perro();
        perro p6= new perro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Que perro desea adoptar");
        p6.setNombre(leer.next());
        if (p6.getNombre().equals(p5.getNombre())){
            System.out.println("El perro ya fue adoptado");
        }else{
            System.out.println("El perro no existe");
       
        }
    }
     
}
