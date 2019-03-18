package billetautomat;

public class BilletDesign {
      public static void udskrivning(int ValgtBillet) {
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
        System.out.println("@@       "+Start.billetTyper.get(ValgtBillet).GetBilletType()+"            @@");
        System.out.println("@@                      @@");
        System.out.println("@@         "+Start.billetTyper.get(ValgtBillet).GetBilletPris()+"kr.       @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("@@                      @@");
        System.out.println("  @@@@@@@@@@@@@@@@@@@@@@  ");
        System.out.println();
    }  
}
