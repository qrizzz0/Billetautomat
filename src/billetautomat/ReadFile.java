package billetautomat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    public String readLogToString (String fileName) { //SMID IND I READ 
        String text = null;
        try{
        Scanner scanner = new Scanner( new File(fileName) );
        text = scanner.useDelimiter("\\A").next();
        scanner.close(); // Put this call in a finally block
        }catch (IOException ex) {
            ex.getStackTrace();
        }
        return text;
    }
    
    public void searchLog (String fileName, String SearchString) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine();
            if(line.contains(SearchString)){
                System.out.println(line);
            }
        }
    } 
    
    public void sinceAdminStart(String fileName, String searchString) throws FileNotFoundException {
        
        String str1 = readLogToString(fileName);
        int index = 0;
        Matcher m = Pattern.compile(searchString).matcher(readLogToString(fileName));
        while (m.find()) { // keep finding new matches until there is not any
            index = m.end();
        }
        System.out.println(str1.substring(index-37));
    }
    
}
