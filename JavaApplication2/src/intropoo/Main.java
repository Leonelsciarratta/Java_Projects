package IntroPOO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creo perro con constructor vacio
        Perro perro1 = new Perro();
        //Creo perro con constructor lleno
        Perro perro2 = new Perro("Toto", "Pug", 3);
        
        System.out.println("Ingrese el nombre del perro");
        perro1.setNombre(sc.nextLine());
        System.out.println("Ingrese la raza del perro");
        perro1.setRaza(sc.nextLine());
        
        mostrarDatos(perro1);
        mostrarDatos(perro2);
        
        perro1.ladrar();
        perro2.ladrar();
        
        
//        System.out.println("Ingrese el nombre del perro3");
//        String nombreAux = sc.nextLine();
//        System.out.println("Ingrese la raza del perro3");
//        String razaAux = sc.nextLine();
//        
//        Perro perro3 = new Perro(nombreAux, razaAux, 5);
        
        
    }
    
    public static void mostrarDatos(Perro p){
        System.out.println("Se muestran los datos del perro");
        System.out.println("Nombre: " + p.getNombre()+ p.getRaza());
        System.out.println("Raza: " + p.getRaza());
        System.out.println("Edad: " + p.getEdad());
    }

}
