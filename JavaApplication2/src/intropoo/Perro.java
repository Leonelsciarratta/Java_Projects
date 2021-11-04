
package IntroPOO;

public class Perro {
   //Atributos - caracteristicas
    private String nombre;
    private String raza;
    private Integer edad;
    
    //metodo constructor vacio
    public Perro(){  
        this.edad = 10;
    }
    
    //metodo constructor con parametros
    public Perro(String nombre, String raza, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    //Metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public void ladrar(){
        System.out.println("Guau guau!");
    }
    
    
    
    
    
    
    
    
    
}
