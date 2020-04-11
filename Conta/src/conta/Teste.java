/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author neiva
 */
import java.util.Scanner;
public class Teste {
    public static void main(String[] args)
{
    Conta c=new Conta();
    Especial e =new Especial();
    Pessoa p=new Pessoa();
    Scanner input = new Scanner (System.in);
    System.out.println("Informe o nome do titular");
    String nome =input.nextLine();
    System.out.println("Informe o cpf");
    String cpf =input.nextLine();
    System.out.println("Valor da conta");
    double valor=input.nextDouble();
    p.setnome(nome);
    p.setcpf(cpf);
    c.setsaldo(valor);
    System.out.println("Informe o quanto vc quer sacar");
    double saque=input.nextDouble();
    if(c.sacar(saque));
    else
    {
        System.out.println("Não é possível efetuar operação,deseja abrir conta especial?1/0 Enquanto hoverem dividas todo deposíto e saldo irão para conta especial)");
        double cntrl =input.nextDouble(); 
        if(cntrl==1&&saque-c.getsaldo()<e.getlimite()){
        e.setsaldo(c.getsaldo());
        e.sacarespecial(saque);
        c.setsaldo(0);
        }else
        {
            System.out.println("Não é possível efetuar operação");   
        }
        }
    System.out.println("Informe o quanto vc quer depositar");
    double deposito=input.nextDouble();
    if(e.getsaldo()<0)
    {
        e.depositar(deposito);
    }
    else{
        c.depositar(deposito);
    }
    if(e.getsaldo()>0)
    {
        c.depositar(e.getsaldo());
        e.setsaldo(0);
    }
    System.out.print(""+p.getnome());System.out.println(" de cpf:"+p.getcpf());
    System.out.println("Seu saldo é:"+c.getsaldo());
    System.out.println("Seu saldo em especial é:"+e.getsaldo());
}
}

