/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author neiva
 */
public class Horista extends Empregado {
    private double valor;
    private int h;
    public Horista(){
        
    }
    @Override
    public void ValorP(){
       this.valor=848+6*this.h; 
    }
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }
    
}
