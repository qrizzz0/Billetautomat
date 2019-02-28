package billetautomat;

import java.util.Scanner;

public class Billetautomat {

    private static int[] ZonePriser;
    private static double balance = 0;

    private static void opsætBillet() {
        System.out.println("Indtast billetpriser: ");

        //Lad os for nu bare sige at der er 5 forskellige billetter
        int i;
        
        if (ZonePriser != null) {
            getBilletPriser();
            System.out.print("\n\n");
        }
        else {
            ZonePriser = new int[6];
        }
        
        for (i = 1; i < 6; i++) {
            Scanner scanner = new Scanner(System.in); //Laver en scanner  
            System.out.println("Pris for zone " + i);
            ZonePriser[i] = scanner.nextInt();
        }

    }

    public static void getBilletPriser() {
        int k;
        if (ZonePriser != null) {
            for (k = 1; k < 6; k++) {
                System.out.print("Pris for zone" + k + ". " + ZonePriser[k] + "      ");
            }
        } else {
            System.out.println("Fejl i billetsystemet - prisliste ikke fundet!");
        }
    }

    public static double getBalance() { //funktionen returnerer nu balancen i stedet for at printe den :)
        return balance;
    }

    private static void setBalance() {
        Scanner scan = new java.util.Scanner(System.in);
        balance = scan.nextDouble();
    }

    public static void udskrivning() {
        System.out.println("  @@@@@@@@@@@@@@@@@@@@@@  ");
        System.out.println("@@ Borgen Trafikselskab @@");
        System.out.println("  @@@@@@@@@@@@@@@@@@@@@@  ");
        System.out.println("@@                      @@");
        System.out.println("@@          @@          @@");
        System.out.println("@@         @@@@         @@");
        System.out.println("@@        @ BT @        @@");
        System.out.println("@@         @@@@         @@");
        System.out.println("@@          @@          @@");
        System.out.println("@@                      @@");
        System.out.println("@@        Billet        @@");
        System.out.println("@@                      @@");
        System.out.println("@@         Pris         @@");
        System.out.println("@@                      @@");
        System.out.println("@@      Andet info      @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("  @@@@@@@@@@@@@@@@@@@@@@  ");
        System.out.println();
    }

    private static void getTicketInfo() {
        System.out.println("\n#################################");
        System.out.println("#Velkommen til billetoversigten:#");
        System.out.println("#   Der er i dag blevet solgt:  #");
        System.out.println("#      X 2-zones billetter      #");
        System.out.println("#      X 3-zones billetter      #");
        System.out.println("#             Osv...            #");
        System.out.println("#################################\n");

    }

    public static void adminMenu() {
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
                    opsætBillet();
                    break;
                case 2:
                    setBalance();
                    break;
                case 3:
                    getTicketInfo();
                    break;
                case 4:
                    admin = false;
                    break;

                default:
                    break;

            }
        }
    }
    //For nu har jeg blot lavet nogle billettyper da jeg ikke helt ved hvordan det med zonerne fungere.
     public static void købBillet() {

                System.out.println(" ");
                System.out.println("Indtast beløb til køb af billetter: ");
            
                    Scanner beløb = new java.util.Scanner(System.in);
                    int sum=beløb.nextInt();
            int voksen=30;
            int barn=15;
            int hund=15;
            int cykel=10;
                        


        Scanner valg = new java.util.Scanner(System.in);
     int valget = -1;

    while(valget < 1 || valget > 5){
            //selve menuen
                System.out.println("Vælg billettype");
                System.out.println("1. Voksenbillet");
                System.out.println("2. Børnebillet");
                System.out.println("3. Hundebillet");
                System.out.println("4. Cykelbillet");
                System.out.println("5. Afslut");
                
            if(valg.hasNextInt())
            valget = valg.nextInt();

    }

     switch(valget){
        case 1:
            if(sum>=voksen){
                System.out.println("Du har købt 1 voksenbillet");
                sum=sum-voksen;
                System.out.println("Du får: "+sum+"kr. tilbage");
                Billetautomat.udskrivning();
            }
           break;
        case 2:
            if(sum>=barn){
                System.out.println("Du har købt 1 børnebillet");
                sum=sum-barn;
                System.out.println("Du får: "+sum+"kr. tilbage");
                Billetautomat.udskrivning();
            }
           break;
        case 3:
            if(sum>=hund){
                System.out.println("Du har købt 1 hundebillet");
                sum=sum-hund;
                System.out.println("Du får: "+sum+"kr. tilbage");
                Billetautomat.udskrivning();
            }
           break;
        case 4:
            if(sum>=cykel){
                System.out.println("Du har købt 1 cykelbillet");
                sum=sum-cykel;
                System.out.println("Du får: "+sum+"kr. tilbage");
                Billetautomat.udskrivning();
            }
            break;
        case 5:
            System.exit(0);
            break;
   }
     }
     
     private static void velkommen(){
                System.out.println("  @@@@@@@@@@@@@@@@@@@@@@  ");
                System.out.println("@@ Borgen Trafikselskab @@");
                System.out.println("  @@@@@@@@@@@@@@@@@@@@@@  ");
                System.out.println(" ");
                System.out.println("Billetautomat til køb af billet");
                System.out.println("-Voksenbillet koster 30kr. (18+år)");
                System.out.println("-Børnebillet koster 15kr. (6-17år)");
                System.out.println("-Hundebillet koster 15kr.");
                System.out.println("-Cykelbillet koster 10kr.");
     }
     


}
