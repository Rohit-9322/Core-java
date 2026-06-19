package all_class;

// try-catch  

public class try_c {

    public static void main(String[] args) {
        int a = 600;
        int b = 0;

        // Without try 
        // int c = a/b;
        // System.out.println("That is c " +c);   // Error -> java.lang.ArithmeticException.

        // With try 
        try {
            int c = a/b;
            System.out.println("That is c " +c);
        } catch (Exception e) {
            System.out.println("That give the error is Resion ");
            System.out.println(e);                                        //Error -> That give the error is Resion java.lang.ArithmeticException: / by zero
        }
        System.out.println("That the block is end");
    }
}
