
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private String cpf;
public Pessoa(){
    this.nome="";
    this.cpf="";
}
    public void setnome(String nome) {
        this.nome = nome;    
}
        public void setcpf(String cpf) {
        this.cpf = cpf;    
}
        public String  getnome()
        {
            return this.nome;
        }
         public String  getcpf()
        {
            return this.cpf;
        }
         
}