package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// File Handling -> Create, Write, Read, Delete 


public class first1 {
    public static void main(String[] args) {
        
       /* 
        // Create 
        File Myfile = new File("RW_111.TXT");
        try {
            Myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file ");
           e.printStackTrace();
        }
        
        


        // Writeing 
        try {
            FileWriter wfile = new FileWriter("RW_111.TXT");
            wfile.write("This is our first file \n Ok thanks !");
            wfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        


        // Redding  
        File myFile = new File("RW_111.TXT");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        */


        // Delete 

        File myFile = new File("RW_111.TXT");
        if (myFile.delete()) {
            System.out.println("I have delete that file -> "+myFile.getName());
        }
        else{
            System.out.println("Some Problem while deleteing this file ");
        }
    }
}
