package billetautomat;

import java.util.Scanner;

public class BilletSalg {
        
    public void KøbBillet() {
        Scanner scan = new java.util.Scanner(System.in);        
                
        System.out.println("Hvilken billet vil du købe?");
        for(int i=0;i<Start.billetTyper.size();i++){
            System.out.println(i+". "+Start.billetTyper.get(i).GetBilletType()+" "+Start.billetTyper.get(i).GetBilletPris()+"kr.");
        }
        
        int ValgtBillet = scan.nextInt(); //Midlertidig balance indtasting
        
        if (        Start.AutomatBalance.getBalance()>=Start.billetTyper.get(ValgtBillet).GetBilletPris()){
                    
                    //Trækker valgte billetpris fra balancen
                    Start.AutomatBalance.setBalance(Start.AutomatBalance.getBalance()-Start.billetTyper.get(ValgtBillet).GetBilletPris());
                   //Skal jeg burge til at teste om det virke senere: System.out.println("Balance:"+Start.AutomatBalance.getBalance());
                    BilletDesign.udskrivning(ValgtBillet);
                    Start.PrisSum=Start.PrisSum+Start.billetTyper.get(ValgtBillet).GetBilletPris();
                    WriteToFile writer = new WriteToFile("solgteBilletter.txt");
                    writer.saveTicket(Start.billetTyper.get(ValgtBillet).GetBilletType(), Start.billetTyper.get(ValgtBillet).GetBilletPris());
        }
        else{
            System.out.println("Balancen er ikke høj nok til at købe den valgte billet.");
        }
        

    }
}
