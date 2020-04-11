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
public class AssalariadosComissionados extends Comissionados {
    
    @Override
    public void ValorP(){
        valor=848+vendas*0.1;
    }
}
