/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author neiva
 */
import Leitura.*;
public class Logica {
    private char c;
    private char tela[]=new char[7];
    private String s="";
    private int v;
    
public Logica(){
    s=(new Leitura()).Ler();
    v=0;
    System.out.println(s);
}
    public int getV() {
        return v;
    }
    public void setV(int v) {
        this.v = v;
    }
    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public char[] getTela() {
        return tela;
    }

    public void setTela(char[] tela) {
        this.tela = tela;
    }

    public void Jogada(char c){
        v++;
        for(int i=0;i<7;i++){
            if(c==s.charAt(i)){
                tela[i]=c;
                
            }
        }   
    }
    public void Chute(String x){
        v++;
        if(s.equals(x)){
            for(int i=0;i<s.length();i++){
                tela[i]=s.charAt(i);
            }
        }
    }
    public void setS(String s) {
        this.s = (new Leitura()).Ler();
    }
}
