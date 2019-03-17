package billetautomat;

import java.util.Scanner;

public class BilletSalg {
        
    private static int valgtBillet;
    
    public void setValgtBillet(int indx){
        valgtBillet = indx;
    }
    public int getValgtBillet(){
        return valgtBillet;
    }
            
    public void KøbBillet() {
        System.out.println("Indtast hvor mange af valgte typebillet du vil have?");
                 Scanner scan = new java.util.Scanner(System.in);
    int  AntalBilletter= scan.nextInt();        
        int MidSum=0;
        int TotalSum=0;
                int j=0;

                while(j>=Start.billetTyper.size()){
                    MidSum=AntalBilletter*Start.billetTyper.get(j).GetBilletPris();
                    TotalSum=TotalSum+MidSum;
                    j++;
                }
                Start.AutomatBalance.setBalance(Start.AutomatBalance.getBalance()-Start.billetTyper.get(valgtBillet).GetBilletPris());
                Start.PrisSum=Start.PrisSum+Start.billetTyper.get(valgtBillet).GetBilletPris();
                BilletDesign.udskrivning(valgtBillet);
                WriteToFile writer = new WriteToFile("solgteBilletter.txt");
                writer.saveTicket(Start.billetTyper.get(valgtBillet).GetBilletType(), Start.billetTyper.get(valgtBillet).GetBilletPris());
     
   

    }
}