/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

/**
 *
 * @author Aluno
 */
public class Lance {
    private Pessoa pessoa;
    private double valor;
    public Lance(){
        pessoa=new Pessoa();
    }
    public void setpessoa(Pessoa p)
    {
        pessoa=p;
    }
    public Pessoa getpessoa()
    {
        return pessoa;
    }
    public void setvalor(double v)
    {
        valor=v;
    }
    public double getvalor()
    {
        return valor;
    }
}
