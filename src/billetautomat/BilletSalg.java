package billetautomat;

import java.util.Scanner;

public class BilletSalg {
        
    private static int valgtBillet = 0;
    private static int AntalBilletter = 1;
    
    public void setValgtBillet(int indx){
        valgtBillet = indx;
    }
    public int getValgtBillet(){
        return valgtBillet;
    }
    public void setAntalBilletter(int Antal){
        AntalBilletter = Antal;
    }
    public int getAntalBilletter(){
        return AntalBilletter;
    }   
    public void KøbBillet() {
        int TotalSum=0;
                TotalSum=AntalBilletter*Start.billetTyper.get(valgtBillet).GetBilletPris();
                Start.AutomatBalance.setBalance(Start.AutomatBalance.getBalance()-TotalSum);
                
                WriteToFile writer = new WriteToFile("solgteBilletter.txt");

                for(int i=0;i<AntalBilletter;i++){
                    BilletDesign.udskrivning(valgtBillet);
                    writer.saveTicket(Start.billetTyper.get(valgtBillet).GetBilletType(), Start.billetTyper.get(valgtBillet).GetBilletPris());
                }
                Start.PrisSum=Start.PrisSum+Start.billetTyper.get(valgtBillet).GetBilletPris();
                
     
    }
}