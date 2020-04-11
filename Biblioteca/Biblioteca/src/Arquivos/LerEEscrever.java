/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import biblioteca.Autor;
import biblioteca.Editoras;
import biblioteca.Livro;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author cantarino
 */
public class LerEEscrever {

    
    public void salvarAutorFileWriter(Autor a) {
        File file = new File("Autores.txt");
        try{
            FileWriter f = new FileWriter(file,true);
            f.write(String.valueOf(a.getId()));
            f.write(";");
            f.write(a.getNome());
            f.write(";");
            f.write(a.getSobrenome());
            f.write(";\n");
            f.flush();
            f.close();
        }
        catch (IOException ex) {
            System.out.println("Falha na abertura" + ex);
            System.exit(0);
        }

    }
    
    public void salvarLivroFileWriter(Livro a) {
        File file = new File("Livros.txt");
        try{
            FileWriter f = new FileWriter(file,true);
            f.write(String.valueOf(a.getId()));
            f.write(";");
            f.write(a.getIsbn());
            f.write(";");
            f.write(a.getTitulo());
            f.write(";");
            f.write(a.getnEdicao());
            f.write(";");
            f.write(a.getCopyright());
            f.write(";");
            f.write(a.getImagem());
            f.write(";");
            f.write(a.getPreco());
            f.write(";");
            f.write(String.valueOf(a.getEditora().getId()));
            f.write(";");
            int l = a.getAutores().length;
            Autor at[] = a.getAutores();
            for(int i=0;i<l;i++){
                f.write(String.valueOf(at[i].getId()));
                f.write(";");
            }
            f.write("\n");
            f.flush();
            f.close();
        }
        catch (IOException ex) {
            System.out.println("Falha na leitura" + ex);
            System.exit(0);
        }

    }
    
    public void salvarEditoraFileWriter(Editoras a) {
        File file = new File("Editoras.txt");
        try{
            FileWriter f = new FileWriter(file,true);
            f.write(String.valueOf(a.getId()));
            f.write(";");
            f.write(a.getNome());
            f.write(";\n");
            f.flush();
            f.close();
        }
        catch (IOException ex) {
            System.out.println("Falha na abertura" + ex);
            System.exit(0);
        }

    }
        
    public void salvarLivroAutorEditoraFileWriter(Livro a) {
        File file = new File("AutoresLivroEditora.txt");
        try{
            FileWriter f = new FileWriter(file,true);
            f.write(String.valueOf(a.getId()));
            f.write(";");
            int l = a.getAutores().length;
            Autor at[] = a.getAutores();
            for(int i=0;i<l;i++){
                f.write(String.valueOf(at[i].getId()));
                f.write(";");
            }
            f.write(String.valueOf(a.getEditora().getId()));
            f.write(";\n");
            f.flush();
            f.close();
        }
        catch (IOException ex) {
            System.out.println("Falha na abertura" + ex);
            System.exit(0);
        }

    }
    
    public ArrayList<Autor> lerAutorFileReader(){  
        ArrayList <Autor> ats=new ArrayList();
        FileReader leitor = null;
        try {
            leitor = new FileReader("Autores.txt");
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Arquivo nao encontrado");
            System.exit(0);
        }
        BufferedReader bleitor = new BufferedReader(leitor);        
        String s = "";
        Autor a = new Autor();
        int k=0;
        int j=0;
        while(s!=null){
            try {
                s = bleitor.readLine();
            } catch (IOException ex) {
                System.out.println("IOException" + ex);
            }   a = new Autor();
                String sI = "";
                if(s==null)break;
                for(;s.charAt(j)!=';';j++){
                    char c = s.charAt(j);
                    System.out.println(c);
                    sI=sI+c;
                }
                a.setId(Integer.parseInt(sI));
                j++;
                String sN = "";
                for(;s.charAt(j)!=';';j++){
                    char c = s.charAt(j);
                    sN=sN+c;
                }
                a.setNome(sN);
                j++;
                String sS="";
                for(;s.charAt(j)!=';';j++){
                    char c = s.charAt(j);
                    sS=sS+c;
                            }
                j++;
                a.setSobrenome(sS);
                j=0;
                ats.add(a);
        }
        return ats;
    }
    
