package all_class;

import java.util.*;

// Nested try-catch 
// problem 1} Write a java program that allow you to keep accssing on array until a volid index given by user 
public class Nested_TC1 {
    public static void main(String[] args) {
        
        int[] mark = new int[3];
        mark[0] = 6;
        mark[1] = 64;
        mark[2] = 8;

        Scanner sc = new Scanner(System.in);
         boolean flag = true;
         while (flag) {
             System.out.println("Enter Your index vallue");
        int ind = sc.nextInt();

        try {
            try {
                System.out.println(mark[ind]);
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Sorry index is not exit");
               System.out.println(" Exception level 2");
            }

        } catch (Exception e) {
           System.out.println("Exception in level 1");
        }

        }
        System.out.println("Thank to use the program ");
       
    }
    
}
