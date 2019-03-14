package billetautomat;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    WriteToFile log = new WriteToFile("log.txt");
    ArrayList<String> BilletTyper = new ArrayList<String>();

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
    
    void opsætBilletter() { //Bruges til at tilføje, fjerne og se alle billettyperne.
        log.logToFile("Billetopsætningen er startet.");

        getBilletTyper();
        Scanner scan = new java.util.Scanner(System.in);
            int valg = scan.nextInt();
            System.out.println("Menu for billettyper");
            System.out.println("1. Tilføj ny billettype");
            System.out.println("2. Fjern eksisterende billettype");
            System.out.println("3. Se liste over eksisterende billettyper");
            
            switch (valg) {
                case 1: //Hvis der skal oprettes en ny billettype.
                String NyBilletType  = scan.nextLine();
                   BilletTyper.add(NyBilletType);
                   System.out.println("Alle billettyper:");
                   System.out.println(BilletTyper); //Billettyperne udskrives så det vides den nye er blevet tilføjet.
                    break;
                case 2: //Hvis der skal fjernes en billettype.
                String FjernBilletType  = scan.nextLine();
                int i=0;
                boolean Fundet=false;    
                while(!Fundet){ //while loop til search, så den indskrevne billettype kan findes
                    if(FjernBilletType==BilletTyper.get(i)){
                        BilletTyper.remove(i);
                        Fundet=true;
                    }
                    else if(i>=BilletTyper.size()){ //Hvis den ikke kan findes.
                        Fundet=true;
                        System.out.println("Den indtastede billettype findes ikke.");
                    }
                }
                i++;
                    break;
                case 3: //Billettyperne udskrives
                    System.out.println(BilletTyper);
                    break;
            }
    }    
    
    void setBalance() {
        log.logToFile("Balancen bliver ændret af admin til:"); //Skal vise til hvor meget!
        //
        //
    }
    
    void getBilletTyper() {
        log.logToFile("Viser alle billettyper til administratoren.");
        //Arraylist med billettyper.
        BilletTyper.add("Voksen");
        BilletTyper.add("Barn");
        BilletTyper.add("Cykel");
        BilletTyper.add("Hund");

}
}