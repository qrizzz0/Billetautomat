package billetautomat;
import java.sql.Timestamp;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
        private FileWriter writer;
    
        public WriteToFile(String FileName) {
        try {
        writer = new FileWriter(FileName, true); //Opret fil. Catch exception hvis noget går galt
        }
        catch (IOException ex) {
          System.out.println("Filen kunne ikke åbnes/laves... :o");
          ex.getStackTrace();
        }       
    }
    
    public void LogToFile(String input) {
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
    
    public void WriteToFile(String input) {
        try {
            writer.flush();
            writer.append(input);
            writer.close();
        }
        catch (IOException ex) {
            ex.getStackTrace();
        }
    }

    
}