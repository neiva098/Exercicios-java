/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

/**
 *
 * @author neiva
 */
import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
      Leilao leilao=new Leilao();
      Pessoa p=new Pessoa();
      Lance l=new Lance();
      Lote lot;
      System.out.print("Enquanto voce quiser adicionar lotes digite 1\n");
      Scanner input = new Scanner (System.in);
      while(input.nextInt()==1)
      {   lot=new Lote();
          input.nextLine();
          lot.setdescricao(input.nextLine());
          leilao.adiciona(lot);
      }
      System.out.print("Digite 1 se deseja fazer LANCE\n");
    while(input.nextInt()==1)
    {  System.out.println(leilao.codigos());
       System.out.print("Digite seu nome\n");
       input.nextLine();
       p.setnome(input.nextLine());
       l.setpessoa(p);
       p=new Pessoa();
       System.out.print("Digite valor do lance\n");
       l.setvalor(input.nextDouble());
       System.out.print("Digite codigo do lote\n");
       input.nextLine();
       leilao.recebe(l,input.nextInt());
       System.out.print("Digite 1 se deseja fazer LANCE\n");
    }
    System.out.println(leilao.imprime());
    }    
}