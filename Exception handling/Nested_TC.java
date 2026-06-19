package all_class;

import java.util.*;

public class Nested_TC {
    public static void main(String[] args) {
        
        int[] mark = new int[3];
        mark[0] = 6;
        mark[1] = 64;
        mark[2] = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your index vallue");
        int ind = sc.nextInt();

        try {
            System.out.println("Wel-come");
            try {
                System.out.println(mark[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Sorry index is not exit");
               System.out.println(" Exception level 2");
            }

        } catch (Exception e) {
           System.out.println("Exception in level 1");
        }
    }
    
}
