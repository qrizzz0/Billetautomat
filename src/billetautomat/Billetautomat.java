package billetautomat;
import java.util.Scanner;



public class Billetautomat {
  public static int[] ZonePriser; //Tror Nordfalk bliver glad hvis vi gør den her private :)
  private static double balance = 0;
  
  public static void main(String[] args){
   
      System.out.println("Hello?");
      
      while(true){
      System.out.println("All hail Senpai <3 ");
      
        System.out.println("All hail Senpai :( ");
        System.out.println("All hail Senpai ∩_∩ ");
      System.out.println("All hail Senpai :( ");
      
      System.out.println("Dette er en test mere :D");
      System.out.println("Hej allesammen");
      
      
      
      
     }
      
   
      
           
  }

    public static void opsætBillet() {
         
 
      
      System.out.println("Indtast billetpriser: ");
     
      //Lad os for nu bare sige at der er 5 forskellige billetter
      int i; 
      ZonePriser = new int[6]; 
      
     
      
      for (i = 1; i < 6; i++){
     Scanner scanner = new Scanner(System.in); //Laver en scanner  
     System.out.println("Pris for zone " + i);
     ZonePriser[i]= scanner.nextInt(); 
      }
    
    }
    

    static void getBilletPriser() {
     int k;
     for (k = 1; k < 6; k++){
          System.out.print("Pris for zone" + k + ". " + ZonePriser[k] + "      ");
      }
    }

    public static void getBalance(){
        System.out.println(balance);
    }
    public static void setBalance(){
        Scanner scan = new java.util.Scanner(System.in);
        balance = scan.nextDouble();
    }
   
    
    
    
 }
  
 

 