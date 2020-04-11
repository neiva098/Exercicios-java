/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.event.ActionListener;
/**
 *
 * @author neiva
 */
public class Calc extends JFrame {
    private JPanel jpanel1;
    private JPanel jpanel2;
    private JButton jbutton1;
    private JButton jbutton2;
    private JButton jbutton3;
    private JButton jbutton4;
    private JButton jbutton5;
    private String operacao="";
    private JButton num[]=new JButton[10];
    private JTextField visor = new javax.swing.JTextField();
    private JTextField jtext1;
    private float n1,n2;
    private char op;
    private float resultado=0;
    private int cntrl=0;
    private class Eventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //if(e.getSource()==b[1])
            if(cntrl==1){
                visor.setText("");
                op='a';
                cntrl=0;
            }
            for(int i=0;i<10;i++)
            {
                if(e.getSource()==num[i])
                {
                    visor.setText(visor.getText()+String.valueOf(i));
                }
                
            }
            if(e.getSource()==jbutton1){
                    n1=Integer.parseInt(visor.getText());
                    visor.setText("");
                    op=jbutton1.getText().charAt(0);
                    
                }
                if(e.getSource()==jbutton2){
                    n1=Integer.parseInt(visor.getText());
                    visor.setText("");
                    op=jbutton2.getText().charAt(0);
                }
                if(e.getSource()==jbutton3){
                    n1=Integer.parseInt(visor.getText());
                    visor.setText("");
                    op=jbutton3.getText().charAt(0);
                }
                if(e.getSource()==jbutton4){
                    n1=Integer.parseInt(visor.getText());
                    visor.setText("");
                    op=jbutton4.getText().charAt(0);
                }
                if(e.getSource()==jbutton5){
                n2=Integer.parseInt(visor.getText());
                if(op=='+'){
                resultado=n1+n2;
                }
                if(op=='-'){
                    resultado=n1-n2;
                }
                 if(op=='/'){
                    resultado=n1/n2;
                }
                  if(op=='*'){
                    resultado=n1*n2;
                }
                visor.setText(""+resultado);
                cntrl=1;
                }     
        }
    }
    public Calc(){
        super("Calc");
        setLayout(new BorderLayout()); 
        Eventos e =new Eventos();
        jpanel1=new JPanel();
        jpanel2=new JPanel();
        visor.setEditable(false);
        jpanel1.setLayout(new GridLayout(1,1));
        jpanel2.setLayout(new GridLayout(5,5));
        JPanel jpanel3=new JPanel();
        jpanel3.setLayout(new GridLayout(1,5));
        for(int i=0;i<10;i++){
            num[i]=new JButton(String.valueOf(i));
            jpanel2.add(num[i]);
            num[i].addActionListener(e);
        }
        jbutton1= new JButton("+");jbutton1.addActionListener(e);
        jbutton2= new JButton("-");jbutton2.addActionListener(e);
        jbutton3= new JButton("*");jbutton3.addActionListener(e);
        jbutton4= new JButton("/");jbutton4.addActionListener(e);
        jbutton5= new JButton("=");jbutton5.addActionListener(e);
        visor.setText("");
        add(jpanel1,BorderLayout.NORTH);
        add(jpanel2,BorderLayout.CENTER);
        add(jpanel3,BorderLayout.SOUTH);
        jpanel1.add(visor);
        jpanel3.add(jbutton1);
        jpanel3.add(jbutton2);
        jpanel3.add(jbutton3);
        jpanel3.add(jbutton4);
        jpanel3.add(jbutton5); 
   }
    public static void main(String[] args) {
        // TODO code application logic here
       Calc c=new Calc();
       c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c.setSize(250, 250);
       c.setVisible(true);
    }
}