/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author alumno
 */
public class cuenta {
    private Integer DNI;
    private Integer Numerodecuenta;
    private Integer Saldoactual;
    public void banco(){
    }
     public void mibanco(Integer DNI, Integer Numerodecuenta, Integer Saldoactual){
     this.DNI=DNI;
     this.Numerodecuenta=Numerodecuenta;
     this.Saldoactual=Saldoactual;
     
     }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getNumerodecuenta() {
        return Numerodecuenta;
    }

    public void setNumerodecuenta(Integer Numerodecuenta) {
        this.Numerodecuenta = Numerodecuenta;
    }

    public Integer getSaldoactual() {
        return Saldoactual;
    }

    public void setSaldoactual(Integer Saldoactual) {
        this.Saldoactual = Saldoactual;
    }
}
