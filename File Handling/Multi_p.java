package p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Multi_p {
    public static void main(String[] args) {
        
        int i = 10;
        String table = "";
        for(int j=0; j<10; j++){
            table += i + " X " + (j+1) + " = " + i*(j+1);
            table += "\n";

        }

        try {
            FileWriter Filew = new FileWriter("Multiplection.txt");
            Filew.write(table);
            Filew.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
