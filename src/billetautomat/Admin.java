package billetautomat;

import java.util.Scanner;

public class Admin {
    WriteToFile log = new WriteToFile("log.txt");
    
    public void adminMenu() {
        log.logToFile("Admin-menuen er åbnet");
        boolean admin = true;
        while (admin) {
            System.out.println("Velkommen til admin menuen.");
            System.out.println("Tast 1 for at modificere billetpriser.");
            System.out.println("Tast 2 for at ændre automatens balance til givent beløb");
            System.out.println("Tast 3 for at se hvor mange billetter der er blevet solgt");
            System.out.println("Tast 4 for at forlade admin menuen.");

            Scanner scan = new java.util.Scanner(System.in);
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    opsætBilletter();
                    break;
                case 2:
                    setBalance();
                    break;
                case 3:
                    getBilletTyper();
                    break;
                case 4:
                    admin = false;
                    break;
                default:
                    break;
            }
        }
    }
    
    void opsætBilletter() {
        log.logToFile("Billetopsætningen er startet.");
        //Skal først getbillettyper()
        //Derefter skal den kunne tilføje nye billettyper
    }    
    
    void setBalance() {
        log.logToFile("Balancen bliver ændret af admin til:"); //Skal vise til hvor meget!
        //
        //
    }
    
    void getBilletTyper() {
        log.logToFile("Viser alle billettyper til administratoren.");
        //Skal helst returnere noget i stil med et array/arraylist af billet-objekter.
    }
}