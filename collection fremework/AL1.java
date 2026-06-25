package a_class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// ArrayList -- Duplicates Allow 

public class AL1 {
    public static void main(String[] args) {
        
        ArrayList<String> m1 = new ArrayList<>();

        m1.add("sham");
        m1.add("ram");
        m1.add("krishna");
        m1.add("sham");           // duplicates allowed


        // Access 
      //  System.out.println(m1.get(0));

        // update 
        m1.set(3, "radha");

        // Remove 
        m1.remove("ram");
        m1.remove(0);

        // size 
        System.out.println(m1.size());

        // iterate 
        for(String s : m1){
            System.out.print(s+", ");
        }


        // sort 
        Collections.sort(m1);

    }
}
