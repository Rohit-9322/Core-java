package all_class;


// 1} write a program demonstate Syntax,logical,runtime error 

public class problem1 {
    public static void main(String[] args) {
        
        // Syntax error 
        int a = 9    

        // logical 
        int age = 78;
        int bornyear = 2000-78;

        // Runtime error 
        System.out.println(6/0);

        int[] arr =new int[2];
        arr[6] =100;

        String s =null;
        s.length();
    }
}
