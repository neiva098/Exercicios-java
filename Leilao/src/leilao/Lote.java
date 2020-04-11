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
public class Lote {
    private String descricao;
    private Lance maior;
    public Lote()
    {
        maior=new Lance();
        maior.setvalor(0);
    }
    void verificalance (Lance l)
    {
        if(l.getvalor()>maior.getvalor())
        {
            maior=l;
            return;
        }
        return;
    }
    void setdescricao(String s)
    {
        descricao=s;
    }
    String getdescricao(){
        return descricao;
    }
    Lance getmaior(){
        return maior;
    }
}
