
package billetautomat;

//Billet class

import java.util.Scanner;

//Mål: Voksen, barn 1-3 zoner.
public class Billet {
       private static int[] ZonePriser;
    private static double balance = 0;
    
    public static void opsætBillet() {
        
        System.out.println("Indtast billetpriser: ");

        //Lad os for nu bare sige at der er 5 forskellige billetter
        int i;
        
        if (ZonePriser != null) {
            getBilletPriser();
            System.out.print("\n\n");
        }
        else {
            ZonePriser = new int[3];
        }
        
        for (i = 1; i < 2; i++) {
            Scanner scanner = new Scanner(System.in); //Laver en scanner  
            System.out.println("Pris for zone " + i);
            ZonePriser[i] = scanner.nextInt();
        }

    }

    public static void getBilletPriser() {
        int k;
        if (ZonePriser != null) {
            for (k = 1; k < 2; k++) {
                System.out.print("Pris for zone" + k + ". " + ZonePriser[k] + "      ");
            }
        } else {
            System.out.println("Fejl i billetsystemet - prisliste ikke fundet!");
        }
    }

    public static double getBalance() { //funktionen returnerer nu balancen i stedet for at printe den :)
        return balance;
    }

    public static void setBalance() {
        Scanner scan = new java.util.Scanner(System.in);
        balance = scan.nextDouble();
    }


    public static void getTicketInfo() {
        System.out.println("\n#################################");
        System.out.println("#Velkommen til billetoversigten:#");
        System.out.println("#   Der er i dag blevet solgt:  #");
        System.out.println("#      X 2-zones billetter      #");
        System.out.println("#      X 3-zones billetter      #");
        System.out.println("#             Osv...            #");
        System.out.println("#################################\n");

    }
}
