package billetautomat;

import java.util.Scanner;

public class BilletSalg {
        
    private static int valgtBillet;
    private static int AntalBilletter;
    
    public void setValgtBillet(int indx){
        valgtBillet = indx;
    }
    public int getValgtBillet(){
        return valgtBillet;
    }
    public void setAntalBilletter(int Antal){
        valgtBillet = Antal;
    }
    public int getAntalBilletter(){
        return valgtBillet;
    }   
    public void KøbBillet() {
        System.out.println("Indtast hvor mange af valgte typebillet du vil have?");
                
                Start.PrisSum=Start.PrisSum+Start.billetTyper.get(valgtBillet).GetBilletPris();
                BilletDesign.udskrivning(valgtBillet);
                WriteToFile writer = new WriteToFile("solgteBilletter.txt");
                writer.saveTicket(Start.billetTyper.get(valgtBillet).GetBilletType(), Start.billetTyper.get(valgtBillet).GetBilletPris());
     
    }
}