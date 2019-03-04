package billetautomat;

import java.util.Scanner;

public class MenuKøbTypebillet {

    public static void velkommen() {
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

    public static void købBillet() {

        //Dette skal fjernes på et tidspunkt - jeg lader det blive som debug indtil videre...
        System.out.println(" ");
        System.out.println("Indtast beløb til køb af billetter: ");

        Scanner beløb = new java.util.Scanner(System.in);
        int input = beløb.nextInt();
        int sum = input;
        WriteToFile log = new WriteToFile("log.txt");
        log.LogToFile("Der er blevet sat " + sum + "kr. ind i automaten!");
        
        int voksen = 30;
        int barn = 15;
        int hund = 15;
        int cykel = 10;

        //Hertil!-----------------------------------------
        
        Scanner valg = new java.util.Scanner(System.in);
        int valget = -1;

        while (valget < 1 || valget > 5) {
            //selve menuen
            System.out.println("Vælg billettype");
            System.out.println("1. Voksenbillet");
            System.out.println("2. Børnebillet");
            System.out.println("3. Hundebillet");
            System.out.println("4. Cykelbillet");
            System.out.println("5. Afslut");

            if (valg.hasNextInt()) {
                valget = valg.nextInt();
            }

        }

        switch (valget) {
            case 1:
                if (sum >= voksen) {
                    System.out.println("Du har købt 1 voksenbillet");
                    sum = sum - voksen;
                    System.out.println("Du får: " + sum + "kr. tilbage");
                    BilletDesign.udskrivning();
                }
                break;
            case 2:
                if (sum >= barn) {
                    System.out.println("Du har købt 1 børnebillet");
                    sum = sum - barn;
                    System.out.println("Du får: " + sum + "kr. tilbage");
                    BilletDesign.udskrivning();
                }
                break;
            case 3:
                if (sum >= hund) {
                    System.out.println("Du har købt 1 hundebillet");
                    sum = sum - hund;
                    System.out.println("Du får: " + sum + "kr. tilbage");
                    BilletDesign.udskrivning();
                }
                break;
            case 4:
                if (sum >= cykel) {
                    System.out.println("Du har købt 1 cykelbillet");
                    sum = sum - cykel;
                    System.out.println("Du får: " + sum + "kr. tilbage");
                    BilletDesign.udskrivning();
                }
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}
