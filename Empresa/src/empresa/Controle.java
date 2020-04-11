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
import java.util.ArrayList;
import java.util.Iterator;
public class Controle {
    public void Controle(ArrayList list){
        double e=0;
        double c=0;
        int i=1;
        int id=1;
        Iterator it = list.iterator();
    while(it.hasNext()){
        Pagavel p  = (Pagavel) it.next();
        p.ValorP();
        if(p instanceof Empregado) {
            ((Empregado) p).setIdent(id);
            id++;
            e=((Empregado) p).getValor()+e;
            System.out.printf(" Funcionario %d   Gasto %f \n",((Empregado) p).getIdent(),((Empregado) p).getValor());
        }
        if(p instanceof Conta) {
            c=((Conta) p).getValor()+c;
            System.out.printf(" Conta %d   Gasto %f \n",i,((Conta) p).getValor());
            i++;
        }
        }
        System.out.printf(" Gastos com empregados: %.02f\n",e);
        System.out.printf(" Gastos com conta: %.02f\n",c);
        System.out.printf(" Gastos Total: %.02f\n",e+c);
       }   
    }
