package all_class;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {

       // return super.toString() ;
       return "I am toString";
    }

    @Override
    public String getMessage() {
       // return super.getMessage();
       return " I am getMassage";
    }
}

// Enter Wrong Age 
class MaxAgeException extends Exception{
    @Override
    public String toString() {

       // return super.toString() ;
       return "The Age is Not Above 125";
    }

    @Override
    public String getMessage() {
       // return super.getMessage();
       return " Make sure Enter currect Age ";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        a = sc.nextInt();
        if (a < 9) {
            try {
               // throw new MyException();
               throw new MaxAgeException();
            } catch (Exception e) {
               System.out.println(e.getMessage());
               System.out.println(e.toString());
               System.out.println(e);
               System.out.println("COMPETE");
               e.printStackTrace();
               
            }
        }
        
    }

    

    
}
