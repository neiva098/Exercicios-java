/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author neiva
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Agenda {

    /**
     * @return the ps
     */

    public ArrayList<Pessoa> getPs() {
        return ps;
    }
    private ArrayList<Pessoa> ps = new ArrayList<>();
        public Agenda(){
        
    }
    public void adc (Pessoa p){
        getPs().add(p);
    }
    public void rmv(int i){
        getPs().remove(i);
    }
    public void alterar(int i,String s,int k){
        if(k==1)
            getPs().get(i).setNome(s);
        if(k==2)
            getPs().get(i).setNum(s);
        if(k==3)
            getPs().get(i).setEmail(s);
        if(k==4)
            getPs().get(i).setEnde(s);
    }
    public String listar(){
        int k=getPs().size();
        String s= null;
        for(int i=0;i<k;i++){
            s=s+i+"  "+getPs().get(i).getNome()+"   "+getPs().get(i).getNum()+"   "+getPs().get(i).getEmail()+"    "+getPs().get(i).getEnde()+"\n";
        }
        return s;
    }
    public String pesquisar(String p){
        String s= null;
        int k=getPs().size();
        for(int i=0;i<k;i++){
            if(p==getPs().get(i).getNome()||p==getPs().get(i).getNum()){
                s=getPs().get(i).getNome()+"   "+getPs().get(i).getNum()+"   "+getPs().get(i).getEmail()+"    "+getPs().get(i).getEnde()+"\n";
            }
        }
        return s;
    }
     public  void exportar()
    throws IOException {
    FileWriter arq = new FileWriter("agenda.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    int i, n = ps.size();
    int k=1;
    for (i=0; i<n; i++) {
        if(k==1)
            gravarArq.printf("%s%n",ps.get(i).getNome());
        if(k==2)
            gravarArq.printf("%s%n",ps.get(i).getNum());
        if(k==3)
            gravarArq.printf("%s%n",ps.get(i).getEmail());
        if(k==4)
            gravarArq.printf("%s%n",ps.get(i).getEnde());
        k++;
        if(k==4)
            k=1;
    }
    gravarArq.close();
  }
      public  void importar() {
    try {
      FileReader arq = new FileReader("agenda.txt");
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine();
      int k=1;
      while (linha != null) {
        Pessoa p=new Pessoa();
        if(k==1)
            p.setNome(linha);
        if(k==2)
            p.setNum(linha);
        if(k==3)
            p.setEmail(linha);
        if(k==4)
            p.setEnde(linha);
        k++;
        if(k==4)
            k=1;
        ps.add(p);
        linha = lerArq.readLine(); // lÃª da segunda atÃ© a Ãºltima linha
      }
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.",
          e.getMessage());
    }
  }
}
