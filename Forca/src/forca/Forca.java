/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import Logica.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 
 * @author neiva
 */
public class Forca extends JFrame {
     private JToggleButton letra[]=new JToggleButton[26];
     private JTextField T[]=new JTextField[7];
     private JPanel p[]=new JPanel[3];
     private JToggleButton novo=new JToggleButton("New");
     private JToggleButton sair=new JToggleButton("Exit");
     private JToggleButton informar=new JToggleButton("Informar");
     private JLabel Pts = new JLabel("Pontos: 0");
     private GridLayout Lay1= new GridLayout(2,13);
     private GridLayout Lay0= new GridLayout(1,7);
     private GridLayout Lay2= new GridLayout(1,4);
     private char c=97;
     private JTextField ch=new JTextField();
     private Logica l=new Logica();
     Eventos handle=new Eventos(); 
     private class Eventos implements ActionListener{
        @Override
        public void  actionPerformed (ActionEvent event){
        if (event.getSource() == novo){
              l=new Logica();
            } 
        if (event.getSource() == sair){
                System.exit(0);
            }
        for(int i=0;i<26;i++){
            if(event.getSource()==letra[i]){
                l.Jogada(letra[i].getText().charAt(0));
            }
        }
        if (event.getSource() == informar){
                l.Chute(ch.getText());
            }
        for(int i=0;i<7;i++)
        {
            T[i].setText(""+l.getTela()[i]);
        }
        Pts.setText(""+l.getV());
        if(l.getV()==10)System.exit(0);
        }
               
}
     public Forca(){
         super("Forca");
         for (int i =0;i<3;i++){
             p[i]=new JPanel();
         }
         
         for (int i =0;i<7;i++){
             T[i]=new JTextField();
             p[0].add(T[i]);
             T[i].setVisible(true);
         }
         for (int i=0; i<26; ++i){
            letra[i] = new JToggleButton(String.valueOf(c++));
            p[1].add(letra[i]);
            letra[i].addActionListener(handle);
            letra[i].setVisible(true);
        }
         p[2].add(novo);
         novo.setVisible(true);
         novo.addActionListener(handle);
         p[2].add(sair);
         sair.addActionListener(handle);
         sair.setVisible(true);
         p[2].add(informar);
         informar.setVisible(true);
         informar.addActionListener(handle);
         p[2].add(Pts);
         Pts.setVisible(true);
         p[2].add(ch);
         ch.setVisible(true);
         p[0].setLayout(Lay0);
         p[1].setLayout(Lay1);
         p[2].setLayout(Lay2);
         add(p[0],BorderLayout.NORTH);
         add(p[1],BorderLayout.CENTER);
         add(p[2],BorderLayout.SOUTH);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);     
         this.setSize(700,200);
         this.setVisible(true);
         this.setLocationRelativeTo(null);      
     }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Forca();
    }  
}