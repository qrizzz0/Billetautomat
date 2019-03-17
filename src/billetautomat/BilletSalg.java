package billetautomat;

public class BilletSalg {
        
    private static int valgtBillet;
    
    public void setValgtBillet(int indx){
        valgtBillet = indx;
    }
    public int getValgtBillet(){
        return valgtBillet;
    }
            
    public void KøbBillet() {
        
                    
                    //Trækker valgte billetpris fra balancen
                    Start.AutomatBalance.setBalance(Start.AutomatBalance.getBalance()-Start.billetTyper.get(valgtBillet).GetBilletPris());
                   //Skal jeg burge til at teste om det virke senere: System.out.println("Balance:"+Start.AutomatBalance.getBalance());
                    BilletDesign.udskrivning(valgtBillet);
                    Start.PrisSum=Start.PrisSum+Start.billetTyper.get(valgtBillet).GetBilletPris();
                    WriteToFile writer = new WriteToFile("solgteBilletter.txt");
                    writer.saveTicket(Start.billetTyper.get(valgtBillet).GetBilletType(), Start.billetTyper.get(valgtBillet).GetBilletPris());

    }
}
