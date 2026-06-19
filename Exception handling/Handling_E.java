package all_class;

import java.util.Scanner;

public class Handling_E {

    public static void main(String[] args) {
        int[] mark = new int[3];
        mark[0] = 6;
        mark[1] = 64;
        mark[2] = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your index Number");
        int ind = sc.nextInt();

        System.out.println("Enter the no you add");
        int no = sc.nextInt();

        try {
            System.out.println("The value od Array index "+ mark[ind]);
            System.out.println("The array value is " + mark[ind]/no);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You error is -> Resioan is ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println("You error is -> Resioan ArithmeticException");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("You error is -> Resioan");
            System.out.println(e);
        }

    }
    
}
