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
        dotindex = filenamein.lastIndexOf(".");
        if (dotindex==-1) {
         filenameout=filenamein+".html";
        }
        else {
         filenameout=filenamein.substring(0, dotindex)+".html";
        }
        fileout= new PrintWriter(filenameout)
        try {
         line =filein.nextLine();
         if (line == null) {
            System.out.println("empty file");            
         }
         else{
            fileout.println("<html>");
            fileout.println("<head>");
            fileout.println("</head>");
            fileout.println("<body>");
            fileout.println(line);
            while (filein.hasNextLine()) {
               fileout.println("<br>");
               line =filein.nextLine();
               if (line.isEmpty()) {
                  fileout.println("<br>");
               }
               else{
                  fileout.println(line);
               }
               fileout.println("<br>");               
            }
            fileout.println("</body>");
            fileout.println("</html>");
            System.out.println("file done");            

         }
         filein.close();
         fileout.close();
        } catch (NoSuchElementException e) {
         System.out.println("Error:"+e.getMessage());
        }

    } catch (FileNotFoundException e) {
       System.out.println("file not found "+e.getMessage());
    }

    
   } 
    
}