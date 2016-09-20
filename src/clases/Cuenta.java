/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import Excepciones.*;

/**
 *
 * @author sony
 */
public class Cuenta {
private long numero_cuenta;
    private long numero_identificacion;
    private double saldo_actual;

    public Cuenta(long numero_cuenta, long numero_identificacion, double saldo_actual) throws NoNegativoException, NoCeroException {
     if(numero_cuenta < 0){
            throw new NoNegativoException("El número de cuenta no debe ser negativo");
        }
        
        if(numero_cuenta == 0){
              throw new NoCeroException("El número de cuenta no debe ser cero");
        }
        if(numero_identificacion < 0){
            throw new NoNegativoException("El número de identificación no debe ser negativo");
        }
        
        if(numero_identificacion == 0){
              throw new NoCeroException("El número de identificación no debe ser cero");
        }
        
        if(saldo_actual < 0){
            throw new NoNegativoException("El saldo actual no debe ser negativo");
        }
        
        
        this.numero_cuenta = numero_cuenta;
        this.numero_identificacion = numero_identificacion;
        this.saldo_actual = saldo_actual;
    
    }
    public Cuenta(long numero_cuenta, long numero_identificacion) throws NoNegativoException, NoCeroException{
     if(numero_cuenta < 0){
            throw new NoNegativoException("El número de cuenta no debe ser negativo");
        }
        
        if(numero_cuenta == 0){
              throw new NoCeroException("El número de cuenta no debe ser cero");
        }
        if(numero_identificacion < 0){
            throw new NoNegativoException("El número de identificación no debe ser negativo");
        }
        
        if(numero_identificacion == 0){
              throw new NoCeroException("El número de identificación no debe ser cero");
        }
        
        this.numero_cuenta = numero_cuenta;
        this.numero_identificacion = numero_identificacion;
        this.saldo_actual = 0;
        
    }
    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public long getNumero_identificacion() {
        return numero_identificacion;
    }

    public double getSaldo_actual() throws NoNegativoException {
   
        return saldo_actual;
    }

    public void setNumero_cuenta(long numero_cuenta) throws NoNegativoException, NoCeroException {
     if(numero_cuenta < 0){
            throw new NoNegativoException("El número de cuenta no debe ser negativo");
        }
        
        if(numero_cuenta == 0){
              throw new NoCeroException("El número de cuenta no debe ser cero");
        }
        
        
        this.numero_cuenta = numero_cuenta;
    }

    public void setNumero_identificacion(long numero_identificacion) throws NoNegativoException, NoCeroException {
      if(numero_identificacion < 0){
            throw new NoNegativoException("El número de identificación no debe ser negativo");
        }
        
        if(numero_identificacion == 0){
              throw new NoCeroException("El número de identificación no debe ser cero");
        } 
        this.numero_identificacion = numero_identificacion;
    }

    public void setSaldo_actual(double saldo_actual) throws NoNegativoException {
     if(saldo_actual < 0){
     throw new NoNegativoException("El saldo actual no puede ser negativo");
     }
     
        this.saldo_actual = saldo_actual;
    }
    
    public void actualizar_saldo(double ian) throws NoNegativoException{
        double auxi,auxi2;
     if(ian < 0 ){
            throw new NoNegativoException("El interes no puedes ser negativo");
        } 
        
        auxi =this.getSaldo_actual()*(ian/365);
        auxi2=this.getSaldo_actual()+ auxi;
        this.setSaldo_actual(auxi2);
    }
        
    public void ingresar(double ingreso) throws NoNegativoException, NoCeroException{
        double auxi;
       if(ingreso < 0){
           throw new NoNegativoException("El ingreso no puede ser negativo");
       }
       
       if(ingreso == 0){
           throw new NoCeroException("El ingreso no puede ser cero");
       }
       
        auxi =this.getSaldo_actual() + ingreso;
        this.setSaldo_actual(auxi);
        
    }
    public void retira(double egreso) throws NoNegativoException, NoCeroException, NoFondosException{
     double auxi;
        if(egreso < 0){
           throw new NoNegativoException("El egreso no puede ser negativo");
       }
       
       if(egreso == 0){
           throw new NoCeroException("El egreso no puede ser cero");
       }
       auxi = this.getSaldo_actual() - egreso;
       
       if(auxi < 0){
           throw new NoFondosException();
       }
        
        
        
        auxi=this.getSaldo_actual()-egreso;
       
     this.setSaldo_actual(auxi);
    }
 
    public String mostrar() throws NoNegativoException {
        String aux;
        aux = "Su Numero de cuenta es :" + this.getNumero_cuenta()+ "\n"
            + "Su Numero de indentificación es : "+ this.getNumero_identificacion()+ "\n"
            + "Su Saldo actual es : " + this.getSaldo_actual();
        return aux;
    }
}
