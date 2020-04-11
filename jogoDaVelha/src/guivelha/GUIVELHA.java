/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guivelha;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import java.io.*;
import Logica.*;
import java.awt.event.ActionListener;
/**
 *
 * @author neiva
 */
public class GUIVELHA extends JFrame {
    private  JButton BNew = new JButton("Novo Jogo");
    private static JButton BExit = new JButton("Sair");
    private static JPanel Panel = new JPanel();
    private GridLayout Layout_do_Jogo = new GridLayout(9,5);
    private static javax.swing.JToggleButton Escolha[] = new JToggleButton[40];
    private static JLabel Pts = new JLabel("Pontos: 0");
    private static Logica l=new Logica();
  
    /**
     * @param args the command line arguments
     */
    private class Eventos_JogoDaMemoria implements ActionListener{
    
        public void  actionPerformed (ActionEvent event){
        if (event.getSource() == BNew){
              l.setNJ(true);
            } 
        if (event.getSource() == BExit){
                System.exit(0);
            }
        if (l.isNJ()==true){ 
                l=new Logica();
                for (int i=0; i<40; ++i){
                    Escolha[i].setText("");
                    Escolha[i].setEnabled(true);
                }
                    for (int i=0; i<40; ++i){
                        l.getPosAl()[i]=i;
                    }
                    for (int i=0; i<40; i++){
                         l.getAl()[i]=i;
                         if(i>=20)
                             l.getAl()[i]=i-20;
                        }         
            }
            for (int i=0; i<40; ++i){
                if (event.getSource() == Escolha[i]){                                    
                    Escolha[i].setText(String.valueOf(l.getAl()[i]));
                    Escolha[i].setEnabled(false);
                    l.setnClick(l.getnClick()+1);                 
                    if (l.getnClick() == 1) l.setPrimeiro_Click(i);
                        if (l.getnClick() == 2){
                            l.setSegundo_Click(i);
                            if (l.getAl()[l.getPrimeiro_Click()] != l.getAl()[l.getSegundo_Click()]){                                                       
                                JOptionPane.showMessageDialog(GUIVELHA.this, "Errado"); 
                                Escolha[l.getPrimeiro_Click()].setText("");
                                Escolha[l.getSegundo_Click()].setText("");
                                Escolha[l.getPrimeiro_Click()].setEnabled(true);
                                Escolha[l.getSegundo_Click()].setEnabled(true);                             
                            }  else {
                                //ont_Acertos++;
                                l.setPts(l.getPts()+1);
                        }
                        l.setnClick(0);
                    }
                }
            }
            if (l.getPts() == 20){
                l=new Logica();
                l.setNJ(true);
                //          lkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
            }
            Pts.setText(""+l.getPts()); 
    }
}
    public GUIVELHA(){
        super("Jogo da velha");
        l.setNJ(true);
        for (int i=0; i<40; ++i){
            Escolha[i] = new JToggleButton();
            Panel.add(Escolha[i]);
            Escolha[i].setVisible(true);
        }
        Panel.add(BNew);
        Panel.add(BExit);
        Panel.setLayout(Layout_do_Jogo);
        add(Panel, BorderLayout.CENTER);
        add(Pts,BorderLayout.SOUTH);
        Eventos_JogoDaMemoria Handler = new Eventos_JogoDaMemoria();
        for (int i=0; i<40; ++i){
            Escolha[i].addActionListener(Handler); 
        }
        BNew.addActionListener(Handler);
        BExit.addActionListener(Handler);
        this.setResizable(false);     
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new GUIVELHA();
        
    }   
}
