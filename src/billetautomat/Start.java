
package billetautomat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Start {
    static ArrayList<Billet> billetTyper = new ArrayList<>();
    public static void main(String[] args){
        //Tjek om der eksisterer en fil med billet-type informationer
        //Hvis der gør, så indlæs fil i rammen!
        try {
            WriteToFile log = new WriteToFile("log.txt");
            log.logToFile("Forsøger at åbne filen indeholdende billettyperne");
            
            ReadFile reader = new ReadFile("BilletTyper.txt");
            ArrayList<String> gemteTyper = reader.readAll();
            for (String object: gemteTyper) {
                StringTokenizer tokenizer = new StringTokenizer(object, ",");
                String type = tokenizer.nextToken();
                int pris = Integer.valueOf(tokenizer.nextToken());
                billetTyper.add(new Billet(type, pris));
            }
        } catch (IOException ex){
            //ex.printStackTrace(); //Vi forventer egentlig en fejl, så vi skal ikke smide en fejl tilbage..
            System.out.println("Ingen billettyper fundet i forvejen - det må være første gang maskinen kører");
            System.out.println("Starter administrationspanelet!");
            Admin admin = new Admin();
            admin.adminMenu();
        }
        


//Hvis ikke: Spørg hvor mange billetter og hvilken type
               //Skriv billettyperne til en fil.
          //Else: Læs billettyper ind fra fil.
        
        //Når billettyper er indlæst, start GUI!
      
        String SecretCode = "1337";
                       
        String CodeInput = "1337";
        if (CodeInput.equals(SecretCode)) {
            Admin admin = new Admin();
            admin.adminMenu();
        }
     BilletDesign.udskrivning();
        
    }
    
}