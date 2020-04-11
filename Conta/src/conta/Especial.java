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
public class Especial extends Conta {
    private  double especial;
    public Especial(){
        super();
        this.especial= 80;
    }
        public boolean sacarespecial(double valor){
        if((getsaldo()+especial)>=valor)
        {
            setsaldo(getsaldo()-valor);
            especial-=valor;
            return true;
        }
        return false;
        }
   public double getlimite()
   {
       return this.especial;
   }
    
}
