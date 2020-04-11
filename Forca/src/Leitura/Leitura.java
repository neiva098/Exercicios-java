/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leitura;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.SecureRandom;
/**
 *
 * @author neiva
 */
public class Leitura {
    private FileReader r;
    private BufferedReader l;
    private String s="";
    public String Ler(){
        int i=0;
        try{
            r=new FileReader("palavrasDoJogo.txt");
            l=new BufferedReader(r);
            s=l.readLine();
             SecureRandom random = new SecureRandom();
            int k=random.nextInt(93);
            while(i<k)
            {   i++;
                s=l.readLine();
            }
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
        return s;
    }   
}
