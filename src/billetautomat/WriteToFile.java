package billetautomat;
import java.sql.Timestamp;
import java.io.FileWriter;
import java.io.IOException;

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
}
