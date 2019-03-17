package billetautomat;

public class Billet {
    private String type;
    private int pris;
    private int AntalBilletter;
    
    Billet(String type, int pris) {
        this.AntalBilletter=0;
        this.type = type;
        this.pris = pris;
    }
    
    public int GetBilletPris() {
       return pris; 
    }
    
    public String GetBilletType() {
        return type;
    }
    
    public int GetAntalBilletter() {
        return AntalBilletter;
    }
    
    public void TilføjBillet(){
        AntalBilletter++;
    }
    
    public void NulstilBilletter(){
        AntalBilletter=0;
    }
}
