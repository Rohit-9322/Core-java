package a_class;

// ArrayList 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

         ArrayList<Integer> l2 = new ArrayList<>(); 


        l1.add(2);
        l1.add(3);
        l1.add(6);
        l1.add(8);
        l1.add(0,23);

        l2.add(11);
        l2.add(12);
        l1.addAll(0,l2);    // Add to Arraylist element 

       //  l1.clear();            // clear all dataa

      // System.out.println(l1.contains(12));    // treu 

       //System.out.println(l1.indexOf(3));   // element 3 pesent index 4 

       System.out.println(l1.lastIndexOf(6));


       l1.set(1, 566);



        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", " );
        }

        Collections.sort(l1);
        Collections.sort(l2);
    }
}

// cd collection fremework
// 