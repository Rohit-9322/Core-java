 package Method;

public class factorial {

   // 1}  Factorial Using Method
    static int facto(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }



    // 2} Factorial Using Recursion
    static int fact1(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
           return  n * fact1(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(fact(5));

        int n =fact1(5);
        System.out.println(n);
    }



}