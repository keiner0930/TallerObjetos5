/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author sony
 */
public class NoFondosException extends Exception {
 public NoFondosException(){
        super("La cuenta tiene fondos insuficientes para realizar el retiro pedido");
    }   
}
