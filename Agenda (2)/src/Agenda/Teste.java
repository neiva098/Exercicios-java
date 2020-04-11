package Agenda;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

  public  void main(String[] args) throws IOException {
    Agenda a=new Agenda();
    Scanner ler = new Scanner(System.in);
    int opcao;
    a.importar();
    do {
      System.out.printf("**** Menu Principal *****\n");
      System.out.printf("[ 1 ] Incluir Contato\n");
      System.out.printf("[ 2 ] Excluir Contato\n");
      System.out.printf("[ 3 ] Listar Contatos\n");
      System.out.printf("[ 4 ] Pesquisar Contato\n");
      System.out.printf("[ 0 ] Encerrar o Programa\n");
      System.out.printf("\nOpÃ§Ã£o Desejada: ");
      opcao = ler.nextInt();
      switch (opcao) {
        case 1: Pessoa p= new Pessoa(); p.setNome(ler.nextLine());p.setNum(ler.nextLine());p.setEmail(ler.nextLine());p.setEnde(ler.nextLine());a.adc(p); break;
        case 2: a.rmv(ler.nextInt()); break;
        case 3: a.listar(); break;
        case 4: a.pesquisar(ler.nextLine());
      }
      System.out.printf("\n\n");

    } while (opcao != 0);

    a.exportar();
  }
}