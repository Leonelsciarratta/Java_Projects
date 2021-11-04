/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

/**
 *
 * @author alumno
 */
public class raices {
    private Integer a;
    private Integer b;
    private Integer c;
    private Double discriminante;
    public raices(){
    }
    public raices(Integer a, Integer b , Integer c, Double discriminante){
        this.a=a;
        this.b=b;
        this.c=c;
        this.discriminante=discriminante;
        
    }

    public Double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(Double discriminante) {
        this.discriminante = discriminante;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}
