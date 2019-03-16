package billetautomat;

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
    void KøbBillet(){
        BilletDesign.udskrivning();
        //If balance større end billetpris brug funktion udskrivning() under BilletDesign.
        //else giv fejlbesked
    }
}
