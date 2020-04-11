/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author neiva
 */
public class Conta {

   private double saldo;
   private Pessoa ident;
   public Conta() {
        this.saldo = 0.0;
 
    }

    public void setsaldo(double valor) {
        this.saldo = valor;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setident(Pessoa ident) {
        this.ident =ident;
        
    }
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor) {
        saldo=saldo+valor;
    }
    
}

