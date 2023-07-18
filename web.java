import java.io.*;
import java.util.*;

public class web {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Scanner filein;
    PrintWriter fileout;
    String filenamein;
    String filenameout;
    int dotindex;
    String line =null;
    System.out.println("enter filename");
    filenamein=scanner.nextLine();
    try {
        filein = new Scanner(new FileReader(filenamein));
    } catch (FileNotFoundException e) {
       system.out.println("file not found");
    }

    
   } 
    
}