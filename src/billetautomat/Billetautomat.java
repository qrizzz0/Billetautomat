package billetautomat;
import java.util.Scanner;



public class Billetautomat {
  public static int[] ZonePriser; //Tror Nordfalk bliver glad hvis vi gør den her private :)
  private static double balance = 0;

    public static void opsætBillet() {
         
 
      
      System.out.println("Indtast billetpriser: ");
     
      //Lad os for nu bare sige at der er 5 forskellige billetter
      int i; 
      ZonePriser = new int[6]; 
      
     
      
      for (i = 1; i < 6; i++){
     Scanner scanner = new Scanner(System.in); //Laver en scanner  
     System.out.println("Pris for zone " + i);
     ZonePriser[i]= scanner.nextInt(); 
        //Tillader instalatøren at indstille balancen så han kan printe biletter uden at bruge penge
       System.out.println("Indtast balance: ");
       setBalance();
      }
    
    }
    

    static void getBilletPriser() {
     int k;
     for (k = 1; k < 6; k++){
          System.out.print("Pris for zone" + k + ". " + ZonePriser[k] + "      ");
      }
    }

    public static double getBalance(){ //funktionen returnerer nu balancen i stedet for at printe den :)
        return balance;
    }
    public static void setBalance(){
        Scanner scan = new java.util.Scanner(System.in);
        balance = scan.nextDouble();
    }
   
    
    
    public void udskrivning() {
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
    
    
 }
  
 

 