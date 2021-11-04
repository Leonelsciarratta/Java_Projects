/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class persona {
    private String nombre;
    private Integer edad;
    private Double altura;
    private Integer peso;
    private String sexo;
  public void persona(){
  }  
  public void persona(String nombre, Integer edad, Double altura, Integer peso, String sexo){
  this.nombre=nombre;
  this.altura=altura;
  this.edad=edad;
  this.peso=peso;
  this.sexo=sexo;
  
  }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo + '}';
    }
   
   
}
