/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetautomat;

/**
 *
 * @author Anders
 */
public class BenytBilletautomat {
    
    public static void main(String[] args){
        String SecretCode = "1337";
        
        Billetautomat.getBilletPriser();
               
        String CodeInput = "1337";
        if (CodeInput.equals(SecretCode)) {
            Billetautomat.adminMenu();
            
        }
        
    }
    
}