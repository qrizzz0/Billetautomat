package billetautomat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Admin {
    WriteToFile log = new WriteToFile("log.txt");
    
    public void adminMenu() throws FileNotFoundException {
        log.logToFile("Admin-menuen er åbnet");
        boolean admin = true;
        while (admin) {
            System.out.println("Velkommen til admin menuen.");
            System.out.println("Tast 1 for at modificere billetpriser.");
            System.out.println("Tast 2 for at ændre automatens balance til givent beløb");
            System.out.println("Tast 3 for at se hvor mange billetter der er blevet solgt");
            System.out.println("Tast 4 for at se beløb af samlede salg af billetter.");
            System.out.println("Tast 5 for at interagere med loggen");
            System.out.println("Tast 6 for at forlade admin menuen.");
            
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
                    getSalg();
                    break;
                case 5:
                    logMenu();
                    break;
                case 6:
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
        
        System.out.println("Menu for billettyper");
        System.out.println("1. Tilføj ny billettype");
        System.out.println("2. Fjern eksisterende billettype");
        System.out.println("3. Se liste over eksisterende billettyper");
        
            
        int valg = scan.nextInt();
            switch (valg) {
                case 1: //Hvis der skal oprettes en ny billettype.
                    log.logToFile("Ny billettype oprettes: "); //handling gemmes i log
                    System.out.println("Hvad skal den nye billettype være?");
                    String NyBilletType  = scan.next();
                    System.out.println("Hvad skal den koste?");
                    //log.closeLog();
                    int pris = scan.nextInt();
                    
                    Start.billetTyper.add(new Billet(NyBilletType, pris));
                    WriteToFile gemType = new WriteToFile("billetTyper.txt");
                    gemType.println(NyBilletType + "," + pris);
                    gemType.closeLog();
                    
                    log.logToFile("Ny billettype: "+NyBilletType+"   Pris: "+pris);
                    System.out.println("Alle billettyper:");
                    getBilletTyper();
                    break;
                
                case 2: //Hvis der skal fjernes en billettype.
                    log.logToFile("En billettype fjernes: ");
                    String FjernBilletType  = scan.nextLine();
                    int i = 0;
                    boolean fundet=false;    
                    while(!fundet){ //while loop til search, så den indskrevne billettype kan findes
                        if (FjernBilletType.equals(Start.billetTyper.get(i).GetBilletType())) {
                            Start.billetTyper.remove(i);
                            fundet=true;
                            log.logToFile("Billettypen " + Start.billetTyper.get(i).GetBilletType() + "fjernes fra systemet");
                        } else if (i >= Start.billetTyper.size()){ //Hvis den ikke kan findes.
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
        //Skal vise til hvor meget!
        //
        //
    }
    
    private void getBilletTyper() {
        log.logToFile("Viser alle billettyper til administratoren.");
        System.out.println("\nFølgende billettyper eksisterer:");
        Start.billetTyper.forEach((n) -> System.out.println(n.GetBilletType() + " Pris: " + n.GetBilletPris()));
        Start.billetTyper.forEach((n) -> log.logToFile(n.GetBilletType() + " Pris: " + n.GetBilletPris()));
        System.out.println("\n");
    }
    
    private void getSalg(){
        System.out.println("Samlede beløb på salg af billetter: "+Start.PrisSum+"kr.");
        log.logToFile("Samlede beløb på salg af billetter: "+Start.PrisSum+"kr.");
    }
    
    private void logMenu() {
        try {
            ReadFile read = new ReadFile("log.txt");

            log.logToFile("\nLog menuen bliver åbnet");
            System.out.print("\n");
            System.out.println("Velkommen til log menuen.");
            System.out.println("Tast 1 for at printe hele loggen");
            System.out.println("Tast 2 for at søge i loggen");
            System.out.println("Tast 3 for at se hvad der er sket siden sidste gang admin-menuen blev åbnet");
            System.out.println("Tast 4 for at se overførsler på 500 eller over");

            Scanner scan = new java.util.Scanner(System.in);
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(read.readLogToString("log.txt"));
                    log.logToFile("Loggen bliver printet ud");
                    System.out.print("\n");
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);
                    String text = scanner.nextLine();
                    read.searchLog("log.txt", text);
                    log.logToFile("Der blev søgt efter '" + text + "' i loggen");
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.print("\n");
                    read.sinceAdminStart("log.txt", "Admin-menuen");
                    log.logToFile("Aktivitet siden sidste admin start blev vist");
                    System.out.print("\n");
                    break;
                case 4:
                    read.searchLog("log.txt", "Høj profit!");
                    log.logToFile("Profitter på 500 eller over bliver fundet");
                    System.out.print("\n");
                    break;
                case 5:

                    break;
                case 6:

                default:
                    break;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}