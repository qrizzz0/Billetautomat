package billetautomat;

public class Billet {
    private int pris;
    private String type;
    
    
    Billet(int pris, String type) {
        this.pris = pris;
        this.type = type;
    }
    
    int GetBilletPris() {
       return pris; 
    }
    
    String GetBilletType() {
        return type;
    }
}
