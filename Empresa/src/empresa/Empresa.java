/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author neiva
 */
import java.util.ArrayList;
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comissionados c=new Comissionados();
        AssalariadosComissionados ac=new AssalariadosComissionados();
        Assalariado a=new Assalariado();
        Horista h=new Horista();
        Titulo t=new Titulo(300,3,6);
        Concessionarias ca;
        ca = new Concessionarias(300.0);
        c.setVendas(100);
        ac.setVendas(100);
        h.setH(300);
        ArrayList<Pagavel> ps = new ArrayList<>();
        ps.add(c);
        ps.add(ac);
        ps.add(a);
        ps.add(h);
        ps.add(t);
        ps.add(ca);
        Controle cntrl=new Controle();
        cntrl.Controle(ps);
        
    }
    
    
}
