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
public abstract  class Empregado extends Pagavel {
    private String nome="";
    private int ident=0;
    private double valor;
    public Empregado(){
        
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ident
     */
    public int getIdent() {
        return ident;
    }

    /**
     * @param ident the ident to set
     */
    public void setIdent(int ident) {
        this.ident = ident;
    }
    @Override
        public abstract void ValorP();

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

}
