package Method;

public class fibonaci {
    
    // Fibonacci Using Recursion 
    static int fibonaci1(int n){
        if (n<=1) {
            return n;
        }
        else{
            return fibonaci1(n-1) + fibonaci1(n-2);
        }
    }


    public static void main(String[] args) {
      System.out.println(  fibonaci1(6));
    }
}
