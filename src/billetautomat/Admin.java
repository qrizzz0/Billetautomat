package billetautomat;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    WriteToFile log = new WriteToFile("log.txt");
    ArrayList<Billet> billetTyper = new ArrayList<>();

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
    
    private void opsætBilletter() { //Bruges til at tilføje, fjerne og se alle billettyperne.
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
                    System.out.println("Hvad skal den nye billettype være?");
                    String NyBilletType  = scan.nextLine();
                    System.out.println("Hvad skal den koste?");
                    int pris = scan.nextInt();
                
                    billetTyper.add(new Billet(NyBilletType, pris));
                
                    System.out.println("Alle billettyper:");
                    System.out.println(billetTyper); //Billettyperne udskrives så det vides den nye er blevet tilføjet.
                    break;
                
                case 2: //Hvis der skal fjernes en billettype.
                    String FjernBilletType  = scan.nextLine();
                    int i = 0;
                    boolean fundet=false;    
                    while(!fundet){ //while loop til search, så den indskrevne billettype kan findes
                        if (FjernBilletType.equals(billetTyper.get(i).GetBilletType())) {
                            billetTyper.remove(i);
                            fundet=true;
                        } else if (i >= billetTyper.size()){ //Hvis den ikke kan findes.
                            fundet=true;
                            System.out.println("Den indtastede billettype findes ikke.");
                        }
                        i++;
                    }
                    break;
                
                case 3: //Billettyperne udskrives
                    getBilletTyper();
                    break;
            }
    }    
    
    private void setBalance() {
        log.logToFile("Balancen bliver ændret af admin til:"); //Skal vise til hvor meget!
        //
        //
    }
    
    private void getBilletTyper() {
        log.logToFile("Viser alle billettyper til administratoren.");
        System.out.println("Følgende billettyper eksisterer:");
        billetTyper.forEach((n) -> System.out.println(n.GetBilletType()));
    }
}