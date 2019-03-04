
package billetautomat;

public class BenytBilletautomat {
    
    public static void main(String[] args){
        MenuKøbTypebillet.købBillet();
        
        String SecretCode = "1337";
        
        Billetautomat.getBilletPriser();
               
        String CodeInput = "1337";
        if (CodeInput.equals(SecretCode)) {
            Billetautomat.adminMenu();
            
        }
        
    }
    
}