package all_class;

import java.util.Scanner;


// Error and Exception

public class Error {
    public static void main(String[] args) {
        
        // 1} Syntax error Demo
        // int a =0   // Error -> No Semicolan 
        //  b = 8;    // Error -> b is not decleard

        // 2} Logical error Demo 
        // Write a program to print the prime number 1 to 10 

        // System.out.println(2);
        // for(int i=1; i<=5; i++){
        //     System.out.println(2*i-1);       // Output -- > 2,1,3,5,7,9 so {9}--is not pprime 

        // }

        // 3} Runtime Error :--

        int k;
        Scanner sc = new Scanner(System.in);
           
        k = sc.nextInt();
         System.out.println("1000 divided by k is --> " +1000/k);    //Error -- That time enter 0 is give error

    }
}
