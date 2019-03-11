
package billetautomat;

public class Start {
    
    public static void main(String[] args){
        
        //Tjek om der eksisterer en fil med billet-type informationer
          //Hvis ikke: Spørg hvor mange billetter og hvilken type
               //Skriv billettyperne til en fil.
          //Else: Læs billettyper ind fra fil.
        
        //Når billettyper er indlæst, start GUI!
      
        String SecretCode = "1337";
                       
        String CodeInput = "1337";
        if (CodeInput.equals(SecretCode)) {
            Admin admin = new Admin();
            admin.adminMenu();
        }
        
    }
    
}