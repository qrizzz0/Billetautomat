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
}
