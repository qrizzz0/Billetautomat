/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetautomat;

import java.util.Scanner;

/**
 *
 * @author bruger
 */
public class AdminMenu {
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
                    Billet.setBalance();
                    break;
                case 3:
                    Billet.getTicketInfo();
                    break;
                case 4:
                    admin = false;
                    break;

                default:
                    break;

            }
        }
    }
}
