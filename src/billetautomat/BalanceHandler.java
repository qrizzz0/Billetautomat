/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetautomat;

/**
 *
 * @author bruger
 */
public class BalanceHandler {
    private int balance = 0;
    
    public void setBalance(int newbal){
       balance = newbal;
    }
    public int getBalance(){
        return balance;
    }
}
