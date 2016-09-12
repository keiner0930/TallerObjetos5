/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sony
 */
public class Cuenta {

    private int ncuenta;
    private int identificacion;
    private double sactual;
    private double intanual;

    public Cuenta(int ncuenta, int identificacion, double sactual, double intanual) {
        this.ncuenta = ncuenta;
        this.identificacion = identificacion;
        this.sactual = sactual;
        this.intanual = intanual;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public double getSactual() {
        return sactual;
    }

    public void setSactual(double sactual) {
        this.sactual = sactual;
    }

    public double getIntanual() {
        return intanual;
    }

    public void setIntanual(double intanual) {
        this.intanual = intanual;
    }

  public double ActualizarSaldo() {
  double res,intdiario;
  
        intdiario = this.intanual / 365;
        res =this.sactual + intdiario; 

        return res;
    }  
    
public double Ingresar(double ingreso) {
 double nuevoSaldo ;
 if (ingreso <= 0) {
  nuevoSaldo = 0;
   }
 
   else {
   this.sactual=  this.sactual + ingreso; 
   nuevoSaldo = this.sactual;
        }
 
        return nuevoSaldo;
    }   
  
 public double Retirar(double retiro) {
 double nuevoSaldo ;
   
      this.sactual = this.sactual - retiro;
       nuevoSaldo = this.sactual;
        
        return nuevoSaldo;
    }      
    
    
    
}
