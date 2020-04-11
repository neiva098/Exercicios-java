/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.ActionListener;
/**
 *
 * @author neiva
 */
public class GUI extends JFrame{
    private JButton b[]=new JButton[3];
    private JCheckBox cb[]=new JCheckBox[2];
    private JLabel l[]=new JLabel[2];
    private JTextField t[]=new JTextField[2];;
    private JPanel p=new JPanel();
    private JPanel p1=new JPanel();
    private JPanel p2=new JPanel();
    private GridLayout lay=new GridLayout(3,1);
    private GridLayout lay1=new GridLayout(2,3);
    private GridLayout lay2=new GridLayout(2,1);
    /**
     * @param args the command line arguments
     */
    private class Eventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b[1])
            {
                System.exit(0);
            }
        }
    }
    public GUI(){
    super("GUI");
    p.setLayout(lay);
    b[0]=new JButton();
    b[0].setText("OK");
    p.add(b[0]);
    b[0].setVisible(true);
    b[1]=new JButton();
    b[1].setText("Sair");
    p.add(b[1]);
    b[1].setVisible(true);
    b[2]=new JButton();
    b[2].setText("Ajuda");
    p.add(b[2]);
    b[2].setVisible(true);
    add(p,BorderLayout.EAST);
    for(int i=0;i<2;i++){
       cb[i]=new JCheckBox();
       t[i]=new JTextField();
       l[i]=new JLabel();
    }
    p1.setLayout(lay1);
    p1.add(l[0]);
    l[0].setText("X:");
    l[0].setVisible(true);
    p1.add(t[0]);
    t[0].setVisible(true);
    p1.add(l[1]);
    l[1].setText("Y:");
    l[1].setVisible(true);
    p1.add(t[1]);
    t[1].setVisible(true);
    add(p1,BorderLayout.CENTER);
    p2.setLayout(lay2);
    JLabel jlabel1=new JLabel("Ajustar para Grid.");
    JLabel jlabel2=new JLabel("Mostrar Grid.");p2.add(jlabel1);
    p2.add(cb[0]);
    cb[0].setVisible(true);p2.add(jlabel2);
    p2.add(cb[1]);
    add(p2,BorderLayout.WEST);
    Eventos e=new Eventos();
    b[1].addActionListener(e);
    this.setResizable(false);
    this.setSize(500,150);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    }public static void main(String[] args) {
        // TODO code application logic here
        new GUI();
    }   
}
