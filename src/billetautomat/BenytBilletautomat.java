
package billetautomat;

public class BenytBilletautomat {
    
    public static void main(String[] args){
        MenuKøbTypebillet.velkommen();
        MenuKøbTypebillet.købBillet();
        
        String SecretCode = "1337";
        
        Billet.getBilletPriser();
               
        String CodeInput = "1337";
        if (CodeInput.equals(SecretCode)) {
            Billetautomat.adminMenu();
            
        }
        
    }
    
}