/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author piriv
 */
public class Matematicas {
    private Double num1;
    private Double num2;
    public Matematicas(){
}
    public Matematicas(Double num1, Double num2){
        this.num1=num1;
        this.num2=num2;
        
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
        
    }

    @Override
    public String toString() {
        return "Matematicas{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
            }
