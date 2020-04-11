/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import Arquivos.LerEEscrever;
import GUI.*;
import java.awt.*;
/**
 *
 * @author cantarino
 */
public class main {
    public static void main(String[] args){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI.Menus().setVisible(true);
            }
        });
    }
}
