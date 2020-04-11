/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class Logica {
   private ArrayList <Paciente> lista;
   public Logica(){
       lista=new ArrayList();
   }

    public ArrayList<Paciente> GetLista() {
        return lista;
    }

    public void SetLista(ArrayList<Paciente> lista) {
        this.lista = lista;
    }
    public int Qnt(){
        return lista.size();
    }
    public float MedId(){
        float med=0;
        int divisor=0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getSexo().equals("masculino"))
            {
                med+=lista.get(i).getId();
                divisor++;
            }
            
        }
        return med/divisor;
    }
    public int QntMulher(){
        int qt=0;
         for(int i=0;i<lista.size();i++){
             if(lista.get(i).getSexo().equals("feminino")){
                 if(lista.get(i).getH()>=1.6&&lista.get(i).getH()<=1.7&&lista.get(i).getPeso()>70)
                     qt++;                    
             }
         }
       return qt; 
    }
    public int QntId(){
        int qt=0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getId()>=18&&lista.get(i).getId()<=25)
                qt++;           
        }
        return qt;
    }
    public String Velho(){
        int cntrl=0;
        String maior="";
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getId()>cntrl)
            {
                cntrl=lista.get(i).getId();
                maior=lista.get(i).getNome();
            }
        }
        return maior;
    }
    public String Baixa(){
        double cntrl=100;
        String baixa="";
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getSexo().equals("feminino")&&lista.get(i).getH()<cntrl){
                cntrl=lista.get(i).getH();
                baixa=lista.get(i).getNome();
            }      
        }
        return baixa;
    }
    public void Adicionar(Paciente p){
        lista.add(p);
    }
    public String[] Ordenar(){
        String s[]=new String[lista.size()];
        for(int i=0;i<lista.size();i++){
            s[i]=new String();
            for(int j=i;j<lista.size();j++){
                if(lista.get(i).getCod()>=lista.get(j).getCod()){
                    s[i]=lista.get(j).getNome();
                }
            }
        }
        return s;
    }
    
    
}
