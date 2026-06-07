 package Loop;

public class factorial {
    public static void main(String[] args) {
        
        // 1} using while loop

         int n = 5;
         long fact = 1;
         int i = 1;
         while (i <= n) {
            fact = fact * i;
            i++;
         } 
         System.out.println(fact);


         // 2}  using for loop
        int fact1 = 1;
        for(int i1=1; i1<=5; i1++){
            fact *=i1;
        }
        System.out.println(fact1);
    }
}
