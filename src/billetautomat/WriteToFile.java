package billetautomat;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WriteToFile {
    private FileWriter writer;
    
    public WriteToFile(String fileName) {
        try {
        writer = new FileWriter(fileName, true); //Opret fil. Catch exception hvis noget går galt
        }
        catch (IOException ex) {
          System.out.println("Filen " + fileName + "kunne ikke åbnes/laves... :o");
          ex.getStackTrace();
        }       
    }
    
    public void logToFile(String input) {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        try {
            writer.flush();
            writer.append(time + ": " + input + "\n");
            writer.close();
        }
        catch (IOException ex) {
            ex.getStackTrace();
        }
    }
    
    public void saveTicket(String billettype, int pris) {
        long time=System.currentTimeMillis();  
        java.util.Date date=new java.util.Date(time);
        //Skriver informationer om den solgte billet - ID formateret som 3-digit tal.
        println(String.format("%03d", Start.billetNummer) + "," + billettype + "," + pris + "," + date);
    }
    
    public void print(String input) {
        try {
            writer.flush();
            writer.append(input);
            writer.close();
        }
        catch (IOException ex) {
            ex.getStackTrace();
        }
    }
    public void println(String input) {
        try {
            writer.flush();
            writer.append(input + "\n");
            writer.close();
        }
        catch (IOException ex) {
            ex.getStackTrace();
        }
    }
    
    public void closeLog (){
        try {
        writer.close();
        }
        catch(IOException ex) {
            ex.getStackTrace();
        }
               
    }
    
    
}
