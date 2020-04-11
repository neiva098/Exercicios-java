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
public class Titulo extends Conta {
    private int m;
    private int d;
    public Titulo(double v,int d,int m){
        this.valor=v;
        this.m=m;
        this.d=d;
    }
    @Override
    public void ValorP(){
        if(this.getMes()<m||(this.getMes()==m&&this.getDia()<d))
            valor=valor*1.1;      
    }
}
