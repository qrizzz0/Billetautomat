package billetautomat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 

public class ReadFile {
    private BufferedReader reader;
    
    public ReadFile(String fileName) throws IOException {
        reader = new BufferedReader(new FileReader(fileName));
    }
    
    public String readln() throws IOException {
        String s1 = reader.readLine();
        return s1;
    }
    
    public ArrayList<String> readAll() throws IOException {
        ArrayList<String> stringList = new ArrayList<String>();
        String s1;
        while ((s1 = reader.readLine()) != null) {
            stringList.add(s1);
        }
        return stringList;
    }
    
    public void close() throws IOException {
            reader.close();
    }   
}
