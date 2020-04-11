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
import java.util.ArrayList;
import java.util.Iterator;
public class Leilao {
    private ArrayList<Lote> lotes= new ArrayList<> ();;
    private Iterator it= lotes.iterator();
    public Leilao(){
      
    }
    void adiciona(Lote l)
    {
        lotes.add(l);
    }
    void recebe(Lance l,int x)
    {
                lotes.get(x).verificalance(l);
    }
    String imprime()
    {  
        String s = "";
        it = lotes.iterator();
         while(it.hasNext()){
          Lote l = (Lote) it.next();
          s = s +"O item:"+ l.getdescricao()
                  +"   foi vendido para "+l.getmaior().getpessoa().getnome()+" a " + l.getmaior().getvalor()+"\n\n";
    }
         return s;
    }
    String codigos()
    {   String s = "";
            for(int i=0;i<lotes.size();i++)
        {
            s=s+i+"   " + lotes.get(i).getdescricao()+"\n";
        }
        return s;
    }
    void encerra()
    {
        System.exit(0);
    }
}
