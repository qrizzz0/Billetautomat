package billetautomat;

import java.util.Scanner;

public class Billetautomat {

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
                    Billet.opsætBillet();
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

     


}