    public ArrayList<Livro> lerLivroFileReader(){
        
        FileReader leitor = null;
        Livro l = new Livro();
        ArrayList<Livro>ls=new ArrayList();
        try {
                leitor = new FileReader("Livros.txt");
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Arquivo nao encontrado");
            System.exit(0);
        }
        BufferedReader bleitor = new BufferedReader(leitor);l = new Livro();        
        String s = "";
        int k=0;
        int j=0;
        while(s!=null){
            try {
                s = bleitor.readLine();
            } catch (IOException ex) {
                System.out.println("IOException" + ex);
            }   
                String sI = ""; if(s==null)break;
                for(;s.charAt(j)!=';';j++){
                    
                    System.out.println(sI);
                    sI=sI+s.charAt(j);System.out.println(sI);
                }
                l.setId(Integer.parseInt(sI));
                j++;
                String sIs = "";
                for(;s.charAt(j)!=';';j++){
                    
                    System.out.println(sIs);
                    sIs=sIs+s.charAt(j);System.out.println(sIs);
                }
                j++;
                char c;
                String sN="";
                for(;s.charAt(j)!=';';j++){
                    c = s.charAt(j);
                    sN=sN+c;
                }
                j++;
                l.setTitulo(sN);
                String sE="";
                for(;s.charAt(j)!=';';j++){
                    c = s.charAt(j);
                    sE=sE+c;
                }
                l.setnEdicao(sE);
                j++;
                String sC="";
                for(;s.charAt(j)!=';';j++){
                    c = s.charAt(j);
                    sC=sC+c;
                }
                l.setCopyright(sC);
                j++;
                String sIm="";
                for(;s.charAt(j)!=';';j++){
                    c = s.charAt(j);
                    sIm=sIm+c;
                }
                l.setImagem(sIm);
                j++;
                String sP="";
                for(;s.charAt(j)!=';';j++){
                    c = s.charAt(j);
                    sP=sP+c;
                }
                l.setPreco(sP);System.out.println(sP);
                j++;
                l.setEditora(lerEditoraFileReader().get(Integer.valueOf(String.valueOf(s.charAt(j)))));
                System.out.println(Integer.valueOf(String.valueOf(s.charAt(j)))+"32");
                j+=2;
                l.setAutor(lerAutorFileReader().get(Integer.valueOf(String.valueOf(s.charAt(j)))));
            j=0;
            ls.add(l);
        }
    return ls;
    }
    
    public ArrayList<Editoras> lerEditoraFileReader(){
        Editoras e= new Editoras();   
        FileReader leitor = null;
        ArrayList<Editoras> es=new ArrayList();
        Livro l = new Livro();
        try {
                leitor = new FileReader("Editoras.txt");
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Arquivo nao encontrado");
            System.exit(0);
        }
        BufferedReader bleitor = new BufferedReader(leitor);        
        String s = "";
        int j=0;
        while(s!=null){
            try {
                s = bleitor.readLine();
            } catch (IOException ex) {
                System.out.println("IOException" + ex);
            }   e= new Editoras();String sI = "";if(s==null)break;
                for(;s.charAt(j)!=';';j++){
                    
                    System.out.println(sI);
                    sI=sI+s.charAt(j);System.out.println(sI);
                }
                e.setId(Integer.parseInt(sI));
                j++;
                char c;
                String sN="";
                for(;s.charAt(j)!=';';j++){
                    c = s.charAt(j);
                    sN=sN+c;
                }
                e.setNome(sN);
                j=0;
            es.add(e);
        }   
        return es;
    } 
}