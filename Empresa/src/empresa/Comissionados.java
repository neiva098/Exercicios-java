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
public class Comissionados extends Empregado {
    public double valor;
    public double vendas;
    public Comissionados(){
    }
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }
    /**
     * @param vendas the vendas to set
     */
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    @Override
    public void ValorP(){
        valor=vendas*0.1;
    }   
}
