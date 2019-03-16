package billetautomat;

import java.util.Scanner;

public class Billet {
    private String type;
    private int pris;
    
    Billet(String type, int pris) {
        this.type = type;
        this.pris = pris;
    }
    
    public int GetBilletPris() {
       return pris; 
    }
    
    public String GetBilletType() {
        return type;
    }
    
    
    public static void KøbBillet(){
        
        System.out.println("Indtast midlertidig balance");
        
        Scanner scan = new java.util.Scanner(System.in);
        int MidBalance = scan.nextInt(); //Midlertidig balance indtasting
        
        System.out.println("Hvilken billet vil du købe?");
        for(int i=0;i<Start.billetTyper.size();i++){
            System.out.println(i+". "+Start.billetTyper.get(i).GetBilletType()+" "+Start.billetTyper.get(i).pris+"kr.");
        }
        
        int ValgtBillet = scan.nextInt(); //Midlertidig balance indtasting
        
        if (MidBalance>=Start.billetTyper.get(ValgtBillet).pris){
                    BilletDesign.udskrivning(ValgtBillet);
        }
        else{
            System.out.println("Balancen er ikke høj nok til at købe den valgte billet.");
        }
    }
}
