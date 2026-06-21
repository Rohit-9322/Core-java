package all_class;

import java.util.Scanner;

// 3} Write program that allow you to keep accecsing an array util a valid index is give 
//        if max retries exteds 5 print''error'



//  Q.4} In Q.3 modify to throw a custom Exception is name reterives are reached 

class MaxRediusReached extends Exception{
    @Override
    public String toString() {
        
        return "Max retry limit reached (5 attempts) ";
    }

    @Override
    public String getMessage() {
        return "Process stopped. Do not try again";
    }
}

public class problem3 {

    // 5} Method using Throws 
    public static void cheackAttempts(int i) throws MaxRediusReached{
        if (i >= 5) {
            
         throw new MaxRediusReached();  
        }
    }    

    public static void main(String[] args) {

        boolean flag = true;
        int[] mark = new int[3];
        mark[0] = 7;
        mark[1] = 95;
        mark[2] = 6;

        Scanner sc =new Scanner(System.in);
        int index ;
        int i =0;
        while (flag && i<5) {
            try {
                System.out.println("Enter Your Index");
                index = sc.nextInt();
                 System.out.println("The array Index is "+ mark[index]);
                 break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invillied Index ");
                i++;
            }
             try{
                cheackAttempts(i);
             }
             catch (MaxRediusReached  ex) {
                System.out.println(ex.getMessage());
                System.out.println(ex.toString());
               }
        }
    }
        
 }

