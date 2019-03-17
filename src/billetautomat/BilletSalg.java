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
        
            Start.billetTyper.get(valgtBillet).TilføjBillet();
                    

    }
    public void AfslutKøb(){
        for(int i=0;i<Start.billetTyper.size()-1;i++){
            for(int t=0;t<Start.billetTyper.size();t++){
                Start.AutomatBalance.setBalance(Start.AutomatBalance.getBalance()-Start.billetTyper.get(valgtBillet).GetBilletPris());
                Start.PrisSum=Start.PrisSum+Start.billetTyper.get(valgtBillet).GetBilletPris();
                BilletDesign.udskrivning(valgtBillet);
                WriteToFile writer = new WriteToFile("solgteBilletter.txt");
                writer.saveTicket(Start.billetTyper.get(valgtBillet).GetBilletType(), Start.billetTyper.get(valgtBillet).GetBilletPris());
            }
        }
    }
}
