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
public class Assalariado extends Empregado {
    private double valor;
    public Assalariado(){
        
    }
    @Override
    public void ValorP(){
        valor=848;
    }   
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }
}
